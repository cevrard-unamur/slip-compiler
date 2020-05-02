
package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlipNbcAssignationTest {

    private static final Logger LOG = LoggerFactory.getLogger(SlipNbcAssignationTest.class);

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
    public void test_char_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/assignation/ok/char.slip", testFolder.newFile(), true, "nbc::assignation: char.slip");
    }


    @Test
    public void test_number_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/assignation/ok/number.slip", testFolder.newFile(), true, "nbc::assignation: number.slip");
    }


    @Test
    public void test_bool_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/assignation/ok/bool.slip", testFolder.newFile(), true, "nbc::assignation: bool.slip");
    }


    // tests KO
}
