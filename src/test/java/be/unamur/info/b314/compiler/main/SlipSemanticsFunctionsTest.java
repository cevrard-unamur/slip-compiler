
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


    @Test
    public void test_function_with_array_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/functions/ok/function_with_array.slip", testFolder.newFile(), true, "semantics::functions: function_with_array.slip");
    }


    @Test
    public void test_funct_with_var_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/functions/ok/funct_with_var.slip", testFolder.newFile(), true, "semantics::functions: funct_with_var.slip");
    }


    @Test
    public void test_valid_name_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/functions/ok/valid_name.slip", testFolder.newFile(), true, "semantics::functions: valid_name.slip");
    }


    // tests KO
    @Test
    public void test_duplicate_fct_name_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/functions/ko/duplicate_fct_name.slip", testFolder.newFile(), false, "semantics::functions: duplicate_fct_name.slip");
    }


    @Test
    public void test_variable_with_name_parameter_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/functions/ko/variable_with_name_parameter.slip", testFolder.newFile(), false, "semantics::functions: variable_with_name_parameter.slip");
    }


    @Test
    public void test_void_function_assign_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/functions/ko/void_function_assign.slip", testFolder.newFile(), false, "semantics::functions: void_function_assign.slip");
    }


    @Test
    public void test_invalid_name_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/functions/ko/invalid_name.slip", testFolder.newFile(), false, "semantics::functions: invalid_name.slip");
    }


    @Test
    public void test_function_with_same_parameters_name_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/functions/ko/function_with_same_parameters_name.slip", testFolder.newFile(), false, "semantics::functions: function_with_same_parameters_name.slip");
    }


    @Test
    public void test_void_function_return_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/functions/ko/void_function_return.slip", testFolder.newFile(), false, "semantics::functions: void_function_return.slip");
    }


    @Test
    public void test_duplicate_param_name_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/functions/ko/duplicate_param_name.slip", testFolder.newFile(), false, "semantics::functions: duplicate_param_name.slip");
    }


    @Test
    public void test_param_name_as_function_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/functions/ko/param_name_as_function.slip", testFolder.newFile(), false, "semantics::functions: param_name_as_function.slip");
    }


}
