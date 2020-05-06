
package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlipNbcFunctionTest {

    private static final Logger LOG = LoggerFactory.getLogger(SlipNbcFunctionTest.class);

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
    public void test_param_from_array_with_function_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/function/ok/param_from_array_with_function.slip", testFolder.newFile(), true, "nbc::function: param_from_array_with_function.slip");
    }


    @Test
    public void test_param_from_array_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/function/ok/param_from_array.slip", testFolder.newFile(), true, "nbc::function: param_from_array.slip");
    }


    @Test
    public void test_param_right_expr_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/function/ok/param_right_expr.slip", testFolder.newFile(), true, "nbc::function: param_right_expr.slip");
    }


    @Test
    public void test_param_char_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/function/ok/param_char.slip", testFolder.newFile(), true, "nbc::function: param_char.slip");
    }


    @Test
    public void test_param_bool_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/function/ok/param_bool.slip", testFolder.newFile(), true, "nbc::function: param_bool.slip");
    }


    @Test
    public void test_param_int_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/function/ok/param_int.slip", testFolder.newFile(), true, "nbc::function: param_int.slip");
    }


    // tests KO
}
