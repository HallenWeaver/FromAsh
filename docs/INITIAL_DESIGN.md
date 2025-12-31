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
If used in regular play, it can't smelt any stone related items. Not sure why anyone would want to build one for that anyway... (aesthetics, maybe?)

### Brick Furnace
Functions essentially as a regular furnace, but has a similar mechanic to the Mud Brick Furnace in that it creates Ash when smelting wood logs or cacti, in that it now produces Ash instead of slag.
If used in regular play, acts like a regular furnace for all other blocks.

#### Brick Furnace Variant 1: Smoker
This block functions essentially the same way as its vanilla counterpart; it can only smelt food items, and does so at double the speed of a regular furnace. It doesn't produce any forms of Ash.

### Ceramic Furnace
A high tier furnace, this is the only furnace capable of performing slag extraction, requiring double of the normal amount of fuel to do so. It can smelt all other items at twice the normal speed.
If used in regular play, acts like a blast furnace but works for all blocks.

### Ceramic Bricks
Obtained by joining 4 Ceramic Brick Items, which are obtained in turn by smelting Unfired Ceramic Brick Items; these are the result of combining ash and clay balls. They have higher blast tolerances than regular bricks and will appear to be a darker color than their vanilla Brick counterparts.
- Variants: Slabs & Stairs

### Dyed Bricks and Dyed Ceramic Bricks
Obtained by applying dye to Bricks/Ceramic Bricks, similarly to what is done for Terracotta blocks. Ceramic Bricks are darker than their regular varieties.
- Variants: Slabs & Stairs

### Unfired Ceramic
Obtained by joining 4 Unfired Ceramic Brick Items in a square, these function similarly to clay but have a darker texture.

### Porcelain
Porcelain is the result of smelting unfired ceramic blocks. They are somewhat similar to Terracotta blocks, but have a rougher finish that is similar to blocks such as Granite/Andesite/Diorite.
- Variant: Dyed Porcelain. Unlike dyed Terracotta, the colors are more vibrant and match more closely that of their dyes.
- Variants: Slabs & Stairs

### Polished Porcelain
Similarly to the Granite/Andesite/Diorite blocks, there is a polished version for the Porcelain blocks.
- Variant: Dyed Polished Porcelain.
- Variants: Slabs & Stairs

### Tiled Porcelain
A block of polished porcelain with more intricate patterns. Conceptually similar to Glazed Terracotta, but have a more glossy finish. Obtained by re-smelting Dyed Porcelain blocks.

### Brick Piston
Functions as an alternative variant to a regular stone piston. Also possesses a sticky variant.

### Brick Lever
Functions as an alternative variant to a regular stone lever.

### Brick Redstone Repeater
Functions as an alternative variant to a regular redstone repeater.

### Brick Redstone Comparator
Functions as an alternative variant to a regular redstone comparator. Can't be created in Structureless Superflat due to the Nether being unavailable, which means we have no access to quartz. 

### Brick Observer
Functions as an alternative variant to a regular observer. Can't be created in Structureless Superflat due to the Nether being unavailable, which means we have no access to quartz.

### Brick Dispenser
Functions as an alternative variant to a regular dispenser.

### Brick Dropper
Functions as an alternative variant to a regular dropper.

### Brick Crafter
Functions as an alternative variant to a regular crafter; requires a brick dropper in its recipe.

### Brick Stonecutter
Functions as an alternative variant to a regular stonecutter.

### Porcelain Grindstone
Un-dyed porcelain

### Geology Table
Cosmetic block, solely for the Geologist Villager's use.

### Engineering Blueprint Table
Cosmetic block (for now at least), solely for the Engineer Villager's use.

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
Brick Furnaces are more clean and efficient upon burning items, but wooden logs and cacti are still susceptible to releasing byproducts; this time, however, instead of solid slag, the cleaner burns produce a form of ash. This ash can be combined with clay balls to produce Unfired Ceramic Bricks, which can either be smelted down to Fired Ceramic Bricks, or combined into an Unfired Ceramic Block that can be smelted into a Porcelain block. Fired Ceramic Bricks, in turn, can be turned into pots (like their regular brick counterparts), or into Fired Ceramic Brick Blocks, which are used to create Ceramic Furnaces.
Like Slag, the number of smelted items + the number of Ash items in a Brick furnace cannot exceed 64, with visual cues indicating that the buildup is taking place, at 16, 32, 48 and 64 Slag items present in the furnace. Unlike Slag, however, Ash can be picked up by regular hoppers, so cleanup is a bit easier.

## Entities

### New Villager Professions

#### Geologist
Possesses trades that allow for easier times acquiring sand, gravel, and amethyst shards, which open up items such as sandstone and concrete in this world. Also trades for pottery sherds.
- Workstation block: Geology Table.
- Trades:
  - Novice: 
    - 3 Emeralds >> 5-12 Sand
    - 3 Emeralds >> 5-12 Red Sand
    - 3 Emeralds >> 5-12 Gravel
  - Apprentice: 
    - 5 Emeralds >> Brush
    - 1 Decorated Pot >> 5 Emeralds
  - Journeyman: 
    - 2 Emeralds >> 4-6 Amethyst Shards
    - (No ideas for another journeyman trade now)
  - Expert:
    - 10 Emeralds >> 1 Pottery Sherd (Chosen at random from the loot pool)
    - 10 Emeralds >> 1 Pottery Sherd (Chosen at random from the loot pool)
  - Master: 
    - (No ideas for master trades for now)

#### Engineer
Possesses trades that allow for ways of obtaining redstone equipment - and the only way to obtain redstone comparators, daylight detectors, and observers in Structureless Superflat.
- Workstation block: Engineer Blueprint Table
- - Trades:
  - Novice: 
    - 1 Emerald >> 4 Redstone Torches
    - (No other ideas)
  - Apprentice: 
    - 3 Emeralds >> Brick Redstone Repeater
    - 3 Emeralds >> Brick Redstone Dropper
  - Journeyman: 
    - 5 Emeralds >> Brick Redstone Comparator
    - 5 Emeralds + Bow >> Brick Redstone Dispenser
  - Expert:
    - 8 Emeralds >> Brick Observer
    - (No ideas for another expert trade for now)
  - Master: 
    - (No ideas for master trades for now)