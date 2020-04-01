
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

public class SlipSemanticsRight_ExpressionTest {

    private static final Logger LOG = LoggerFactory.getLogger(SlipSemanticsRight_ExpressionTest.class);

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
    public void test_add_integer_2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/right_expression/ok/add_integer_2.slip", testFolder.newFile(), true, "semantics::right_expression: add_integer_2.slip");
    }


    @Test
    public void test_add_integer_paranthese_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/right_expression/ok/add_integer_paranthese.slip", testFolder.newFile(), true, "semantics::right_expression: add_integer_paranthese.slip");
    }


    @Test
    public void test_add_integer_1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/semantics/right_expression/ok/add_integer_1.slip", testFolder.newFile(), true, "semantics::right_expression: add_integer_1.slip");
    }


    // tests KO
}
