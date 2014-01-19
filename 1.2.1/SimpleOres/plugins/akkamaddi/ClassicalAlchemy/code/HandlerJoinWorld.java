package SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code;

import SimpleOres.core.handlers.RandomRange;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class HandlerJoinWorld
{
    public static double rand;
    public static int range;
    public static RandomRange rnd;

    public static RandomRange random = new RandomRange();

    /**
     * This class allows zombies and skeletons to spawn holding/wearing SimpleOres items.
     */
    @ForgeSubscribe
    public void EntityJoinWorldEvent(EntityJoinWorldEvent event)
    {
        rand = Math.random();
        range = random.nextIntII(1, 81);

        if ((rand <= 0.02D) && ((event.entity instanceof EntityLiving)) && ((event.entity instanceof EntitySkeleton | event.entity instanceof EntityZombie)))
        {
            EntityLiving living = (EntityLiving)event.entity;

            if (range == 1)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.stannumHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.stannumChest));
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.stannumLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.stannumBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.stannumSword));
            }

            if (range == 2)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.stannumHelm));
            }

            if (range == 3)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.stannumChest));
            }

            if (range == 4)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.stannumLegs));
            }

            if (range == 5)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.stannumBoots));
            }

            if (range == 6)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.stannumSword));
            }

            if (range == 7)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.stannumShovel));
            }

            if (range == 8)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.stannumAxe));
            }

            if (range == 9)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.stannumPickaxe));
            }

            if (range == 10)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.stannumHoe));
            }
            
            if (range == 11)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.stannumHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.stannumChest));
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.stannumLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.stannumBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.stannumSword));
            }

            if (range == 12)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.stannumHelm));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.stannumBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.stannumPickaxe));
            }

            if (range == 13)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.stannumHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.stannumChest));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.stannumAxe));
            }

            if (range == 14)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.stannumLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.stannumBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.stannumShovel));
            }

            if (range == 15)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.stannumHelm));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.stannumBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.stannumHoe));
            }
            
            if (range == 16)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.cuprumHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.cuprumChest));
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.cuprumLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.cuprumBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.cuprumSword));
            }

            if (range == 17)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.cuprumHelm));
            }

            if (range == 18)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.cuprumChest));
            }

            if (range == 19)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.cuprumLegs));
            }

            if (range == 20)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.cuprumBoots));
            }

            if (range == 21)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.cuprumSword));
            }

            if (range == 22)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.cuprumShovel));
            }

            if (range == 23)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.cuprumAxe));
            }

            if (range == 24)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.cuprumPickaxe));
            }

            if (range == 25)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.cuprumHoe));
            }
            
            if (range == 26)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.cuprumHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.cuprumChest));
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.cuprumLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.cuprumBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.cuprumSword));
            }

            if (range == 27)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.cuprumHelm));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.cuprumBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.cuprumPickaxe));
            }

            if (range == 28)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.cuprumHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.cuprumChest));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.cuprumAxe));
            }

            if (range == 29)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.cuprumLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.cuprumBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.cuprumShovel));
            }

            if (range == 30)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.cuprumHelm));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.cuprumBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.cuprumHoe));
            }

            if (range == 31)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.pyropusBronzeHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.pyropusBronzeChest));
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.pyropusBronzeLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.pyropusBronzeBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.pyropusBronzeSword));
            }

            if (range == 32)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.pyropusBronzeHelm));
            }

            if (range == 33)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.pyropusBronzeChest));
            }

            if (range == 34)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.pyropusBronzeLegs));
            }

            if (range == 35)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.pyropusBronzeBoots));
            }

            if (range == 36)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.pyropusBronzeSword));
            }

            if (range == 37)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.pyropusBronzeShovel));
            }

            if (range == 38)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.pyropusBronzeAxe));
            }

            if (range == 39)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.pyropusBronzePickaxe));
            }

            if (range == 40)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.pyropusBronzeHoe));
            }
            
            if (range == 41)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.pyropusBronzeHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.pyropusBronzeChest));
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.pyropusBronzeLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.pyropusBronzeBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.pyropusBronzeSword));
            }

            if (range == 42)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.pyropusBronzeHelm));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.pyropusBronzeBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.pyropusBronzePickaxe));
            }

            if (range == 43)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.pyropusBronzeHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.pyropusBronzeChest));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.pyropusBronzeAxe));
            }

            if (range == 44)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.pyropusBronzeLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.pyropusBronzeBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.pyropusBronzeShovel));
            }

            if (range == 45)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.pyropusBronzeHelm));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.pyropusBronzeBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.pyropusBronzeHoe));
            }
            
            if (range == 46)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.pyropusBronzeHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.pyropusBronzeChest));
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.pyropusBronzeLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.pyropusBronzeBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.pulchrumBronzeSword));
            }

            if (range == 47)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.pulchrumBronzeSword));
            }

            if (range == 48)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.pulchrumBronzeShovel));
            }

            if (range == 49)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.pulchrumBronzeAxe));
            }

            if (range == 50)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.pulchrumBronzePickaxe));
            }

            if (range == 51)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.pyropusBronzeHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.pyropusBronzeChest));
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.pyropusBronzeLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.pyropusBronzeBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.pulchrumBronzeSword));
            }

            if (range == 52)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.pyropusBronzeHelm));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.pyropusBronzeBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.pulchrumBronzePickaxe));
            }

            if (range == 53)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.pyropusBronzeHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.pyropusBronzeChest));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.pulchrumBronzeAxe));
            }

            if (range == 54)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.pyropusBronzeLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.pyropusBronzeBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.pulchrumBronzeShovel));
            }
            

            if (range == 55 ||range == 56 || range == 57)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.tombBronzeHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.tombBronzeChest));
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.tombBronzeLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.tombBronzeBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.tombBronzeSword));
            }

            if (range == 58 || range == 59)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.tombBronzeHelm));
            }

            if (range == 60 || range == 61)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.tombBronzeChest));
            }

            if (range == 62 || range == 63)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.tombBronzeLegs));
            }

            if (range == 64 || range == 65)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.tombBronzeBoots));
            }

            if (range == 66 || range == 67)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.tombBronzeSword));
            }

            if (range == 68 || range == 69)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.tombBronzeShovel));
            }

            if (range == 70 || range == 71)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.tombBronzeAxe));
            }

            if (range == 72 || range == 73)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.tombBronzePickaxe));
            }

            if (range == 74 || range == 75)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.tombBronzeHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.tombBronzeChest));
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.tombBronzeLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.tombBronzeBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.tombBronzeSword));
            }

            if (range == 76 || range == 77)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.tombBronzeHelm));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.tombBronzeBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.tombBronzePickaxe));
            }

            if (range == 78 || range == 79)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.tombBronzeHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.tombBronzeChest));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.tombBronzeAxe));
            }

            if (range == 80 || range == 81)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.tombBronzeLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.tombBronzeBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.tombBronzeShovel));
            }
            
        }
    }
}
