
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

public class SlipSyntaxMapsTest {

    private static final Logger LOG = LoggerFactory.getLogger(SlipSyntaxMapsTest.class);

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
    public void test_map_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/maps/ok/map.slip", testFolder.newFile(), true, "syntax::maps: map.slip");
    }


    @Test
    public void test_map_one_line_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/maps/ok/map_one_line.slip", testFolder.newFile(), true, "syntax::maps: map_one_line.slip");
    }


    // tests KO
    @Test
    public void test_map_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/maps/ko/map.slip", testFolder.newFile(), false, "syntax::maps: map.slip");
    }


}
