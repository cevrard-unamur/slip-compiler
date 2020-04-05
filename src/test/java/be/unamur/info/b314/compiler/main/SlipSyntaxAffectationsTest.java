
package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlipSyntaxAffectationsTest {

    private static final Logger LOG = LoggerFactory.getLogger(SlipSyntaxAffectationsTest.class);

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
    public void test_bool_array_constant_values_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affectations/ok/bool_array_constant_values.slip", testFolder.newFile(), true, "syntax::affectations: bool_array_constant_values.slip");
    }


    @Test
    public void test_square_right_expressions_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affectations/ok/square_right_expressions.slip", testFolder.newFile(), true, "syntax::affectations: square_right_expressions.slip");
    }


    @Test
    public void test_square_constant_values_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affectations/ok/square_constant_values.slip", testFolder.newFile(), true, "syntax::affectations: square_constant_values.slip");
    }


    @Test
    public void test_square_array_right_expressions_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affectations/ok/square_array_right_expressions.slip", testFolder.newFile(), true, "syntax::affectations: square_array_right_expressions.slip");
    }


    @Test
    public void test_int_right_expression_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affectations/ok/int_right_expression.slip", testFolder.newFile(), true, "syntax::affectations: int_right_expression.slip");
    }


    @Test
    public void test_bool_constant_values_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affectations/ok/bool_constant_values.slip", testFolder.newFile(), true, "syntax::affectations: bool_constant_values.slip");
    }


    @Test
    public void test_negative_number_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affectations/ok/negative_number.slip", testFolder.newFile(), true, "syntax::affectations: negative_number.slip");
    }


    @Test
    public void test_int_array_right_expressions_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affectations/ok/int_array_right_expressions.slip", testFolder.newFile(), true, "syntax::affectations: int_array_right_expressions.slip");
    }


    // tests KO
}
