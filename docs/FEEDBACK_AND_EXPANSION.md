# FromAsh - Feedback & Expansion Document

## Executive Summary

Your mod concept is compelling because it respects the core challenge of Structureless Superflat while opening meaningful progression pathways. The phase-based progression is well-thought-out, and you clearly understand the constraints. However, there are design tensions that need addressing, along with significant opportunities for expansion.

---

## Section 1: Constructive Criticism

### 1.1 Phase Progression - Pacing Concerns

**Issue:** Phases 1-3 are tightly coupled to RNG with Wandering Traders.

**Feedback:**
- The entire early game hinges on WT trades (emeralds for logs/moss). While this creates tension, it may feel frustrating if players get unlucky with trades for extended periods.
- **Suggestion:** Consider adding a *non-WT alternative* that's slower/more resource-intensive but doesn't require luck. For example:
  - Crafting a primitive "Dirt Kiln" or "Composting System" that very slowly converts dirt + organic matter into fuel or seeds
  - A hand-cranked "Grinding Stone" block (crafted from flint somehow) that produces very small amounts of useful materials
  - This gives players agency and reduces frustration during unlucky stretches

ALEX COMMENT: The dependency on RNG is, for the good and bad of it, the basis for the Vanilla challenge. I wouldn't want to change the status quo for that. I'd rather make my mod more endgame focused.

### 1.2 The "Iron Bottleneck"

**Issue:** You mention needing 7-10 iron ingots early on, but also relying on zombie drops which are random.

**Feedback:**
- Iron acquisition feels underspecified. How many nights of mob farming does this realistically take?
- The requirement for "decent drop luck" with Witches creating potions, then killing burning Zombies for potatoes feels convoluted.
- **Suggestion:** Consider a "Rust/Oxidation Reversal" mechanic:
  - Zombified Piglins already exist (via lightning), and you note they drop gold. Why not add Oxidized Zombie Piglins that can drop oxidized copper, which can be crafted back into fresh copper?
  - Or, introduce a very late-game "Smelting Oxidation" mechanic in the Clay Brick Furnace where existing copper blocks can be smelted with charcoal to remove oxidation, yielding some copper dust

ALEX COMMENT: Iron griding takes a long time. But it's also part of the challenge. As for the copper methods, I am not a big fan of them (specially #2, it feels as if we're creating something out of nothing)

### 1.3 Village Curing - Single Point of Failure

**Issue:** The entire village foundation depends on curing two Zombie Villagers with one Enchanted Apple path.

**Feedback:**
- You need golden apples specifically to cure villagers. This is locked behind a single WT trade for oak saplings.
- If a player fails to secure apples (tree doesn't drop them, or they're used elsewhere), they're stuck.
- **Suggestion:** Add redundancy:
  - Allow Witch potion brewing to eventually produce Regeneration potions, which could be used as an alternative (lower effectiveness, slower cure)
  - Or, allow a secondary path: Fermented Spider Eyes + specific WT trade combinations to create a "Weak Golden Apple" that works slower

ALEX COMMENT: Again, part of the grind. Tough luck.

### 1.4 "Zombie Piglins Don't Naturally Spawn" Problem

**Issue:** You mention trapping Zombie Piglins, but you're creating them via lightning strikes, not trapping pre-existing ones.

**Feedback:**
- This is actually clever (lightning rod + pigs), but the wording made me initially confused.
- The timing dependency (waiting for thunderstorm) adds RNG again. What if a biome has low rainfall?
- **Suggestion:** 
  - Consider adding a "Lightning Attractor" block crafted from copper + logs that increases local lightning strike frequency during storms
  - Or allow a Witch-crafted "Thunder Brew" that can be poured on pigs to manually convert them (expensive, but reliable)

ALEX COMMENT: No need to worry - SSf is pretty much only played in the regular plains biomes settings.

---

## Section 2: Design Tensions & Questions

### 2.1 Furnace Tier Progression

**Problem:** You correctly identify that Mud Brick Furnaces might become obsolete once Clay Brick Furnaces exist.

