
package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlipSemanticsActionTest {

    private static final Logger LOG = LoggerFactory.getLogger(SlipSemanticsActionTest.class);

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
    public void test_action_correct_type_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/action/ok/action_correct_type.slip", testFolder.newFile(), true, "semantics::action: action_correct_type.slip");
    }


    @Test
    public void test_action_correct_type_variable_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/action/ok/action_correct_type_variable.slip", testFolder.newFile(), true, "semantics::action: action_correct_type_variable.slip");
    }


    @Test
    public void test_action_correct_type_operation_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/action/ok/action_correct_type_operation.slip", testFolder.newFile(), true, "semantics::action: action_correct_type_operation.slip");
    }


    // tests KO
    @Test
    public void test_jump_incorrect_type_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/action/ko/jump_incorrect_type.slip", testFolder.newFile(), false, "semantics::action: jump_incorrect_type.slip");
    }


    @Test
    public void test_jump_incorrect_type_type_boolean_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/action/ko/jump_incorrect_type_type_boolean.slip", testFolder.newFile(), false, "semantics::action: jump_incorrect_type_type_boolean.slip");
    }


}
