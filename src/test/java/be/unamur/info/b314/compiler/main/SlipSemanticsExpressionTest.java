
package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlipSemanticsExpressionTest {

    private static final Logger LOG = LoggerFactory.getLogger(SlipSemanticsExpressionTest.class);

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
    public void test_add_integer_2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/expression/ok/add_integer_2.slip", testFolder.newFile(), true, "semantics::expression: add_integer_2.slip");
    }


    @Test
    public void test_boolean_expression_2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/expression/ok/boolean_expression_2.slip", testFolder.newFile(), true, "semantics::expression: boolean_expression_2.slip");
    }


    @Test
    public void test_compare_2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/expression/ok/compare_2.slip", testFolder.newFile(), true, "semantics::expression: compare_2.slip");
    }


    @Test
    public void test_compare_1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/expression/ok/compare_1.slip", testFolder.newFile(), true, "semantics::expression: compare_1.slip");
    }


    @Test
    public void test_add_integer_paranthese_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/expression/ok/add_integer_paranthese.slip", testFolder.newFile(), true, "semantics::expression: add_integer_paranthese.slip");
    }


    @Test
    public void test_add_array_1d_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/expression/ok/add_array_1d.slip", testFolder.newFile(), true, "semantics::expression: add_array_1d.slip");
    }


    @Test
    public void test_boolean_expression_1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/expression/ok/boolean_expression_1.slip", testFolder.newFile(), true, "semantics::expression: boolean_expression_1.slip");
    }


    @Test
    public void test_add_integer_1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/expression/ok/add_integer_1.slip", testFolder.newFile(), true, "semantics::expression: add_integer_1.slip");
    }


    @Test
    public void test_add_array_2d_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/expression/ok/add_array_2d.slip", testFolder.newFile(), true, "semantics::expression: add_array_2d.slip");
    }


    @Test
    public void test_boolean_parentheses_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/expression/ok/boolean_parentheses.slip", testFolder.newFile(), true, "semantics::expression: boolean_parentheses.slip");
    }


    // tests KO
    @Test
    public void test_add_different_type_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/expression/ko/add_different_type.slip", testFolder.newFile(), false, "semantics::expression: add_different_type.slip");
    }


    @Test
    public void test_add_parenthsesis_incorrect_type_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/expression/ko/add_parenthsesis_incorrect_type.slip", testFolder.newFile(), false, "semantics::expression: add_parenthsesis_incorrect_type.slip");
    }


    @Test
    public void test_add_incorrect_array_use_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/expression/ko/add_incorrect_array_use.slip", testFolder.newFile(), false, "semantics::expression: add_incorrect_array_use.slip");
    }


}
