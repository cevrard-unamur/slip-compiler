grammar PlayPlus;

import PlayPlusWords;

root: programme;

programme:  mapImport ((COMMENT_MULTILINE)*|(COMMENT_SINGLELINE)*)?  mainFunction            #mainProgram
            ;

mapImport:  IMPORT QUOTE MAPFILE QUOTE                      #mapImportation
            ;

mainFunction: MAIN AS FUNCTION LPAR RPAR COLON VOID DO END   #mainFucntion
            ;