package akkamaddi.simpletungsten.code;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import alexndr.SimpleOres.plugins.fusion.FusionRecipes;

public class TungstenRecipes
{
    public static void doTungstenRecipes()
    {

    	// Ore Dictionary
        
    	OreDictionary.registerOre("ingotTungsten", new ItemStack(SimpleTungstenCore.tungstenIngot));
    	OreDictionary.registerOre("oreTungsten", new ItemStack(SimpleTungstenCore.oreTungsten));
        OreDictionary.registerOre("ingotTungstenCarbide", new ItemStack(SimpleTungstenCore.tungstenCarbideIngot));
        OreDictionary.registerOre("ingotValfram", new ItemStack(SimpleTungstenCore.valframIngot));
        
        // recipes: Crafting
        
        //Storage Block
        
        GameRegistry.addRecipe(new ItemStack(SimpleTungstenCore.blockTungsten, 1), new Object[] {"AAA", "AAA", "AAA", 'A', SimpleTungstenCore.tungstenIngot});
        GameRegistry.addRecipe(new ItemStack(SimpleTungstenCore.blockTungstenCarbide, 1), new Object[] {"AAA", "AAA", "AAA", 'A', SimpleTungstenCore.tungstenCarbideIngot});
        GameRegistry.addRecipe(new ItemStack(SimpleTungstenCore.blockValfram, 1), new Object[] {"AAA", "AAA", "AAA", 'A', SimpleTungstenCore.valframIngot});
        
        //Item Recipe
        
        //Ingot Recipe
        
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.tungstenIngot, 9), new Object[]
        		{SimpleTungstenCore.blockTungsten});
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.tungstenCarbideIngot, 9), new Object[]
                {SimpleTungstenCore.blockTungstenCarbide});
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.valframIngot, 9), new Object[]
                {SimpleTungstenCore.blockValfram});
        
        // Tungsten Carbide Chunks
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem, 1), new Object[]
                {SimpleTungstenCore.smallTungstenCarbideChunkItem, SimpleTungstenCore.smallTungstenCarbideChunkItem, SimpleTungstenCore.smallTungstenCarbideChunkItem, SimpleTungstenCore.smallTungstenCarbideChunkItem, SimpleTungstenCore.smallTungstenCarbideChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem, 1), new Object[]
                {SimpleTungstenCore.mediumTungstenCarbideChunkItem, SimpleTungstenCore.mediumTungstenCarbideChunkItem, SimpleTungstenCore.mediumTungstenCarbideChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem, 1), new Object[]
                {SimpleTungstenCore.mediumTungstenCarbideChunkItem, SimpleTungstenCore.mediumTungstenCarbideChunkItem, SimpleTungstenCore.smallTungstenCarbideChunkItem, SimpleTungstenCore.smallTungstenCarbideChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.mediumTungstenCarbideChunkItem, 1), new Object[]
                {SimpleTungstenCore.smallTungstenCarbideChunkItem, SimpleTungstenCore.smallTungstenCarbideChunkItem, SimpleTungstenCore.smallTungstenCarbideChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.mediumTungstenCarbideChunkItem, 2), new Object[]
                {SimpleTungstenCore.largeTungstenCarbideChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.smallTungstenCarbideChunkItem, 2), new Object[]
                {SimpleTungstenCore.mediumTungstenCarbideChunkItem });
        
        // Valfram Chunks
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.largeValframChunkItem, 1), new Object[]
                {SimpleTungstenCore.smallValframChunkItem, SimpleTungstenCore.smallValframChunkItem, SimpleTungstenCore.smallValframChunkItem, SimpleTungstenCore.smallValframChunkItem, SimpleTungstenCore.smallValframChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.largeValframChunkItem, 1), new Object[]
                {SimpleTungstenCore.mediumValframChunkItem, SimpleTungstenCore.mediumValframChunkItem, SimpleTungstenCore.mediumValframChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.largeValframChunkItem, 1), new Object[]
                {SimpleTungstenCore.mediumValframChunkItem, SimpleTungstenCore.mediumValframChunkItem, SimpleTungstenCore.smallValframChunkItem, SimpleTungstenCore.smallValframChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.mediumValframChunkItem, 1), new Object[]
                {SimpleTungstenCore.smallValframChunkItem, SimpleTungstenCore.smallValframChunkItem, SimpleTungstenCore.smallValframChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.mediumValframChunkItem, 2), new Object[]
                {SimpleTungstenCore.largeValframChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.smallValframChunkItem, 2), new Object[]
                {SimpleTungstenCore.mediumValframChunkItem });

        // Tungsten
        
        //Tungsten Tool Recipes
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenPickaxe, true, new Object[]
                { "XXX", " Y ", " Y ", 'X', "ingotTungsten", 'Y', "stickWood" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenAxe, true, new Object[]
                { "XX ", "XY ", " Y ", 'X', "ingotTungsten", 'Y', "stickWood" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenShovel, true, new Object[]
                { "X", "Y", "Y", 'X', "ingotTungsten", 'Y', "stickWood" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenSword, true, new Object[]
                { "X", "X", "Y", 'X', "ingotTungsten", 'Y', "stickWood" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenHoe, true, new Object[]
                { "XX ", " Y ", " Y ", 'X', "ingotTungsten", 'Y', "stickWood" }));
        
        //Tungsten Armor
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenHelm, true, new Object[]
                { "XXX", "X X", 'X', "ingotTungsten" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenChest, true, new Object[]
                { "X X", "XXX", "XXX", 'X', "ingotTungsten" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenLegs, true, new Object[]
                { "XXX", "X X", "X X", 'X', "ingotTungsten" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenBoots, true, new Object[]
                {  "X X", "X X", 'X', "ingotTungsten" }));
        
        // Tungsten Carbide
       
        //Tungsten Carbide Tool Recipes
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenCarbidePickaxe, true, new Object[]
                {  "XXX", " Y ", " Y ", 'X', "ingotTungstenCarbide", 'Y', "stickWood" }));
       
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenCarbideAxe, true, new Object[]
                {  "XX ", "XY ", " Y ", 'X', "ingotTungstenCarbide", 'Y', "stickWood" }));
       
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenCarbideShovel, true, new Object[]
                {  "X", "Y", "Y", 'X', "ingotTungstenCarbide", 'Y', "stickWood" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenCarbideSword, true, new Object[]
                {  "X", "X", "Y", 'X', "ingotTungstenCarbide", 'Y', "stickWood" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenCarbideHoe, true, new Object[]
                {  "XX ", " Y ", " Y ", 'X', "ingotTungstenCarbide", 'Y', "stickWood" }));
        
        //Tungsten Carbide Armor
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenCarbideHelm, true, new Object[]
                {  "XXX", "X X", 'X', "ingotTungstenCarbide" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenCarbideChest, true, new Object[]
                {  "X X", "XXX", "XXX", 'X', "ingotTungstenCarbide" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenCarbideLegs, true, new Object[]
                {  "XXX", "X X", "X X", 'X', "ingotTungstenCarbide" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenCarbideBoots, true, new Object[]
                {  "X X", "X X", 'X', "ingotTungstenCarbide" }));
        
        // Valfram
        
        // Valfram Tool Recipes
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.valframPickaxe, true, new Object[]
                {  "XXX", " Y ", " Y ", 'X', "ingotValfram", 'Y', "stickWood" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.valframAxe, true, new Object[]
                {  "XX ", "XY ", " Y ", 'X', "ingotValfram", 'Y', "stickWood" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.valframShovel, true, new Object[]
                {  "X", "Y", "Y", 'X', "ingotValfram", 'Y', "stickWood" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.valframSword, true, new Object[]
                {  "X", "X", "Y", 'X', "ingotValfram", 'Y', "stickWood" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.valframHoe, true, new Object[]
                {  "XX ", " Y ", " Y ", 'X', "ingotValfram", 'Y', "stickWood" }));
        
        // Valfram Armor
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.valframHelm, true, new Object[]
                {  "XXX", "X X", 'X', "ingotValfram" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.valframChest, true, new Object[]
                {  "X X", "XXX", "XXX", 'X', "ingotValfram" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.valframLegs, true, new Object[]
                {  "XXX", "X X", "X X", 'X', "ingotValfram" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.valframBoots, true, new Object[]
                {  "X X", "X X", 'X', "ingotValfram" }));
        
        // recipes: Smelting
        
        GameRegistry.addSmelting(SimpleTungstenCore.oreTungsten.blockID, new ItemStack(SimpleTungstenCore.tungstenIngot), 0.8F);
        GameRegistry.addSmelting(SimpleTungstenCore.largeTungstenCarbideChunkItem.itemID, new ItemStack(SimpleTungstenCore.tungstenCarbideIngot), 1.0F);
        GameRegistry.addSmelting(SimpleTungstenCore.largeValframChunkItem.itemID, new ItemStack(SimpleTungstenCore.valframIngot), 1.4F);
        
        //Fusion Furnace Recipes
        
        //Tungsten Carbide
        
        FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenIngot), new ItemStack(Item.brick), new ItemStack(Item.dyePowder, 1, 15), new ItemStack(SimpleTungstenCore.smallTungstenCarbideChunkItem), 8.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenIngot), new ItemStack(Item.brick), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.mediumTungstenCarbideChunkItem), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenIngot), new ItemStack(Item.brick), new ItemStack(Item.gunpowder), new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem), 26.F);
        
        //Valfram
        
        FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenIngot), new ItemStack(Item.netherrackBrick), new ItemStack(Item.gunpowder), new ItemStack(SimpleTungstenCore.smallValframChunkItem), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenIngot), new ItemStack(Item.netherrackBrick), new ItemStack(Item.glowstone), new ItemStack(SimpleTungstenCore.mediumValframChunkItem), 12.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenIngot), new ItemStack(Item.netherrackBrick), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 36.F);
        
        if (SimpleTungstenCore.enableRecycling) {
    		
       	 // Tungsten
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.oreTungsten), 10.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.oreTungsten, 2, 0), 20.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.oreTungsten, 2, 0), 20.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.oreTungsten), 10.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.oreTungsten), 10.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.oreTungsten), 10.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.oreTungsten), 10.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.oreTungsten), 10.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.oreTungsten), 10.0F);
		
       	 // Tungsten Carbide
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenCarbideHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.clay), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem), 15.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenCarbideChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.clay, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem, 2, 0), 30.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenCarbideLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.clay, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem, 2, 0), 30.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenCarbideBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.clay), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem), 15.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenCarbideSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.clay), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem), 15.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenCarbideShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.clay), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem), 15.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenCarbidePickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.clay), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem), 15.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenCarbideAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.clay), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem), 15.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenCarbideHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Item.clay), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem), 15.0F);
		
       	 // Tungsten
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 20.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem, 2, 0), 40.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem, 2, 0), 40.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 20.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 20.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 20.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 20.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 20.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 20.0F);
			
			
       }
        
    }
}
