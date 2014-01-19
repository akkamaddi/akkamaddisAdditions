package akkamaddi.ClassicalAlchemy.code;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import alexndr.SimpleOres.plugins.fusion.FusionRecipes;
import alexndr.SimpleOres.core.Items;

public class ClassicalAlchemyRecipes
{
    public static void doStannumRecipes()
    {
        
    	// Ore Dictionary
        
    	OreDictionary.registerOre("ingotStannum", new ItemStack(ClassicalAlchemyCore.stannumIngot));
        
    	// recipes: Crafting
        
    	//Storage Block
        
    	GameRegistry.addRecipe(new ItemStack(ClassicalAlchemyCore.blockStannum, 1), new Object[] {"AAA", "AAA", "AAA", 'A', ClassicalAlchemyCore.stannumIngot});
        
    	//Item Recipe
        
    	//Ingot Recipe
        
    	GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.stannumIngot, 9), new Object[]
            {ClassicalAlchemyCore.blockStannum });
        
    	// Tools
        
    	//Stannum Tool Recipes
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.stannumPickaxe, true, new Object[]
                { "XXX", " Y ", " Y ", 'X', "ingotStannum", 'Y', "stickWood" }));
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.stannumAxe, true, new Object[]
                { "XX ", "XY ", " Y ", 'X', "ingotStannum", 'Y', "stickWood" }));
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.stannumShovel, true, new Object[]
                { "X", "Y", "Y", 'X', "ingotStannum", 'Y', "stickWood" }));
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.stannumSword, true, new Object[]
                { "X", "X", "Y", 'X', "ingotStannum", 'Y', "stickWood" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.stannumHoe, true, new Object[]
                { "XX ", " Y ", " Y ", 'X', "ingotStannum", 'Y', "stickWood" }));
        
        //Stannum Armor
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.stannumHelm, true, new Object[]
                { "XXX", "X X", 'X', "ingotStannum" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.stannumChest, true, new Object[]
                { "X X", "XXX", "XXX", 'X', "ingotStannum" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.stannumLegs, true, new Object[]
                { "XXX", "X X", "X X", 'X', "ingotStannum" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.stannumBoots, true, new Object[]
                { "X X", "X X", 'X', "ingotStannum" }));
        
        // recipes: Smelting
        
        GameRegistry.addSmelting(ClassicalAlchemyCore.largeStannumChunkItem.itemID, new ItemStack(ClassicalAlchemyCore.stannumIngot), 1.0F);
        
        // Fusion Furnace

        FusionRecipes.smelting().addSmelting(new ItemStack(Items.tinIngot), new ItemStack(Items.tinIngot), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.smallStannumChunkItem), 0.4F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Items.tinIngot), new ItemStack(Items.tinIngot), new ItemStack(Item.dyePowder, 1, 15), new ItemStack(ClassicalAlchemyCore.mediumStannumChunkItem), 0.8F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Items.tinIngot), new ItemStack(Items.tinIngot), new ItemStack(Item.gunpowder), new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem), 1.2F);
        
        // Recycling
        
        if (ClassicalAlchemyCore.enableRecycling) {
        	 // Stannum
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem), 7.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem, 2, 0), 14.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem, 2, 0), 14.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem), 7.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem), 7.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem), 7.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem), 7.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem), 7.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem), 7.0F);
        }
        
        
    }
}
