grammar Map;

import MapWords;

map: (mapStructure)*
            ;

mapStructure: (MAP COLON NUMBER NUMBER (mapSymbols)+) EOF?        #mapDescription
           ;

mapSymbols: ROBOT                   #robot
           | CHEST                  #chest
           | GRASS                  #grass
           | PALMTREE               #palmtree
           | BRIDGE                 #bridge
           | BUSH                   #bush
           | CASK                   #cask
           | WELL                   #well
           | EMPTY                  #empty
           | SQUELETON              #squeleton
           | COMMENT_SINGLELINE     #commentSingle
           | COMMENT_MULTILINE      #commentMulti
           ;