**Analysis:**
- Real-life furnaces deteriorate and require maintenance, but Minecraft isn't a maintenance game (except for a few mods).
- However, Minecraft has precedent: tools wear out, enchantments degrade indirectly through use.

**Suggestions for differentiation:**
- **Specialization over durability:** Mud Brick Furnaces are "fragile furnaces" that are *fast* (0.9x cook time) but have a small chance to destroy items when breaking them mid-cook. Clay Brick Furnaces are *reliable* but normal speed.
- **Fuel efficiency:** Mud Brick Furnaces are more efficient with specific fuels (charcoal, dried kelp, bamboo) but worse with others (coal).
- **Slag/Degradation system:** Introduce a "Furnace Integrity" mechanic where cooking certain items (like clay) creates slag that accumulates. Players can:
  - Use a "Furnace Scraper" (wooden tool) to manually clean it (slow, gives slag items)
  - Use a "Kiln Wash" recipe (ash + water + clay dust) to auto-clean periodically
  - This creates ongoing engagement without being tedious

ALEX COMMENT: Destroying items is punishing the player even more for what is already a gruesome challenge - that's out of the question. Fuel efficiency is interesting - it's something that MC doesn't concern itself; rather, different types of fuel only care about the number of items they can possibly smelt. Potency is an interesting concept. Also, what could we do with slag?

### 2.2 Stone Substitution Problem (Blackstone)

**Problem:** You note blackstone would make the furnace discussion "pointless."

**Analysis:**
- This is a real design risk. Blackstone is currently unobtainable without the Nether.
- If it becomes obtainable, it trivializes your furnace progression.

**Solutions:**
- **Option A (Conservative):** Don't allow Zombie Piglins to drop blackstone in this mod. Let them drop gold ingots and pig drops only. Keep blackstone exclusive to the Nether.
- **Option B (Progressive):** Allow blackstone but make furnaces still relevant by:
  - Creating specialized furnace variants (Charcoal Kilns, Ceramic Kilns, Drying Ovens) that have different benefits
  - Making some recipes *require* a specific furnace type
  - This forces players to build multiple furnaces, creating gameplay depth

ALEX COMMENT: The Piglin route is something I will leave for some other time.

### 2.3 Missing: Fuel Acquisition

**Issue:** You haven't addressed sustainable fuel sources thoroughly.

**Current situation:**
- Charcoal from logs (good)
- Witches drop redstone/glowstone (not fuel)
- No bamboo for 1.20+ bamboo block/hanging signs

**Suggestions:**
- **Sugar Cane:** Can be traded with WT, dried into fuel
- **Pumpkins/Melons:** Farmable from WT seeds, can be dried or fermented for fuel
- **Seaweed/Kelp:** If obtainable via WT (seagrass), can be dried
- **Bone Meal Furnace:** Use bones (abundant from skeletons) to create bone meal, then burn dried seaweed for charcoal in a special "Compost Furnace"

ALEX COMMENT: We need to add bamboo as a trade for WT, that's for sure. As for other fuel sources... with vanilla blocks, we can acquire campfires from villagers and Kelp from WT; Kelp can be dried in campfires, then bundled together into a block. Charcoal would be a hell of an addition, though - way simpler to acquire and mass produce. About fermentation... you're making me want to consider adding alcohol distillation, particularly with sugarcane/sugar.

---

## Section 3: Expanded Ideas & Synergies

### 3.1 Enhanced Mud Brick System

**Concept:** Turn mud bricks from a single-use stepping stone into a full technological tier.

**Expansion:**
- **Mud Brick Furnace** (as you mentioned)
- **Mud Brick Kiln** (specialized for creating clay items):
  - Input: clay balls → Output: clay bricks (3:1)
  - Input: clay blocks → Output: hardened clay (slower, higher cost)
  - Can be fueled with organic matter exclusively
  
- **Mud Brick Forge** (hammer + mud bricks):
  - A primitive crafting station that combines materials by "striking" them
  - Input: copper dust + flint + fuel → Output: copper ingot (50% efficiency compared to smelting)
  - Creates a use for flint (from gravel) early game
  
- **Mud Brick Drying Rack**:
  - A block where you can dry items over time
  - Clay → Hardened clay (without fuel!)
  - Cactus green → Green dye
  - This creates an alternative progression path that doesn't require furnaces

