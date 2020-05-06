
package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlipNbcActionTest {

    private static final Logger LOG = LoggerFactory.getLogger(SlipNbcActionTest.class);

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
    public void test_move_left_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/action/ok/move_left.slip", testFolder.newFile(), true, "nbc::action: move_left.slip");
    }


    @Test
    public void test_jump_param_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/action/ok/jump_param.slip", testFolder.newFile(), true, "nbc::action: jump_param.slip");
    }


    @Test
    public void test_move_right_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/action/ok/move_right.slip", testFolder.newFile(), true, "nbc::action: move_right.slip");
    }


    @Test
    public void test_move_left_param_fct_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/action/ok/move_left_param_fct.slip", testFolder.newFile(), true, "nbc::action: move_left_param_fct.slip");
    }


    @Test
    public void test_move_up_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/action/ok/move_up.slip", testFolder.newFile(), true, "nbc::action: move_up.slip");
    }


    @Test
    public void test_move_left_param_array_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/action/ok/move_left_param_array.slip", testFolder.newFile(), true, "nbc::action: move_left_param_array.slip");
    }


    @Test
    public void test_move_down_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/action/ok/move_down.slip", testFolder.newFile(), true, "nbc::action: move_down.slip");
    }


    @Test
    public void test_move_left_param_var_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/action/ok/move_left_param_var.slip", testFolder.newFile(), true, "nbc::action: move_left_param_var.slip");
    }


    @Test
    public void test_jump_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/action/ok/jump.slip", testFolder.newFile(), true, "nbc::action: jump.slip");
    }


    @Test
    public void test_move_left_param_number_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/action/ok/move_left_param_number.slip", testFolder.newFile(), true, "nbc::action: move_left_param_number.slip");
    }


    @Test
    public void test_fight_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/action/ok/fight.slip", testFolder.newFile(), true, "nbc::action: fight.slip");
    }


    // tests KO
}
