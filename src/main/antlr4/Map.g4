grammar Map;

import MapWords;

map: MAP NUMBER NUMBER (mapsymbols)*;

mapsymbols: ROBOT
           | CHEST
           | GRASS
           | PALMTREE
           | BRIDGE
           | BUSH
           | CASK
           | WELL
           | VOID
           | SQUELETON;