### 3.2 Ash System (Expansion on Your Campfire Idea)

**Concept:** Campfires become the foundation of an ash-based crafting system.

**Full System:**
- **Campfire Evolution:**
  - Burn wood → Ash (1:8 logs yield 1 ash)
  - Burn bones → Bone Ash (valuable crafting ingredient)
  - Burn specific items (like charcoal) → Activated Ash (special properties)

- **Ash Recipes:**
  - Ash + Water → Ash Paste (ingredient for multiple recipes)
  - Ash + Clay Ball → Ash Clay (fires into Ash Clay Brick)
  - Bone Ash + Copper Dust → Rust Remover (for cleaning oxidized copper)
  - Ash + Seeds → Primitive Soap/Cleaner (decoration block that provides "Clean" texture on blocks)

- **Ash Furnace:**
  - A specialized furnace that ONLY burns ash as fuel (very efficient, clean burns)
  - Used for glazing pottery, creating special colored bricks
  - Recipe: 9 Ash Clay Bricks + 1 Stick → Ash Furnace

### 3.3 Dripstone Processing Chain

**Current issue:** Getting dripstone is hard.

**Expansion:**
- **Dripstone Harvesting:** Create a "Water Drip Collector" block (wooden frame + funnel shape) that accumulates dripping water into clay balls or other items over time
- **Dripstone Grinder:** A hand-cranked or water-wheel powered block that crushes dripstone into:
  - Dripstone Dust (crafting ingredient)
  - Fine Sand (for glassmaking or sandstone recreation)
  - Calcite Powder (decorative, or combines with ash for special mortars)

- **Dripstone + Ash Mortar:** 
  - Dripstone Dust + Ash Paste = Mortar
  - Used to "bind" bricks together into larger decorative blocks
  - Allows creation of gradient/pattern blocks without command blocks

### 3.4 New Villager Concept: The "Earthworker"

ALEX COMMENT: Don't really like this.

**Why?** To provide a progression alternative to complicated tree-based systems.

**Profession:**
- Workstation: Mud Brick Furnace (justifies building them even after upgrading)
- Specialization: Trades for soil-based resources
  
**Possible Trades:**
- Emerald → 2 Dirt Blocks (renewable resource, boring but useful)
- 4 Dirt + 1 Bone Meal → 1 Podzol (for mushroom farming)
- 5 Gravel + 1 Flint → 1 Clay Ball (creates a gravel sink)
- 1 Emerald → 8 Sand (from WT) + Earthworker upgrade → Sand Block variants (red sand, natural sand)

**Why include?** Because obtaining sand is legitimately hard, and this gives players choice: trade with WT, or breed Earthworkers.

### 3.5 Pottery & Kiln System

**Concept:** Create a parallel progression to furnaces focused on decoration and utility vessels.

**System:**
- **Clay Kiln** (Clay Brick Furnace recipe variant):
  - Specialized for firing pottery and decorative items
  - Can produce:
    - Terracotta (from clay blocks + dyes)
    - Pottery Vessels (decorative, can hold items as containers)
    - Glazed Bricks (combination of clay bricks + glaze)
    - Decorative Tiles (multiple types, can be colored)

- **Glaze System:**
  - Ash + specific ores/plants → different glaze colors
  - Ash + Copper Dust → Green/Blue Glaze
  - Ash + Bone Meal → White Glaze
  - Ash + Charcoal → Black Glaze
  - These are applied to clay items before firing

- **Pottery Wheel** (bonus idea):
  - Requires string + stick + copper ingot to build
  - Hand-cranked crafting station for shaping clay into bowls, vases, and vessels
  - Opens up decorative building without using logs

### 3.6 Water-Based Crafting (Expansion)

**Current system:** Water collection for drinking, farming, duplication.

**Expansion Ideas:**
- **Water Filtration:** Dirty water (from specific sources) → Clean water via sand/charcoal filter blocks
- **Salt Evaporation:** Salt water (ocean water) → Salt via water evaporation blocks
- **Alkali Production:** Ash + Water → Lye (used in soap, cleaning, and chemistry-based recipes)
- **Hydration System:** Some recipes require "wet" clay, which you create by:
  - Placing clay near water
  - Using water bottles on clay blocks
  - This adds a crafting dimension

