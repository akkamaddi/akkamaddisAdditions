package akkamaddi.goldenglitter.code;

import java.util.Random;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraft.item.Item;

public class HandlerJoinWorld
{
    public static double rand;
    public static int range;

    public static RandomRange random = new RandomRange();

    /**
     * This class allows zombies and skeletons to spawn holding/wearing SimpleOres items.
     */
    @ForgeSubscribe
    public void EntityJoinWorldEvent(EntityJoinWorldEvent event)
    {
        rand = Math.random();
        range = random.nextInt(1, 36);

        if ((rand <= 0.03D) && ((event.entity instanceof EntityLiving)) && ((event.entity instanceof EntitySkeleton | event.entity instanceof EntityZombie)))
        {
            EntityLiving living = (EntityLiving)event.entity;

            if (range == 1)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(GoldenGlitterCore.roseGoldHelm));
            }

            if (range == 2)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(GoldenGlitterCore.roseGoldChest));
            }

            if (range == 3)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(GoldenGlitterCore.roseGoldLegs));
            }

            if (range == 4)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(GoldenGlitterCore.roseGoldBoots));
            }

            if (range == 5)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.roseGoldSword));
            }

            if (range == 6)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.roseGoldShovel));
            }

            if (range == 7)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.roseGoldAxe));
            }

            if (range == 8)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.roseGoldPickaxe));
            }

            if (range == 9)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.roseGoldHoe));
            }

            if (range == 10)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.erubescentGoldSword));
            }

            if (range == 11)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.erubescentGoldSword));
            }

            if (range == 12)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.erubescentGoldPickaxe));
            }

            if (range == 13)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.erubescentGoldAxe));
            }

            if (range == 14)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.erubescentGoldShovel));
            }

            if (range == 15)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.scarlatiteGoldSword));
            }

            if (range == 16)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.scarlatiteGoldSword));
            }

            if (range == 17)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.scarlatiteGoldPickaxe));
            }

            if (range == 18)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.scarlatiteGoldAxe));
            }

            if (range == 19)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.scarlatiteGoldShovel));
            }

            if (range == 20)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.hephaestanGoldSword));
            }

            if (range == 21)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.hephaestanGoldSword));
            }

            if (range == 22)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.hephaestanGoldPickaxe));
            }

            if (range == 23)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.hephaestanGoldAxe));
            }

            if (range == 24)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.hephaestanGoldShovel));
            }

            if (range == 25)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(GoldenGlitterCore.roseGoldHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(GoldenGlitterCore.roseGoldChest));
                living.setCurrentItemOrArmor(2, new ItemStack(GoldenGlitterCore.roseGoldLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(GoldenGlitterCore.roseGoldBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.roseGoldSword));
            }

            if (range == 26)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(GoldenGlitterCore.roseGoldHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(GoldenGlitterCore.roseGoldChest));
                living.setCurrentItemOrArmor(2, new ItemStack(GoldenGlitterCore.roseGoldLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(GoldenGlitterCore.roseGoldBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.roseGoldSword));
            }

            if (range == 27)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(GoldenGlitterCore.roseGoldHelm));
                living.setCurrentItemOrArmor(1, new ItemStack(GoldenGlitterCore.roseGoldBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.roseGoldPickaxe));
            }

            if (range == 28)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(GoldenGlitterCore.roseGoldHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(GoldenGlitterCore.roseGoldChest));
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.roseGoldAxe));
            }

            if (range == 29)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(GoldenGlitterCore.roseGoldLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(GoldenGlitterCore.roseGoldBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.roseGoldShovel));
            }

            if (range == 30)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(GoldenGlitterCore.roseGoldHelm));
                living.setCurrentItemOrArmor(1, new ItemStack(GoldenGlitterCore.roseGoldBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.roseGoldHoe));
            }

            if (range == 31)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(GoldenGlitterCore.roseGoldHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(GoldenGlitterCore.roseGoldChest));
                living.setCurrentItemOrArmor(2, new ItemStack(GoldenGlitterCore.roseGoldLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(GoldenGlitterCore.roseGoldBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.erubescentGoldSword));
            }

            if (range == 32)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Item.helmetGold));
                living.setCurrentItemOrArmor(3, new ItemStack(Item.plateGold));
                living.setCurrentItemOrArmor(2, new ItemStack(Item.legsGold));
                living.setCurrentItemOrArmor(1, new ItemStack(Item.bootsGold));
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.erubescentGoldSword));
            }

            if (range == 33)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(GoldenGlitterCore.roseGoldHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(GoldenGlitterCore.roseGoldChest));
                living.setCurrentItemOrArmor(2, new ItemStack(GoldenGlitterCore.roseGoldLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(GoldenGlitterCore.roseGoldBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.scarlatiteGoldSword));
            }

            if (range == 34)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Item.helmetGold));
                living.setCurrentItemOrArmor(3, new ItemStack(Item.plateGold));
                living.setCurrentItemOrArmor(2, new ItemStack(Item.legsGold));
                living.setCurrentItemOrArmor(1, new ItemStack(Item.bootsGold));
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.scarlatiteGoldSword));
            }

            if (range == 35)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(GoldenGlitterCore.roseGoldHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(GoldenGlitterCore.roseGoldChest));
                living.setCurrentItemOrArmor(2, new ItemStack(GoldenGlitterCore.roseGoldLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(GoldenGlitterCore.roseGoldBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.hephaestanGoldSword));
            }

            if (range == 36)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(Item.helmetGold));
                living.setCurrentItemOrArmor(3, new ItemStack(Item.plateGold));
                living.setCurrentItemOrArmor(2, new ItemStack(Item.legsGold));
                living.setCurrentItemOrArmor(1, new ItemStack(Item.bootsGold));
                living.setCurrentItemOrArmor(0, new ItemStack(GoldenGlitterCore.hephaestanGoldSword));
            }
        }
    }
}

class RandomRange extends Random
{
    public int nextInt(int min, int max)
    {
        return nextInt(max - min + 1) + min;
    }
}