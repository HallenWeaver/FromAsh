# FromAsh - Design Gaps & Clarifications

## Overview

Your INITIAL_DESIGN document is strong on block/item definitions and villager trades, but lacks specification on mechanics, interactions, and systems-level design. This document outlines all gaps and provides clarifications needed before implementation.

---

## Section 1: Critical Gaps (Implementation Blockers)

### 1.1 Slag Automation System

**Current state:** "a way to automate slag removal must be implemented..."

**Problem:** You haven't specified WHAT that mechanism is. This is essential—without it, large furnace arrays become unmanageable.

**Options to choose from:**

**Option A: Slag Extractor Block**
- New block: Slag Extractor (crafted from Clay + Comparator or similar)
- Placement: Directly below Mud Brick Furnace
- Mechanics: Every 10 ticks, pulls 1 slag from furnace above
- Output: Items can be picked up by hoppers
- **Pros:** Simple, scalable, requires infrastructure investment
- **Cons:** One more block to craftit**

**Option B: Native Hopper Support**
- Modify: Hoppers can extract slag directly from Mud Brick Furnace
- Mechanics: Hoppers pull slag (but not regular items) from furnaces
- **Pros:** Uses vanilla mechanics, minimal new blocks
- **Cons:** Less intuitive; why slag but not items?

**Option C: Auto-Ejection**
- Modify: When furnace reaches 64 items (slag + items), furnace auto-ejects slag
- Mechanics: Ejected slag appears as item on ground or in adjacent block
- **Pros:** Requires no new infrastructure
- **Cons:** Sloppy; slag items drop everywhere

**Option D: Manual-Only**
- No automation. Players must right-click furnace to extract slag
- Mechanics: Right-click → slag removal GUI
- **Pros:** Simplest to implement
- **Cons:** Tedious for large arrays; directly contradicts "unmanageable" concern

**RECOMMENDATION:** Choose **Option A (Slag Extractor Block)**. It:
- Creates infrastructure gameplay (similar to vanilla furnace setups)
- Is scalable (multiple extractors for arrays)
- Feels balanced (requires resource investment)
- Naturally leads to automation with hoppers

ALEX COMMENT: I am still unsure as to how to approach this. The "lore" reason for slag removal needing to be manual is because slag as a byproduct does incur on buildup, but maybe for simplicity's sake I'd rather have it function like Ash in regards of hopper pickup - It still incurs on a buildup of items, but hoppers can pick up both the smelted item (charcoal, green dye, etc.) and the Slag item.

---

### 1.2 Furnace Interaction Model

**Current state:** Vague mentions of "visual cues" and slag removal.

**Missing:** Exact player interaction flow.

**Questions to answer:**

1. **How does player extract slag from Mud Brick Furnace?**
   - Right-click with empty hand?
   - Right-click with special tool?
   - GUI button?
   - Automatic (via Slag Extractor block)?

2. **What's the "visual cue" at 16/32/48/64 slag?**
   - Texture changes on furnace? (Gets progressively darker/grimier?)
   - Particle effects? (Slag particles pouring out?)
   - Overlay text on furnace?
   - Sound effects?

3. **When furnace is full (64 items total), what happens?**
   - Furnace stops accepting input?
   - Player can still extract finished items?
   - Player can still extract slag?
   - What if recipe finishes mid-block? (Player has 60 items + slag, recipe finishes → 61 items)

4. **Can you extract slag mid-cook?**
   - Yes: Furnace continues cooking, slag automatically falls out
   - No: Must stop all cooking to extract slag

**RECOMMENDATION:** 

**Slag Extraction Model:**
- Right-click Mud Brick Furnace with empty hand → opens GUI
- GUI shows: [Items cooking] [Slag accumulated] [Extract Slag button]
- Click "Extract Slag" → all slag drops as items on ground
- Furnace continues cooking during this

**Visual Cue Model:**
- At 16 slag: Furnace develops small cracks (texture overlay)
- At 32 slag: More prominent cracks, slight glow (inside cracks show orange)
- At 48 slag: Heavy cracks, red glow, furnace looks damaged
- At 64 slag: Furnace looks broken, particles suggest imminent failure
- This telegraphs "clean me now" without blocking progress

ALEX COMMENT: On the extraction model, the Mud Brick Furnace UI would contain two output slots; one for the smelted item, another one for Slag (and only Slag). It can be easily interacted with.

ALEX COMMENT: The visual cue should be two-fold: reduced light-levels coming from the furnace (13 >> 9 >> 5 >> 1) and the inside should display more and more black "things" forming. The furnace has no reason to appear cracked; it's as if slag "suffocates" the furnace and stops oxygen to come in for the combustion process.

