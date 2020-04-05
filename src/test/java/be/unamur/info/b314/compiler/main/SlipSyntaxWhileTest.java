
package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlipSyntaxWhileTest {

    private static final Logger LOG = LoggerFactory.getLogger(SlipSyntaxWhileTest.class);

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
    public void test_for_right_expr_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/while/ok/for_right_expr.slip", testFolder.newFile(), true, "syntax::while: for_right_expr.slip");
    }


    @Test
    public void test_for_for_3_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/while/ok/for_for_3.slip", testFolder.newFile(), true, "syntax::while: for_for_3.slip");
    }


    @Test
    public void test_array_tour_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/while/ok/array_tour.slip", testFolder.newFile(), true, "syntax::while: array_tour.slip");
    }


    @Test
    public void test_for_for_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/while/ok/for_for.slip", testFolder.newFile(), true, "syntax::while: for_for.slip");
    }


    @Test
    public void test_for_for_2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/while/ok/for_for_2.slip", testFolder.newFile(), true, "syntax::while: for_for_2.slip");
    }


    // tests KO
    @Test
    public void test_for_with_sub_while_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/while/ko/for_with_sub_while.slip", testFolder.newFile(), false, "syntax::while: for_with_sub_while.slip");
    }


}
