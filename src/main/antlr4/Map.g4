grammar Map;

import MapWords;

map: MAP NUMBER NUMBER ((mapsymbols)* | NEWLINE | EOF);

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