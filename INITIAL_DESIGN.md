# From Ash - Initial Design

## Core Philosophy
Maintain the vanilla look and feel of the game while adding mechanics that allow for more player expression and creativity.
All items must be obtainable from mid-to-late game, once the early grind is done and the player has acquired basic items from grinding on mob traps and also from trading with a Wandering Trader.

## Blocks

### Mud Brick Furnace
A low-tier furnace, this will be the first possible furnace that will be constructed on the Structureless Superflat world. 
Unlike a regular furnace, this furnace is susceptible to two particularities:
- First, fuel efficiency is determined not only by the amount of smeltable items, but also by the time taken by each fuel to produce/convert an item. I propose the following values, pending balancing and correction:
  - Wood items & Saplings: Take 1.75x longer to smelt an item than it would on a stone furnace.
  - Wool and Carpets: Take 1.5x longer to smelt an item than it would on a stone furnace
  - Dried Kelp Blocks: Take 1.2x longer to smelt an item than it would on a stone furnace
  - Charcoal/Coal: Same time as a regular stone furnace
  - Lava: Unlike a stone furnace, can't be used as fuel
- Second, smelting non-food items has a chance to create slag as a byproduct. Slag is an item that can be, at a later stage, refined for metals, but not by using it on the Mud Brick Furnace. Mud Brick Furnaces are the only way to obtain the Slag item.

### Brick Furnace
Functions essentially as a regular furnace, but has a 

#### Brick Furnace Variant 1: Smoker
TBD

### Ceramic Furnace
TBD

### Ceramic Bricks
TBD

### Porcelain
TBD

### Brick Piston
Functions as an alternative variant to a regular stone piston. Also possesses a sticky variant.

### Brick Lever
Functions as an alternative variant to a regular stone lever.

### Brick Redstone Repeater
Functions as an alternative variant to a regular redstone repeater. 

### Geology Table
Cosmetic block, solely for the Geologist's use.

## Items

### Slag
The byproduct of smelting non-food items in a Mud Brick Furnace. Depending on the type of smelted item, slag has a chance to form:
- Wood Logs & Cacti: 10% chance of generating Slag
- Clay Balls: 15% chance of generating Slag
- Clay Blocks: 30% chance of generating Slag

In Ceramic Furnaces, slag can be smelted into a random metallic nugget, with 60% chance of getting Iron, 30% chance of getting Copper, and 10% of getting Gold. 

#### Buildup Mechanic
Over time, the accumulation of slag will prevent new items from being smelted. This means that slag must be removed manually by the player, and it cannot also be picked up by a regular hopper. The number of smelted items + the number of Slag items in a Mud Brick furnace cannot exceed 64, with visual cues indicating that the buildup is taking place, at 16, 32, 48 and 64 Slag items present in the furnace. In large furnace arrays this can become unmanageable, and therefore a way to automate slag removal must be implemented...

### Ash
Brick Furnaces are more clean and efficient upon burning items, but wooden logs and cacti are still susceptible to releasing byproducts; this time, however, instead of solid slag, the cleaner burns produce a form of ash. This ash can be combined with clay balls to produce Unfired Ceramic Bricks, which can either be smelted down to Fired Ceramic Bricks, or combined into an Unfired Ceramic Block that can be smelted into a Porcelain block. Fired Ceramic Bricks, in turn, can be turned into pots (like their regular brick counterparts), or into Fired Ceramic Brick Blocks, which are used to create Ceramic Furnaces

## Entities

### New Villager Professions

#### Geologist
Possesses trades that allow for easier times acquiring sand, gravel, and amethyst shards, which open up items such as sandstone and concrete in this world. Also trades for pottery sherds.
- Workstation block: Geology Table.