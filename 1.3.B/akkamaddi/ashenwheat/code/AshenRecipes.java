package akkamaddi.ashenwheat.code;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class AshenRecipes
{
    public static void doAshenRecipes()
    {
        //ore dictionary registrations
    	OreDictionary.registerOre("cropAshenwheat", new ItemStack(AshenWheatCore.ashWheatSheaf));
        OreDictionary.registerOre("seedAshenwheat", new ItemStack(AshenWheatCore.ashSeeds));
        OreDictionary.registerOre("foodAshenBread", new ItemStack(AshenWheatCore.ashBread));
        OreDictionary.registerOre("foodAshenCookie", new ItemStack(AshenWheatCore.ashCookie));
        
    	OreDictionary.registerOre("cropScintillawheat", new ItemStack(AshenWheatCore.scintillaWheatSheaf));
        OreDictionary.registerOre("seedScintillawheat", new ItemStack(AshenWheatCore.scintillaSeeds));
        OreDictionary.registerOre("foodScintillaBread", new ItemStack(AshenWheatCore.scintillaBread));
        OreDictionary.registerOre("foodScintillaCookie", new ItemStack(AshenWheatCore.scintillaCookie));
        
        OreDictionary.registerOre("cropOssidroot", new ItemStack(AshenWheatCore.ossidRoot));
        OreDictionary.registerOre("seedOssidroot", new ItemStack(AshenWheatCore.ossidSeeds));
        OreDictionary.registerOre("dustCalcifiedAsh", new ItemStack(AshenWheatCore.calcifiedAsh));
        OreDictionary.registerOre("dustAsh", new ItemStack(AshenWheatCore.calcifiedAsh));
        
        OreDictionary.registerOre("seedThundergrass", new ItemStack(AshenWheatCore.thunderSeeds));
        OreDictionary.registerOre("dustUnstableSoot", new ItemStack(AshenWheatCore.unstableSoot));
        
        
        // recipes
        GameRegistry.addRecipe(new ItemStack(AshenWheatCore.ashBread, 1), 
        		new Object[] {"AAA", 'A', AshenWheatCore.ashWheatSheaf});
        GameRegistry.addRecipe(new ItemStack(AshenWheatCore.ashWheatBale, 1), 
        		new Object[] {"AAA", "AAA", "AAA", 'A', AshenWheatCore.ashWheatSheaf});
        GameRegistry.addRecipe(new ItemStack(AshenWheatCore.ashCookie, 8), 
        		new Object[] {"WCW", 'W', AshenWheatCore.ashWheatSheaf, 'C', new ItemStack(Item.dyePowder, 1, 3)});

        GameRegistry.addShapelessRecipe(new ItemStack(AshenWheatCore.ashSeeds, 4), 
        		new Object[] { AshenWheatCore.ashWheatSheaf });
        GameRegistry.addShapelessRecipe(new ItemStack(AshenWheatCore.ashWheatSheaf, 9), 
        		new Object[] { AshenWheatCore.ashWheatBale });

        GameRegistry.addRecipe(new ItemStack(AshenWheatCore.scintillaBread, 1), 
        		new Object[] {"AAA", 'A', AshenWheatCore.scintillaWheatSheaf});
        GameRegistry.addRecipe(new ItemStack(AshenWheatCore.scintillaWheatBale, 1), 
        		new Object[] {"AAA", "AAA", "AAA", 'A', AshenWheatCore.scintillaWheatSheaf});
        GameRegistry.addRecipe(new ItemStack(AshenWheatCore.scintillaCookie, 8), 
        		new Object[] {"WCW", 'W', AshenWheatCore.scintillaWheatSheaf, 'C', new ItemStack(Item.dyePowder, 1, 3)});

        GameRegistry.addShapelessRecipe(new ItemStack(AshenWheatCore.scintillaSeeds, 4), 
        		new Object[] { AshenWheatCore.scintillaWheatSheaf });
        GameRegistry.addShapelessRecipe(new ItemStack(AshenWheatCore.scintillaWheatSheaf, 9), 
        		new Object[] { AshenWheatCore.scintillaWheatBale });

        GameRegistry.addRecipe(new ItemStack(Item.glowstone, 1), 
        		new Object[] {"AA", "AA", 'A', AshenWheatCore.scintillatingAsh});
        
        GameRegistry.addRecipe(new ItemStack(AshenWheatCore.ossidLantern, 1), 
        		new Object[] {"A", "T", 'A', AshenWheatCore.ossidRoot, 'T', Block.torchWood});
        
        GameRegistry.addShapelessRecipe(new ItemStack(AshenWheatCore.ossidSeeds, 4), new Object[]
                        { AshenWheatCore.ossidRoot });
        GameRegistry.addRecipe(new ItemStack(Item.dyePowder, 1, 15), 
        		new Object[] {"AA", "AA", 'A', AshenWheatCore.calcifiedAsh});
        
        
        GameRegistry.addRecipe(new ItemStack(Item.gunpowder, 1), 
        		new Object[] {"AAA", "AAA", "AAA", 'A', AshenWheatCore.unstableSoot});
        
        
        //smelting
        GameRegistry.addSmelting(AshenWheatCore.ashBread.itemID, new ItemStack(Item.coal, 1, 1), 0.5F);
        GameRegistry.addSmelting(AshenWheatCore.scintillaWheatBale.blockID, new ItemStack(AshenWheatCore.scintillatingAsh), 0.5F);
        GameRegistry.addSmelting(AshenWheatCore.ossidRoot.blockID, new ItemStack(AshenWheatCore.calcifiedAsh), 0.4F);
        GameRegistry.addSmelting(AshenWheatCore.thunderSeeds.itemID, new ItemStack(AshenWheatCore.unstableSoot), 0.4F);
        
    }
}
