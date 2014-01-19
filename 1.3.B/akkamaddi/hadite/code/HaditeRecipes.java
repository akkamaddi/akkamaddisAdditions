package akkamaddi.hadite.code;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import alexndr.SimpleOres.plugins.fusion.FusionRecipes;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import alexndr.SimpleOres.core.Armor;
import alexndr.SimpleOres.core.Tools;
import alexndr.SimpleOres.core.Items;
import alexndr.SimpleOres.core.Blocks;

public class HaditeRecipes
{
	
	public static alexndr.SimpleOres.core.Tools soTools;
    public static alexndr.SimpleOres.core.Armor soArmor;
    public static alexndr.SimpleOres.core.Items soItems;
    public static alexndr.SimpleOres.core.Blocks soBlocks;
    
    public static void doHaditeRecipes()
    {
        // Ore Dictionary registry
        OreDictionary.registerOre("ingotHaditeCoal", new ItemStack(HaditeCoalCore.haditeCoalIngot));
        OreDictionary.registerOre("oreHaditeCoal", new ItemStack(HaditeCoalCore.blockHaditeCoalOre));
        OreDictionary.registerOre("ingotHaditeSteel", new ItemStack(HaditeCoalCore.haditeSteelIngot));
        OreDictionary.registerOre("ingotGestankenzinn", new ItemStack(HaditeCoalCore.gestankenzinnIngot));
        // wildcard
        final int WILDCARD_VALUE = OreDictionary.WILDCARD_VALUE;
        // Crafting recipes
        //Storage Block
        GameRegistry.addRecipe(new ItemStack(HaditeCoalCore.blockHaditeCoalBlock, 1), new Object[] {"AAA", "AAA", "AAA", 'A', HaditeCoalCore.haditeCoalIngot});
        GameRegistry.addRecipe(new ItemStack(HaditeCoalCore.blockHaditeSteel, 1), new Object[] {"AAA", "AAA", "AAA", 'A', HaditeCoalCore.haditeSteelIngot});
        GameRegistry.addRecipe(new ItemStack(HaditeCoalCore.blockGestankenzinn, 1), new Object[] {"AAA", "AAA", "AAA", 'A', HaditeCoalCore.gestankenzinnIngot});
        //Item Recipe
        //Ingot Recipe
        GameRegistry.addShapelessRecipe(new ItemStack(HaditeCoalCore.haditeCoalIngot, 9), new Object[]
                                        {
                                            HaditeCoalCore.blockHaditeCoalBlock
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(HaditeCoalCore.haditeSteelIngot, 9), new Object[]
                                        {
                                            HaditeCoalCore.blockHaditeSteel
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(HaditeCoalCore.gestankenzinnIngot, 9), new Object[]
                                        {
                                            HaditeCoalCore.blockGestankenzinn
                                        });
        // Tools
        //Hadite Steel Tools
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(HaditeCoalCore.haditeSteelPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotHaditeSteel", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(HaditeCoalCore.haditeSteelAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotHaditeSteel", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(HaditeCoalCore.haditeSteelShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotHaditeSteel", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(HaditeCoalCore.haditeSteelSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotHaditeSteel", 'Y', "stickWood"
                }));
        //Gestankenzinn Tools
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(HaditeCoalCore.gestankenzinnPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotGestankenzinn", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(HaditeCoalCore.gestankenzinnAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotGestankenzinn", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(HaditeCoalCore.gestankenzinnShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotGestankenzinn", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(HaditeCoalCore.gestankenzinnSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotGestankenzinn", 'Y', "stickWood"
                }));
        // torches
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Block.torchWood, 64), true, new Object[]
                {
                    "YYY", "YXY", "YYY", 'X', "ingotHaditeCoal", 'Y', "stickWood"
                }));
        // recipes: Smelting
        GameRegistry.addSmelting(HaditeCoalCore.largeHaditeSteelChunkItem.itemID, new ItemStack(HaditeCoalCore.haditeSteelIngot), 4.0F);
        GameRegistry.addSmelting(HaditeCoalCore.largeGestankenzinnChunkItem.itemID, new ItemStack(HaditeCoalCore.gestankenzinnIngot), 3.0F);
        // Fusion Furnace recipes
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.flint), new ItemStack(HaditeCoalCore.haditeCoalIngot), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Item.gunpowder), 6.0F);
        // alloys
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.ingotIron), new ItemStack(HaditeCoalCore.haditeCoalIngot), new ItemStack(Item.gunpowder), new ItemStack(HaditeCoalCore.largeHaditeSteelChunkItem), 6.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Items.tinIngot), new ItemStack(HaditeCoalCore.haditeCoalIngot), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(HaditeCoalCore.largeGestankenzinnChunkItem), 5.0F);
 
        if (HaditeCoalCore.enableRecycling) {
        	//Hadite Steel
            FusionRecipes.smelting().addSmelting(new ItemStack(HaditeCoalCore.haditeSteelSword, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(HaditeCoalCore.largeHaditeSteelChunkItem), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(HaditeCoalCore.haditeSteelShovel, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(HaditeCoalCore.largeHaditeSteelChunkItem), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(HaditeCoalCore.haditeSteelAxe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(HaditeCoalCore.largeHaditeSteelChunkItem), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(HaditeCoalCore.haditeSteelPickaxe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(HaditeCoalCore.largeHaditeSteelChunkItem), 15.0F);
            //Gestankenzinn
            FusionRecipes.smelting().addSmelting(new ItemStack(HaditeCoalCore.gestankenzinnSword, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(HaditeCoalCore.largeGestankenzinnChunkItem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(HaditeCoalCore.gestankenzinnShovel, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(HaditeCoalCore.largeGestankenzinnChunkItem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(HaditeCoalCore.gestankenzinnAxe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(HaditeCoalCore.largeGestankenzinnChunkItem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(HaditeCoalCore.gestankenzinnPickaxe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(HaditeCoalCore.largeGestankenzinnChunkItem), 20.0F);
            // recycle your Onyx
            FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.onyxHelm, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(HaditeCoalCore.haditeCoalIngot), new ItemStack(soItems.onyxGem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.onyxChest, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(HaditeCoalCore.haditeCoalIngot, 2, 0), new ItemStack(soItems.onyxGem, 2, 0), 40.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.onyxLegs, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(HaditeCoalCore.haditeCoalIngot, 2, 0), new ItemStack(soItems.onyxGem, 2, 0), 40.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.onyxBoots, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(HaditeCoalCore.haditeCoalIngot), new ItemStack(soItems.onyxGem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(soTools.onyxSword, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(HaditeCoalCore.haditeCoalIngot), new ItemStack(soItems.onyxGem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(soTools.onyxShovel, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(HaditeCoalCore.haditeCoalIngot), new ItemStack(soItems.onyxGem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(soTools.onyxPick, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(HaditeCoalCore.haditeCoalIngot), new ItemStack(soItems.onyxGem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(soTools.onyxAxe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(HaditeCoalCore.haditeCoalIngot), new ItemStack(soItems.onyxGem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(soTools.onyxHoe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(HaditeCoalCore.haditeCoalIngot), new ItemStack(soItems.onyxGem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(soTools.onyxBow, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(HaditeCoalCore.haditeCoalIngot), new ItemStack(soItems.onyxGem), 20.0F);
            // extra Onyx recycling
            FusionRecipes.smelting().addSmelting(new ItemStack(soItems.onyxDoorItem, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(HaditeCoalCore.haditeCoalIngot), new ItemStack(soItems.onyxGem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(soItems.onyxRod, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(HaditeCoalCore.haditeCoalIngot), new ItemStack(soItems.onyxGem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(soTools.onyxShears, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(HaditeCoalCore.haditeCoalIngot), new ItemStack(soItems.onyxGem), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(soBlocks.onyxFurnace, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(HaditeCoalCore.haditeCoalIngot), new ItemStack(soItems.onyxGem, 2, 0), 40.0F);
        }
    }
}
