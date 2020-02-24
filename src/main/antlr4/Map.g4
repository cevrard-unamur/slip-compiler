grammar Map;

import MapWords;

map: (mapDescription)*
            ;

mapDescription: (MAP COLON NUMBER NUMBER (mapSymbols)+) EOF?
           ;

mapSymbols: ROBOT
           | CHEST
           | GRASS
           | PALMTREE
           | BRIDGE
           | BUSH
           | CASK
           | WELL
           | EMPTY
           | SQUELETON
           | COMMENT_SINGLELINE
           | COMMENT_MULTILINE
           ;