---

## Section 4: Mechanical Depth Additions

### 4.1 Tool Progression

**Observation:** Your mod doesn't discuss tools beyond the initial hoe.

**Suggestions:**
- **Mud Brick Pickaxe:** Crafted with mud bricks + sticks, can mine stone (slowly), breaks quickly
- **Copper Pickaxe:** Better durability, can mine faster, slightly better than mud brick
- **Hardened Clay Pickaxe:** Even better, requires clay brick furnace
- **Tool Repair Mechanic:** Provide a "Smithing Table" alternative that uses your furnaces to repair tools (fuel-based rather than anvil)

ALEX COMMENT: Tools can be acquired via the toolsmith villager, which is an SSf obtainable villager.

### 4.2 Hunger/Farming Balance

**Observation:** You mention farming wheat, carrots, potatoes, but don't discuss sustainability metrics.

**Suggestions:**
- **Crop Rotation:** Implement a simple crop rotation where planting the same crop repeatedly reduces yield
  - Encourages farm diversification
  - Ties into the "Earthworker" villager concept for soil replenishment
  
- **Hunger Tiers:**
  - Basic: Bread, seeds (low saturation)
  - Intermediate: Cooked meat, baked potatoes (medium)
  - Advanced: Cake, cookies (high saturation but resource-intensive)
  - Rare: Enchanted golden apples (emergency food only)

ALEX COMMENT: I'd rather not implement crop rotation into MC. Too hard and not viable.

### 4.3 Technical Progression Milestones

**Create specific "achievement-like" milestones** that telegraph progression:
- Milestone 1: "First Ash" - Burn logs in a campfire, collect ash
- Milestone 2: "Pottery Master" - Create first clay brick via kiln
- Milestone 3: "Metallurgy Beginnings" - Smelt your first copper ingot
- Milestone 4: "Village Rising" - Cure your first zombie villager
- These should provide subtle buff potions or advancement notifications

---

## Section 5: Integration & Compatibility

### 5.1 Mod Compatibility Suggestions

**Your mention of Beautify: Refabricated is good.** Consider explicit synergies with:
- **Macaw's mod suite:** Add recipes that accept their decorative blocks and create variants
- **Spectrum:** Their dye system could interact with your ash glazing system
- **Farmer's Delight:** Their cooking system could use your dried ash/herbs
- **Create mod (if Fabric):** Water wheels could power your hand-cranked blocks, adding automation

ALEX COMMENT: Spectrum uses magic, so... I wouldn't want to mesh them together. There's enough magic in Vanilla MC making a lot of the heavy lifting here. As for Create, I also don't want this to be a super technical mod, but rather something close to vanilla that is easy enough to pick up.

### 5.2 Datapack-Friendliness

**Design consideration:** Make recipe outcomes data-driven so players/datapacks can customize:
- Furnace burn times
- Villager trade values
- Recipe outputs
- Progression speed

This maximizes mod lifetime and community engagement.

ALEX COMMENT: Awesome suggestion! Especially due to balancing, the community's input would make it easier to tune things.

---

## Section 6: Questions for You to Consider

1. **Dimension Access:** You explicitly exclude the Nether and End. Is the Overworld-only truly the goal, or could a "dead Nether" (no structures, limited mobs, no lava) be acceptable?
ALEX COMMENT: I'd rather not give any other dimensions an excuse to exist. Though the OG Aether and Twilight Forest mods could be accessed using only vanilla blocks... but I don't want these.

2. **Combat Balance:** Early game is extremely vulnerable. Should you add a "Difficulty Scaling" option where the mod adapts to player progression?
ALEX COMMENT: Nope. It's a tough grind.

3. **Mob Farm Automation:** You mention "pathfinding mob farms" but not their evolution. How should endgame mob farms work? Can they be improved beyond vanilla designs?
ALEX COMMENT: There are improvements to the design, especially once water and wood become available.

