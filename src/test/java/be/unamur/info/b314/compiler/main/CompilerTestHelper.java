package be.unamur.info.b314.compiler.main;

import org.apache.logging.log4j.core.util.IOUtils;
import org.hamcrest.Matchers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import static org.hamcrest.Matchers.endsWith;
import static org.junit.Assert.assertThat;

/**
 *
 */
class CompilerTestHelper {
    private static final Logger LOG = LoggerFactory.getLogger(CompilerTestHelper.class);

    /**
     * Launch compilation and check OK/KO output according to the given parameters.
     *
     * @param input The name of the input B314 file (in src/test/resources).
     * @param ok True if the compiler should print 'OK' on stderr for the given
     * files.
     * @param message Message to print if the test failes.
     * @param outputFile Output file where PCode is written
     * @throws URISyntaxException If the given file does not exist in
     * src/test/resources.
     * @throws IOException If the method fails to create ta temporary output file in testFolder.
     */
    public static void launchCompilation(String input, File outputFile, boolean ok, String message) throws URISyntaxException, IOException {
        File inputFile = new File(CompilerTestHelper.class.getResource(input).toURI());

        ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        System.setErr(new PrintStream(errContent));
        // Launch main method
        Main.main(new String[]{"-i", inputFile.getAbsolutePath(), "-o", outputFile.getAbsolutePath()});
        String expected;
        if (ok) {
            expected = String.format("OK%n"); // Using format to prevent EOL compatibility issues
        } else {
            expected = String.format("KO%n");
        }
        assertThat(message, errContent.toString(), endsWith(expected)); // Check that the output ends with OK/KO

        if(expected.equals("OK\n")) {
            Process process;
            BufferedReader execErrorStream;
            Integer exit;

            try {

                String workingDirectory = System.getProperty("user.dir");

                process = Runtime.getRuntime().exec(
                        String.format("nbc %s -O=%s/%s", outputFile.getAbsolutePath(), workingDirectory, "nbcCode.rxe"));
                execErrorStream = new BufferedReader(new InputStreamReader(process.getErrorStream()));
                exit = process.waitFor();
                assertThat(IOUtils.toString(execErrorStream), exit.toString(), Matchers.equalTo("0"));

                LOG.info("NBC compilation has been performed");
            } catch (IOException | InterruptedException e) {
                LOG.error("unable to run nbc: " + e.toString());
            }
        }
    }

}
