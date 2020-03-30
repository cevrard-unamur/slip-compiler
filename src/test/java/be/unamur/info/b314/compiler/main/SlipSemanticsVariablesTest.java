
package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlipSemanticsVariablesTest {

    private static final Logger LOG = LoggerFactory.getLogger(SlipSemanticsVariablesTest.class);

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
    public void test_array_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ok/array.slip", testFolder.newFile(), true, "semantics::variables: array.slip");
    }


    @Test
    public void test_type_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ok/type.slip", testFolder.newFile(), true, "semantics::variables: type.slip");
    }


    // tests KO
}
