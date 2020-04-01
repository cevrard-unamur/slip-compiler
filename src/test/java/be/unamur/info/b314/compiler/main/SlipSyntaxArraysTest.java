
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

public class SlipSyntaxArraysTest {

    private static final Logger LOG = LoggerFactory.getLogger(SlipSyntaxArraysTest.class);

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
    public void test_array_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/arrays/ok/array.slip", testFolder.newFile(), true, "syntax::arrays: array.slip");
    }


    @Test
    public void test_array_multi_dimension_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/arrays/ok/array_multi_dimension.slip", testFolder.newFile(), true, "syntax::arrays: array_multi_dimension.slip");
    }


    // tests KO
    @Test
    public void test_array_missing_comma_2d_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/arrays/ko/array_missing_comma_2d.slip", testFolder.newFile(), false, "syntax::arrays: array_missing_comma_2d.slip");
    }


    @Test
    public void test_array_no_dimension_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/arrays/ko/array_no_dimension.slip", testFolder.newFile(), false, "syntax::arrays: array_no_dimension.slip");
    }


}
