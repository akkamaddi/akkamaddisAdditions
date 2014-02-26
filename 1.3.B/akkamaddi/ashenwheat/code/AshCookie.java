package akkamaddi.ashenwheat.code;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class AshCookie extends ItemFood
{

	 		
	public AshCookie(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabFood);
        setAlwaysEdible();
        setPotionEffect(Potion.regeneration.id, 2, 1, 1.0F);
	
	}

	
    public void registerIcons(IconRegister ir)
    {
        this.itemIcon = ir.registerIcon("ashenwheat:ashCookie");
    }
    
}

