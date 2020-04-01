
package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlipSyntaxFunctionTest {

    private static final Logger LOG = LoggerFactory.getLogger(SlipSyntaxFunctionTest.class);

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
    public void test_factorial_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/function/ok/factorial.slip", testFolder.newFile(), true, "syntax::function: factorial.slip");
    }


    @Test
    public void test_no_local_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/function/ok/no_local.slip", testFolder.newFile(), true, "syntax::function: no_local.slip");
    }


    @Test
    public void test_function_with_global_variable_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/function/ok/function_with_global_variable.slip", testFolder.newFile(), true, "syntax::function: function_with_global_variable.slip");
    }


    @Test
    public void test_global_no_local_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/function/ok/global_no_local.slip", testFolder.newFile(), true, "syntax::function: global_no_local.slip");
    }


    // tests KO
}
