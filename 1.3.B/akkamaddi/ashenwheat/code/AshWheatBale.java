package akkamaddi.ashenwheat.code;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class AshWheatBale extends BlockRotatedPillar
{
    public AshWheatBale(int par1)
    {
        super(par1, Material.grass);
        this.setCreativeTab(CreativeTabs.tabFood);
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 31;
    }

    @SideOnly(Side.CLIENT)

    /**
     * The icon for the side of the block.
     */
    protected Icon getSideIcon(int par1)
    {
        return this.blockIcon;
    }

    @SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.field_111051_a = par1IconRegister.registerIcon("ashenwheat:ashWheatBale_top");
        this.blockIcon = par1IconRegister.registerIcon("ashenwheat:ashWheatBale_side");
    }
    
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random random)
    {
        if (AshenWheat.MakeBalesFlame == true)
        {
                float f1 = (float)x - 0.5F;
                float f2 = (float)y - 0.5F;
                float f3 = (float)z - 0.5F;
                float f4 = random.nextFloat() * 2.0f;
                float f5 = random.nextFloat() * 2.0f;
                float f6 = random.nextFloat() * 2.0f;
                world.spawnParticle("smoke", (double)(f1 + f4), (double)(f2 + f5) , (double)(f3 + f6), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (double)((f1 + 0.3) + (f6 * 0.7)), (double)((f2 + 0.3) + (f4 * 0.7)) , (double)((f3 + 0.3) + (f5 * 0.7)), 0.0D, 0.0D, 0.0D);
         }
         
        else
        
        {
           	return;
        }
    }
    
}

        