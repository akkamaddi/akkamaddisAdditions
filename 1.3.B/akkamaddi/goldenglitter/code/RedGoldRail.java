package akkamaddi.goldenglitter.code;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.block.BlockRail;

public class RedGoldRail extends BlockRail
{
    @SideOnly(Side.CLIENT)
    private Icon theIcon;
    private Icon blockIcon;

    protected RedGoldRail(int par1)
    {
        super(par1);
        // TODO Auto-generated constructor stub
    }

    /**
     * Returns true if the block is emitting indirect/weak redstone power on the specified side. If isBlockNormalCube
     * returns true, standard redstone propagation rules will apply instead and this will not be called. Args: World, X,
     * Y, Z, side. Note that the side is reversed - eg it is 1 (up) when checking the bottom of the block.
     */
    public int isProvidingWeakPower(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return 15;
    }

    @Override
    /*
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon("goldenglitter" + ":" + (this.getUnlocalizedName().substring(5)));
    }

    @SideOnly(Side.CLIENT)

     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.

    public void registerIcons2(IconRegister par1IconRegister)
    {
        super.registerIcons(par1IconRegister);
        this.blockIcon = iconRegister.registerIcon("goldenglitter" + ":" + (this.getUnlocalizedName().substring(5)) + "_turned");
    }
    */
    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int par1, int par2)
    {
        return par2 >= 6 ? this.theIcon : this.blockIcon;
    }

    @SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister par1IconRegister)
    {
        //super.registerIcons(par1IconRegister);
        //if (registerIcons(par1IconRegister))
        this.theIcon = par1IconRegister.registerIcon("goldenglitter" + ":" + (this.getUnlocalizedName()) + "_turned");
        this.blockIcon = par1IconRegister.registerIcon("goldenglitter" + ":" + (this.getTextureName()));
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random random)
    {
        if (GoldenGlitterCore.MakeRedGoldRailSparkle == true)
        {
            float f1 = (float)x;
            float f2 = (float)y - 0.1F;
            float f3 = (float)z;
            float f4 = random.nextFloat();
            float f5 = random.nextFloat() * .4f;
            float f6 = random.nextFloat();
            world.spawnParticle("reddust", (double)(f1 + f4), (double)(f2 + f5) , (double)(f3 + f6), 0.0D, 0.0D, 0.0D);
        }
        else
        {
            return;
        }
    }
}
