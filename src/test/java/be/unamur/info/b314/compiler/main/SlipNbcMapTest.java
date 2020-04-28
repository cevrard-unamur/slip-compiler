
package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlipNbcMapTest {

    private static final Logger LOG = LoggerFactory.getLogger(SlipNbcMapTest.class);

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
    public void test_map_import_chest_1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/map/ok/map_import_chest_1.slip", testFolder.newFile(), true, "nbc::map: map_import_chest_1.slip");
    }


    @Test
    public void test_map_import_ennemies_1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/map/ok/map_import_ennemies_1.slip", testFolder.newFile(), true, "nbc::map: map_import_ennemies_1.slip");
    }


    @Test
    public void test_map_import_robot_1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/map/ok/map_import_robot_1.slip", testFolder.newFile(), true, "nbc::map: map_import_robot_1.slip");
    }


    @Test
    public void test_map_import_ennemies_3_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/map/ok/map_import_ennemies_3.slip", testFolder.newFile(), true, "nbc::map: map_import_ennemies_3.slip");
    }


    // tests KO
    @Test
    public void test_map_import_chest_0_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/map/ko/map_import_chest_0.slip", testFolder.newFile(), false, "nbc::map: map_import_chest_0.slip");
    }


    @Test
    public void test_map_import_robot_0_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/map/ko/map_import_robot_0.slip", testFolder.newFile(), false, "nbc::map: map_import_robot_0.slip");
    }


    @Test
    public void test_map_import_robot_2_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/map/ko/map_import_robot_2.slip", testFolder.newFile(), false, "nbc::map: map_import_robot_2.slip");
    }


    @Test
    public void test_map_import_enemies_0_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/map/ko/map_import_enemies_0.slip", testFolder.newFile(), false, "nbc::map: map_import_enemies_0.slip");
    }


    @Test
    public void test_map_import_chest_2_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/nbc/map/ko/map_import_chest_2.slip", testFolder.newFile(), false, "nbc::map: map_import_chest_2.slip");
    }


}