---

### 1.3 Slag Refining Mechanics

**Current state:** "slag can be smelted into a random metallic nugget, with 60% chance of getting Iron, 30% chance of getting Copper, and 10% of getting Gold"

**Ambiguous:** How does the randomness work?

**Questions:**

1. **Is ratio 1:1 (always)?**
   - 1 slag → 1 nugget (type random)
   - **OR** 1 slag → nugget with 60% chance of iron, 30% copper, 10% gold

2. **Or is it probabilistic output?**
   - 1 slag → 0-2 nuggets (random amount + type)

3. **Can you smelt in bulk?**
   - Add 64 slag at once, get random mix of nuggets?
   - Or does furnace need to process one at a time?

**RECOMMENDATION:**

**Slag Refining (Clear Model):**
- Each slag placed in Ceramic Furnace = 1 smelt job
- Smelting 1 slag (with double fuel cost) produces 1 nugget
- Nugget type is random: 60% iron, 30% copper, 10% gold
- Multiple slag can queue up (but still process 1 per cook cycle)
- Cook time: 10 seconds per slag (baseline; adjust per feedback)

Example: 10 slag in queue → 10 nuggets produced over ~100 seconds
- ~6 iron nuggets
- ~3 copper nuggets  
- ~1 gold nugget (statistically)

ALEX COMMENT: Each Slag item always outputs a single nugget, with the probability changes displayed. You can smelt in bulk, yes, but this made me realize a crucial issue: furnaces only have one output slot. We'd need to change that to at least three slots, but this could bastardize the original intent of a furnace. Perhaps we need a new block.

---

## Section 2: High-Priority Gaps

### 2.1 Wood Type Slag Differentiation

**Earlier discussion:** You mentioned different wood types → different slag types (oak = iron-rich, etc.)

**Current design:** No mention of this. Was it decided YES or NO?

**If YES (Recommended):**
Specify:
- Oak logs → Iron-rich slag → 70% chance iron nugget
- Birch logs → Copper-rich slag → 70% chance copper nugget
- Dark Oak logs → Mixed slag → 50% iron, 40% copper, 10% gold
- Other woods → Generic slag → 60% iron, 30% copper, 10% gold

**Gameplay impact:** Players must diversify tree farms to get balanced metal distribution.

**If NO:**
Keep current design (all slag identical, random output).

**RECOMMENDATION:** **YES.** This creates strategic depth and encourages multi-tree farming.

ALEX COMMENT: I'll go with the no. Simplifying game design.

---

### 2.2 Emerald Economy

**Current state:** No mention of how many emeralds players realistically earn.

**Critical for balance:** If emeralds are scarce, Geologist/Engineer trades become "essential gates." If abundant, they're "luxury options."

**Questions:**

1. **What's the emerald source?**
   - Villager trading (selling items)?
   - Which items? (What do players have excess of?)
   - What's the exchange rate?

2. **Realistic emerald income?**
   - Per day? Per week?
   - Early game vs. late game?

3. **Emerald sinks (your trades):**
   - Geologist: 3-10 emeralds per trade
   - Engineer: 1-10 emeralds per trade
   - Do players feel pressured to do both, or can they pick one?

**RECOMMENDATION:** 