4. **Decoration Ceiling:** What's the ultimate decoration limit? Is "half of vanilla blocks" the goal, or do you want to exceed that while maintaining balance?
ALEX COMMENT: Ehh... I think everything's fine as is.

5. **Multiplayer Compatibility:** How does this scale with multiple players? Should trading/WT mechanics have shared cooldowns or per-player cooldowns?
ALEX COMMENT: Uhh... I won't worry about this now.

6. **Survival vs. Creative:** Should your mod include a "Building Mode" that unlocks all blocks for creative building, separate from survival progression?
ALEX COMMENT: This is pretty much a given - adding items to MC automatically makes them available as creative blocks.

---

## Section 7: High-Priority Recommendations

### Tier 1 (Essential):
1. **Add non-RNG progression paths** to reduce player frustration
2. **Specify fuel acquisition chains** in detail
3. **Clarify the furnace tier system** with clear, non-overlapping benefits
4. **Design the ash system** as a core mechanic (not just a side idea)

### Tier 2 (Highly Recommended):
5. **Create a decorative block progression** so players always have something to build
6. **Add at least 2 new villager types** to reduce WT dependency
7. **Design a tool progression path** with repair mechanics
8. **Establish clear "endgame" metrics** (what does winning look like?)

### Tier 3 (Nice to Have):
9. Polish with compatibility recipes for popular mods
10. Add cosmetic/flavor variations on furnaces and blocks
11. Include optional "hardcore" rule sets for additional challenge

---

## Section 8: Post-Review Discussion & Clarifications

### Overview
After reviewing your responses to the feedback, several themes emerged that refine the mod's direction and clarify where the design should focus.

### 8.1 RNG as Core Mechanic, Not Bug

**Your Stance:** RNG dependency (Wandering Traders, mob drops, thunderstorms) is intentional and core to the SSf challenge, not something to circumvent.

**Implication:** This shifts the mod's philosophy from "reduce frustration" to "provide meaningful progression *within* the existing grind." This is actually stronger—you're working *with* the challenge, not against it. The mod becomes about "what to do with resources when they finally arrive" rather than "how to avoid needing to grind."

**Design Focus:** Emphasize **endgame content** rather than early-game accessibility. Your mod opens doors that vanilla SSf locks, giving players goals to work toward during the inevitable grinding phases.

---

### 8.2 Slag as Strategic Material

**Your interest in slag opens several design directions:**

**Option 1: Slag as Structural Reinforcement**
- Slag + Clay Ball → Dense Clay Brick (more durable, darker texture)
- Slag dust + Mortar (Dripstone dust + Ash paste) → Reinforced Mortar (used in larger decorative builds)
- Creates a progression: Basic clay → Reinforced clay (requires furnace slag byproduct)

**Option 2: Slag as Furnace Maintenance**
- Slag Stabilizer (slag dust + bone meal) applied to furnaces before heavy use
- Reduces furnace degradation rate or prevents random failure
- Creates recurring crafting demand without being tedious

**Option 3: Slag as Decorative Block**
- Slag Block (compacted slag) as a dark, industrial-looking decorative option
- Slag Brick variants for pattern-building
- Complements the "progression from simple to refined materials" aesthetic

**Recommendation:** Combine Options 1 and 3. Let slag be both functional (reinforcement) and decorative (blocks). This gives players multiple sinks for it and prevents waste.

---

### 8.3 Fuel Efficiency & Charcoal Economy

**Your observation about fuel efficiency as "potency"** is excellent—it's something vanilla MC doesn't explore deeply. Here's a streamlined system:

**Proposed Fuel Tiers:**

| Fuel | Burn Time | Items Cooked | Use Case |
|------|-----------|--------------|----------|
| Charcoal | 8 min | 8 items | Fast, reliable (endgame default) |
| Coal (mob drop) | 8 min | 8 items | Same as charcoal, harder to get |
| Kelp Block | 20 min | 20 items | Renewable, slow (bulk smelting) |
| Bamboo Block | 13.5 min | 13.5 items | Decent, renewable |
| Log | 15 sec | 1.5 items | Emergency fuel only |

