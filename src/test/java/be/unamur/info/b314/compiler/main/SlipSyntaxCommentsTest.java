
package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlipSyntaxCommentsTest {

    private static final Logger LOG = LoggerFactory.getLogger(SlipSyntaxCommentsTest.class);

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
    public void test_multiline_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/multiline.slip", testFolder.newFile(), true, "syntax::comments: multiline.slip");
    }


    @Test
    public void test_more_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/more.slip", testFolder.newFile(), true, "syntax::comments: more.slip");
    }


    @Test
    public void test_singleline_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/singleline.slip", testFolder.newFile(), true, "syntax::comments: singleline.slip");
    }


    // tests KO
    @Test
    public void test_comment_singleline_incorrect_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/comment_singleline_incorrect.slip", testFolder.newFile(), false, "syntax::comments: comment_singleline_incorrect.slip");
    }


}
