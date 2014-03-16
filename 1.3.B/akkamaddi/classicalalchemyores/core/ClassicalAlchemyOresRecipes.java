package akkamaddi.classicalalchemyores.core;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;
import akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore;

public class ClassicalAlchemyOresRecipes
{
    public static void doClassicalAlchemyOres()
    {
        // Ore Dictionary
        OreDictionary.registerOre("oreBornite", new ItemStack(ClassicalAlchemyOresCore.borniteOre));
        
        OreDictionary.registerOre("oreCassiterite", new ItemStack(ClassicalAlchemyOresCore.cassiteriteOre));
		
        // recipes: Smelting
        GameRegistry.addSmelting(ClassicalAlchemyOresCore.borniteOre.blockID, new ItemStack(ClassicalAlchemyCore.cuprumIngot), 2.0F);
        GameRegistry.addSmelting(ClassicalAlchemyOresCore.cassiteriteOre.blockID, new ItemStack(ClassicalAlchemyCore.stannumIngot), 2.5F);
        
        
    }
}
