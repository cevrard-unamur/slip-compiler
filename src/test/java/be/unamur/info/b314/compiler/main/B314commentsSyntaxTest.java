package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314commentsSyntaxTest {

    private static final Logger LOG = LoggerFactory.getLogger(B314commentsSyntaxTest.class);

    @Rule
    public TemporaryFolder testFolder = new TemporaryFolder(); // Create a temporary folder for outputs deleted after tests

    @Rule
    public TestRule watcher = new TestWatcher() { // Prints message on logger before each test
        @Override
        protected void starting(Description description) {
            LOG.info(String.format("Starting test: %s()...",
                    description.getMethodName()));
        }
    ;
    };

    //
    // Serie variables OK
    //
    @Test
    public void test_comment_more() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/comment_more", testFolder.newFile(), true, "variables: comment_more");
    }

    @Test
    public void test_full_program() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/full_program", testFolder.newFile(), true, "variables: full_program");
    }

    @Test
    public void test_comment_multiline() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/comment_multiline", testFolder.newFile(), true, "variables: comment_multiline");
    }

    @Test
    public void test_comment_singleline() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/comment_singleline", testFolder.newFile(), true, "variables: comment_singleline");
    }

    //
    // Serie variables KO
    //
    @Test
    public void test_empty_import() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/empty_import", testFolder.newFile(), false, "variables: empty_import");
    }

    @Test
    public void test_import_string() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/import_string", testFolder.newFile(), false, "variables: import_string");
    }

    @Test
    public void test_missing_main_function() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/missing_main_function", testFolder.newFile(), false, "variables: missing_main_function");
    }
}