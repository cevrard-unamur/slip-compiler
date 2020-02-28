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
    public void testcomments_singleline_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/singleline", testFolder.newFile(), true, "comments: singleline");
    }

    @Test
    public void testcomments_map1_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/map1", testFolder.newFile(), true, "comments: map1");
    }

    @Test
    public void testcomments_structure_no_variable_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/structure_no_variable", testFolder.newFile(), true, "comments: structure_no_variable");
    }

    @Test
    public void testcomments_jump_incorrect_type_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/jump_incorrect_type", testFolder.newFile(), true, "comments: jump_incorrect_type");
    }

    @Test
    public void testcomments_full_program_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/full_program", testFolder.newFile(), true, "comments: full_program");
    }

    @Test
    public void testcomments_array_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/array", testFolder.newFile(), true, "comments: array");
    }

    @Test
    public void testcomments_enum_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/enum", testFolder.newFile(), true, "comments: enum");
    }

    @Test
    public void testcomments_jump_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/jump", testFolder.newFile(), true, "comments: jump");
    }

    @Test
    public void testcomments_more_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/more", testFolder.newFile(), true, "comments: more");
    }

    @Test
    public void testcomments_struct_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/struct", testFolder.newFile(), true, "comments: struct");
    }

    @Test
    public void testcomments_map2_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/map2", testFolder.newFile(), true, "comments: map2");
    }

    @Test
    public void testcomments_more_than_one_variable_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/more_than_one_variable", testFolder.newFile(), true, "comments: more_than_one_variable");
    }

    @Test
    public void testcomments_type_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/type", testFolder.newFile(), true, "comments: type");
    }

    @Test
    public void testcomments_array_multi_dimension_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/array_multi_dimension", testFolder.newFile(), true, "comments: array_multi_dimension");
    }

    @Test
    public void testcomments_multiline_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/multiline", testFolder.newFile(), true, "comments: multiline");
    }

    @Test
    public void testcomments_declaration_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/declaration", testFolder.newFile(), true, "comments: declaration");
    }

    @Test
    public void testcomments_declaration_more_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/declaration_more", testFolder.newFile(), true, "comments: declaration_more");
    }

    //
    // Serie comments KO
    //
    @Test
    public void testcomments_empty_import_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/empty_import", testFolder.newFile(), false, "comments: empty_import");
    }

    @Test
    public void testcomments_no_dig_instruction_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/no_dig_instruction", testFolder.newFile(), false, "comments: no_dig_instruction");
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
    public void testcomments_missing_semicolon_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/missing_semicolon", testFolder.newFile(), false, "comments: missing_semicolon");
    }

    @Test
    public void testcomments_array_missing_comma_2d_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/array_missing_comma_2d", testFolder.newFile(), false, "comments: array_missing_comma_2d");
    }

    @Test
    public void testcomments_missing_main_function_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/missing_main_function", testFolder.newFile(), false, "comments: missing_main_function");
    }

    @Test
    public void testcomments_non_existant_type_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/non_existant_type", testFolder.newFile(), false, "comments: non_existant_type");
    }

    @Test
    public void testcomments_map_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/map", testFolder.newFile(), false, "comments: map");
    }

    @Test
    public void testcomments_array_no_dimension_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/array_no_dimension", testFolder.newFile(), false, "comments: array_no_dimension");
    }

    @Test
    public void testcomments_incorrect_name_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/incorrect_name", testFolder.newFile(), false, "comments: incorrect_name");
    }

}