**Strategic Depth:**
- Early game: Logs (painful but necessary)
- Mid-game: Kelp blocks (slow but renewable)
- Late-game: Charcoal (fast, from logs you grow)
- Creates a clear progression without making early game impossible

**Charcoal Production:**
- Cook logs in furnace → 1 log = 1 charcoal (1:1 conversion)
- This is your "fuel multiplication": 8 logs → 8 charcoal → burn 8 charcoal to cook 8 items
- Compare to burning logs directly (8 logs burn 12 items), making charcoal slightly less efficient but more stackable/tradeable

---

### 8.4 Alcohol Distillation: Scope vs. Payoff

**Question for you:** What's the mechanical purpose of alcohol in your mod?

**Potential Payoffs (choose your direction):**

**Option A: Flavor/Decoration Only**
- Sugarcane → Sugar → Fermented → Alcohol (item)
- Alcohol + Bottles = Decorative alcohol bottles
- Can be displayed, traded with new "Brewer" villager
- **Cost:** Simple recipes, 3-4 new items
- **Payoff:** Aesthetic, zero mechanical benefit
- **Verdict:** Not worth the complexity unless you love the flavor

**Option B: High-Efficiency Fuel**
- Fermented Sugarcane → Alcohol
- Alcohol + Clay vessel → Bottled Alcohol
- Bottles can be burned in furnaces for 2x coal-equivalent (16-item burn)
- **Cost:** Recipe chains, new fuel type, balance concerns
- **Payoff:** Late-game fuel alternative, enables industrial-scale smelting
- **Verdict:** Viable if fuel economy becomes important to your progression

**Option C: Brewing/Potion Mechanic**
- Alcohol as ingredient in custom potion recipes
- Requires new brewing mechanics (outside vanilla)
- **Cost:** Significant complexity
- **Payoff:** Expanded potion system unique to your mod
- **Verdict:** Ambitious, maybe defer to later versions

**Recommendation:** If you pursue alcohol, anchor it to **Option B (fuel)**. It creates a strategic choice: "Do I grow sugarcane for food, fuel, or both?" This fits your design philosophy of "meaningful choices within constraints."

---

### 8.5 Toolsmithing & Villager Trade Routes

**Your comment about Toolsmith villagers** simplifies tool acquisition significantly. This means:

- Players get picks/axes/shovels from Toolsmith trades early
- Your mod doesn't need custom tool progression (mud brick pickaxe, etc.)
- Instead, focus on **tool enhancement** via your furnace system
- Example: Furnace-based "Tool Hardening" where you sharpen/reinforce traded tools

**Implication:** Your furnaces become tool *enhancement hubs*, not tool *sources*. This creates recurring crafting goals.

---

### 8.6 Clarified Design Scope

**Things you're focusing on:**
- Furnace tier system (Mud Brick → Clay Brick → specialized variants)
- Ash system as core mechanic (campfire → ash → multiple recipe paths)
- Charcoal production and fuel economy
- Slag utilization
- Potential alcohol distillation (under evaluation)

**Things you're deferring/excluding:**
- Early-game RNG mitigation (keep the grind)
- Custom tool progression (use Toolsmith)
- Crop rotation (too complex for MC)
- Piglins/Blackstone mechanics
- Multiplayer balancing
- Other dimensions

**This is cleaner scope.** You're building an "endgame expansion" more than a "fundamentals overhaul."

---

### 8.7 The Mud Brick Furnace Solution: Slag-to-Metal Refining

**Problem Solved:** You've identified the perfect use case for Mud Brick Furnaces—they become the *only source of slag*, which then becomes refinable into metal nuggets.

**The System:**

**Mud Brick Furnace (Unique Feature):**
- Every recipe smelted produces slag as a byproduct
- Slag accumulates in the furnace during cooking
- Player must periodically extract slag (creates resource management layer)

**Two Implementation Paths:**

**Path A: Wood Type Determines Slag Type (Realistic)**
- Oak logs → Iron-rich slag (crafts to iron nuggets more often)
- Birch logs → Copper-rich slag (crafts to copper nuggets more often)
- Dark Oak logs → Mixed slag (random metals)
- Spruce/Jungle logs → Gold-rich slag (rarer, slower refining)

