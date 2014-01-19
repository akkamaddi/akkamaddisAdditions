package akkamaddi.SterlingAndBlack.code;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlackStorageBlock extends Block
{
    private String modName;
    /**
     * The main constructor for the blocks.
     *
     * @param par1 = ID of the block.
     * @param material = The material of the block. This sets what tools are effective against it, the sounds it makes, etc.
     */
    public BlackStorageBlock(int par1, Material material, String mod)
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
}
