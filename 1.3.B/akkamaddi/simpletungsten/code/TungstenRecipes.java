package akkamaddi.simpletungsten.code;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import alexndr.SimpleOres.plugins.fusion.FusionRecipes;
import alexndr.SimpleOres.api.helpers.CoreHelper;

public class TungstenRecipes
{
    public static void doTungstenRecipes()
    {

    	// Ore Dictionary
        
    	OreDictionary.registerOre("ingotTungsten", new ItemStack(SimpleTungstenCore.tungstenIngot));
    	OreDictionary.registerOre("oreTungsten", new ItemStack(SimpleTungstenCore.oreTungsten));
        OreDictionary.registerOre("ingotTungstenCarbide", new ItemStack(SimpleTungstenCore.tungstenCarbideIngot));
        OreDictionary.registerOre("ingotValfram", new ItemStack(SimpleTungstenCore.valframIngot));
        OreDictionary.registerOre("ingotTungstenSteel", new ItemStack(SimpleTungstenCore.tungstenSteelIngot));
        OreDictionary.registerOre("ingotPrasinos", new ItemStack(SimpleTungstenCore.prasinosIngot));
        
        // recipes: Crafting
        
        //Storage Block
        
        GameRegistry.addRecipe(new ItemStack(SimpleTungstenCore.blockTungsten, 1), new Object[] {"AAA", "AAA", "AAA", 'A', SimpleTungstenCore.tungstenIngot});
        GameRegistry.addRecipe(new ItemStack(SimpleTungstenCore.blockTungstenCarbide, 1), new Object[] {"AAA", "AAA", "AAA", 'A', SimpleTungstenCore.tungstenCarbideIngot});
        GameRegistry.addRecipe(new ItemStack(SimpleTungstenCore.blockValfram, 1), new Object[] {"AAA", "AAA", "AAA", 'A', SimpleTungstenCore.valframIngot});
        GameRegistry.addRecipe(new ItemStack(SimpleTungstenCore.blockTungstenSteel, 1), new Object[] {"AAA", "AAA", "AAA", 'A', SimpleTungstenCore.tungstenSteelIngot});
        GameRegistry.addRecipe(new ItemStack(SimpleTungstenCore.blockPrasinos, 1), new Object[] {"AAA", "AAA", "AAA", 'A', SimpleTungstenCore.prasinosIngot});
        
        //Item Recipe
        
        //Ingot Recipe
        
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.tungstenIngot, 9), new Object[]
        		{SimpleTungstenCore.blockTungsten});
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.tungstenCarbideIngot, 9), new Object[]
                {SimpleTungstenCore.blockTungstenCarbide});
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.valframIngot, 9), new Object[]
                {SimpleTungstenCore.blockValfram});
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.tungstenSteelIngot, 9), new Object[]
                {SimpleTungstenCore.blockTungstenSteel});
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.prasinosIngot, 9), new Object[]
                {SimpleTungstenCore.blockPrasinos});
        
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

        // Prasinos Chunks
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.largePrasinosChunkItem, 1), new Object[]
                {SimpleTungstenCore.smallPrasinosChunkItem, SimpleTungstenCore.smallPrasinosChunkItem, SimpleTungstenCore.smallPrasinosChunkItem, SimpleTungstenCore.smallPrasinosChunkItem, SimpleTungstenCore.smallPrasinosChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.largePrasinosChunkItem, 1), new Object[]
                {SimpleTungstenCore.mediumPrasinosChunkItem, SimpleTungstenCore.mediumPrasinosChunkItem, SimpleTungstenCore.mediumPrasinosChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.largePrasinosChunkItem, 1), new Object[]
                {SimpleTungstenCore.mediumPrasinosChunkItem, SimpleTungstenCore.mediumPrasinosChunkItem, SimpleTungstenCore.smallPrasinosChunkItem, SimpleTungstenCore.smallPrasinosChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.mediumPrasinosChunkItem, 1), new Object[]
                {SimpleTungstenCore.smallPrasinosChunkItem, SimpleTungstenCore.smallPrasinosChunkItem, SimpleTungstenCore.smallPrasinosChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.mediumPrasinosChunkItem, 2), new Object[]
                {SimpleTungstenCore.largePrasinosChunkItem });
        GameRegistry.addShapelessRecipe(new ItemStack(SimpleTungstenCore.smallPrasinosChunkItem, 2), new Object[]
                {SimpleTungstenCore.mediumPrasinosChunkItem });

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
        
        // Tungsten Steel
       
        //Tungsten Steel Tool Recipes
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenSteelPickaxe, true, new Object[]
                {  "XXX", " Y ", " Y ", 'X', "ingotTungstenSteel", 'Y', "stickWood" }));
       
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenSteelAxe, true, new Object[]
                {  "XX ", "XY ", " Y ", 'X', "ingotTungstenSteel", 'Y', "stickWood" }));
       
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenSteelShovel, true, new Object[]
                {  "X", "Y", "Y", 'X', "ingotTungstenSteel", 'Y', "stickWood" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenSteelSword, true, new Object[]
                {  "X", "X", "Y", 'X', "ingotTungstenSteel", 'Y', "stickWood" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenSteelHoe, true, new Object[]
                {  "XX ", " Y ", " Y ", 'X', "ingotTungstenSteel", 'Y', "stickWood" }));
        
        //Tungsten Steel Armor
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenSteelHelm, true, new Object[]
                {  "XXX", "X X", 'X', "ingotTungstenSteel" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenSteelChest, true, new Object[]
                {  "X X", "XXX", "XXX", 'X', "ingotTungstenSteel" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenSteelLegs, true, new Object[]
                {  "XXX", "X X", "X X", 'X', "ingotTungstenSteel" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.tungstenSteelBoots, true, new Object[]
                {  "X X", "X X", 'X', "ingotTungstenSteel" }));
        
        // Prasinos
        
        // Prasinos Tool Recipes
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.prasinosPickaxe, true, new Object[]
                {  "XXX", " Y ", " Y ", 'X', "ingotPrasinos", 'Y', "stickWood" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.prasinosAxe, true, new Object[]
                {  "XX ", "XY ", " Y ", 'X', "ingotPrasinos", 'Y', "stickWood" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.prasinosShovel, true, new Object[]
                {  "X", "Y", "Y", 'X', "ingotPrasinos", 'Y', "stickWood" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.prasinosSword, true, new Object[]
                {  "X", "X", "Y", 'X', "ingotPrasinos", 'Y', "stickWood" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.prasinosHoe, true, new Object[]
                {  "XX ", " Y ", " Y ", 'X', "ingotPrasinos", 'Y', "stickWood" }));
        
        // Prasinos Armor
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.prasinosHelm, true, new Object[]
                {  "XXX", "X X", 'X', "ingotPrasinos" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.prasinosChest, true, new Object[]
                {  "X X", "XXX", "XXX", 'X', "ingotPrasinos" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.prasinosLegs, true, new Object[]
                {  "XXX", "X X", "X X", 'X', "ingotPrasinos" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(SimpleTungstenCore.prasinosBoots, true, new Object[]
                {  "X X", "X X", 'X', "ingotPrasinos" }));
        
        // recipes: Smelting
        
        GameRegistry.addSmelting(SimpleTungstenCore.oreTungsten.blockID, new ItemStack(SimpleTungstenCore.tungstenIngot), 0.8F);
        GameRegistry.addSmelting(SimpleTungstenCore.largeTungstenCarbideChunkItem.itemID, new ItemStack(SimpleTungstenCore.tungstenCarbideIngot), 1.0F);
        GameRegistry.addSmelting(SimpleTungstenCore.largeValframChunkItem.itemID, new ItemStack(SimpleTungstenCore.valframIngot), 1.4F);
        GameRegistry.addSmelting(SimpleTungstenCore.largeTungstenSteelChunkItem.itemID, new ItemStack(SimpleTungstenCore.tungstenSteelIngot), 1.2F);
        GameRegistry.addSmelting(SimpleTungstenCore.largePrasinosChunkItem.itemID, new ItemStack(SimpleTungstenCore.prasinosIngot), 1.6F);
        
        //Fusion Furnace Recipes
        
        //Tungsten Carbide
        
        FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenIngot), new ItemStack(Item.brick), new ItemStack(Item.dyePowder, 1, 15), new ItemStack(SimpleTungstenCore.smallTungstenCarbideChunkItem), 8.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenIngot), new ItemStack(Item.brick), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.mediumTungstenCarbideChunkItem), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenIngot), new ItemStack(Item.brick), new ItemStack(Item.gunpowder), new ItemStack(SimpleTungstenCore.largeTungstenCarbideChunkItem), 26.F);
        
        //Tungsten Steel
        
        FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenIngot), new ItemStack(Item.ingotIron), new ItemStack(CoreHelper.coreContent.tinIngot), new ItemStack(SimpleTungstenCore.largeTungstenSteelChunkItem), 26.F);
        
        //Valfram
        
        FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenIngot), new ItemStack(Item.netherrackBrick), new ItemStack(Item.gunpowder), new ItemStack(SimpleTungstenCore.smallValframChunkItem), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenIngot), new ItemStack(Item.netherrackBrick), new ItemStack(Item.glowstone), new ItemStack(SimpleTungstenCore.mediumValframChunkItem), 12.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenIngot), new ItemStack(Item.netherrackBrick), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 36.F);
        
        //Prasinos
        
        FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenIngot), new ItemStack(CoreHelper.coreContent.adamantiumIngot), new ItemStack(Item.glowstone), new ItemStack(SimpleTungstenCore.smallPrasinosChunkItem), 12.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenIngot), new ItemStack(CoreHelper.coreContent.adamantiumIngot), new ItemStack(Item.magmaCream), new ItemStack(SimpleTungstenCore.mediumPrasinosChunkItem), 16.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenIngot), new ItemStack(CoreHelper.coreContent.adamantiumIngot), new ItemStack(Item.blazePowder), new ItemStack(SimpleTungstenCore.largePrasinosChunkItem), 40.F);
        
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
		
       	 // Valfram
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 20.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem, 2, 0), 40.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem, 2, 0), 40.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 20.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 20.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 20.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 20.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 20.0F);
           FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.valframHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largeValframChunkItem), 20.0F);
			
           // Tungsten Steel
             FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenSteelHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenSteelChunkItem), 15.0F);
             FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenSteelChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenSteelChunkItem, 2, 0), 30.0F);
             FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenSteelLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenSteelChunkItem, 2, 0), 30.0F);
             FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenSteelBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenSteelChunkItem), 15.0F);
             FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenSteelSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenSteelChunkItem), 15.0F);
             FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenSteelShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenSteelChunkItem), 15.0F);
             FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenSteelPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenSteelChunkItem), 15.0F);
             FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenSteelAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenSteelChunkItem), 15.0F);
             FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.tungstenSteelHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(SimpleTungstenCore.largeTungstenSteelChunkItem), 15.0F);
  		
         	 // Prasinos
             FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.prasinosHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largePrasinosChunkItem), 25.0F);
             FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.prasinosChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largePrasinosChunkItem, 2, 0), 50.0F);
             FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.prasinosLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largePrasinosChunkItem, 2, 0), 50.0F);
             FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.prasinosBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largePrasinosChunkItem), 25.0F);
             FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.prasinosSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largePrasinosChunkItem), 25.0F);
             FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.prasinosShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largePrasinosChunkItem), 25.0F);
             FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.prasinosPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largePrasinosChunkItem), 25.0F);
             FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.prasinosAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largePrasinosChunkItem), 25.0F);
             FusionRecipes.smelting().addSmelting(new ItemStack(SimpleTungstenCore.prasinosHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(SimpleTungstenCore.largePrasinosChunkItem), 25.0F);
  			
			
       }
        
    }
}