**Benefits:**
- Creates strategic wood choice (do you farm oak for iron, or birch for copper?)
- Connects slag type to source material (feels logical)
- Encourages tree variety in farms
- Requires obtaining multiple wood types from WT

**Path B: Single Slag Type with Random Metallurgy (Simpler)**
- All wood types → Generic slag (one type)
- Slag in furnace has chance to be:
  - Iron nugget (60%)
  - Copper nugget (30%)
  - Gold nugget (10%)
- Extracted via clicking furnace with empty hand

**Benefits:**
- Simpler to implement and balance
- Less grinding (single slag type)
- RNG is acceptable (fits SSf philosophy)
- Don't need multi-tree farming prerequisite

**Recommendation:** Start with **Path B** (simpler), then if gameplay feels right, add **Path A** variants later.

---

**Metal Nugget Refining Furnace (Specialized):**

Since raw slag isn't directly useful, you need a second furnace to process it:

**Option 1: Slag-Smelter (Simple)**
- Uses Clay Brick Furnace (post-furnace upgrade)
- Input: Slag → Output: Metal Nugget
- No additional fuel (slag is fuel)
- Acts as secondary forge

**Option 2: Slag-Refiner (Detailed)**
- New specialized furnace block (Refined Clay or Dripstone variant)
- Input: Slag + bone meal (acts as catalyst) → Output: Metal Nugget + ash
- Creates a recipe chain: Cook → Slag → Refine with bone meal → Nugget
- Adds complexity but feels more "refinement-like"

**Recommendation:** Use **Option 1** (simple). The slag itself carries value—don't add extra ingredients unless you want to gate metal production harder.

---

**Balancing the Metal Income:**

**Iron nuggets from slag should be:** Alternative, not primary
- Suggestion: 10-15 slag → 1 iron nugget (conversion rate)
- This means smelting ~100 items in Mud Brick Furnace → ~7-10 iron nuggets
- Compare to: Mining 10 blocks of ore → 10 ore → 10 iron ingots
- The furnace route is slower but doesn't require mining or luck

**Copper nuggets:** Similar rate
- 10-15 slag → 1 copper nugget
- Creates a redundancy if players can't find enough drowned

**Gold nuggets:** Much rarer (30% chance on slag)
- Could be used for: Enchanted apples (eventually), brewing stands (not in vanilla), trade goods
- Or convert 3 gold nuggets + 1 ingot → 1 gold ingot? (allowing nugget accumulation)

---

**Impact on Progression:**

This elegantly solves the Mud Brick Furnace obsolescence problem:

| Furnace | Primary Use | Unique Feature | Endgame Relevance |
|---------|-------------|-----------------|-------------------|
| Mud Brick | General cooking | Slag generation | Always (metal source) |
| Clay Brick | General cooking | Reliable, normal | Main furnace |
| Specialized | Pottery/decoration | Unique recipes | Specific uses only |

Players keep *all three* for different reasons—perfect design.

---

### 8.8 Next Steps for Implementation

**Immediate priorities (in order):**

1. **Finalize the slag-to-metal system** (Path A or B? Conversion rates?)
2. **Define the Ash System completely** (what burns, what's produced, all recipes)
3. **Specify the three furnace types and their recipes**
4. **Design slag generation rules** (how much per item smelted?) and refining mechanics
5. **Create fuel economy spreadsheet** (exact burn times, conversion ratios)
6. **Decide on alcohol distillation** (yes/no/later?)

**Then prototype in-game** to test feel and balance.

- **Reducing RNG dependency** while maintaining tension
- **Specifying fuel and resource chains** completely
- **Adding decorative depth** without trivializing the challenge
- **Creating clear milestones** so players feel progression

The ash system and mud brick specialization ideas are your strongest expansion opportunities. Focus on making these feel essential, not optional.

This could genuinely be a beloved mod for the Superflat community.


## Section 9: Other Ideas
- Distilling can be its own separate mod, along with something I came up with - an Apothecary Villager, which substitutes in part the need for a Cleric
- A mod I really liked in concept that I just saw for ceramic blocks is "Ceramics", by KnightMiner