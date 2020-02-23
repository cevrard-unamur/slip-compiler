grammar Map;

import MapWords;

map: MAP COLON NUMBER NUMBER (mapSymbols)*;

mapSymbols: ROBOT
           | CHEST
           | GRASS
           | PALMTREE
           | BRIDGE
           | BUSH
           | CASK
           | WELL
           | EMPTY
           | SQUELETON;