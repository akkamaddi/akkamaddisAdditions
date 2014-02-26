package akkamaddi.ashenwheat.code;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class AshBread extends ItemFood
{

	public AshBread(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabFood);
	}

	/*
	public AshBread(int par1, int par2, boolean par3) {
		super(par1, par2, par3);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabFood);
		}

	
    public AshBread(int par1)
    {
        super(par1);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabFood);
    }
    */

    public void registerIcons(IconRegister ir)
    {
        this.itemIcon = ir.registerIcon("ashenwheat:ashBread");
    }
    
}
