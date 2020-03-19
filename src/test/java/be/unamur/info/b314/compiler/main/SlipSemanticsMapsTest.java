
package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlipSemanticsMapsTest {

    private static final Logger LOG = LoggerFactory.getLogger(SlipSemanticsMapsTest.class);

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
    public void test_map_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/maps/ok/map.slip", testFolder.newFile(), true, "semantics::maps: map.slip");
    }


    // tests KO
    @Test
    public void test_incorrect_number_of_symbols_1_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/maps/ko/incorrect_number_of_symbols_1.slip", testFolder.newFile(), false, "semantics::maps: incorrect_number_of_symbols_1.slip");
    }


    @Test
    public void test_incorrect_size_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/maps/ko/incorrect_size.slip", testFolder.newFile(), false, "semantics::maps: incorrect_size.slip");
    }


    @Test
    public void test_incorrect_number_of_symbols_2_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/maps/ko/incorrect_number_of_symbols_2.slip", testFolder.newFile(), false, "semantics::maps: incorrect_number_of_symbols_2.slip");
    }


}
