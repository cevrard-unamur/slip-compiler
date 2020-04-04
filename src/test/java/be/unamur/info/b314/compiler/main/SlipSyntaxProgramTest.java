
package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlipSyntaxProgramTest {

    private static final Logger LOG = LoggerFactory.getLogger(SlipSyntaxProgramTest.class);

    @Rule
    public TemporaryFolder testFolder = new TemporaryFolder(); // Create a temporary folder for outputs deleted after tests

    @Rule
    public TestRule watcher = new TestWatcher() { // Prints message on logger before each test
        @Override
        protected void starting(Description description) {
            LOG.info(String.format("Starting test: %s()...",
                    description.getMethodName()));
        };
    };

    // tests OK
    @Test
    public void test_full_program_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/program/ok/full_program.slip", testFolder.newFile(), true, "syntax::program: full_program.slip");
    }


    // tests KO
    @Test
    public void test_missing_main_function_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/program/ko/missing_main_function.slip", testFolder.newFile(), false, "syntax::program: missing_main_function.slip");
    }


    @Test
    public void test_import_string_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/program/ko/import_string.slip", testFolder.newFile(), false, "syntax::program: import_string.slip");
    }


    @Test
    public void test_no_dig_instruction_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/program/ko/no_dig_instruction.slip", testFolder.newFile(), false, "syntax::program: no_dig_instruction.slip");
    }


    @Test
    public void test_empty_import_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/program/ko/empty_import.slip", testFolder.newFile(), false, "syntax::program: empty_import.slip");
    }


}
