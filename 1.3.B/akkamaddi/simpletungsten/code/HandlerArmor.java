package akkamaddi.simpletungsten.code;

import java.util.EnumSet;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

public class HandlerArmor {
	
    //effects
    @ForgeSubscribe
    public void onFallDamage(LivingAttackEvent event)
    {
        if (event.entity instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer)event.entity;
            ItemStack helmet = player.getCurrentItemOrArmor(4);
            ItemStack chest = player.getCurrentItemOrArmor(3);
            ItemStack legs = player.getCurrentItemOrArmor(2);
            ItemStack boots = player.getCurrentItemOrArmor(1);

            if (event.entity instanceof EntityPlayer)
            {
                EntityPlayer eventPlayer = (EntityPlayer)event.entity;

                if (helmet != null && chest != null && legs != null && boots != null)
                {
                    if (helmet.getItem() == SimpleTungstenCore.valframHelm & chest.getItem() == SimpleTungstenCore.valframChest & legs.getItem() == SimpleTungstenCore.valframLegs & boots.getItem() == SimpleTungstenCore.valframBoots)
                    {
                        if (event.source.equals(DamageSource.lava) || event.source.equals(DamageSource.inFire) || event.source.equals(DamageSource.onFire))
                        {
                            event.setCanceled(true);
                            //return;
                        }
                    }
                }
            }
        }
		
		
        if (event.entity instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer)event.entity;
            ItemStack helmet = player.getCurrentItemOrArmor(4);
            ItemStack chest = player.getCurrentItemOrArmor(3);
            ItemStack legs = player.getCurrentItemOrArmor(2);
            ItemStack boots = player.getCurrentItemOrArmor(1);

            if (event.entity instanceof EntityPlayer)
            {
                EntityPlayer eventPlayer = (EntityPlayer)event.entity;

                if (helmet != null && chest != null && legs != null && boots != null)
                {
                    if (helmet.getItem() == SimpleTungstenCore.tungstenCarbideHelm & chest.getItem() == SimpleTungstenCore.tungstenCarbideChest & legs.getItem() == SimpleTungstenCore.tungstenCarbideLegs & boots.getItem() == SimpleTungstenCore.tungstenCarbideBoots)
                    {
                        if (event.source.equals(DamageSource.anvil) || event.source.equals(DamageSource.fallingBlock) || event.source.equals(DamageSource.inWall))
                        {
                            event.setCanceled(true);
                            //return;
                        }
                    }
                }
            }
        }
		
    }

}
