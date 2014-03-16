package akkamaddi.ashenwheat.code;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ScintillatingAsh extends Item
{
    public ScintillatingAsh(int par1)
    {
        super(par1);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMisc);
    }

    public void registerIcons(IconRegister ir)
    {
        this.itemIcon = ir.registerIcon("ashenwheat:scintillatingAsh");
    }
}