
package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlipNbcVariablesTest {

    private static final Logger LOG = LoggerFactory.getLogger(SlipNbcVariablesTest.class);

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
    public void test_variable_declaration_init_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/variables/ok/variable_declaration_init.slip", testFolder.newFile(), true, "nbc::variables: variable_declaration_init.slip");
    }


    @Test
    public void test_variable_declaration_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/variables/ok/variable_declaration.slip", testFolder.newFile(), true, "nbc::variables: variable_declaration.slip");
    }


    // tests KO
}
