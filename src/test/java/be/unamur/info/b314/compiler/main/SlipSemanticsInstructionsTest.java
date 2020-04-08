
package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlipSemanticsInstructionsTest {

    private static final Logger LOG = LoggerFactory.getLogger(SlipSemanticsInstructionsTest.class);

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
    public void test_previous_series_and_if_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/instructions/ok/previous_series_and_if.slip", testFolder.newFile(), true, "semantics::instructions: previous_series_and_if.slip");
    }


    // tests KO
    @Test
    public void test_mistake_fct_local_variable_diff_names_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/instructions/ko/mistake_fct_local_variable_diff_names.slip", testFolder.newFile(), false, "semantics::instructions: mistake_fct_local_variable_diff_names.slip");
    }


    @Test
    public void test_mistake_global_vars_and_functions_no_local_var_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/instructions/ko/mistake_global_vars_and_functions_no_local_var.slip", testFolder.newFile(), false, "semantics::instructions: mistake_global_vars_and_functions_no_local_var.slip");
    }


    @Test
    public void test_mistake_square_function_no_local_var_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/instructions/ko/mistake_square_function_no_local_var.slip", testFolder.newFile(), false, "semantics::instructions: mistake_square_function_no_local_var.slip");
    }


    @Test
    public void test_mistake_void_function_no_local_var_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/instructions/ko/mistake_void_function_no_local_var.slip", testFolder.newFile(), false, "semantics::instructions: mistake_void_function_no_local_var.slip");
    }


    @Test
    public void test_no_local_var_2_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/instructions/ko/no_local_var_2.slip", testFolder.newFile(), false, "semantics::instructions: no_local_var_2.slip");
    }


    @Test
    public void test_no_local_var_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/instructions/ko/no_local_var.slip", testFolder.newFile(), false, "semantics::instructions: no_local_var.slip");
    }


}
