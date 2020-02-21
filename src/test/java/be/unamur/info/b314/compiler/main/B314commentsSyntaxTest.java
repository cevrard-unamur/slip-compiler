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
    // Serie comments OK
    //
    @Test
    public void testcomments_variable_global_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/variable_global", testFolder.newFile(), true, "comments: variable_global");
    }

    @Test
    public void testcomments_full_program_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/full_program", testFolder.newFile(), true, "comments: full_program");
    }

    @Test
    public void testcomments_comment_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/comment", testFolder.newFile(), true, "comments: comment");
    }

    @Test
    public void testcomments_actions_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/actions", testFolder.newFile(), true, "comments: actions");
    }

    //
    // Serie comments KO
    //
    @Test
    public void testcomments_variable_global_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/variable_global", testFolder.newFile(), false, "comments: variable_global");
    }

    @Test
    public void testcomments_empty_import_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/empty_import", testFolder.newFile(), false, "comments: empty_import");
    }

    @Test
    public void testcomments_import_string_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/import_string", testFolder.newFile(), false, "comments: import_string");
    }

    @Test
    public void testcomments_comment_singleline_incorrect_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/comment_singleline_incorrect", testFolder.newFile(), false, "comments: comment_singleline_incorrect");
    }

    @Test
    public void testcomments_missing_main_function_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/missing_main_function", testFolder.newFile(), false, "comments: missing_main_function");
    }

    @Test
    public void testcomments_actions_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/actions", testFolder.newFile(), false, "comments: actions");
    }

    @Test
    public void testcomments_program_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/program", testFolder.newFile(), false, "comments: program");
    }

}