**Establish emerald targets:**
- Early game (pre-village): 0 emeralds (can't trade yet)
- Mid-game (1-2 villagers): 10-20 emeralds/day achievable
- Late-game (full village): 50+ emeralds/day possible
- Your mod trades should feel like "choices" (use emeralds for sand OR redstone, not both)

**Then balance trades accordingly:**
- Essential trades: 3-5 emeralds (worth spending)
- Luxury trades: 8-15 emeralds (nice-to-have)
- Premium trades: 20+ emeralds (endgame flex)

**Current trades assessment:**
- Geologist Novice (3 emeralds → sand): Fair, renewable
- Engineer Journeyman (5 emeralds → comparator): Good, fills gap
- Geologist Expert (10 emeralds → pottery sherd): Expensive for cosmetic—might be too much

ALEX COMMENT: In a Vanilla challenge, the emerald economy is pretty solid - although the lack of flint, and therefore fletchers, hurts a bit. Still, a solid amount of farmers can buy a surplus of crops, which provides enough emeralds for doing anything else. Adding more villagers just makes it even easier to obtain emeralds from alternative sources, so this is a non-issue.

---

### 2.3 Dyed Blocks Mechanics

**Current state:** "similarly to what is done for Terracotta"

**Ambiguous:** Exact crafting and re-dyeing rules.

**Questions:**

1. **Recipe format?**
   - 8 Ceramic Bricks + 1 dye in 3×3 grid (like terracotta)?
   - Output: 8 Dyed Ceramic Bricks?

2. **Can you re-dye?**
   - 8 Red Ceramic + 1 Blue Dye → 8 Blue Ceramic?
   - **OR** dyed blocks are locked to their color?

3. **How many colors?**
   - All 16 vanilla dyes (White, Orange, Magenta, etc.)?
   - Or subset?

4. **Usage beyond decoration?**
   - Are dyed bricks required for any recipes?
   - Or purely cosmetic?

**RECOMMENDATION:**

**Dye Mechanics (Clear Model):**
- Recipe: 8 Ceramic Bricks + 1 dye in 3×3 grid → 8 Dyed Ceramic Bricks (same as terracotta)
- Can re-dye: Yes (convert one color to another)
- Supports: All 16 vanilla dyes
- Usage: Purely decorative (no recipes require specific colors)
- Same mechanics apply to Porcelain blocks (Dyed Porcelain, etc.)

ALEX COMMENT: I agree with all of the recommendations except for the re-dye mechanic; I'll pick a page from the terracotta book and not allow for re-dyeing.

---

### 2.4 Tiled Porcelain Clarification

**Current state:** "obtained by re-smelting Dyed Porcelain blocks" with "glossy finish"

**Questions:**

1. **How many patterns?**
   - 1 pattern (all dyed → tiled looks same)?
   - Multiple patterns (dyed red → red tile, dyed blue → blue tile, etc.)?

2. **Behavior like Glazed Terracotta?**
   - Directional (rotates with placement)?
   - Or static?

3. **Can tiled be dyed further?**
   - Re-smelt Dyed Porcelain → Tiled Porcelain (fixed pattern)
   - **OR** Smelt Tiled → can re-dye → becomes Dyed again?

4. **Conversion ratio?**
   - 1 Dyed Porcelain → 1 Tiled Porcelain?

**RECOMMENDATION:**

**Tiled Porcelain (Clear Model):**
- 1 Dyed Porcelain block (any color) → re-smelt → 1 Tiled Porcelain block (same color)
- Tiled blocks have directional patterns (rotate with placement, like Glazed Terracotta)
- Each dye color has unique pattern (red tiles look different from blue tiles)
- Cannot be re-dyed once tiled (pure decorative end-state)
- Visual: Glossy finish with intricate geometric patterns specific to color

ALEX COMMENT: Recommendation looks good. But, I've thought about changing the obtaining method to change from smelting to using the grindstone (or the 2x2 grid where 4 items go in, 4 go out) to get the Tiled variant.

---

## Section 3: Medium-Priority Gaps

### 3.1 Ceramic Bricks & Unfired Ceramic Crafting

**Current state:** "Ash + Clay Ball → Unfired Ceramic Brick"

**Missing specifics:**

1. **Crafting mechanism?**
   - Crafting table recipe?
   - Special workbench?
   - Right-click ash on clay?

2. **Ratios?**
   - 1 ash + 1 clay = 1 unfired brick?
   - Or different ratio?

3. **Unfired → Fired progression:**
   - Unfired Ceramic Block (4 unfired bricks) → smelt → Porcelain Block?
   - Or Unfired Bricks → individually smelt → Fired Bricks?

4. **Placement rules:**
   - Can unfired ceramics be placed in world, or only inventory items?
   - If placeable, do they have special behavior? (Like wet clay?)

**RECOMMENDATION:**

**Ceramic Crafting (Clear Model):**
- Ash + Clay Ball (crafting table, 1:1) → Unfired Ceramic Brick
- 4 Unfired Ceramic Bricks (2×2 grid) → 1 Unfired Ceramic Block
- Unfired Ceramic Block (in furnace) → 1 Porcelain Block
- Alternative: Unfired Ceramic Brick (in furnace) → 1 Fired Ceramic Brick
- 4 Fired Ceramic Bricks (2×2) → 1 Ceramic Brick Block
- Unfired variants are NOT placeable in world (inventory only)

ALEX COMMENT: Unfired Ceramic Brick crafting should be possible with the regular 2x2 grid (which is the minimal crafting grid in the game, available at all times to the player). The Unfired Ceramic Block can be placed as a decorative block, and is the block to be dyed before turning it into Porcelain Blocks and then polished into Tiled Porcelain Blocks.

---

### 3.2 Ceramic Bricks: Are They Buildable?

**Current state:** Blocks exist but unclear if they're full blocks or just items.

**Questions:**

1. **Can you place Ceramic Brick Blocks in world?** (Like regular bricks)
2. **Do they need to be converted from something first?**
3. **Recipe chain:**
   - Unfired Ceramic Brick → smelt (in furnace, not a block) → Fired Ceramic Brick
   - Fired Ceramic Brick → place in world as "Ceramic Brick Block"?
   - Or are "Ceramic Bricks" and "Ceramic Brick Block" same thing?

**Recommendation:** Clarify terminology:
- **Unfired Ceramic Brick** = item (uncooked)
- **Ceramic Brick** = item (cooked)
- **Ceramic Brick Block** = world block (4 bricks stacked)

ALEX COMMENT: The Brick Block can be placed, but the Brick (either fired or unfired) cannot, and only stays in as an item.

---

### 3.3 Brick Crafter Functionality

**Current state:** "Functions as an alternative variant to a regular crafter"

**Missing:** Why include it? What's the mechanical purpose?
ALEX COMMENT: Because we have no stone in Structureless Superflat, and regular crafters require it.

**Questions:**

1. **Functionally identical to vanilla Crafter?**
   - Auto-crafts recipes in a 3×3 grid?
   - Same output/speed?

2. **Why would players choose Brick Crafter over vanilla?**
   - Aesthetic only?
   - Different behavior? (Faster? Different recipes?)
   - Required for specific recipes?

3. **Brick Crafter recipe:**
   - Currently: "requires a brick dropper in its recipe"
   - Full recipe: 3 Brick Blocks + 1 Brick Dropper + 2 Sticks + Redstone?

**RECOMMENDATION:**

**Brick Crafter (Decision needed):**
- If purely aesthetic: Keep it, but make clear it's a variant
- If functional: Specify what makes it different
- Suggested approach: **Aesthetic variant only**
  - Functionally identical to vanilla Crafter
  - Provides "all-brick" building aesthetic
  - No mechanical advantage

---

### 3.4 Pottery Sherds & Brush Usage

**Current state:** Geologist trades Brush (5 emeralds) and Pottery Sherds (10 emeralds each)

**Missing:** What are these for?
ALEX COMMENT: These are the same items from Vanilla MC.

**Questions:**

1. **Brush usage:**
   - Is it the vanilla archaeology brush?
   - Does it dig pottery from special blocks?
   - Or is it purely decorative?

2. **Pottery Sherds:**
   - Are they vanilla shards (20 types)?
   - Just decorative display items?
   - Required for anything?

3. **Why trade them?**
   - Emerald value suggests they're desirable
   - But unclear if functional or aesthetic

ALEX COMMENT: Just for decorative value.

**RECOMMENDATION:**

**Pottery System (Decision needed):**
- If purely decorative: Mark as such, reduce emerald cost (5 per sherd, not 10)
- If functional: Specify what they craft into
- Suggested approach: **Decorative only**
  - Pottery Sherds are display items (like amethyst)
  - Brush is vanilla archaeology tool (for future content expansion)
  - Players collect for aesthetic village decoration
  - Keep 10 emeralds (premium for collectors)

---

### 3.5 Wood Type Handling

**Current state:** No specification of which wood types are supported.

**Missing:**

1. **Which woods generate slag?**
   - All vanilla woods (Oak, Spruce, Birch, Jungle, Acacia, Dark Oak, Mangrove)?
   - Cherry wood (1.20+)?
   - Nether woods (unavailable in SSf anyway)?

2. **Do different woods have different properties?**
   - Or all identical for slag purposes?

3. **If different properties (related to 2.1):**
   - Each wood type maps to specific slag type
   - Specify all mappings

**RECOMMENDATION:**

**Wood Support (Clear Model):**
- All vanilla overworld woods supported: Oak, Spruce, Birch, Jungle, Acacia, Dark Oak, Mangrove, Cherry
- Nether woods excluded (not available in SSf)
- If implementing wood-type slag differentiation (recommended from 2.1):
  - Oak → Iron-rich slag
  - Birch → Copper-rich slag
  - Dark Oak → Mixed slag
  - Others → Generic slag
- All wood types produce ash identically (no variance)

ALEX COMMENT: Important distinction to be made! Nether "woods" can't be burned, so they can't generate slag by definition. This is a non-issue for Structureless Superflat worlds since the Nether will always remain off-limits, but for regular worlds the distinction is important.

---

## Section 4: Low-Priority Gaps

### 4.1 Workstation Block Requirements

**Current state:** Described as "cosmetic block, solely for [profession] use"

**Question:** Is this descriptive or prescriptive?

**Options:**
- **Required:** Villager ONLY works if workstation block nearby (like vanilla)
- **Optional:** Workstation not required, purely decorative

**RECOMMENDATION:** **Required** (consistent with vanilla). Specify:
- Geology Table must be within 16 blocks of Geologist for them to work
- Engineering Blueprint Table must be within 16 blocks of Engineer for them to work

ALEX COMMENT: Not sure why you would ever think they'd differ from other workstations but OK. They will function like regular workstations.

---

### 4.2 Brick Redstone Variants

**Current state:** "Functions as an alternative variant to a regular [component]"

**Questions:**

1. **Are they functionally identical?**
   - Brick Repeater = regular repeater, just looks like brick?
   - Brick Comparator = regular comparator, just looks like brick?

2. **Why include them if identical?**
   - Aesthetic matching (all-brick builds)?
   - No mechanical advantage?

**RECOMMENDATION:**

**Brick Redstone Variants (Decision):**
- All are **functionally identical** to vanilla counterparts
- Serve **aesthetic purposes** only (all-brick redstone builds)
- No mechanical changes or special behaviors
- Simply texture/model variants

ALEX COMMENT: I sometimes think you've forgotten that I've explicitly declared that this mod is focused on Structureless Superflat play. These blocks are functionally similar to their stone counterparts, and are the only possible alternatives in SSf. In regular worlds they would be fitting just a decorative alternative for more industrial builds, but in SSf they are vital.

---

### 4.3 Slag & Ash Stack Sizes

**Current state:** Not mentioned.

**Questions:**

1. **Max stack size?** (64? 32? 16?)
2. **Can store in barrels/hoppers?**
3. **Can display in item frames?**

**RECOMMENDATION:**

- Slag: 64 max stack (like normal items)
- Ash: 64 max stack
- Both: Compatible with hoppers, barrels, item frames (standard item behavior)

ALEX COMMENT: That's how I envisioned it.

---

### 4.4 Unfired Ceramic Block Behavior

**Current state:** "function similarly to clay but have a darker texture"

**Questions:**

1. **Are they placeable in world?** (Like clay blocks?)
2. **Do they have special behavior?** (Can you only smelt in furnace?)
3. **Or are they purely visual variants?**

**RECOMMENDATION:**

- Unfired Ceramic Blocks are placeable in world (like clay)
- Appearance: Darker tan/beige color (distinct from clay)
- Behavior: Identical to clay (can be smelted into porcelain, nothing else)

ALEX COMMENT: Correct.

---

## Section 5: Implementation Checklist

### Must-Haves (Before starting code):
- [ ] Choose slag automation mechanism (Option A recommended)
- [ ] Specify furnace interaction model (GUI for slag extraction)
- [ ] Decide on wood-type slag differentiation (YES recommended)
- [ ] Define emerald economy targets
- [ ] Clarify slag refining (1:1 ratio, random type)

### Should-Haves (Before first build):
- [ ] Complete emerald economy (exact costs for each trade)
- [ ] Specify dye mechanics (recipe format, re-dyeing rules)
- [ ] Clarify tiled porcelain (pattern generation, directional behavior)
- [ ] Define ceramic crafting chain (exact recipes, ratios)
- [ ] Clarify Brick Crafter purpose (aesthetic only? or functional?)

### Nice-to-Haves (Can iterate on):
- [ ] Workstation requirement confirmation (required or optional?)
- [ ] Wood type support list (all woods? subset?)
- [ ] Redstone variants clarification (aesthetic only)
- [ ] Pottery sherd/brush purpose (decorative? functional?)
- [ ] Slag/ash stack sizes and storage

---

## Section 6: Recommended Priority Order

**Week 1 (Foundational):**
1. Slag automation system design
2. Furnace interaction model
3. Slag refining mechanics (1:1 ratio)
4. Emerald economy framework

**Week 2 (Core Mechanics):**
5. Wood-type slag differentiation
6. Dye mechanics finalization
7. Ceramic crafting chain (complete recipes)
8. Complete emerald trade costs

**Week 3+ (Polish):**
9. Tiled porcelain patterns
10. Redstone variant specifications
11. Pottery/brush mechanics
12. Edge case handling (stacking, storage, etc.)

---

## Conclusion

Your design is **85% complete**. The remaining 15% is clarification on interactions and systems.

**Critical path forward:**
1. Make decisions on the 5 critical gaps (Section 1)
2. Fill in the 5 high-priority gaps (Section 2)
3. Use clarifications from Sections 3-4 as you code

Once these gaps are filled, you have a **complete, implementation-ready specification.**

Would you like me to help you work through any of these gaps in detail?
