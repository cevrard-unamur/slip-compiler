
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
    public void test_fonct_with_var_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/function/ok/fonct_with_var.slip", testFolder.newFile(), true, "syntax::function: fonct_with_var.slip");
    }


    @Test
    public void test_factorial_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/function/ok/factorial.slip", testFolder.newFile(), true, "syntax::function: factorial.slip");
    }


    @Test
    public void test_no_local_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/function/ok/no_local.slip", testFolder.newFile(), true, "syntax::function: no_local.slip");
    }


    @Test
    public void test_global_no_local_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/function/ok/global_no_local.slip", testFolder.newFile(), true, "syntax::function: global_no_local.slip");
    }


    @Test
    public void test_void_function_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/function/ok/void_function.slip", testFolder.newFile(), true, "syntax::function: void_function.slip");
    }


    // tests KO
    @Test
    public void test_function_integer_char_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/function/ko/function_integer_char.slip", testFolder.newFile(), false, "syntax::function: function_integer_char.slip");
    }


}
