
package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlipSemanticsFunctionsTest {

    private static final Logger LOG = LoggerFactory.getLogger(SlipSemanticsFunctionsTest.class);

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
    public void test_void_function_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/functions/ok/void_function.slip", testFolder.newFile(), true, "semantics::functions: void_function.slip");
    }


    // tests KO
    @Test
    public void test_void_function_return_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/functions/ko/void_function_return.slip", testFolder.newFile(), false, "semantics::functions: void_function_return.slip");
    }


    @Test
    public void test_void_function_assign_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/functions/ko/void_function_assign.slip", testFolder.newFile(), false, "semantics::functions: void_function_assign.slip");
    }


}
