
package be.unamur.info.b314.compiler.main;

import be.unamur.info.b314.compiler.application.Application;
import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

public class SlipSyntaxVariablesTest {

    private static final Logger LOG = LoggerFactory.getLogger(SlipSyntaxVariablesTest.class);

    @Before
    public void resetSingleton() throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field instance = Application.class.getDeclaredField("instance");
        instance.setAccessible(true);
        instance.set(null, null);
    }

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
    public void test_enum_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/variables/ok/enum.slip", testFolder.newFile(), true, "syntax::variables: enum.slip");
    }


    @Test
    public void test_declaration_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/variables/ok/declaration.slip", testFolder.newFile(), true, "syntax::variables: declaration.slip");
    }


    @Test
    public void test_and_var_wrong_type_2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/variables/ok/and_var_wrong_type_2.slip", testFolder.newFile(), true, "syntax::variables: and_var_wrong_type_2.slip");
    }


    @Test
    public void test_struct_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/variables/ok/struct.slip", testFolder.newFile(), true, "syntax::variables: struct.slip");
    }


    @Test
    public void test_declaration_more_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/variables/ok/declaration_more.slip", testFolder.newFile(), true, "syntax::variables: declaration_more.slip");
    }


    @Test
    public void test_more_than_one_variable_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/variables/ok/more_than_one_variable.slip", testFolder.newFile(), true, "syntax::variables: more_than_one_variable.slip");
    }


    @Test
    public void test_fct_local_var_diff_names_than_global_vars_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/variables/ok/fct_local_var_diff_names_than_global_vars.slip", testFolder.newFile(), true, "syntax::variables: fct_local_var_diff_names_than_global_vars.slip");
    }


    @Test
    public void test_when_local_var_diff_names_than_global_vars_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/variables/ok/when_local_var_diff_names_than_global_vars.slip", testFolder.newFile(), true, "syntax::variables: when_local_var_diff_names_than_global_vars.slip");
    }


    @Test
    public void test_type_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/variables/ok/type.slip", testFolder.newFile(), true, "syntax::variables: type.slip");
    }


    @Test
    public void test_struct_does_not_exist_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/variables/ok/struct_does_not_exist.slip", testFolder.newFile(), true, "syntax::variables: struct_does_not_exist.slip");
    }


    // tests KO
    @Test
    public void test_missing_semicolon_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/variables/ko/missing_semicolon.slip", testFolder.newFile(), false, "syntax::variables: missing_semicolon.slip");
    }


    @Test
    public void test_non_existant_type_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/variables/ko/non_existant_type.slip", testFolder.newFile(), false, "syntax::variables: non_existant_type.slip");
    }


    @Test
    public void test_incorrect_name_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/variables/ko/incorrect_name.slip", testFolder.newFile(), false, "syntax::variables: incorrect_name.slip");
    }


}
