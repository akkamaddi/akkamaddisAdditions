package akkamaddi.netherrocksaddenda.code;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraft.item.Item;
import java.util.Random;
import alexndr.SimpleOres.plugins.netherrocks.Content;
import alexndr.SimpleOres.api.helpers.CoreHelper;


public class JoinWorldNR {
	  public static double rand;
	  public static int range;

	  public static RandomRange random = new RandomRange();
	  
	  
	  /**
	   * This class allows zombies and skeletons to spawn holding/wearing SimpleOres items.
	   */
	  @ForgeSubscribe
	  public void EntityJoinWorldEvent(EntityJoinWorldEvent event)
	  {
	    if (event.world.isRemote
	        || !(event.entity instanceof EntitySkeleton || event.entity instanceof EntityZombie))
	      return;
	      
	    rand = Math.random();
	    range = random.nextInt(1, 155);
	    if (rand <= 0.02D)
	    {
	      EntityLiving living = (EntityLiving)event.entity;
	      if (range == 1 || range == 2 || range == 3) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.malachiteHelm));
	      }

	      if (range == 4 || range == 5 || range == 6) {
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.malachiteChest));
	      }

	      if (range == 7 || range == 8 || range == 9) {
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.malachiteLegs));
	      }

	      if (range == 10 || range == 11 || range == 12) {
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.malachiteBoots));
	      }
		  
		  if (range == 13 || range == 14 || range == 15) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.malachiteSword));
	        }
	      
		  if (range == 16 || range == 17 || range == 18) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.malachiteAxe));
	        }
	      
		  if (range == 19 || range == 20 || range == 21) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.malachitePick));
	        }
	      
		  if (range == 22 || range == 23 || range == 24) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.malachiteShovel));
	        }
	      
		  if (range == 25 || range == 26 || range == 27) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.malachiteHoe));
	        }
	      
		  if (range == 28 || range == 29 || range == 30) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.fyriteHelm));
	      }

	      if (range == 31 || range == 32 || range == 33) {
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.fyriteChest));
	      }

	      if (range == 34 || range == 35 || range == 36) {
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.fyriteLegs));
	      }

	      if (range == 37 || range == 38 || range == 39) {
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.fyriteBoots));
	      }

		  if (range == 40 || range == 41 || range == 42) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.fyriteSword));
	        }
	      
	      if (range == 43 || range == 44 || range == 45) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.argoniteSword));
	        }
	      
	      if (range == 46 || range == 47 || range == 48) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.argoniteAxe));
	        }
	      
	      if (range == 49 || range == 50 || range == 51) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.argonitePick));
	        }
	      
	      if (range == 52 || range == 53 || range == 54) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.argoniteShovel));
	        }
	      
	      if (range == 55 || range == 56 || range == 57) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.argoniteHoe));
	        }
	      
	      if (range == 58 || range == 59) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstoneSword));
	        }
	      
	      if (range == 60 || range == 61) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstoneAxe));
	        }
	      
	      if (range == 62 || range == 63) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstonePick));
	        }
	      
	      if (range == 64 || range == 65) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstoneShovel));
	        }
	      
	      if (range == 66 || range == 67) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstoneHoe));
	        }
	      
		  if (range == 68 || range == 69) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.illumeniteHelm));
	      }

	      if (range == 70 || range == 71) {
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.illumeniteChest));
	      }

	      if (range == 72 || range == 73) {
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.illumeniteLegs));
	      }

	      if (range == 74 || range == 75) {
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.illumeniteBoots));
	      }
	      
	      if (range == 76 || range == 77) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.illumeniteSword));
	        }
		
		  if (range == 78 || range == 79) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.dragonstoneHelm));
	      }

	      if (range == 80 || range == 81) {
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.dragonstoneChest));
	      }

	      if (range == 82 || range == 83) {
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.dragonstoneLegs));
	      }

	      if (range == 84 || range == 85) {
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.dragonstoneBoots));
	      }
	      
	      if (range == 86 || range == 87) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstoneSword));
	        }
		
	      if (range == 88 || range == 89) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstoneAxe));
	        }
		
	      if (range == 90 || range == 91) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstonePick));
	        }
		
	      if (range == 92 || range == 93) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstoneShovel));
	        }
		
	      if (range == 94 || range == 95) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstoneHoe));
	        }
		
	      if (range == 96 || range == 97) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.malachiteHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.malachiteChest));
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.malachiteLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.malachiteBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.malachiteSword));
	        }
	      
	      if (range == 98 || range == 99) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.malachiteHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.malachiteBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.malachitePick));
	        }
	      
	      if (range == 100 || range == 101) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.malachiteHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.malachiteChest));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.malachiteAxe));
	        }
	      
	      if (range == 102 || range == 103) {
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.malachiteLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.malachiteBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.malachiteShovel));
	        }
	      
	      if (range == 104 || range == 105) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.malachiteHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.malachiteBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.malachiteHoe));
	        }
	      
	      if (range == 106 || range == 107) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.fyriteHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.fyriteChest));
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.fyriteLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.fyriteBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.fyriteSword));
	        }
	      
	      if (range == 108) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.malachiteHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.malachiteChest));
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.malachiteLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.malachiteBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstoneSword));
	        }
	      
	      if (range == 109) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.malachiteHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.malachiteBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstonePick));
	        }
	      
	      if (range == 110) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.malachiteHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.malachiteChest));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstoneAxe));
	        }
	      
	      if (range == 111) {
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.malachiteLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.malachiteBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstoneShovel));
	        }
	      
	      if (range == 112) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.malachiteHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.malachiteBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstoneHoe));
	        }
	      
	      if (range == 113) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.malachiteHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.malachiteChest));
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.malachiteLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.malachiteBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.argoniteSword));
	        }
	      
	      if (range == 114) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.malachiteHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.malachiteBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.argonitePick));
	        }
	      
	      if (range == 115) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.malachiteHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.malachiteChest));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.argoniteAxe));
	        }
	      
	      if (range == 116) {
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.malachiteLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.malachiteBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.argoniteShovel));
	        }
	      
	      if (range == 117) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.malachiteHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.malachiteBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.argoniteHoe));
	        }

	      if (range == 118) {
	            living.setCurrentItemOrArmor(4, new ItemStack(Item.helmetIron));
	            living.setCurrentItemOrArmor(3, new ItemStack(Item.plateIron));
	            living.setCurrentItemOrArmor(2, new ItemStack(Item.legsIron));
	            living.setCurrentItemOrArmor(1, new ItemStack(Item.bootsIron));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstoneSword));
	        }
	      
	      if (range == 119) {
	            living.setCurrentItemOrArmor(4, new ItemStack(Item.helmetIron));
	            living.setCurrentItemOrArmor(1, new ItemStack(Item.bootsIron));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstonePick));
	        }
	      
	      if (range == 120) {
	            living.setCurrentItemOrArmor(4, new ItemStack(Item.helmetIron));
	            living.setCurrentItemOrArmor(3, new ItemStack(Item.plateIron));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstoneAxe));
	        }
	      
	      if (range == 121) {
	            living.setCurrentItemOrArmor(2, new ItemStack(Item.legsIron));
	            living.setCurrentItemOrArmor(1, new ItemStack(Item.bootsIron));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstoneShovel));
	        }
	      
	      if (range == 122) {
	            living.setCurrentItemOrArmor(4, new ItemStack(Item.helmetIron));
	            living.setCurrentItemOrArmor(1, new ItemStack(Item.bootsIron));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstoneHoe));
	        }
	      
	      if (range == 123 || range == 124) {
	            living.setCurrentItemOrArmor(4, new ItemStack(Item.helmetIron));
	            living.setCurrentItemOrArmor(3, new ItemStack(Item.plateIron));
	            living.setCurrentItemOrArmor(2, new ItemStack(Item.legsIron));
	            living.setCurrentItemOrArmor(1, new ItemStack(Item.bootsIron));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.argoniteSword));
	        }
	      
	      if (range == 125 || range == 126) {
	            living.setCurrentItemOrArmor(4, new ItemStack(Item.helmetIron));
	            living.setCurrentItemOrArmor(1, new ItemStack(Item.bootsIron));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.argonitePick));
	        }
	      
	      if (range == 127 || range == 128) {
	            living.setCurrentItemOrArmor(4, new ItemStack(Item.helmetIron));
	            living.setCurrentItemOrArmor(3, new ItemStack(Item.plateIron));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.argoniteAxe));
	        }
	      
	      if (range == 129 || range == 130) {
	            living.setCurrentItemOrArmor(2, new ItemStack(Item.legsIron));
	            living.setCurrentItemOrArmor(1, new ItemStack(Item.bootsIron));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.argoniteShovel));
	        }
	      
	      if (range == 131 || range == 132) {
	            living.setCurrentItemOrArmor(4, new ItemStack(Item.helmetIron));
	            living.setCurrentItemOrArmor(1, new ItemStack(Item.bootsIron));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.argoniteHoe));
	        }

	      if (range == 133) {
		        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.adamantiumHelm));
		        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.adamantiumChest));
		        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.adamantiumLegs));
		        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.adamantiumBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstoneSword));
	        }
	      
	      if (range == 134) {
		        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.adamantiumHelm));
		        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.adamantiumBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstonePick));
	        }
	      
	      if (range == 135) {
		        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.adamantiumHelm));
		        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.adamantiumChest));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstoneAxe));
	        }
	      
	      if (range == 136) {
		        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.adamantiumLegs));
		        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.adamantiumBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstoneShovel));
	        }
	      
	      if (range == 137) {
		        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.adamantiumHelm));
		        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.adamantiumBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.ashstoneHoe));
	        }
	      
	      if (range == 138) {
		        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.mythrilHelm));
		        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.mythrilChest));
		        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.mythrilLegs));
		        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.mythrilBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.argoniteSword));
	        }
	      
	      if (range == 139) {
		        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.mythrilHelm));
		        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.mythrilBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.argonitePick));
	        }
	      
	      if (range == 140) {
		        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.mythrilHelm));
		        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.mythrilChest));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.argoniteAxe));
	        }
	      
	      if (range == 141) {
		        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.mythrilLegs));
		        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.mythrilBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.argoniteShovel));
	        }
	      
	      if (range == 142) {
		        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.mythrilHelm));
		        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.mythrilBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.argoniteHoe));
	        }
	      
	      if (range == 143) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.illumeniteHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.illumeniteChest));
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.illumeniteLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.illumeniteBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.illumeniteSword));
	        }
	      
	      if (range == 144) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.dragonstoneHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.dragonstoneChest));
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.dragonstoneLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.dragonstoneBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstoneSword));
	        }
	      
	      if (range == 145) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.dragonstoneHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.dragonstoneBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstonePick));
	        }
	      
	      if (range == 146) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.dragonstoneHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.dragonstoneChest));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstoneAxe));
	        }
	      
	      if (range == 147) {
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.dragonstoneLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.dragonstoneBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstoneShovel));
	        }
	      
	      if (range == 148) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.dragonstoneHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.dragonstoneBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstoneHoe));
	        }

	      if (range == 149) {
		        living.setCurrentItemOrArmor(4, new ItemStack(Content.dragonstoneHelm));
		        living.setCurrentItemOrArmor(3, new ItemStack(Content.dragonstoneChest));
		        living.setCurrentItemOrArmor(2, new ItemStack(Content.dragonstoneLegs));
		        living.setCurrentItemOrArmor(1, new ItemStack(Content.dragonstoneBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.illumeniteSword));
	        }
	      
	      if (range == 150) {
		        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.onyxHelm));
		        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.onyxChest));
		        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.onyxLegs));
		        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.onyxBoots));
		        living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstoneSword));
	      }

	      if (range == 151) {
		        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.onyxHelm));
		        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.onyxBoots));
		        living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstonePick));
	      }
	      
	      if (range == 152) {
		        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.onyxHelm));
		        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.onyxChest));
		        living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstoneAxe));
	      }
	      
	      if (range == 153) {
		        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.onyxLegs));
		        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.onyxBoots));
		        living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstoneShovel));
	      }
	      
	      if (range == 154) {
		        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.onyxHelm));
		        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.onyxBoots));
		        living.setCurrentItemOrArmor(0, new ItemStack(Content.dragonstoneHoe));
	      }
	      

	      if (range == 155) {
		        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.onyxHelm));
		        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.onyxChest));
		        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.onyxLegs));
		        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.onyxBoots));
		        living.setCurrentItemOrArmor(0, new ItemStack(Content.illumeniteSword));
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
