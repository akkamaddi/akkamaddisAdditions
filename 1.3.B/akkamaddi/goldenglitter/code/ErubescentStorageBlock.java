package akkamaddi.goldenglitter.code;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ErubescentStorageBlock extends Block
{
    private String modName;
    /**
     * The main constructor for the blocks.
     *
     * @param par1 = ID of the block.
     * @param material = The material of the block. This sets what tools are effective against it, the sounds it makes, etc.
     */

    public ErubescentStorageBlock(int par1, Material material, String mod)
    {
        super(par1, material);
        this.modName = mod;
    }

    /**
     * Sets the texture for the block.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon(modName + ":" + (this.getUnlocalizedName().substring(5)));
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random random)
    {
        if (GoldenGlitterCore.MakeErubescentSparkle == true)
        {
            float f1 = (float)x - 0.3F;
            float f2 = (float)y - 0.3F;
            float f3 = (float)z - 0.3F;
            float f4 = random.nextFloat() * 1.6f;
            float f5 = random.nextFloat() * 1.6f;
            float f6 = random.nextFloat() * 1.6f;
            world.spawnParticle("reddust", (double)(f1 + f4), (double)(f2 + f5) , (double)(f3 + f6), 0.0D, 0.0D, 0.0D);
        }
        else
        {
            return;
        }
    }

    /**
    * Can this block provide power. Only wire currently seems to have this change based on its state.
    */
    public boolean canProvidePower()
    {
        return true;
    }

    /**
     * Returns true if the block is emitting indirect/weak redstone power on the specified side. If isBlockNormalCube
     * returns true, standard redstone propagation rules will apply instead and this will not be called. Args: World, X,
     * Y, Z, side. Note that the side is reversed - eg it is 1 (up) when checking the bottom of the block.
     */
    public int isProvidingWeakPower(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return 7;
    }
}
