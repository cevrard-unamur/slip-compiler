
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
    public void test_array_initialisation_2d_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ok/array_initialisation_2d.slip", testFolder.newFile(), true, "semantics::variables: array_initialisation_2d.slip");
    }


    @Test
    public void test_array_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ok/array.slip", testFolder.newFile(), true, "semantics::variables: array.slip");
    }


    @Test
    public void test_enum_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ok/enum.slip", testFolder.newFile(), true, "semantics::variables: enum.slip");
    }


    @Test
    public void test_mixing_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ok/mixing.slip", testFolder.newFile(), true, "semantics::variables: mixing.slip");
    }


    @Test
    public void test_struct_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ok/struct.slip", testFolder.newFile(), true, "semantics::variables: struct.slip");
    }


    @Test
    public void test_array_initialisation_2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ok/array_initialisation_2.slip", testFolder.newFile(), true, "semantics::variables: array_initialisation_2.slip");
    }


    @Test
    public void test_variable_init_2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ok/variable_init_2.slip", testFolder.newFile(), true, "semantics::variables: variable_init_2.slip");
    }


    @Test
    public void test_variable_init_1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ok/variable_init_1.slip", testFolder.newFile(), true, "semantics::variables: variable_init_1.slip");
    }


    @Test
    public void test_type_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ok/type.slip", testFolder.newFile(), true, "semantics::variables: type.slip");
    }


    @Test
    public void test_array_initialisation_1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ok/array_initialisation_1.slip", testFolder.newFile(), true, "semantics::variables: array_initialisation_1.slip");
    }


    @Test
    public void test_assign_function_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ok/assign_function.slip", testFolder.newFile(), true, "semantics::variables: assign_function.slip");
    }


    @Test
    public void test_constant_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ok/constant.slip", testFolder.newFile(), true, "semantics::variables: constant.slip");
    }


    // tests KO
    @Test
    public void test_array_initialisation_2d_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ko/array_initialisation_2d.slip", testFolder.newFile(), false, "semantics::variables: array_initialisation_2d.slip");
    }


    @Test
    public void test_incorrect_var_init_2d_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ko/incorrect_var_init_2d.slip", testFolder.newFile(), false, "semantics::variables: incorrect_var_init_2d.slip");
    }


    @Test
    public void test_already_define_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ko/already_define.slip", testFolder.newFile(), false, "semantics::variables: already_define.slip");
    }


    @Test
    public void test_variable_init_3_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ko/variable_init_3.slip", testFolder.newFile(), false, "semantics::variables: variable_init_3.slip");
    }


    @Test
    public void test_invalid_name_2_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ko/invalid_name_2.slip", testFolder.newFile(), false, "semantics::variables: invalid_name_2.slip");
    }


    @Test
    public void test_invalid_name_3_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ko/invalid_name_3.slip", testFolder.newFile(), false, "semantics::variables: invalid_name_3.slip");
    }


    @Test
    public void test_array_initialisation_2_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ko/array_initialisation_2.slip", testFolder.newFile(), false, "semantics::variables: array_initialisation_2.slip");
    }


    @Test
    public void test_variable_init_2_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ko/variable_init_2.slip", testFolder.newFile(), false, "semantics::variables: variable_init_2.slip");
    }


    @Test
    public void test_const_affectation_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ko/const_affectation.slip", testFolder.newFile(), false, "semantics::variables: const_affectation.slip");
    }


    @Test
    public void test_incorrect_var_init_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ko/incorrect_var_init.slip", testFolder.newFile(), false, "semantics::variables: incorrect_var_init.slip");
    }


    @Test
    public void test_variable_init_1_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ko/variable_init_1.slip", testFolder.newFile(), false, "semantics::variables: variable_init_1.slip");
    }


    @Test
    public void test_array_initialisation_1_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ko/array_initialisation_1.slip", testFolder.newFile(), false, "semantics::variables: array_initialisation_1.slip");
    }


    @Test
    public void test_enum_duplicate_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ko/enum_duplicate.slip", testFolder.newFile(), false, "semantics::variables: enum_duplicate.slip");
    }


    @Test
    public void test_invalid_name_1_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ko/invalid_name_1.slip", testFolder.newFile(), false, "semantics::variables: invalid_name_1.slip");
    }


    @Test
    public void test_constant_assigns_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/variables/ko/constant_assigns.slip", testFolder.newFile(), false, "semantics::variables: constant_assigns.slip");
    }


}
