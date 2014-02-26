package akkamaddi.ashenwheat.code;

import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class AshyBonemeal
{
    @ForgeSubscribe
    public void onUseBonemeal(BonemealEvent event)
    {
    	
        if (event.ID == AshenWheat.ashWheatCrop.blockID)
        {
        	event.world.setBlockMetadataWithNotify(event.X, event.Y, event.Z, 7, 2);
        }
        
    }
}
