grammar PlayPlus;

import PlayPlusWords;

root: programme;

programme: mapImport ((COMMENT)*)? mainFunction;

mapImport: IMPORT QUOTE MAPFILE QUOTE;

mainFunction: MAIN AS FUNCTION LPAR RPAR COLON VOID DO END;