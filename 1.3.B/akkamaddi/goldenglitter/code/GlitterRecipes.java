package akkamaddi.goldenglitter.code;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import alexndr.SimpleOres.plugins.fusion.FusionHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import alexndr.SimpleOres.api.helpers.CoreHelper;

public class GlitterRecipes
{
    public static void doGlitterRecipes()
    {
        // Ore Dictionary
        OreDictionary.registerOre("ingotRoseGold", new ItemStack(GoldenGlitterCore.roseGoldIngot));
        OreDictionary.registerOre("ingotErubescentGold", new ItemStack(GoldenGlitterCore.erubescentGoldIngot));
        OreDictionary.registerOre("ingotScarlatiteGold", new ItemStack(GoldenGlitterCore.scarlatiteGoldIngot));
        OreDictionary.registerOre("ingotHephaestanGold", new ItemStack(GoldenGlitterCore.hephaestanGoldIngot));
        // recipes: Crafting
        //Storage Block
        GameRegistry.addRecipe(new ItemStack(GoldenGlitterCore.blockRoseGold, 1), new Object[] {"AAA", "AAA", "AAA", 'A', GoldenGlitterCore.roseGoldIngot});
        GameRegistry.addRecipe(new ItemStack(GoldenGlitterCore.blockErubescentGold, 1), new Object[] {"AAA", "AAA", "AAA", 'A', GoldenGlitterCore.erubescentGoldIngot});
        GameRegistry.addRecipe(new ItemStack(GoldenGlitterCore.blockScarlatiteGold, 1), new Object[] {"AAA", "AAA", "AAA", 'A', GoldenGlitterCore.scarlatiteGoldIngot});
        GameRegistry.addRecipe(new ItemStack(GoldenGlitterCore.blockHephaestanGold, 1), new Object[] {"AAA", "AAA", "AAA", 'A', GoldenGlitterCore.hephaestanGoldIngot});
        //Item Recipe
        //Ingot Recipe
        GameRegistry.addShapelessRecipe(new ItemStack(GoldenGlitterCore.roseGoldIngot, 9), new Object[]
                                        {
                                            GoldenGlitterCore.blockRoseGold
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(GoldenGlitterCore.erubescentGoldIngot, 9), new Object[]
                                        {
                                            GoldenGlitterCore.blockErubescentGold
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(GoldenGlitterCore.scarlatiteGoldIngot, 9), new Object[]
                                        {
                                            GoldenGlitterCore.blockScarlatiteGold
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(GoldenGlitterCore.hephaestanGoldIngot, 9), new Object[]
                                        {
                                            GoldenGlitterCore.blockHephaestanGold
                                        });
        // Tools
        //Rose Gold Tool Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.roseGoldPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotRoseGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.roseGoldAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotRoseGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.roseGoldShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotRoseGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.roseGoldSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotRoseGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.roseGoldHoe, true, new Object[]
                {
                    "XX ", " Y ", " Y ", 'X', "ingotRoseGold", 'Y', "stickWood"
                }));
        //Rose Gold Armor
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.roseGoldHelm, true, new Object[]
                {
                    "XXX", "X X", 'X', "ingotRoseGold"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.roseGoldChest, true, new Object[]
                {
                    "X X", "XXX", "XXX", 'X', "ingotRoseGold"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.roseGoldLegs, true, new Object[]
                {
                    "XXX", "X X", "X X", 'X', "ingotRoseGold"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.roseGoldBoots, true, new Object[]
                {
                    "X X", "X X", 'X', "ingotRoseGold"
                }));
        //Erubescent Gold Tools
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.erubescentGoldPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotErubescentGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.erubescentGoldAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotErubescentGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.erubescentGoldShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotErubescentGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.erubescentGoldSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotErubescentGold", 'Y', "stickWood"
                }));
        //Scarlatite Gold Tools
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.scarlatiteGoldPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotScarlatiteGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.scarlatiteGoldAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotScarlatiteGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.scarlatiteGoldShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotScarlatiteGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.scarlatiteGoldSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotScarlatiteGold", 'Y', "stickWood"
                }));
        //Hephaestan Gold Tools
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.hephaestanGoldPickaxe, true, new Object[]
                {
                    "XXX", " Y ", " Y ", 'X', "ingotHephaestanGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.hephaestanGoldAxe, true, new Object[]
                {
                    "XX ", "XY ", " Y ", 'X', "ingotHephaestanGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.hephaestanGoldShovel, true, new Object[]
                {
                    "X", "Y", "Y", 'X', "ingotHephaestanGold", 'Y', "stickWood"
                }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenGlitterCore.hephaestanGoldSword, true, new Object[]
                {
                    "X", "X", "Y", 'X', "ingotHephaestanGold", 'Y', "stickWood"
                }));
        // recipes: Smelting
        GameRegistry.addSmelting(GoldenGlitterCore.largeRoseGoldChunkItem.itemID, new ItemStack(GoldenGlitterCore.roseGoldIngot), 0.8F);
        GameRegistry.addSmelting(GoldenGlitterCore.largeErubescentGoldChunkItem.itemID, new ItemStack(GoldenGlitterCore.erubescentGoldIngot), 3.0F);
        GameRegistry.addSmelting(GoldenGlitterCore.largeScarlatiteGoldChunkItem.itemID, new ItemStack(GoldenGlitterCore.scarlatiteGoldIngot), 6.0F);
        GameRegistry.addSmelting(GoldenGlitterCore.largeHephaestanGoldChunkItem.itemID, new ItemStack(GoldenGlitterCore.hephaestanGoldIngot), 9.0F);
        // recipes: Fusion Furnace
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.copperIngot), new ItemStack(Item.goldNugget), new ItemStack(Item.dyePowder, 1, 1), new ItemStack(GoldenGlitterCore.largeRoseGoldChunkItem), 6.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.redstone), new ItemStack(Item.redstone), new ItemStack(Item.ingotGold), new ItemStack(GoldenGlitterCore.largeErubescentGoldChunkItem), 12.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.redstone), new ItemStack(Item.redstone), new ItemStack(GoldenGlitterCore.erubescentGoldIngot), new ItemStack(GoldenGlitterCore.largeScarlatiteGoldChunkItem), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.bucketLava), new ItemStack(Item.bucketLava), new ItemStack(GoldenGlitterCore.scarlatiteGoldIngot), new ItemStack(GoldenGlitterCore.largeHephaestanGoldChunkItem), 20.0F);
        // Red Gold Rail
        GameRegistry.addShapelessRecipe(new ItemStack(GoldenGlitterCore.redGoldRail, 3), new Object[]
                                        {
                                            GoldenGlitterCore.erubescentGoldIngot, Block.rail, Block.rail, Block.rail
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(GoldenGlitterCore.redGoldRail, 8), new Object[]
                                        {
                                            GoldenGlitterCore.scarlatiteGoldIngot, Block.rail, Block.rail, Block.rail, Block.rail, Block.rail, Block.rail, Block.rail, Block.rail
                                        });

        if (GoldenGlitterCore.enableRecycling)
        {
            // rose gold
            FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(GoldenGlitterCore.roseGoldHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(GoldenGlitterCore.largeRoseGoldChunkItem), 10.0F);
            FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(GoldenGlitterCore.roseGoldChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(GoldenGlitterCore.largeRoseGoldChunkItem, 2, 0), 20.0F);
            FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(GoldenGlitterCore.roseGoldLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(GoldenGlitterCore.largeRoseGoldChunkItem, 2, 0), 20.0F);
            FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(GoldenGlitterCore.roseGoldBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(GoldenGlitterCore.largeRoseGoldChunkItem), 10.0F);
            FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(GoldenGlitterCore.roseGoldSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(GoldenGlitterCore.largeRoseGoldChunkItem), 10.0F);
            FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(GoldenGlitterCore.roseGoldShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(GoldenGlitterCore.largeRoseGoldChunkItem), 10.0F);
            FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(GoldenGlitterCore.roseGoldPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(GoldenGlitterCore.largeRoseGoldChunkItem), 10.0F);
            FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(GoldenGlitterCore.roseGoldAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(GoldenGlitterCore.largeRoseGoldChunkItem), 10.0F);
            FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(GoldenGlitterCore.roseGoldHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(GoldenGlitterCore.largeRoseGoldChunkItem), 10.0F);
            //erubescent gold
            FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(GoldenGlitterCore.erubescentGoldSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(GoldenGlitterCore.largeErubescentGoldChunkItem), 15.0F);
            FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(GoldenGlitterCore.erubescentGoldShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(GoldenGlitterCore.largeErubescentGoldChunkItem), 15.0F);
            FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(GoldenGlitterCore.erubescentGoldAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(GoldenGlitterCore.largeErubescentGoldChunkItem), 15.0F);
            FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(GoldenGlitterCore.erubescentGoldPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(GoldenGlitterCore.largeErubescentGoldChunkItem), 15.0F);
            //scarlatite gold
            FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(GoldenGlitterCore.scarlatiteGoldSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(GoldenGlitterCore.largeScarlatiteGoldChunkItem), 20.0F);
            FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(GoldenGlitterCore.scarlatiteGoldShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(GoldenGlitterCore.largeScarlatiteGoldChunkItem), 20.0F);
            FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(GoldenGlitterCore.scarlatiteGoldAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(GoldenGlitterCore.largeScarlatiteGoldChunkItem), 20.0F);
            FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(GoldenGlitterCore.scarlatiteGoldPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(GoldenGlitterCore.largeScarlatiteGoldChunkItem), 20.0F);
            //hephaestan gold
            FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(GoldenGlitterCore.hephaestanGoldSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(GoldenGlitterCore.largeHephaestanGoldChunkItem), 25.0F);
            FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(GoldenGlitterCore.hephaestanGoldShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(GoldenGlitterCore.largeHephaestanGoldChunkItem), 25.0F);
            FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(GoldenGlitterCore.hephaestanGoldAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(GoldenGlitterCore.largeHephaestanGoldChunkItem), 25.0F);
            FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(GoldenGlitterCore.hephaestanGoldPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(GoldenGlitterCore.largeHephaestanGoldChunkItem), 25.0F);
        }
    }
}
