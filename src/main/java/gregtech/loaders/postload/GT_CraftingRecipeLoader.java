package gregtech.loaders.postload;

import cpw.mods.fml.common.Loader;
import gregtech.GT_Mod;
import gregtech.api.GregTech_API;
import gregtech.api.enums.*;
import gregtech.api.items.GT_RadioactiveCellIC_Item;
import gregtech.api.util.GT_Log;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class GT_CraftingRecipeLoader
        implements Runnable {
    public void run() {
        GT_Log.out.println("GT_Mod: Adding nerfed Vanilla Recipes.");
        GT_ModHandler.addCraftingRecipe(new ItemStack(Items.bucket, 1), GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_SHAPED_RECIPES, new Object[]{"XhX", " X ", Character.valueOf('X'), OrePrefixes.plate.get(Materials.AnyIron)});
        if (!GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.recipereplacements, "Iron.Bucket", true)) {
            GT_ModHandler.addCraftingRecipe(new ItemStack(Items.bucket, 1), GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"X X", " X ", Character.valueOf('X'), OrePrefixes.ingot.get(Materials.AnyIron)});
        }
        ItemStack tMat = new ItemStack(Items.iron_ingot);
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.recipereplacements, "Iron.PressurePlate", true)) {
            ItemStack tStack;
            if (null != (tStack = GT_ModHandler.removeRecipe(new ItemStack[]{tMat, tMat, null, null, null, null, null, null, null}))) {
                GT_ModHandler.addCraftingRecipe(tStack, GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_RECIPES, new Object[]{"XXh", Character.valueOf('X'), OrePrefixes.plate.get(Materials.AnyIron), Character.valueOf('S'), OrePrefixes.stick.get(Materials.Wood), Character.valueOf('I'), OrePrefixes.ingot.get(Materials.AnyIron)});
            }
        }
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.recipereplacements, "Iron.Door", true)) {
            ItemStack tStack;
            if (null != (tStack = GT_ModHandler.removeRecipe(new ItemStack[]{tMat, tMat, null, tMat, tMat, null, tMat, tMat, null}))) {
                GT_ModHandler.addCraftingRecipe(tStack, GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_RECIPES, new Object[]{"XX ", "XXh", "XX ", Character.valueOf('X'), OrePrefixes.plate.get(Materials.AnyIron), Character.valueOf('S'), OrePrefixes.stick.get(Materials.Wood), Character.valueOf('I'), OrePrefixes.ingot.get(Materials.AnyIron)});
            }
        }
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.recipereplacements, "Iron.Cauldron", true)) {
            ItemStack tStack;
            if (null != (tStack = GT_ModHandler.removeRecipe(new ItemStack[]{tMat, null, tMat, tMat, null, tMat, tMat, tMat, tMat}))) {
                GT_ModHandler.addCraftingRecipe(tStack, GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_RECIPES, new Object[]{"X X", "XhX", "XXX", Character.valueOf('X'), OrePrefixes.plate.get(Materials.AnyIron), Character.valueOf('S'), OrePrefixes.stick.get(Materials.Wood), Character.valueOf('I'), OrePrefixes.ingot.get(Materials.AnyIron)});
            }
        }
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.recipereplacements, "Iron.Hopper", true)) {
            ItemStack tStack;
            if (null != (tStack = GT_ModHandler.removeRecipe(new ItemStack[]{tMat, null, tMat, tMat, new ItemStack(Blocks.chest, 1, 0), tMat, null, tMat, null}))) {
                GT_ModHandler.addCraftingRecipe(tStack, GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_RECIPES, new Object[]{"XwX", "XCX", " X ", Character.valueOf('X'), OrePrefixes.plate.get(Materials.AnyIron), Character.valueOf('S'), OrePrefixes.stick.get(Materials.Wood), Character.valueOf('I'), OrePrefixes.ingot.get(Materials.AnyIron), Character.valueOf('C'), "craftingChest"});
            }
        }
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.recipereplacements, "Iron.Bars", true)) {
            ItemStack tStack;
            if (null != (tStack = GT_ModHandler.removeRecipe(new ItemStack[]{tMat, tMat, tMat, tMat, tMat, tMat, null, null, null}))) {
                tStack.stackSize /= 2;
                GT_ModHandler.addCraftingRecipe(tStack, GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_RECIPES, new Object[]{" w ", "XXX", "XXX", Character.valueOf('X'), OrePrefixes.stick.get(Materials.AnyIron), Character.valueOf('S'), OrePrefixes.stick.get(Materials.Wood), Character.valueOf('I'), OrePrefixes.ingot.get(Materials.AnyIron)});
            }
        }
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("ironFence", 6L), GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.REVERSIBLE, new Object[]{"XXX", "XXX", " w ", Character.valueOf('X'), OrePrefixes.stick.get(Materials.AnyIron), Character.valueOf('S'), OrePrefixes.stick.get(Materials.Wood), Character.valueOf('I'), OrePrefixes.ingot.get(Materials.AnyIron)});

        tMat = new ItemStack(Items.gold_ingot);
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.recipereplacements, "Gold.PressurePlate", true)) {
            ItemStack tStack;
            if (null != (tStack = GT_ModHandler.removeRecipe(new ItemStack[]{tMat, tMat, null, null, null, null, null, null, null}))) {
                GT_ModHandler.addCraftingRecipe(tStack, GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_RECIPES, new Object[]{"XXh", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Gold), Character.valueOf('S'), OrePrefixes.stick.get(Materials.Wood), Character.valueOf('I'), OrePrefixes.ingot.get(Materials.Gold)});
            }
        }
        tMat = GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Rubber, 1L);
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.recipereplacements, "Rubber.Sheet", true)) {
            ItemStack tStack;
            if (null != (tStack = GT_ModHandler.removeRecipe(new ItemStack[]{tMat, tMat, tMat, tMat, tMat, tMat, null, null, null}))) {
                GT_ModHandler.addCraftingRecipe(tStack, GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_RECIPES, new Object[]{"XXX", "XXX", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Rubber)});
            }
        }
        GT_ModHandler.removeRecipeByOutput(ItemList.Bottle_Empty.get(1L, new Object[0]));
        GT_ModHandler.removeRecipeByOutput(ItemList.IC2_Spray_WeedEx.get(1L, new Object[0]));
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("reBattery", 1L));
        GT_ModHandler.removeRecipeByOutput(new ItemStack(Blocks.tnt));

        ItemStack tStack = GT_ModHandler.removeRecipe(new ItemStack[]{new ItemStack(Blocks.planks, 1, 0), null, null, new ItemStack(Blocks.planks, 1, 0)});
        if (tStack != null) {
            GT_ModHandler.addCraftingRecipe(GT_Utility.copyAmount(GT_Mod.gregtechproxy.mNerfedWoodPlank ? tStack.stackSize : tStack.stackSize * 5 / 4, new Object[]{tStack}), GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"s", "P", "P", Character.valueOf('P'), OrePrefixes.plank.get(Materials.Wood)});
            GT_ModHandler.addCraftingRecipe(GT_Utility.copyAmount(GT_Mod.gregtechproxy.mNerfedWoodPlank ? tStack.stackSize / 2 : tStack.stackSize, new Object[]{tStack}), GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.BUFFERED, new Object[]{"P", "P", Character.valueOf('P'), OrePrefixes.plank.get(Materials.Wood)});
        }
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.wooden_pressure_plate, 1, 0), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"PP", Character.valueOf('P'), OrePrefixes.plank.get(Materials.Wood)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.stone_button, 2, 0), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"S", "S", Character.valueOf('S'), OrePrefixes.stone});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.stone_pressure_plate, 1, 0), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"SS", Character.valueOf('S'), OrePrefixes.stone});
        GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Blocks.stone_button, 1, 0), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.stone});

        GT_Log.out.println("GT_Mod: Adding Vanilla Convenience Recipes.");

        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.stonebrick, 1, 3), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"f", "X", Character.valueOf('X'), new ItemStack(Blocks.double_stone_slab, 1, 8)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.gravel, 1, 0), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"h", "X", Character.valueOf('X'), new ItemStack(Blocks.cobblestone, 1, 0)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.cobblestone, 1, 0), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"h", "X", Character.valueOf('X'), new ItemStack(Blocks.stone, 1, 0)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.stonebrick, 1, 2), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"h", "X", Character.valueOf('X'), new ItemStack(Blocks.stonebrick, 1, 0)});
        GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Blocks.double_stone_slab, 1, 8), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{new ItemStack(Blocks.double_stone_slab, 1, 0)});
        GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Blocks.double_stone_slab, 1, 0), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{new ItemStack(Blocks.double_stone_slab, 1, 8)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.double_stone_slab, 1, 0), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"B", "B", Character.valueOf('B'), new ItemStack(Blocks.stone_slab, 1, 0)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.cobblestone, 1, 0), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"B", "B", Character.valueOf('B'), new ItemStack(Blocks.stone_slab, 1, 3)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.brick_block, 1, 0), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"B", "B", Character.valueOf('B'), new ItemStack(Blocks.stone_slab, 1, 4)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.stonebrick, 1, 0), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"B", "B", Character.valueOf('B'), new ItemStack(Blocks.stone_slab, 1, 5)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.nether_brick, 1, 0), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"B", "B", Character.valueOf('B'), new ItemStack(Blocks.stone_slab, 1, 6)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.quartz_block, 1, 0), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"B", "B", Character.valueOf('B'), new ItemStack(Blocks.stone_slab, 1, 7)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.double_stone_slab, 1, 8), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"B", "B", Character.valueOf('B'), new ItemStack(Blocks.stone_slab, 1, 8)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.planks, 1, 0), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"B", "B", Character.valueOf('B'), new ItemStack(Blocks.wooden_slab, 1, 0)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.planks, 1, 1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"B", "B", Character.valueOf('B'), new ItemStack(Blocks.wooden_slab, 1, 1)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.planks, 1, 2), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"B", "B", Character.valueOf('B'), new ItemStack(Blocks.wooden_slab, 1, 2)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.planks, 1, 3), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"B", "B", Character.valueOf('B'), new ItemStack(Blocks.wooden_slab, 1, 3)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.planks, 1, 4), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"B", "B", Character.valueOf('B'), new ItemStack(Blocks.wooden_slab, 1, 4)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.planks, 1, 5), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"B", "B", Character.valueOf('B'), new ItemStack(Blocks.wooden_slab, 1, 5)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.planks, 1, 6), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"B", "B", Character.valueOf('B'), new ItemStack(Blocks.wooden_slab, 1, 6)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.planks, 1, 7), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"B", "B", Character.valueOf('B'), new ItemStack(Blocks.wooden_slab, 1, 7)});

        GT_ModHandler.addCraftingRecipe(new ItemStack(Items.stick, 2, 0), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"s", "X", Character.valueOf('X'), new ItemStack(Blocks.deadbush, 1, 32767)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Items.stick, 2, 0), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"s", "X", Character.valueOf('X'), new ItemStack(Blocks.tallgrass, 1, 0)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Items.stick, 1, 0), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"s", "X", Character.valueOf('X'), OrePrefixes.treeSapling});

        GT_ModHandler.addCraftingRecipe(new ItemStack(Items.comparator, 1, 0), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" T ", "TQT", "SSS", Character.valueOf('Q'), OreDictNames.craftingQuartz, Character.valueOf('S'), OrePrefixes.stoneSmooth, Character.valueOf('T'), OreDictNames.craftingRedstoneTorch});

        GT_Log.out.println("GT_Mod: Adding Tool Recipes.");
        GT_ModHandler.addCraftingRecipe(new ItemStack(Items.minecart, 1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_SHAPED_RECIPES, new Object[]{" h ", "PwP", "WPW", Character.valueOf('P'), OrePrefixes.plate.get(Materials.AnyIron), Character.valueOf('W'), ItemList.Component_Minecart_Wheels_Iron});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Items.minecart, 1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" h ", "PwP", "WPW", Character.valueOf('P'), OrePrefixes.plate.get(Materials.Steel), Character.valueOf('W'), ItemList.Component_Minecart_Wheels_Steel});

        GT_ModHandler.addCraftingRecipe(new ItemStack(Items.chest_minecart, 1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_SHAPED_RECIPES, new Object[]{"X", "C", Character.valueOf('C'), new ItemStack(Items.minecart, 1), Character.valueOf('X'), OreDictNames.craftingChest});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Items.furnace_minecart, 1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_SHAPED_RECIPES, new Object[]{"X", "C", Character.valueOf('C'), new ItemStack(Items.minecart, 1), Character.valueOf('X'), OreDictNames.craftingFurnace});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Items.hopper_minecart, 1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_SHAPED_RECIPES, new Object[]{"X", "C", Character.valueOf('C'), new ItemStack(Items.minecart, 1), Character.valueOf('X'), new ItemStack(Blocks.hopper, 1, 32767)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Items.tnt_minecart, 1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_SHAPED_RECIPES, new Object[]{"X", "C", Character.valueOf('C'), new ItemStack(Items.minecart, 1), Character.valueOf('X'), new ItemStack(Blocks.tnt, 1, 32767)});

        GT_ModHandler.addCraftingRecipe(new ItemStack(Items.chainmail_helmet, 1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_SHAPED_RECIPES, new Object[]{"RRR", "RhR", Character.valueOf('R'), OrePrefixes.ring.get(Materials.Steel)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Items.chainmail_chestplate, 1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_SHAPED_RECIPES, new Object[]{"RhR", "RRR", "RRR", Character.valueOf('R'), OrePrefixes.ring.get(Materials.Steel)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Items.chainmail_leggings, 1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_SHAPED_RECIPES, new Object[]{"RRR", "RhR", "R R", Character.valueOf('R'), OrePrefixes.ring.get(Materials.Steel)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Items.chainmail_boots, 1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_SHAPED_RECIPES, new Object[]{"R R", "RhR", Character.valueOf('R'), OrePrefixes.ring.get(Materials.Steel)});

        GT_Log.out.println("GT_Mod: Adding Wool and Color releated Recipes.");
        GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Blocks.wool, 1, 1), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{new ItemStack(Blocks.wool, 1, 0), Dyes.dyeOrange});
        GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Blocks.wool, 1, 2), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{new ItemStack(Blocks.wool, 1, 0), Dyes.dyeMagenta});
        GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Blocks.wool, 1, 3), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{new ItemStack(Blocks.wool, 1, 0), Dyes.dyeLightBlue});
        GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Blocks.wool, 1, 4), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{new ItemStack(Blocks.wool, 1, 0), Dyes.dyeYellow});
        GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Blocks.wool, 1, 5), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{new ItemStack(Blocks.wool, 1, 0), Dyes.dyeLime});
        GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Blocks.wool, 1, 6), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{new ItemStack(Blocks.wool, 1, 0), Dyes.dyePink});
        GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Blocks.wool, 1, 7), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{new ItemStack(Blocks.wool, 1, 0), Dyes.dyeGray});
        GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Blocks.wool, 1, 8), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{new ItemStack(Blocks.wool, 1, 0), Dyes.dyeLightGray});
        GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Blocks.wool, 1, 9), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{new ItemStack(Blocks.wool, 1, 0), Dyes.dyeCyan});
        GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Blocks.wool, 1, 10), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{new ItemStack(Blocks.wool, 1, 0), Dyes.dyePurple});
        GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Blocks.wool, 1, 11), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{new ItemStack(Blocks.wool, 1, 0), Dyes.dyeBlue});
        GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Blocks.wool, 1, 12), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{new ItemStack(Blocks.wool, 1, 0), Dyes.dyeBrown});
        GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Blocks.wool, 1, 13), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{new ItemStack(Blocks.wool, 1, 0), Dyes.dyeGreen});
        GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Blocks.wool, 1, 14), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{new ItemStack(Blocks.wool, 1, 0), Dyes.dyeRed});
        GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Blocks.wool, 1, 15), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{new ItemStack(Blocks.wool, 1, 0), Dyes.dyeBlack});

        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.stained_glass, 8, 0), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"GGG", "GDG", "GGG", Character.valueOf('G'), new ItemStack(Blocks.glass, 1), Character.valueOf('D'), Dyes.dyeWhite});

        GT_Log.out.println("GT_Mod: Putting a Potato on a Stick.");
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Packaged_PotatoChips.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.foil.get(Materials.Aluminium), ItemList.Food_PotatoChips});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Packaged_ChiliChips.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.foil.get(Materials.Aluminium), ItemList.Food_ChiliChips});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Packaged_Fries.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.plateDouble.get(Materials.Paper), ItemList.Food_Fries});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Chum_On_Stick.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.stick.get(Materials.Wood), ItemList.Food_Chum});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Potato_On_Stick.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.stick.get(Materials.Wood), ItemList.Food_Raw_Potato});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Potato_On_Stick_Roasted.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.stick.get(Materials.Wood), ItemList.Food_Baked_Potato});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Dough.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.bucket.get(Materials.Water), OrePrefixes.dust.get(Materials.Wheat)});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Dough_Sugar.get(2L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"foodDough", OrePrefixes.dust.get(Materials.Sugar)});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Dough_Chocolate.get(2L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"foodDough", OrePrefixes.dust.get(Materials.Cocoa)});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Dough_Chocolate.get(2L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"foodDough", OrePrefixes.dust.get(Materials.Chocolate)});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Flat_Dough.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"foodDough", ToolDictNames.craftingToolRollingPin});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Raw_Bun.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"foodDough"});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Raw_Bread.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"foodDough", "foodDough"});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Raw_Baguette.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"foodDough", "foodDough", "foodDough"});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Raw_Cake.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Dough_Sugar, ItemList.Food_Dough_Sugar, ItemList.Food_Dough_Sugar, ItemList.Food_Dough_Sugar});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_ChiliChips.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_PotatoChips, OrePrefixes.dust.get(Materials.Chili)});

        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Sliced_Buns.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Bun, ItemList.Food_Sliced_Bun});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Sliced_Breads.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Bread, ItemList.Food_Sliced_Bread});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Sliced_Baguettes.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Baguette, ItemList.Food_Sliced_Baguette});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Sliced_Bun.get(2L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Buns});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Sliced_Bread.get(2L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Breads});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Sliced_Baguette.get(2L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Baguettes});

        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Burger_Veggie.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Buns, ItemList.Food_Sliced_Cucumber, ItemList.Food_Sliced_Tomato, ItemList.Food_Sliced_Onion});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Burger_Cheese.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Buns, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Burger_Meat.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Buns, OrePrefixes.dust.get(Materials.MeatCooked)});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Burger_Chum.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Buns, ItemList.Food_Chum});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Burger_Veggie.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Bun, ItemList.Food_Sliced_Bun, ItemList.Food_Sliced_Cucumber, ItemList.Food_Sliced_Tomato, ItemList.Food_Sliced_Onion});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Burger_Cheese.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Bun, ItemList.Food_Sliced_Bun, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Burger_Meat.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Bun, ItemList.Food_Sliced_Bun, OrePrefixes.dust.get(Materials.MeatCooked)});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Burger_Chum.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Bun, ItemList.Food_Sliced_Bun, ItemList.Food_Chum});

        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Sandwich_Veggie.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Breads, ItemList.Food_Sliced_Cucumber, ItemList.Food_Sliced_Cucumber, ItemList.Food_Sliced_Tomato, ItemList.Food_Sliced_Tomato, ItemList.Food_Sliced_Onion});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Sandwich_Cheese.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Breads, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Sandwich_Bacon.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Breads, new ItemStack(Items.cooked_porkchop, 1)});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Sandwich_Steak.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Breads, new ItemStack(Items.cooked_beef, 1)});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Sandwich_Veggie.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Bread, ItemList.Food_Sliced_Bread, ItemList.Food_Sliced_Cucumber, ItemList.Food_Sliced_Cucumber, ItemList.Food_Sliced_Tomato, ItemList.Food_Sliced_Tomato, ItemList.Food_Sliced_Onion});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Sandwich_Cheese.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Bread, ItemList.Food_Sliced_Bread, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Sandwich_Bacon.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Bread, ItemList.Food_Sliced_Bread, new ItemStack(Items.cooked_porkchop, 1)});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Sandwich_Steak.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Bread, ItemList.Food_Sliced_Bread, new ItemStack(Items.cooked_beef, 1)});

        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Large_Sandwich_Veggie.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Baguettes, ItemList.Food_Sliced_Cucumber, ItemList.Food_Sliced_Cucumber, ItemList.Food_Sliced_Cucumber, ItemList.Food_Sliced_Tomato, ItemList.Food_Sliced_Tomato, ItemList.Food_Sliced_Tomato, ItemList.Food_Sliced_Onion});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Large_Sandwich_Cheese.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Baguettes, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Large_Sandwich_Bacon.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Baguettes, new ItemStack(Items.cooked_porkchop, 1), new ItemStack(Items.cooked_porkchop, 1)});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Large_Sandwich_Steak.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Baguettes, new ItemStack(Items.cooked_beef, 1), new ItemStack(Items.cooked_beef, 1)});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Large_Sandwich_Veggie.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Baguette, ItemList.Food_Sliced_Baguette, ItemList.Food_Sliced_Cucumber, ItemList.Food_Sliced_Cucumber, ItemList.Food_Sliced_Cucumber, ItemList.Food_Sliced_Tomato, ItemList.Food_Sliced_Tomato, ItemList.Food_Sliced_Tomato, ItemList.Food_Sliced_Onion});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Large_Sandwich_Cheese.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Baguette, ItemList.Food_Sliced_Baguette, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Large_Sandwich_Bacon.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Baguette, ItemList.Food_Sliced_Baguette, new ItemStack(Items.cooked_porkchop, 1), new ItemStack(Items.cooked_porkchop, 1)});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Large_Sandwich_Steak.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Sliced_Baguette, ItemList.Food_Sliced_Baguette, new ItemStack(Items.cooked_beef, 1), new ItemStack(Items.cooked_beef, 1)});

        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Raw_Pizza_Veggie.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Flat_Dough, ItemList.Food_Sliced_Cucumber, ItemList.Food_Sliced_Tomato, ItemList.Food_Sliced_Onion});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Raw_Pizza_Cheese.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Flat_Dough, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese, ItemList.Food_Sliced_Cheese});
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Food_Raw_Pizza_Meat.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{ItemList.Food_Flat_Dough, OrePrefixes.dust.get(Materials.MeatCooked)});

        GT_ModHandler.addCraftingRecipe(ItemList.Food_Sliced_Cheese.get(4L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"kX", Character.valueOf('X'), "foodCheese"});
        GT_ModHandler.addCraftingRecipe(ItemList.Food_Sliced_Lemon.get(4L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"kX", Character.valueOf('X'), "cropLemon"});
        GT_ModHandler.addCraftingRecipe(ItemList.Food_Sliced_Tomato.get(4L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"kX", Character.valueOf('X'), "cropTomato"});
        GT_ModHandler.addCraftingRecipe(ItemList.Food_Sliced_Onion.get(4L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"kX", Character.valueOf('X'), "cropOnion"});
        GT_ModHandler.addCraftingRecipe(ItemList.Food_Sliced_Cucumber.get(4L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"kX", Character.valueOf('X'), "cropCucumber"});
        GT_ModHandler.addCraftingRecipe(ItemList.Food_Sliced_Bun.get(2L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"kX", Character.valueOf('X'), ItemList.Food_Baked_Bun});
        GT_ModHandler.addCraftingRecipe(ItemList.Food_Sliced_Bread.get(2L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"kX", Character.valueOf('X'), ItemList.Food_Baked_Bread});
        GT_ModHandler.addCraftingRecipe(ItemList.Food_Sliced_Baguette.get(2L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"kX", Character.valueOf('X'), ItemList.Food_Baked_Baguette});
        GT_ModHandler.addCraftingRecipe(ItemList.Food_Raw_PotatoChips.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"kX", Character.valueOf('X'), "cropPotato"});
        GT_ModHandler.addCraftingRecipe(ItemList.Food_Raw_Cookie.get(4L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"kX", Character.valueOf('X'), ItemList.Food_Dough_Chocolate});

        GT_ModHandler.addCraftingRecipe(ItemList.Food_Raw_Fries.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"k", "X", Character.valueOf('X'), "cropPotato"});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Items.bowl, 1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"k", "X", Character.valueOf('X'), OrePrefixes.plank.get(Materials.Wood)});
        GT_ModHandler.addCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.ring, Materials.Rubber, 1L), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"k", "X", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Rubber)});
        GT_ModHandler.addCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.toolHeadArrow, Materials.Flint, 1L), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"f", "X", Character.valueOf('X'), new ItemStack(Items.flint, 1, 32767)});

        GT_ModHandler.addCraftingRecipe(new ItemStack(Items.arrow, 1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_SHAPED_RECIPES, new Object[]{"  H", " S ", "F  ", Character.valueOf('H'), new ItemStack(Items.flint, 1, 32767), Character.valueOf('S'), OrePrefixes.stick.get(Materials.Wood), Character.valueOf('F'), OreDictNames.craftingFeather});

        GT_ModHandler.removeRecipe(new ItemStack[]{new ItemStack(Blocks.planks), null, new ItemStack(Blocks.planks), null, new ItemStack(Blocks.planks)});
        GT_ModHandler.removeRecipeByOutput(ItemList.Food_Baked_Bread.get(1L, new Object[0]));
        GT_ModHandler.removeRecipeByOutput(new ItemStack(Items.cookie, 1));
        GT_ModHandler.removeRecipe(new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Copper, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Tin, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Copper, 1L)});
        if (null != GT_Utility.setStack(GT_ModHandler.getRecipeOutput(true, new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Copper, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Copper, 1L), null, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Copper, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Tin, 1L)}), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Bronze, GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.disabledrecipes, "bronzeingotcrafting", true) ? 1L : 2L))) {
            GT_Log.out.println("GT_Mod: Changed Forestrys Bronze Recipe");
        }
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.disabledrecipes, "enchantmenttable", false)) {
            GT_Log.out.println("GT_Mod: Removing the Recipe of the Enchantment Table, to have more Fun at enchanting with the Anvil and Books from Dungeons.");
            GT_ModHandler.removeRecipeByOutput(new ItemStack(Blocks.enchanting_table, 1));
        }
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.disabledrecipes, "enderchest", false)) {
            GT_ModHandler.removeRecipeByOutput(new ItemStack(Blocks.ender_chest, 1));
        }
        tStack = GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Ash, 1L);
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getRecipeOutput(new ItemStack[]{null, new ItemStack(Blocks.sand, 1, 0), null, null, GT_OreDictUnificator.get(OrePrefixes.gem, Materials.Apatite, 1L), null, null, new ItemStack(Blocks.sand, 1, 0), null}), new Object[]{"S", "A", "S", Character.valueOf('A'), OrePrefixes.dust.get(Materials.Apatite), Character.valueOf('S'), new ItemStack(Blocks.sand, 1, 32767)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getRecipeOutput(new ItemStack[]{tStack, tStack, tStack, tStack, GT_OreDictUnificator.get(OrePrefixes.gem, Materials.Apatite, 1L), tStack, tStack, tStack, tStack}), new Object[]{"SSS", "SAS", "SSS", Character.valueOf('A'), OrePrefixes.dust.get(Materials.Apatite), Character.valueOf('S'), OrePrefixes.dust.get(Materials.Ash)});

        GT_Log.out.println("GT_Mod: Adding Mixed Metal Ingot Recipes.");
        GT_ModHandler.removeRecipeByOutput(ItemList.IC2_Mixed_Metal_Ingot.get(1L, new Object[0]));

        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(1L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.AnyIron), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Tin)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(1L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.AnyIron), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Zinc)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(1L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.AnyIron), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Aluminium)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(1L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.AnyIron), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Tin)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(1L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.AnyIron), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Zinc)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(1L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.AnyIron), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Aluminium)});

        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(1L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Nickel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Tin)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(1L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Nickel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Zinc)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(1L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Nickel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Aluminium)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(1L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Nickel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Tin)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(1L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Nickel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Zinc)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(1L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Nickel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Aluminium)});

        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(2L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Invar), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Tin)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(2L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Invar), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Zinc)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(3L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Invar), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Aluminium)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(2L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Invar), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Tin)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(2L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Invar), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Zinc)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(3L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Invar), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Aluminium)});

        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(2L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Steel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Tin)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(2L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Steel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Zinc)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(3L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Steel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Aluminium)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(2L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Steel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Tin)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(2L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Steel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Zinc)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(3L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Steel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Aluminium)});

        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(3L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.StainlessSteel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Tin)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(3L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.StainlessSteel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Zinc)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(4L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.StainlessSteel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Aluminium)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(3L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.StainlessSteel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Tin)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(3L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.StainlessSteel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Zinc)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(4L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.StainlessSteel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Aluminium)});

        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(3L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Titanium), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Tin)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(3L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Titanium), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Zinc)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(4L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Titanium), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Aluminium)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(3L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Titanium), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Tin)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(3L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Titanium), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Zinc)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(4L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Titanium), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Aluminium)});

        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(3L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Tungsten), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Tin)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(3L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Tungsten), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Zinc)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(4L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Tungsten), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Aluminium)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(3L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Tungsten), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Tin)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(3L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Tungsten), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Zinc)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(4L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.Tungsten), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Aluminium)});

        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(5L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.TungstenSteel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Tin)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(5L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.TungstenSteel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Zinc)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(6L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.TungstenSteel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Bronze), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Aluminium)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(5L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.TungstenSteel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Tin)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(5L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.TungstenSteel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Zinc)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Mixed_Metal_Ingot.get(6L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"X", "Y", "Z", Character.valueOf('X'), OrePrefixes.plate.get(Materials.TungstenSteel), Character.valueOf('Y'), OrePrefixes.plate.get(Materials.Brass), Character.valueOf('Z'), OrePrefixes.plate.get(Materials.Aluminium)});

        GT_Log.out.println("GT_Mod: Adding Rolling Machine Recipes.");
        GT_ModHandler.addRollingMachineRecipe(ItemList.RC_Rail_Standard.get(4L, new Object[0]), new Object[]{"X X", "X X", "X X", Character.valueOf('X'), OrePrefixes.ingot.get(Materials.Aluminium).toString()});
        GT_ModHandler.addRollingMachineRecipe(ItemList.RC_Rail_Standard.get(32L, new Object[0]), new Object[]{"X X", "X X", "X X", Character.valueOf('X'), OrePrefixes.ingot.get(Materials.Titanium).toString()});
        GT_ModHandler.addRollingMachineRecipe(ItemList.RC_Rail_Standard.get(32L, new Object[0]), new Object[]{"X X", "X X", "X X", Character.valueOf('X'), OrePrefixes.ingot.get(Materials.Tungsten).toString()});

        GT_ModHandler.addRollingMachineRecipe(ItemList.RC_Rail_Reinforced.get(32L, new Object[0]), new Object[]{"X X", "X X", "X X", Character.valueOf('X'), OrePrefixes.ingot.get(Materials.TungstenSteel).toString()});

        GT_ModHandler.addRollingMachineRecipe(ItemList.RC_Rebar.get(2L, new Object[0]), new Object[]{"  X", " X ", "X  ", Character.valueOf('X'), OrePrefixes.ingot.get(Materials.Aluminium).toString()});
        GT_ModHandler.addRollingMachineRecipe(ItemList.RC_Rebar.get(16L, new Object[0]), new Object[]{"  X", " X ", "X  ", Character.valueOf('X'), OrePrefixes.ingot.get(Materials.Titanium).toString()});
        GT_ModHandler.addRollingMachineRecipe(ItemList.RC_Rebar.get(16L, new Object[0]), new Object[]{"  X", " X ", "X  ", Character.valueOf('X'), OrePrefixes.ingot.get(Materials.Tungsten).toString()});
        GT_ModHandler.addRollingMachineRecipe(ItemList.RC_Rebar.get(48L, new Object[0]), new Object[]{"  X", " X ", "X  ", Character.valueOf('X'), OrePrefixes.ingot.get(Materials.TungstenSteel).toString()});

        GT_ModHandler.addRollingMachineRecipe(GT_ModHandler.getModItem("Railcraft", "post.metal.light.blue", 8L), new Object[]{"XXX", " X ", "XXX", Character.valueOf('X'), OrePrefixes.ingot.get(Materials.Aluminium).toString()});
        GT_ModHandler.addRollingMachineRecipe(GT_ModHandler.getModItem("Railcraft", "post.metal.purple", 64L), new Object[]{"XXX", " X ", "XXX", Character.valueOf('X'), OrePrefixes.ingot.get(Materials.Titanium).toString()});
        GT_ModHandler.addRollingMachineRecipe(GT_ModHandler.getModItem("Railcraft", "post.metal.black", 64L), new Object[]{"XXX", " X ", "XXX", Character.valueOf('X'), OrePrefixes.ingot.get(Materials.Tungsten).toString()});

        GT_ModHandler.addRollingMachineRecipe(GT_ModHandler.getModItem("Railcraft", "post.metal.light.blue", 8L), new Object[]{"X X", "XXX", "X X", Character.valueOf('X'), OrePrefixes.ingot.get(Materials.Aluminium).toString()});
        GT_ModHandler.addRollingMachineRecipe(GT_ModHandler.getModItem("Railcraft", "post.metal.purple", 64L), new Object[]{"X X", "XXX", "X X", Character.valueOf('X'), OrePrefixes.ingot.get(Materials.Titanium).toString()});
        GT_ModHandler.addRollingMachineRecipe(GT_ModHandler.getModItem("Railcraft", "post.metal.black", 64L), new Object[]{"X X", "XXX", "X X", Character.valueOf('X'), OrePrefixes.ingot.get(Materials.Tungsten).toString()});

        GT_Log.out.println("GT_Mod: Replacing Railcraft Recipes with slightly more OreDicted Variants");

        long tBitMask = GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_RECIPES_IF_SAME_NBT | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_SHAPED_RECIPES | GT_ModHandler.RecipeBits.DELETE_ALL_OTHER_NATIVE_RECIPES | GT_ModHandler.RecipeBits.ONLY_ADD_IF_THERE_IS_ANOTHER_RECIPE_FOR_IT;
        char tHammer = ' ';
        char tFile = ' ';
        char tWrench = ' ';
        OrePrefixes tIngot = OrePrefixes.ingot;
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.harderrecipes, "railcraft_stuff_use_tools", true)) {
            tHammer = 'h';
            tFile = 'f';
            tWrench = 'w';
        }
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.harderrecipes, "railcraft_stuff_use_plates", true)) {
            tIngot = OrePrefixes.plate;
        }
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "part.gear", 2L, 3), tBitMask | GT_ModHandler.RecipeBits.MIRRORED, new Object[]{tHammer + "" + tFile, "XX", "XX", Character.valueOf('X'), tIngot.get(Materials.Tin)});

        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "part.gear", 1L, 0), tBitMask, new Object[]{tHammer + "X ", "XGX", " X" + tFile, Character.valueOf('X'), OrePrefixes.nugget.get(Materials.Gold), Character.valueOf('G'), GT_ModHandler.getModItem("Railcraft", "part.gear", 1L, 3)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "part.gear", 1L, 1), tBitMask, new Object[]{tHammer + "X ", "XGX", " X" + tFile, Character.valueOf('X'), tIngot.get(Materials.AnyIron), Character.valueOf('G'), GT_ModHandler.getModItem("Railcraft", "part.gear", 1L, 3)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "part.gear", 1L, 2), tBitMask, new Object[]{tHammer + "X ", "XGX", " X" + tFile, Character.valueOf('X'), tIngot.get(Materials.Steel), Character.valueOf('G'), GT_ModHandler.getModItem("Railcraft", "part.gear", 1L, 3)});

        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.beta", 8L, 0), tBitMask, new Object[]{tWrench + "PP", tHammer + "PP", Character.valueOf('P'), OrePrefixes.plate.get(Materials.AnyIron)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.beta", 8L, 1), tBitMask, new Object[]{"GPG", "PGP", "GPG", Character.valueOf('P'), OrePrefixes.plate.get(Materials.AnyIron), Character.valueOf('G'), new ItemStack(Blocks.glass_pane, 1, 32767)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.beta", 8L, 2), tBitMask, new Object[]{"BPB", "PLP", "BPB", Character.valueOf('P'), OrePrefixes.plate.get(Materials.AnyIron), Character.valueOf('B'), new ItemStack(Blocks.iron_bars, 1, 32767), Character.valueOf('L'), new ItemStack(Blocks.lever, 1, 32767)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.beta", 1L, 3), tBitMask, new Object[]{tWrench + "P", tHammer + "P", Character.valueOf('P'), OrePrefixes.plate.get(Materials.AnyIron)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.beta", 1L, 4), tBitMask, new Object[]{tWrench + "P", tHammer + "P", Character.valueOf('P'), OrePrefixes.plate.get(Materials.Steel)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.beta", 1L, 5), tBitMask, new Object[]{"BBB", "BFB", "BOB", Character.valueOf('B'), OrePrefixes.ingot.get(Materials.Brick), Character.valueOf('F'), new ItemStack(Items.fire_charge, 1, 32767), Character.valueOf('O'), OreDictNames.craftingFurnace});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.beta", 1L, 6), tBitMask, new Object[]{"PUP", "BFB", "POP", Character.valueOf('P'), OrePrefixes.plate.get(Materials.Steel), Character.valueOf('B'), new ItemStack(Blocks.iron_bars, 1, 32767), Character.valueOf('F'), new ItemStack(Items.fire_charge, 1, 32767), Character.valueOf('U'), OrePrefixes.bucket.get(Materials.Empty), Character.valueOf('O'), OreDictNames.craftingFurnace});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.beta", 1L, 7), tBitMask | GT_ModHandler.RecipeBits.MIRRORED, new Object[]{"PPP", tHammer + "G" + tWrench, "OTO", Character.valueOf('P'), OrePrefixes.nugget.get(Materials.Gold), Character.valueOf('O'), GT_ModHandler.getModItem("Railcraft", "part.gear", 1L, 0), Character.valueOf('G'), new ItemStack(Blocks.glass, 1, 32767), Character.valueOf('T'), OreDictNames.craftingPiston});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.beta", 1L, 8), tBitMask | GT_ModHandler.RecipeBits.MIRRORED, new Object[]{"PPP", tHammer + "G" + tWrench, "OTO", Character.valueOf('P'), OrePrefixes.plate.get(Materials.AnyIron), Character.valueOf('O'), GT_ModHandler.getModItem("Railcraft", "part.gear", 1L, 1), Character.valueOf('G'), new ItemStack(Blocks.glass, 1, 32767), Character.valueOf('T'), OreDictNames.craftingPiston});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.beta", 1L, 9), tBitMask | GT_ModHandler.RecipeBits.MIRRORED, new Object[]{"PPP", tHammer + "G" + tWrench, "OTO", Character.valueOf('P'), OrePrefixes.plate.get(Materials.Steel), Character.valueOf('O'), GT_ModHandler.getModItem("Railcraft", "part.gear", 1L, 2), Character.valueOf('G'), new ItemStack(Blocks.glass, 1, 32767), Character.valueOf('T'), OreDictNames.craftingPiston});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.beta", 1L, 10), tBitMask, new Object[]{" E ", " O ", "OIO", Character.valueOf('I'), tIngot.get(Materials.Gold), Character.valueOf('E'), OrePrefixes.gem.get(Materials.EnderPearl), Character.valueOf('O'), OrePrefixes.stone.get(Materials.Obsidian)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.beta", 1L, 11), tBitMask, new Object[]{"OOO", "OEO", "OOO", Character.valueOf('E'), OrePrefixes.gem.get(Materials.EnderPearl), Character.valueOf('O'), OrePrefixes.stone.get(Materials.Obsidian)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.beta", 1L, 12), tBitMask, new Object[]{"GPG", "PAP", "GPG", Character.valueOf('P'), OreDictNames.craftingPiston, Character.valueOf('A'), OreDictNames.craftingAnvil, Character.valueOf('G'), GT_ModHandler.getModItem("Railcraft", "part.gear", 1L, 2)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.beta", 8L, 13), tBitMask, new Object[]{tWrench + "PP", tHammer + "PP", Character.valueOf('P'), OrePrefixes.plate.get(Materials.Steel)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.beta", 8L, 14), tBitMask, new Object[]{"GPG", "PGP", "GPG", Character.valueOf('P'), OrePrefixes.plate.get(Materials.Steel), Character.valueOf('G'), new ItemStack(Blocks.glass_pane, 1, 32767)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.beta", 8L, 15), tBitMask, new Object[]{"BPB", "PLP", "BPB", Character.valueOf('P'), OrePrefixes.plate.get(Materials.Steel), Character.valueOf('B'), new ItemStack(Blocks.iron_bars, 1, 32767), Character.valueOf('L'), new ItemStack(Blocks.lever, 1, 32767)});

        GT_ModHandler.addCraftingRecipe(ItemList.RC_ShuntingWireFrame.get(6L, new Object[0]), tBitMask, new Object[]{"PPP", "R" + tWrench + "R", "RRR", Character.valueOf('P'), OrePrefixes.plate.get(Materials.AnyIron), Character.valueOf('R'), ItemList.RC_Rebar.get(1L, new Object[0])});

        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.alpha", 1L, 0), tBitMask, new Object[]{"IOI", "GEG", "IOI", Character.valueOf('I'), tIngot.get(Materials.Gold), Character.valueOf('G'), OrePrefixes.gem.get(Materials.Diamond), Character.valueOf('E'), OrePrefixes.gem.get(Materials.EnderPearl), Character.valueOf('O'), OrePrefixes.stone.get(Materials.Obsidian)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.alpha", 3L, 1), tBitMask, new Object[]{"BPB", "P" + tWrench + "P", "BPB", Character.valueOf('P'), OrePrefixes.plate.get(Materials.Steel), Character.valueOf('B'), OrePrefixes.block.get(Materials.Steel)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.alpha", 1L, 2), tBitMask, new Object[]{"IOI", "GEG", "IOI", Character.valueOf('I'), tIngot.get(Materials.Gold), Character.valueOf('G'), OrePrefixes.gem.get(Materials.Emerald), Character.valueOf('E'), OrePrefixes.gem.get(Materials.EnderPearl), Character.valueOf('O'), OrePrefixes.stone.get(Materials.Obsidian)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.alpha", 4L, 3), tBitMask, new Object[]{"PPP", "PFP", "PPP", Character.valueOf('P'), OrePrefixes.plate.get(Materials.Steel), Character.valueOf('F'), OreDictNames.craftingFurnace});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.alpha", 1L, 5), tBitMask, new Object[]{" N ", "RCR", Character.valueOf('R'), OrePrefixes.dust.get(Materials.Redstone), Character.valueOf('N'), OrePrefixes.stone.get(Materials.Netherrack), Character.valueOf('C'), new ItemStack(Items.cauldron, 1, 0)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.alpha", 1L, 6), tBitMask, new Object[]{"SGS", "EDE", "SGS", Character.valueOf('E'), OrePrefixes.gem.get(Materials.Emerald), Character.valueOf('S'), OrePrefixes.plate.get(Materials.Steel), Character.valueOf('G'), new ItemStack(Blocks.glass_pane, 1, 32767), Character.valueOf('D'), new ItemStack(Blocks.dispenser, 1, 32767)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.alpha", 1L, 8), tBitMask, new Object[]{"IPI", "PCP", "IPI", Character.valueOf('P'), OreDictNames.craftingPiston, Character.valueOf('I'), tIngot.get(Materials.AnyIron), Character.valueOf('C'), new ItemStack(Blocks.crafting_table, 1, 32767)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.alpha", 1L, 9), tBitMask, new Object[]{" I ", " T ", " D ", Character.valueOf('I'), new ItemStack(Blocks.iron_bars, 1, 32767), Character.valueOf('T'), GT_ModHandler.getModItem("Railcraft", "machine.beta", 1L, 4), Character.valueOf('D'), new ItemStack(Blocks.dispenser, 1, 32767)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.alpha", 1L, 10), tBitMask, new Object[]{" I ", "RTR", " D ", Character.valueOf('I'), new ItemStack(Blocks.iron_bars, 1, 32767), Character.valueOf('T'), GT_ModHandler.getModItem("Railcraft", "machine.beta", 1L, 4), Character.valueOf('D'), new ItemStack(Blocks.dispenser, 1, 32767), Character.valueOf('R'), OrePrefixes.dust.get(Materials.Redstone)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.alpha", 1L, 10), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"RTR", Character.valueOf('T'), GT_ModHandler.getModItem("Railcraft", "machine.alpha", 1L, 9), Character.valueOf('R'), OrePrefixes.dust.get(Materials.Redstone)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.alpha", 1L, 11), tBitMask, new Object[]{"PCP", "CSC", "PCP", Character.valueOf('P'), OrePrefixes.plank.get(Materials.Wood), Character.valueOf('S'), OrePrefixes.plate.get(Materials.Steel), Character.valueOf('C'), new ItemStack(Items.golden_carrot, 1, 0)});
        if (GregTech_API.sMachineFile.get(ConfigCategories.machineconfig, "DisableRCBlastFurnace", false)) {
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getModItem("Railcraft", "machine.alpha", 4L, 12));
        }
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.alpha", 1L, 13), tBitMask, new Object[]{"TSB", "SCS", "PSP", Character.valueOf('P'), OreDictNames.craftingPiston, Character.valueOf('S'), OrePrefixes.plate.get(Materials.Steel), Character.valueOf('B'), OreDictNames.craftingBook, Character.valueOf('C'), new ItemStack(Blocks.crafting_table, 1, 32767), Character.valueOf('T'), new ItemStack(Items.diamond_pickaxe, 1, 0)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.alpha", 6L, 14), tBitMask, new Object[]{"PPP", "ISI", "PPP", Character.valueOf('P'), OrePrefixes.plank.get(Materials.Wood), Character.valueOf('I'), tIngot.get(Materials.AnyIron), Character.valueOf('S'), "slimeball"});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.alpha", 4L, 15), tBitMask, new Object[]{"PDP", "DBD", "PDP", Character.valueOf('P'), OreDictNames.craftingPiston, Character.valueOf('B'), OrePrefixes.block.get(Materials.Steel), Character.valueOf('D'), OrePrefixes.gem.get(Materials.Diamond)});

        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "machine.epsilon", 1L, 0), tBitMask, new Object[]{"PWP", "WWW", "PWP", Character.valueOf('P'), OrePrefixes.plate.get(Materials.AnyIron), Character.valueOf('W'), OrePrefixes.wireGt02.get(Materials.Copper)});

        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "tool.crowbar", 1L, 0), tBitMask, new Object[]{tHammer + "DS", "DSD", "SD" + tFile, Character.valueOf('S'), OrePrefixes.ingot.get(Materials.Iron), Character.valueOf('D'), Dyes.dyeRed});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "tool.crowbar.reinforced", 1L, 0), tBitMask, new Object[]{tHammer + "DS", "DSD", "SD" + tFile, Character.valueOf('S'), OrePrefixes.ingot.get(Materials.Steel), Character.valueOf('D'), Dyes.dyeRed});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "tool.whistle.tuner", 1L, 0), tBitMask | GT_ModHandler.RecipeBits.MIRRORED, new Object[]{"S" + tHammer + "S", "SSS", " S" + tFile, Character.valueOf('S'), OrePrefixes.nugget.get(Materials.Iron)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "part.turbine.blade", 1L, 0), tBitMask, new Object[]{"S" + tFile, "S ", "S" + tHammer, Character.valueOf('S'), tIngot.get(Materials.Steel)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "part.turbine.disk", 1L, 0), tBitMask, new Object[]{"SSS", "SBS", "SSS", Character.valueOf('B'), OrePrefixes.block.get(Materials.Steel), Character.valueOf('S'), GT_ModHandler.getModItem("Railcraft", "part.turbine.blade", 1L, 0)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "part.turbine.rotor", 1L, 0), tBitMask, new Object[]{"SSS", " " + tWrench + " ", Character.valueOf('S'), GT_ModHandler.getModItem("Railcraft", "part.turbine.disk", 1L, 0)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "borehead.iron", 1L, 0), tBitMask, new Object[]{"SSS", "SBS", "SSS", Character.valueOf('B'), OrePrefixes.block.get(Materials.Iron), Character.valueOf('S'), tIngot.get(Materials.Steel)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "borehead.steel", 1L, 0), tBitMask, new Object[]{"SSS", "SBS", "SSS", Character.valueOf('B'), OrePrefixes.block.get(Materials.Steel), Character.valueOf('S'), tIngot.get(Materials.Steel)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "borehead.diamond", 1L, 0), tBitMask, new Object[]{"SSS", "SBS", "SSS", Character.valueOf('B'), OrePrefixes.block.get(Materials.Diamond), Character.valueOf('S'), tIngot.get(Materials.Steel)});

        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "cart.loco.steam.solid", 1L, 0), tBitMask, new Object[]{"TTF", "TTF", "BCC", Character.valueOf('C'), new ItemStack(Items.minecart, 1), Character.valueOf('T'), GT_ModHandler.getModItem("Railcraft", "machine.beta", 1L, 4), Character.valueOf('F'), GT_ModHandler.getModItem("Railcraft", "machine.beta", 1L, 5), Character.valueOf('B'), new ItemStack(Blocks.iron_bars, 1, 32767)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "cart.loco.electric", 1L, 0), tBitMask, new Object[]{"LP" + tWrench, "PEP", "GCG", Character.valueOf('C'), new ItemStack(Items.minecart, 1), Character.valueOf('E'), GT_ModHandler.getModItem("Railcraft", "machine.epsilon", 1L, 0), Character.valueOf('G'), GT_ModHandler.getModItem("Railcraft", "part.gear", 1L, 2), Character.valueOf('L'), new ItemStack(Blocks.redstone_lamp, 1, 32767), Character.valueOf('P'), OrePrefixes.plate.get(Materials.Steel)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Railcraft", "cart.bore", 1L, 0), tBitMask, new Object[]{"BCB", "FCF", tHammer + "A" + tWrench, Character.valueOf('C'), new ItemStack(Items.minecart, 1), Character.valueOf('A'), new ItemStack(Items.chest_minecart, 1), Character.valueOf('F'), OreDictNames.craftingFurnace, Character.valueOf('B'), OrePrefixes.block.get(Materials.Steel)});

        GT_Log.out.println("GT_Mod: Beginning to add regular Crafting Recipes.");
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("scaffold", 4L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"WWW", " S ", "S S", Character.valueOf('W'), OrePrefixes.plank.get(Materials.Wood), Character.valueOf('S'), OrePrefixes.stick.get(Materials.Wood)});

        GT_ModHandler.addCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.wireGt01, Materials.Superconductor, 3L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"NPT", "CCC", "HPT", Character.valueOf('H'), OrePrefixes.cell.get(Materials.Helium), Character.valueOf('N'), OrePrefixes.cell.get(Materials.Nitrogen), Character.valueOf('T'), OrePrefixes.pipeTiny.get(Materials.TungstenSteel), Character.valueOf('P'), ItemList.Electric_Pump_LV, Character.valueOf('C'), OrePrefixes.wireGt01.get(Materials.NiobiumTitanium)});
        GT_ModHandler.addCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.wireGt01, Materials.Superconductor, 3L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"NPT", "CCC", "HPT", Character.valueOf('H'), OrePrefixes.cell.get(Materials.Helium), Character.valueOf('N'), OrePrefixes.cell.get(Materials.Nitrogen), Character.valueOf('T'), OrePrefixes.pipeTiny.get(Materials.TungstenSteel), Character.valueOf('P'), ItemList.Electric_Pump_LV, Character.valueOf('C'), OrePrefixes.wireGt01.get(Materials.VanadiumGallium)});
        GT_ModHandler.addCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.wireGt01, Materials.Superconductor, 3L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"NPT", "CCC", "NPT", Character.valueOf('N'), OrePrefixes.cell.get(Materials.Nitrogen), Character.valueOf('T'), OrePrefixes.pipeTiny.get(Materials.TungstenSteel), Character.valueOf('P'), ItemList.Electric_Pump_LV, Character.valueOf('C'), OrePrefixes.wireGt01.get(Materials.YttriumBariumCuprate)});
        GT_ModHandler.addCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.wireGt01, Materials.Superconductor, 3L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"NPT", "CCC", "NPT", Character.valueOf('N'), OrePrefixes.cell.get(Materials.Nitrogen), Character.valueOf('T'), OrePrefixes.pipeTiny.get(Materials.TungstenSteel), Character.valueOf('P'), ItemList.Electric_Pump_LV, Character.valueOf('C'), OrePrefixes.wireGt01.get(Materials.Naquadah)});

        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.stick, Materials.IronMagnetic, 1L), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.stick.get(Materials.AnyIron), OrePrefixes.dust.get(Materials.Redstone), OrePrefixes.dust.get(Materials.Redstone), OrePrefixes.dust.get(Materials.Redstone), OrePrefixes.dust.get(Materials.Redstone)});

        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Item_Casing_Gold.get(1L, new Object[0]), new Object[]{"h P", Character.valueOf('P'), OrePrefixes.plate.get(Materials.Gold)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Item_Casing_Iron.get(1L, new Object[0]), new Object[]{"h P", Character.valueOf('P'), OrePrefixes.plate.get(Materials.AnyIron)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Item_Casing_Bronze.get(1L, new Object[0]), new Object[]{"h P", Character.valueOf('P'), OrePrefixes.plate.get(Materials.Bronze)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Item_Casing_Copper.get(1L, new Object[0]), new Object[]{"h P", Character.valueOf('P'), OrePrefixes.plate.get(Materials.AnyCopper)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Item_Casing_Tin.get(1L, new Object[0]), new Object[]{"h P", Character.valueOf('P'), OrePrefixes.plate.get(Materials.Tin)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Item_Casing_Lead.get(1L, new Object[0]), new Object[]{"h P", Character.valueOf('P'), OrePrefixes.plate.get(Materials.Lead)});
        GT_ModHandler.addCraftingRecipe(ItemList.IC2_Item_Casing_Steel.get(1L, new Object[0]), new Object[]{"h P", Character.valueOf('P'), OrePrefixes.plate.get(Materials.Steel)});
       
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.torch, 2), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"C", "S", Character.valueOf('C'), OrePrefixes.dust.get(Materials.Sulfur), Character.valueOf('S'), OrePrefixes.stick.get(Materials.Wood)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.torch, 6), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"C", "S", Character.valueOf('C'), OrePrefixes.dust.get(Materials.Phosphorus), Character.valueOf('S'), OrePrefixes.stick.get(Materials.Wood)});

        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.piston, 1), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"WWW", "CBC", "CRC", Character.valueOf('W'), OrePrefixes.plank.get(Materials.Wood), Character.valueOf('C'), OrePrefixes.stoneCobble, Character.valueOf('R'), OrePrefixes.dust.get(Materials.Redstone), Character.valueOf('B'), OrePrefixes.ingot.get(Materials.AnyIron)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.piston, 1), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"WWW", "CBC", "CRC", Character.valueOf('W'), OrePrefixes.plank.get(Materials.Wood), Character.valueOf('C'), OrePrefixes.stoneCobble, Character.valueOf('R'), OrePrefixes.dust.get(Materials.Redstone), Character.valueOf('B'), OrePrefixes.ingot.get(Materials.AnyBronze)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.piston, 1), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"WWW", "CBC", "CRC", Character.valueOf('W'), OrePrefixes.plank.get(Materials.Wood), Character.valueOf('C'), OrePrefixes.stoneCobble, Character.valueOf('R'), OrePrefixes.dust.get(Materials.Redstone), Character.valueOf('B'), OrePrefixes.ingot.get(Materials.Aluminium)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.piston, 1), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"WWW", "CBC", "CRC", Character.valueOf('W'), OrePrefixes.plank.get(Materials.Wood), Character.valueOf('C'), OrePrefixes.stoneCobble, Character.valueOf('R'), OrePrefixes.dust.get(Materials.Redstone), Character.valueOf('B'), OrePrefixes.ingot.get(Materials.Steel)});
        GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.piston, 1), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"WWW", "CBC", "CRC", Character.valueOf('W'), OrePrefixes.plank.get(Materials.Wood), Character.valueOf('C'), OrePrefixes.stoneCobble, Character.valueOf('R'), OrePrefixes.dust.get(Materials.Redstone), Character.valueOf('B'), OrePrefixes.ingot.get(Materials.Titanium)});

        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("reactorVent", 1L, 1), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"AIA", "I I", "AIA", Character.valueOf('I'), new ItemStack(Blocks.iron_bars, 1), Character.valueOf('A'), OrePrefixes.plate.get(Materials.Aluminium)});
        GT_ModHandler.addShapelessCraftingRecipe(GT_ModHandler.getIC2Item("reactorPlatingExplosive", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{GT_ModHandler.getIC2Item("reactorPlating", 1L), OrePrefixes.plate.get(Materials.Lead)});
        if (!Materials.Steel.mBlastFurnaceRequired) {
            GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Steel, 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Iron), OrePrefixes.dust.get(Materials.Coal), OrePrefixes.dust.get(Materials.Coal)});
        }
        if (GT_Mod.gregtechproxy.mNerfDustCrafting) {
            GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Electrum, 6L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Silver), OrePrefixes.dust.get(Materials.Gold)});
            GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Brass, 3L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.AnyCopper), OrePrefixes.dust.get(Materials.AnyCopper), OrePrefixes.dust.get(Materials.AnyCopper), OrePrefixes.dust.get(Materials.Zinc)});
            GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Brass, 9L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Tetrahedrite), OrePrefixes.dust.get(Materials.Tetrahedrite), OrePrefixes.dust.get(Materials.Tetrahedrite), OrePrefixes.dust.get(Materials.Zinc)});
            GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Bronze, 3L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.AnyCopper), OrePrefixes.dust.get(Materials.AnyCopper), OrePrefixes.dust.get(Materials.AnyCopper), OrePrefixes.dust.get(Materials.Tin)});
            GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Bronze, 9L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Tetrahedrite), OrePrefixes.dust.get(Materials.Tetrahedrite), OrePrefixes.dust.get(Materials.Tetrahedrite), OrePrefixes.dust.get(Materials.Tin)});
            GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Invar, 9L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Iron), OrePrefixes.dust.get(Materials.Iron), OrePrefixes.dust.get(Materials.Nickel)});
            GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Cupronickel, 6L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Nickel), OrePrefixes.dust.get(Materials.AnyCopper)});
            GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Nichrome, 15L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Nickel), OrePrefixes.dust.get(Materials.Nickel), OrePrefixes.dust.get(Materials.Nickel), OrePrefixes.dust.get(Materials.Nickel), OrePrefixes.dust.get(Materials.Chrome)});
        } else {
            GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Electrum, 2L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Silver), OrePrefixes.dust.get(Materials.Gold)});
            GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Brass, 4L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.AnyCopper), OrePrefixes.dust.get(Materials.AnyCopper), OrePrefixes.dust.get(Materials.AnyCopper), OrePrefixes.dust.get(Materials.Zinc)});
            GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Brass, 3L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Tetrahedrite), OrePrefixes.dust.get(Materials.Tetrahedrite), OrePrefixes.dust.get(Materials.Tetrahedrite), OrePrefixes.dust.get(Materials.Zinc)});
            GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Bronze, 4L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.AnyCopper), OrePrefixes.dust.get(Materials.AnyCopper), OrePrefixes.dust.get(Materials.AnyCopper), OrePrefixes.dust.get(Materials.Tin)});
            GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Bronze, 3L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Tetrahedrite), OrePrefixes.dust.get(Materials.Tetrahedrite), OrePrefixes.dust.get(Materials.Tetrahedrite), OrePrefixes.dust.get(Materials.Tin)});
            GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Invar, 3L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Iron), OrePrefixes.dust.get(Materials.Iron), OrePrefixes.dust.get(Materials.Nickel)});
            GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Cupronickel, 2L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Nickel), OrePrefixes.dust.get(Materials.AnyCopper)});
            GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Nichrome, 5L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Nickel), OrePrefixes.dust.get(Materials.Nickel), OrePrefixes.dust.get(Materials.Nickel), OrePrefixes.dust.get(Materials.Nickel), OrePrefixes.dust.get(Materials.Chrome)});
        }
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.RoseGold, 5L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Gold), OrePrefixes.dust.get(Materials.Gold), OrePrefixes.dust.get(Materials.Gold), OrePrefixes.dust.get(Materials.Gold), OrePrefixes.dust.get(Materials.AnyCopper)});
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.SterlingSilver, 5L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Silver), OrePrefixes.dust.get(Materials.Silver), OrePrefixes.dust.get(Materials.Silver), OrePrefixes.dust.get(Materials.Silver), OrePrefixes.dust.get(Materials.AnyCopper)});
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.BlackBronze, 5L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Gold), OrePrefixes.dust.get(Materials.Silver), OrePrefixes.dust.get(Materials.AnyCopper), OrePrefixes.dust.get(Materials.AnyCopper), OrePrefixes.dust.get(Materials.AnyCopper)});
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.BismuthBronze, 5L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Bismuth), OrePrefixes.dust.get(Materials.Zinc), OrePrefixes.dust.get(Materials.AnyCopper), OrePrefixes.dust.get(Materials.AnyCopper), OrePrefixes.dust.get(Materials.AnyCopper)});
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.BlackSteel, 5L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Nickel), OrePrefixes.dust.get(Materials.BlackBronze), OrePrefixes.dust.get(Materials.Steel), OrePrefixes.dust.get(Materials.Steel), OrePrefixes.dust.get(Materials.Steel)});
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.RedSteel, 8L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.SterlingSilver), OrePrefixes.dust.get(Materials.BismuthBronze), OrePrefixes.dust.get(Materials.Steel), OrePrefixes.dust.get(Materials.Steel), OrePrefixes.dust.get(Materials.BlackSteel), OrePrefixes.dust.get(Materials.BlackSteel), OrePrefixes.dust.get(Materials.BlackSteel), OrePrefixes.dust.get(Materials.BlackSteel)});
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.BlueSteel, 8L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.RoseGold), OrePrefixes.dust.get(Materials.Brass), OrePrefixes.dust.get(Materials.Steel), OrePrefixes.dust.get(Materials.Steel), OrePrefixes.dust.get(Materials.BlackSteel), OrePrefixes.dust.get(Materials.BlackSteel), OrePrefixes.dust.get(Materials.BlackSteel), OrePrefixes.dust.get(Materials.BlackSteel)});
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Osmiridium, 4L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Iridium), OrePrefixes.dust.get(Materials.Iridium), OrePrefixes.dust.get(Materials.Iridium), OrePrefixes.dust.get(Materials.Osmium)});

        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Ultimet, 9L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Cobalt), OrePrefixes.dust.get(Materials.Cobalt), OrePrefixes.dust.get(Materials.Cobalt), OrePrefixes.dust.get(Materials.Cobalt), OrePrefixes.dust.get(Materials.Cobalt), OrePrefixes.dust.get(Materials.Chrome), OrePrefixes.dust.get(Materials.Chrome), OrePrefixes.dust.get(Materials.Nickel), OrePrefixes.dust.get(Materials.Molybdenum)});
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.CobaltBrass, 9L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Brass), OrePrefixes.dust.get(Materials.Brass), OrePrefixes.dust.get(Materials.Brass), OrePrefixes.dust.get(Materials.Brass), OrePrefixes.dust.get(Materials.Brass), OrePrefixes.dust.get(Materials.Brass), OrePrefixes.dust.get(Materials.Brass), OrePrefixes.dust.get(Materials.Aluminium), OrePrefixes.dust.get(Materials.Cobalt)});
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.StainlessSteel, 9L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Iron), OrePrefixes.dust.get(Materials.Iron), OrePrefixes.dust.get(Materials.Iron), OrePrefixes.dust.get(Materials.Iron), OrePrefixes.dust.get(Materials.Iron), OrePrefixes.dust.get(Materials.Iron), OrePrefixes.dust.get(Materials.Nickel), OrePrefixes.dust.get(Materials.Manganese), OrePrefixes.dust.get(Materials.Chrome)});
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.YttriumBariumCuprate, 6L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Yttrium), OrePrefixes.dust.get(Materials.Barium), OrePrefixes.dust.get(Materials.Barium), OrePrefixes.dust.get(Materials.AnyCopper), OrePrefixes.dust.get(Materials.AnyCopper), OrePrefixes.dust.get(Materials.AnyCopper)});
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Kanthal, 3L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Iron), OrePrefixes.dust.get(Materials.Aluminium), OrePrefixes.dust.get(Materials.Chrome)});

        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Ultimet, 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dustTiny.get(Materials.Cobalt), OrePrefixes.dustTiny.get(Materials.Cobalt), OrePrefixes.dustTiny.get(Materials.Cobalt), OrePrefixes.dustTiny.get(Materials.Cobalt), OrePrefixes.dustTiny.get(Materials.Cobalt), OrePrefixes.dustTiny.get(Materials.Chrome), OrePrefixes.dustTiny.get(Materials.Chrome), OrePrefixes.dustTiny.get(Materials.Nickel), OrePrefixes.dustTiny.get(Materials.Molybdenum)});
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.CobaltBrass, 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dustTiny.get(Materials.Brass), OrePrefixes.dustTiny.get(Materials.Brass), OrePrefixes.dustTiny.get(Materials.Brass), OrePrefixes.dustTiny.get(Materials.Brass), OrePrefixes.dustTiny.get(Materials.Brass), OrePrefixes.dustTiny.get(Materials.Brass), OrePrefixes.dustTiny.get(Materials.Brass), OrePrefixes.dustTiny.get(Materials.Aluminium), OrePrefixes.dustTiny.get(Materials.Cobalt)});
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.StainlessSteel, 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dustTiny.get(Materials.Iron), OrePrefixes.dustTiny.get(Materials.Iron), OrePrefixes.dustTiny.get(Materials.Iron), OrePrefixes.dustTiny.get(Materials.Iron), OrePrefixes.dustTiny.get(Materials.Iron), OrePrefixes.dustTiny.get(Materials.Iron), OrePrefixes.dustTiny.get(Materials.Nickel), OrePrefixes.dustTiny.get(Materials.Manganese), OrePrefixes.dustTiny.get(Materials.Chrome)});
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.YttriumBariumCuprate, 6L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dustTiny.get(Materials.Yttrium), OrePrefixes.dustTiny.get(Materials.Barium), OrePrefixes.dustTiny.get(Materials.Barium), OrePrefixes.dustTiny.get(Materials.AnyCopper), OrePrefixes.dustTiny.get(Materials.AnyCopper), OrePrefixes.dustTiny.get(Materials.AnyCopper)});
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Kanthal, 3L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dustTiny.get(Materials.Iron), OrePrefixes.dustTiny.get(Materials.Aluminium), OrePrefixes.dustTiny.get(Materials.Chrome)});

        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.VanadiumSteel, 9L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Steel), OrePrefixes.dust.get(Materials.Steel), OrePrefixes.dust.get(Materials.Steel), OrePrefixes.dust.get(Materials.Steel), OrePrefixes.dust.get(Materials.Steel), OrePrefixes.dust.get(Materials.Steel), OrePrefixes.dust.get(Materials.Steel), OrePrefixes.dust.get(Materials.Vanadium), OrePrefixes.dust.get(Materials.Chrome)});
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.HSSG, 9L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.TungstenSteel), OrePrefixes.dust.get(Materials.TungstenSteel), OrePrefixes.dust.get(Materials.TungstenSteel), OrePrefixes.dust.get(Materials.TungstenSteel), OrePrefixes.dust.get(Materials.TungstenSteel), OrePrefixes.dust.get(Materials.Chrome), OrePrefixes.dust.get(Materials.Molybdenum), OrePrefixes.dust.get(Materials.Molybdenum), OrePrefixes.dust.get(Materials.Vanadium)});
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.HSSE, 9L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.HSSG), OrePrefixes.dust.get(Materials.HSSG), OrePrefixes.dust.get(Materials.HSSG), OrePrefixes.dust.get(Materials.HSSG), OrePrefixes.dust.get(Materials.HSSG), OrePrefixes.dust.get(Materials.HSSG), OrePrefixes.dust.get(Materials.Cobalt), OrePrefixes.dust.get(Materials.Manganese), OrePrefixes.dust.get(Materials.Silicon)});
        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.HSSS, 9L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.HSSG), OrePrefixes.dust.get(Materials.HSSG), OrePrefixes.dust.get(Materials.HSSG), OrePrefixes.dust.get(Materials.HSSG), OrePrefixes.dust.get(Materials.HSSG), OrePrefixes.dust.get(Materials.HSSG), OrePrefixes.dust.get(Materials.Iridium), OrePrefixes.dust.get(Materials.Iridium), OrePrefixes.dust.get(Materials.Osmium)});


        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.IronWood, 2L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Iron), OrePrefixes.dust.get(Materials.LiveRoot), OrePrefixes.dustTiny.get(Materials.Gold)});

        GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Items.gunpowder, 3), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Coal), OrePrefixes.dust.get(Materials.Sulfur), OrePrefixes.dust.get(Materials.Saltpeter), OrePrefixes.dust.get(Materials.Saltpeter)});
        GT_ModHandler.addShapelessCraftingRecipe(new ItemStack(Items.gunpowder, 2), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Charcoal), OrePrefixes.dust.get(Materials.Sulfur), OrePrefixes.dust.get(Materials.Saltpeter), OrePrefixes.dust.get(Materials.Saltpeter)});

        GT_ModHandler.addShapelessCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Saltpeter, 5L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.dust.get(Materials.Potassium), OrePrefixes.cell.get(Materials.Nitrogen), OrePrefixes.cell.get(Materials.Oxygen), OrePrefixes.cell.get(Materials.Oxygen), OrePrefixes.cell.get(Materials.Oxygen)});
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("carbonFiber", 1L));
        if (GT_Mod.gregtechproxy.mDisableIC2Cables) {
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("copperCableItem", 1L));
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("insulatedCopperCableItem", 1L));
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("goldCableItem", 1L));
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("insulatedGoldCableItem", 1L));
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("insulatedIronCableItem", 1L));
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("glassFiberCableItem", 1L));
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("tinCableItem", 1L));
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("ironCableItem", 1L));
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("insulatedTinCableItem", 1L));
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("detectorCableItem", 1L));
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("splitterCableItem", 1L));
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("electrolyzer", 1L));

            if (Loader.isModLoaded("NotEnoughItems")) {
                codechicken.nei.api.API.hideItem(GT_ModHandler.getIC2Item("copperCableItem", 1L));
                codechicken.nei.api.API.hideItem(GT_ModHandler.getIC2Item("insulatedCopperCableItem", 1L));
                codechicken.nei.api.API.hideItem(GT_ModHandler.getIC2Item("goldCableItem", 1L));
                codechicken.nei.api.API.hideItem(GT_ModHandler.getIC2Item("insulatedGoldCableItem", 1L));
                codechicken.nei.api.API.hideItem(GT_ModHandler.getIC2Item("insulatedIronCableItem", 1L));
                codechicken.nei.api.API.hideItem(GT_ModHandler.getIC2Item("glassFiberCableItem", 1L));
                codechicken.nei.api.API.hideItem(GT_ModHandler.getIC2Item("tinCableItem", 1L));
                codechicken.nei.api.API.hideItem(GT_ModHandler.getIC2Item("ironCableItem", 1L));
                codechicken.nei.api.API.hideItem(GT_ModHandler.getIC2Item("insulatedTinCableItem", 1L));
                codechicken.nei.api.API.hideItem(GT_ModHandler.getIC2Item("detectorCableItem", 1L));
                codechicken.nei.api.API.hideItem(GT_ModHandler.getIC2Item("splitterCableItem", 1L));
                codechicken.nei.api.API.hideItem(GT_ModHandler.getIC2Item("electrolyzer", 1L));
                codechicken.nei.api.API.hideItem(GT_ModHandler.getIC2Item("cutter", 1L));
            }
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("batBox", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("batBox", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"PCP", "BBB", "PPP", 'C', OrePrefixes.cableGt01.get(Materials.Tin), 'P', OrePrefixes.plank.get(Materials.Wood), 'B', OrePrefixes.battery.get(Materials.Basic)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("mfeUnit", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("mfeUnit", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"CEC", "EME", "CEC", 'C', OrePrefixes.cableGt01.get(Materials.Gold), 'E', OrePrefixes.battery.get(Materials.Elite), 'M', GT_ModHandler.getIC2Item("machine", 1L)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("lvTransformer", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("lvTransformer", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"PCP", "POP", "PCP", 'C', OrePrefixes.cableGt01.get(Materials.Tin), 'O', GT_ModHandler.getIC2Item("coil", 1L), 'P', OrePrefixes.plank.get(Materials.Wood)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("mvTransformer", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("mvTransformer", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"CMC", 'C', OrePrefixes.cableGt01.get(Materials.Copper), 'M', GT_ModHandler.getIC2Item("machine", 1L)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("hvTransformer", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("hvTransformer", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" C ", "IMB", " C ", 'C', OrePrefixes.cableGt01.get(Materials.Gold), 'M', GT_ModHandler.getIC2Item("mvTransformer", 1L), 'I', OrePrefixes.circuit.get(Materials.Basic), 'B', OrePrefixes.battery.get(Materials.Advanced)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("evTransformer", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("evTransformer", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" C ", "IMB", " C ", 'C', OrePrefixes.cableGt01.get(Materials.Aluminium), 'M', GT_ModHandler.getIC2Item("hvTransformer", 1L), 'I', OrePrefixes.circuit.get(Materials.Advanced), 'B', OrePrefixes.battery.get(Materials.Master)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("cesuUnit", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("cesuUnit", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"PCP", "BBB", "PPP", 'C', OrePrefixes.cableGt01.get(Materials.Copper), 'P', OrePrefixes.plate.get(Materials.Bronze), 'B', OrePrefixes.battery.get(Materials.Advanced)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("luminator", 1L));
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("teleporter", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("teleporter", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"GFG", "CMC", "GDG", 'C', OrePrefixes.cableGt01.get(Materials.Platinum), 'G', OrePrefixes.circuit.get(Materials.Advanced), 'D', OrePrefixes.gem.get(Materials.Diamond), 'M', GT_ModHandler.getIC2Item("machine", 1L), 'F', GT_ModHandler.getIC2Item("frequencyTransmitter", 1L)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("energyOMat", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("energyOMat", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"RBR", "CMC", 'C', OrePrefixes.cableGt01.get(Materials.Copper), 'R', OrePrefixes.dust.get(Materials.Redstone), 'B', OrePrefixes.battery.get(Materials.Basic), 'M', GT_ModHandler.getIC2Item("machine", 1L)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("advBattery", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("advBattery", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"CTC", "TST", "TLT", 'C', OrePrefixes.cableGt01.get(Materials.Copper), 'S', OrePrefixes.dust.get(Materials.Sulfur), 'L', OrePrefixes.dust.get(Materials.Lead), 'T', GT_ModHandler.getIC2Item("casingbronze", 1L)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("boatElectric", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("boatElectric", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"CCC", "XWX", "XXX", 'C', OrePrefixes.cableGt01.get(Materials.Copper), 'X', OrePrefixes.plate.get(Materials.Iron), 'W', GT_ModHandler.getIC2Item("waterMill", 1L)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("cropnalyzer", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("cropnalyzer", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"CC ", "RGR", "RIR", 'C', OrePrefixes.cableGt01.get(Materials.Copper), 'R', OrePrefixes.dust.get(Materials.Redstone), 'G', OrePrefixes.block.get(Materials.Glass), 'I', OrePrefixes.circuit.get(Materials.Basic)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("coil", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("coil", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"CCC", "CXC", "CCC", 'C', OrePrefixes.wireGt01.get(Materials.Copper), 'X', OrePrefixes.ingot.get(Materials.AnyIron)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("powerunit", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("powerunit", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"BCA", "BIM", "BCA", 'C', OrePrefixes.cableGt01.get(Materials.Copper), 'B', OrePrefixes.battery.get(Materials.Basic), 'A', GT_ModHandler.getIC2Item("casingiron", 1L), 'I', OrePrefixes.circuit.get(Materials.Basic), 'M', GT_ModHandler.getIC2Item("elemotor", 1L)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("powerunitsmall", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("powerunitsmall", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" CA", "BIM", " CA", 'C', OrePrefixes.cableGt01.get(Materials.Copper), 'B', OrePrefixes.battery.get(Materials.Basic), 'A', GT_ModHandler.getIC2Item("casingiron", 1L), 'I', OrePrefixes.circuit.get(Materials.Basic), 'M', GT_ModHandler.getIC2Item("elemotor", 1L)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("remote", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("remote", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" C ", "TLT", " F ", 'C', OrePrefixes.cableGt01.get(Materials.Copper), 'L', OrePrefixes.dust.get(Materials.Lapis), 'T', GT_ModHandler.getIC2Item("casingtin", 1L), 'F', GT_ModHandler.getIC2Item("frequencyTransmitter", 1L)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("odScanner", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("odScanner", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"PGP", "CBC", "WWW", 'W', OrePrefixes.cableGt01.get(Materials.Copper), 'G', OrePrefixes.dust.get(Materials.Glowstone), 'B', OrePrefixes.battery.get(Materials.Advanced), 'C', OrePrefixes.circuit.get(Materials.Advanced), 'P', GT_ModHandler.getIC2Item("casinggold", 1L)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("ovScanner", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("ovScanner", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"PDP", "GCG", "WSW", 'W', OrePrefixes.cableGt01.get(Materials.Gold), 'G', OrePrefixes.dust.get(Materials.Glowstone), 'D', OrePrefixes.battery.get(Materials.Elite), 'C', OrePrefixes.circuit.get(Materials.Advanced), 'P', GT_ModHandler.getIC2Item("casinggold", 1L), 'S', GT_ModHandler.getIC2Item("odScanner", 1L)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("solarHelmet", 1L));
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("staticBoots", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("staticBoots", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"I I", "IWI", "CCC", 'C', OrePrefixes.cableGt01.get(Materials.Copper), 'I', OrePrefixes.ingot.get(Materials.Iron), 'W', new ItemStack(Blocks.wool)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("ecMeter", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("ecMeter", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" G ", "CIC", "C C", 'C', OrePrefixes.cableGt01.get(Materials.Copper), 'G', OrePrefixes.dust.get(Materials.Glowstone), 'I', OrePrefixes.circuit.get(Materials.Basic)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("obscurator", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("obscurator", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"RER", "CAC", "RRR", 'C', OrePrefixes.cableGt01.get(Materials.Gold), 'R', OrePrefixes.dust.get(Materials.Redstone), 'E', OrePrefixes.battery.get(Materials.Advanced), 'A', OrePrefixes.circuit.get(Materials.Advanced)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("overclockerUpgrade", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("overclockerUpgrade", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"CCC", "WEW", 'W', OrePrefixes.cableGt01.get(Materials.Copper), 'C', GT_ModHandler.getIC2Item("reactorCoolantSimple", 1L, 1), 'E', OrePrefixes.circuit.get(Materials.Basic)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("transformerUpgrade", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("transformerUpgrade", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"GGG", "WTW", "GEG", 'W', OrePrefixes.cableGt01.get(Materials.Gold), 'T', GT_ModHandler.getIC2Item("mvTransformer", 1L), 'E', OrePrefixes.circuit.get(Materials.Basic), 'G', OrePrefixes.block.get(Materials.Glass)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("energyStorageUpgrade", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("energyStorageUpgrade", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"PPP", "WBW", "PEP", 'W', OrePrefixes.cableGt01.get(Materials.Copper), 'E', OrePrefixes.circuit.get(Materials.Basic), 'P', OrePrefixes.plank.get(Materials.Wood), 'B', OrePrefixes.battery.get(Materials.Basic)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("ejectorUpgrade", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("ejectorUpgrade", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"PHP", "WEW", 'W', OrePrefixes.cableGt01.get(Materials.Copper), 'E', OrePrefixes.circuit.get(Materials.Basic), 'P', new ItemStack(Blocks.piston), 'H', new ItemStack(Blocks.hopper)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("suBattery", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("suBattery", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"W", "C", "R", 'W', OrePrefixes.cableGt01.get(Materials.Copper), 'C', OrePrefixes.dust.get(Materials.HydratedCoal), 'R', OrePrefixes.dust.get(Materials.Redstone)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("frequencyTransmitter", 1L));
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("pullingUpgrade", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("pullingUpgrade", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"PHP", "WEW", 'W', OrePrefixes.cableGt01.get(Materials.Copper), 'P', new ItemStack(Blocks.sticky_piston), 'R', new ItemStack(Blocks.hopper), 'E', OrePrefixes.circuit.get(Materials.Basic)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("cutter", 1L));
        } else {
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("glassFiberCableItem", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"GGG", "EDE", "GGG", Character.valueOf('G'), new ItemStack(Blocks.glass, 1, 32767), Character.valueOf('D'), OrePrefixes.dust.get(Materials.Silver), Character.valueOf('E'), ItemList.IC2_Energium_Dust.get(1L, new Object[0])});
        }
        
        if (Loader.isModLoaded("NotEnoughItems")) {
        	codechicken.nei.api.API.hideItem(GT_ModHandler.getIC2Item("reactorUraniumSimple", 1L,1));
        	codechicken.nei.api.API.hideItem(GT_ModHandler.getIC2Item("reactorUraniumDual", 1L,1));
        	codechicken.nei.api.API.hideItem(GT_ModHandler.getIC2Item("reactorUraniumQuad", 1L,1));
        	codechicken.nei.api.API.hideItem(GT_ModHandler.getIC2Item("reactorMOXSimple", 1L,1));
        	codechicken.nei.api.API.hideItem(GT_ModHandler.getIC2Item("reactorMOXDual", 1L,1));
        	codechicken.nei.api.API.hideItem(GT_ModHandler.getIC2Item("reactorMOXQuad", 1L,1));
        }
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("UranFuel", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"UUU", "NNN", "UUU", 'U', OrePrefixes.ingot.get(Materials.Uranium), 'N', OrePrefixes.nugget.get(Materials.Uranium235)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("MOXFuel", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"UUU", "NNN", "UUU", 'U', OrePrefixes.ingot.get(Materials.Uranium), 'N', OrePrefixes.ingot.get(Materials.Plutonium)});
        
        
        GT_ModHandler.addCraftingRecipe(ItemList.Uraniumcell_2.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"RPR", "   ", "   ", 'R', ItemList.Uraniumcell_1, 'P', OrePrefixes.plate.get(Materials.Iron)});
        GT_ModHandler.addCraftingRecipe(ItemList.Uraniumcell_4.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"RPR", "CPC", "RPR", 'R', ItemList.Uraniumcell_1, 'P', OrePrefixes.plate.get(Materials.Iron), 'C', OrePrefixes.plate.get(Materials.Copper)});
        GT_ModHandler.addCraftingRecipe(ItemList.Moxcell_2.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"RPR", "   ", "   ", 'R', ItemList.Moxcell_1, 'P', OrePrefixes.plate.get(Materials.Iron)});
        GT_ModHandler.addCraftingRecipe(ItemList.Moxcell_4.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"RPR", "CPC", "RPR", 'R', ItemList.Moxcell_1, 'P', OrePrefixes.plate.get(Materials.Iron), 'C', OrePrefixes.plate.get(Materials.Copper)});

        GT_ModHandler.removeRecipeByOutput(ItemList.IC2_Energium_Dust.get(1L, new Object[0]));
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.gregtechrecipes, "energycrystalruby", true)) {
            GT_ModHandler.addCraftingRecipe(ItemList.IC2_Energium_Dust.get(9L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"RDR", "DRD", "RDR", Character.valueOf('R'), OrePrefixes.dust.get(Materials.Redstone), Character.valueOf('D'), OrePrefixes.dust.get(Materials.Ruby)});
        } else {
            GT_ModHandler.addCraftingRecipe(ItemList.IC2_Energium_Dust.get(9L, new Object[0]), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"RDR", "DRD", "RDR", Character.valueOf('R'), OrePrefixes.dust.get(Materials.Redstone), Character.valueOf('D'), OrePrefixes.dust.get(Materials.Diamond)});
        }
        GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("lapotronCrystal", 1L));
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("lapotronCrystal", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"LCL", "LSL", "LCL", Character.valueOf('C'), OrePrefixes.circuit.get(Materials.Advanced), Character.valueOf('S'), GT_ModHandler.getIC2Item("energyCrystal", 1L, 32767), Character.valueOf('L'), OrePrefixes.dust.get(Materials.Lazurite)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("lapotronCrystal", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"LCL", "LSL", "LCL", Character.valueOf('C'), OrePrefixes.circuit.get(Materials.Advanced), Character.valueOf('S'), GT_ModHandler.getIC2Item("energyCrystal", 1L, 32767), Character.valueOf('L'), OrePrefixes.dust.get(Materials.Lapis)});

        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("luminator", 16L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"RTR", "GHG", "GGG", Character.valueOf('H'), OrePrefixes.cell.get(Materials.Helium), Character.valueOf('T'), OrePrefixes.ingot.get(Materials.Tin), Character.valueOf('R'), OrePrefixes.ingot.get(Materials.AnyIron), Character.valueOf('G'), new ItemStack(Blocks.glass, 1)});
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("luminator", 16L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"RTR", "GHG", "GGG", Character.valueOf('H'), OrePrefixes.cell.get(Materials.Mercury), Character.valueOf('T'), OrePrefixes.ingot.get(Materials.Tin), Character.valueOf('R'), OrePrefixes.ingot.get(Materials.AnyIron), Character.valueOf('G'), new ItemStack(Blocks.glass, 1)});

        GT_ModHandler.removeRecipe(new ItemStack[]{tStack = GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Sulfur, 1L), tStack, tStack, tStack, new ItemStack(Items.coal, 1, 0), tStack, tStack, tStack, tStack});
        GT_ModHandler.removeRecipe(new ItemStack[]{tStack = GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Sulfur, 1L), tStack, tStack, tStack, new ItemStack(Items.coal, 1, 1), tStack, tStack, tStack, tStack});
        GT_ModHandler.removeRecipe(new ItemStack[]{null, tStack = new ItemStack(Items.coal, 1), null, tStack, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Iron, 1L), tStack, null, tStack, null});

        GT_ModHandler.removeFurnaceSmelting(new ItemStack(Blocks.hopper));

        GT_Log.out.println("GT_Mod: Applying harder Recipes for several Blocks.");
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.harderrecipes, "blockbreaker", false)) {
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.removeRecipe(new ItemStack[]{new ItemStack(Blocks.cobblestone, 1), new ItemStack(Items.iron_pickaxe, 1), new ItemStack(Blocks.cobblestone, 1), new ItemStack(Blocks.cobblestone, 1), new ItemStack(Blocks.piston, 1), new ItemStack(Blocks.cobblestone, 1), new ItemStack(Blocks.cobblestone, 1), new ItemStack(Items.redstone, 1), new ItemStack(Blocks.cobblestone, 1)}), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"RGR", "RPR", "RCR", Character.valueOf('G'), OreDictNames.craftingGrinder, Character.valueOf('C'), OrePrefixes.circuit.get(Materials.Advanced), Character.valueOf('R'), OrePrefixes.plate.get(Materials.Steel), Character.valueOf('P'), OreDictNames.craftingPiston});
        }
        if ((GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.harderrecipes, "beryliumreflector", true)) &&
                (GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("reactorReflectorThick", 1L, 1)))) {
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("reactorReflectorThick", 1L, 1), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" N ", "NBN", " N ", Character.valueOf('B'), OrePrefixes.plate.get(Materials.Beryllium), Character.valueOf('N'), GT_ModHandler.getIC2Item("reactorReflector", 1L, 1)});
        }
        if ((GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.harderrecipes, "cropharvester", true)) &&
                (GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("crophavester", 1L)))) {
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("crophavester", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"ACA", "PMS", "WOW", 'M', ItemList.Hull_HV, 'C', OrePrefixes.circuit.get(Materials.Master), 'A', ItemList.Robot_Arm_HV, 'P', ItemList.Electric_Piston_HV, 'S', ItemList.Sensor_HV, 'W', OrePrefixes.toolHeadSense.get(Materials.StainlessSteel), 'O', ItemList.Conveyor_Module_HV});
        }
        if ((GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.harderrecipes, "nuclearReactor", true)) &&
                (GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("nuclearReactor", 1L)))) {
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("nuclearReactor", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"PCP", "PMP", "PAP", 'P', OrePrefixes.plateDense.get(Materials.Lead), 'C', OrePrefixes.circuit.get(Materials.Master), 'M', GT_ModHandler.getIC2Item("reactorChamber", 1), 'A', ItemList.Robot_Arm_EV});

            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("reactorChamber", 1L));
            GT_Values.RA.addAssemblerRecipe(ItemList.Hull_EV.get(1, new Object[0]), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Lead, 4), GT_ModHandler.getIC2Item("reactorChamber", 1), 200, 256);

            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("reactorvessel", 1L));
            GT_Values.RA.addChemicalBathRecipe(GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Lead, 1), Materials.Concrete.getMolten(144), GT_ModHandler.getIC2Item("reactorvessel", 1), GT_Values.NI, GT_Values.NI, null, 400, 80);

            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("reactorAccessHatch", 1L));
            GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getIC2Item("reactorvessel", 1L), ItemList.Conveyor_Module_EV.get(1, new Object[0]), GT_ModHandler.getIC2Item("reactorAccessHatch", 1L), 200, 80);

            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("reactorFluidPort", 1L));
            GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getIC2Item("reactorvessel", 1L), ItemList.Electric_Pump_EV.get(1, new Object[0]), GT_ModHandler.getIC2Item("reactorFluidPort", 1L), 200, 80);

            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("reactorRedstonePort", 1L));
            GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getIC2Item("reactorvessel", 1L), GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 1), GT_ModHandler.getIC2Item("reactorRedstonePort", 1L), 200, 80);
        }
        if ((GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.harderrecipes, "rtg", true)) &&
                (GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("RTGenerator", 1L)))) {
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("RTGenerator", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"III", "IMI", "ICI", 'I', ItemList.IC2_Item_Casing_Steel, 'C', OrePrefixes.circuit.get(Materials.Master), 'M', ItemList.Hull_IV});

            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("RTHeatGenerator", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("RTHeatGenerator", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"III", "IMB", "ICI", 'I', ItemList.IC2_Item_Casing_Steel, 'C', OrePrefixes.circuit.get(Materials.Master), 'M', ItemList.Hull_IV, 'B', GT_OreDictUnificator.get(OrePrefixes.block, Materials.Copper, 1)});
        }
        if ((GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.harderrecipes, "windRotor", true)) &&
                (GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("carbonrotor", 1L)))) {
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("carbonrotor", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"dBS", "BTB", "SBw", 'B', GT_ModHandler.getIC2Item("carbonrotorblade", 1), 'S', OrePrefixes.screw.get(Materials.Iridium), 'T', GT_ModHandler.getIC2Item("steelshaft", 1)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("steelrotor", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("steelrotor", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"dBS", "BTB", "SBw", 'B', GT_ModHandler.getIC2Item("steelrotorblade", 1), 'S', OrePrefixes.screw.get(Materials.StainlessSteel), 'T', GT_ModHandler.getIC2Item("ironshaft", 1)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("ironrotor", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("ironrotor", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"dBS", "BTB", "SBw", 'B', GT_ModHandler.getIC2Item("ironrotorblade", 1), 'S', OrePrefixes.screw.get(Materials.WroughtIron), 'T', GT_ModHandler.getIC2Item("ironshaft", 1)});
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("woodrotor", 1L));
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("woodrotor", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"dBS", "BTB", "SBw", 'B', GT_ModHandler.getIC2Item("woodrotorblade", 1), 'S', OrePrefixes.screw.get(Materials.WroughtIron), 'T', OrePrefixes.stickLong.get(Materials.WroughtIron)});
        }
        if (GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Diamond, 1L) != null) {
            tStack = GT_ModHandler.getRecipeOutput(new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Iron, 1L), new ItemStack(Items.redstone, 1), GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Iron, 1L), GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Gold, 1L), GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Iron, 1L), GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Gold, 1L), GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Diamond, 1L), new ItemStack(Items.diamond_pickaxe, 1), GT_OreDictUnificator.get(OrePrefixes.gear, Materials.Diamond, 1L)});
            if (GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.harderrecipes, "quarry", true)) {
                GT_ModHandler.removeRecipeByOutput(tStack);
                GT_ModHandler.addCraftingRecipe(tStack, GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"ICI", "GIG", "DPD", Character.valueOf('C'), OrePrefixes.circuit.get(Materials.Advanced), Character.valueOf('D'), OrePrefixes.gear.get(Materials.Diamond), Character.valueOf('G'), OrePrefixes.gear.get(Materials.Gold), Character.valueOf('I'), OrePrefixes.gear.get(Materials.Steel), Character.valueOf('P'), GT_ModHandler.getIC2Item("diamondDrill", 1L, 32767)});
            }
            if (GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.disabledrecipes, "quarry", false)) {
                GT_ModHandler.removeRecipeByOutput(tStack);
            }
        }
        if ((GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.harderrecipes, "sugarpaper", true))) {
            GT_ModHandler.removeRecipeByOutput(new ItemStack(Items.paper));
            GT_ModHandler.removeRecipeByOutput(new ItemStack(Items.sugar));
            GT_ModHandler.addCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Paper, 2), new Object[]{"SSS", " m ", 'S', new ItemStack(Items.reeds)});
            GT_ModHandler.addCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Sugar, 1), new Object[]{"Sm ", 'S', new ItemStack(Items.reeds)});
            GT_ModHandler.addCraftingRecipe(GT_OreDictUnificator.get(OrePrefixes.paper, Materials.Empty, 2), new Object[]{" C ", "SSS", " C ", 'S', GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Paper, 1), 'C', new ItemStack(Blocks.stone_slab)});
        }

        GT_Log.out.println("GT_Mod: Applying Recipes for Tools");
        if ((GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.harderrecipes, "nanosaber", true)) &&
                (GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("nanoSaber", 1L)))) {
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("nanoSaber", 1L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"PI ", "PI ", "CLC", Character.valueOf('L'), OrePrefixes.battery.get(Materials.Master), Character.valueOf('I'), OrePrefixes.plateAlloy.get("Iridium"), Character.valueOf('P'), OrePrefixes.plate.get(Materials.Platinum), Character.valueOf('C'), OrePrefixes.circuit.get(Materials.Master)});
        }
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.harderrecipes, "namefix", true)) {
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.removeRecipeByOutput(new ItemStack(Items.flint_and_steel, 1)) ? new ItemStack(Items.flint_and_steel, 1) : null, GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"S ", " F", Character.valueOf('F'), new ItemStack(Items.flint, 1), Character.valueOf('S'), "nuggetSteel"});
        }
        if (GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("diamondDrill", 1L))) {
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("diamondDrill", 1L), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" D ", "DMD", "TAT", Character.valueOf('M'), GT_ModHandler.getIC2Item("miningDrill", 1L, 32767), Character.valueOf('D'), OreDictNames.craftingIndustrialDiamond, Character.valueOf('T'), OrePrefixes.plate.get(Materials.Titanium), Character.valueOf('A'), OrePrefixes.circuit.get(Materials.Advanced)});
        }
        if (GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("miningDrill", 1L))) {
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("miningDrill", 1L), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" S ", "SCS", "SBS", Character.valueOf('C'), OrePrefixes.circuit.get(Materials.Basic), Character.valueOf('B'), OrePrefixes.battery.get(Materials.Basic), Character.valueOf('S'), GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.harderrecipes, "electricsteeltools", true) ? OrePrefixes.plate.get(Materials.StainlessSteel) : OrePrefixes.plate.get(Materials.Iron)});
        }
        if (GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("chainsaw", 1L))) {
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("chainsaw", 1L), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"BS ", "SCS", " SS", Character.valueOf('C'), OrePrefixes.circuit.get(Materials.Basic), Character.valueOf('B'), OrePrefixes.battery.get(Materials.Basic), Character.valueOf('S'), GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.harderrecipes, "electricsteeltools", true) ? OrePrefixes.plate.get(Materials.StainlessSteel) : OrePrefixes.plate.get(Materials.Iron)});
        }
        if (GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("electricHoe", 1L))) {
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("electricHoe", 1L), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"SS ", " C ", " B ", Character.valueOf('C'), OrePrefixes.circuit.get(Materials.Basic), Character.valueOf('B'), OrePrefixes.battery.get(Materials.Basic), Character.valueOf('S'), GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.harderrecipes, "electricsteeltools", true) ? OrePrefixes.plate.get(Materials.StainlessSteel) : OrePrefixes.plate.get(Materials.Iron)});
        }
        if (GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("electricTreetap", 1L))) {
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getIC2Item("electricTreetap", 1L), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" B ", "SCS", "S  ", Character.valueOf('C'), OrePrefixes.circuit.get(Materials.Basic), Character.valueOf('B'), OrePrefixes.battery.get(Materials.Basic), Character.valueOf('S'), GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.harderrecipes, "electricsteeltools", true) ? OrePrefixes.plate.get(Materials.StainlessSteel) : OrePrefixes.plate.get(Materials.Iron)});
        }
        GT_Log.out.println("GT_Mod: Removing Q-Armor Recipes if configured.");
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.disabledrecipes, "QHelmet", false)) {
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("quantumHelmet", 1L));
        }
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.disabledrecipes, "QPlate", false)) {
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("quantumBodyarmor", 1L));
        }
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.disabledrecipes, "QLegs", false)) {
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("quantumLeggings", 1L));
        }
        if (GregTech_API.sRecipeFile.get(ConfigCategories.Recipes.disabledrecipes, "QBoots", false)) {
            GT_ModHandler.removeRecipeByOutput(GT_ModHandler.getIC2Item("quantumBoots", 1L));
        }
    }
}
