
package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlipNbcIfTest {

    private static final Logger LOG = LoggerFactory.getLogger(SlipNbcIfTest.class);

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
    public void test_compare_number_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/if/ok/compare_number.slip", testFolder.newFile(), true, "nbc::if: compare_number.slip");
    }


    @Test
    public void test_function_call_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/if/ok/function_call.slip", testFolder.newFile(), true, "nbc::if: function_call.slip");
    }


    @Test
    public void test_compare_function_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/if/ok/compare_function.slip", testFolder.newFile(), true, "nbc::if: compare_function.slip");
    }


    @Test
    public void test_compare_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/if/ok/compare.slip", testFolder.newFile(), true, "nbc::if: compare.slip");
    }


    // tests KO
}
