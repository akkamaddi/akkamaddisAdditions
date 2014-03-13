package akkamaddi.netherrocksaddenda.code;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import alexndr.SimpleOres.api.helpers.WorldGenHelper;
import cpw.mods.fml.common.IWorldGenerator;
import alexndr.SimpleOres.plugins.netherrocks.Content;


public class NetherrocksGenerator implements IWorldGenerator {
	

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		if(NetherrocksAddenda.enableHigherDimensionGen && NetherrocksAddenda.dimensionIDsArray.length >= 1)
		{
			for(int i = 0; i < NetherrocksAddenda.dimensionIDsArray.length; i++)
			{
				if(world.provider.dimensionId == NetherrocksAddenda.dimensionIDsArray[i])
				{
					generateOnyx(world, random, chunkX*16, chunkZ*16, NetherrocksAddenda.dimensionIDsArray[i]);
				}
			}
		}
		
	}
	
	/**
	 * Generates the main surface ores in dimensions other than the vanilla ones.
	 * This is all configurable through the settings file, and is classified as "Advanced".
	 * 
	 * Each different dimension can have different spawn rates, with support for up to ~30000 dimensions (I think).
	 */
	//@Override
	private void generateOnyx(World world, Random random, int blockX, int blockZ, int dimensionID) 
	{
		if(NetherrocksAddenda.enableHigherDimensionGen)
		{
			for(int i = 0; i < NetherrocksAddenda.dimensionIDsArray.length; i++)
			{
				int fyriteRate = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Fyrite Spawn Rate", 10).getInt();
				int malachiteRate = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Malachite Spawn Rate", 10).getInt();
				int ashstoneRate = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Ashstone Spawn Rate", 10).getInt();
				int illumeniteRate = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Illumenite Spawn Rate", 350).getInt();
				int dragonstoneRate = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Dragonstone Spawn Rate", 6).getInt();
				int argoniteRate = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Argonite Spawn Rate", 10).getInt();
				
				for(int x = 0; x < fyriteRate; x++)
				{
					int maxHeight = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Fyrite Maximum Spawn Height", 256).getInt();
					int minHeight = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Fyrite Minimum Spawn Height", 0).getInt();
					int veinSize = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Fyrite Vein Size", 6).getInt();
					
				    int Xcoord = blockX + random.nextInt(16);
				    int Ycoord = random.nextInt(maxHeight - minHeight);
				    int Zcoord = blockZ + random.nextInt(16);
				    new WorldGenHelper(Content.fyriteOre.blockID, veinSize, Block.netherrack).generate(world, random, Xcoord, Ycoord + minHeight, Zcoord);				    
				}

				for(int x = 0; x < malachiteRate; x++)
				{
					int maxHeight = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Malachite Maximum Spawn Height", 256).getInt();
					int minHeight = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Malachite Minimum Spawn Height", 0).getInt();
					int veinSize = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Malachite Vein Size", 7).getInt();
					
				    int Xcoord = blockX + random.nextInt(16);
				    int Ycoord = random.nextInt(maxHeight - minHeight);
				    int Zcoord = blockZ + random.nextInt(16);
				    new WorldGenHelper(Content.malachiteOre.blockID, veinSize, Block.netherrack).generate(world, random, Xcoord, Ycoord + minHeight, Zcoord);				    
				}

				for(int x = 0; x < ashstoneRate; x++)
				{
					int maxHeight = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Ashstone Maximum Spawn Height", 256).getInt();
					int minHeight = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Ashstone Minimum Spawn Height", 0).getInt();
					int veinSize = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Ashstone Vein Size", 5).getInt();
					
				    int Xcoord = blockX + random.nextInt(16);
				    int Ycoord = random.nextInt(maxHeight - minHeight);
				    int Zcoord = blockZ + random.nextInt(16);
				    new WorldGenHelper(Content.ashstoneOre.blockID, veinSize, Block.netherrack).generate(world, random, Xcoord, Ycoord + minHeight, Zcoord);				    
				}

				for(int x = 0; x < illumeniteRate; x++)
				{
					int maxHeight = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Illumenite Maximum Spawn Height", 256).getInt();
					int minHeight = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Illumenite Minimum Spawn Height", 0).getInt();
					int veinSize = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Illumenite Vein Size", 15).getInt();
					
				    int Xcoord = blockX + random.nextInt(16);
				    int Ycoord = random.nextInt(maxHeight - minHeight);
				    int Zcoord = blockZ + random.nextInt(16);
				    new WorldGenHelper(Content.illumeniteOre.blockID, veinSize, Block.glowStone).generate(world, random, Xcoord, Ycoord + minHeight, Zcoord);				    
				}

				for(int x = 0; x < dragonstoneRate; x++)
				{
					int maxHeight = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Dragonstone Maximum Spawn Height", 256).getInt();
					int minHeight = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Dragonstone Minimum Spawn Height", 0).getInt();
					int veinSize = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Dragonstone Vein Size", 5).getInt();
					
				    int Xcoord = blockX + random.nextInt(16);
				    int Ycoord = random.nextInt(maxHeight - minHeight);
				    int Zcoord = blockZ + random.nextInt(16);
				    new WorldGenHelper(Content.dragonstoneOre.blockID, veinSize, Block.netherrack).generate(world, random, Xcoord, Ycoord + minHeight, Zcoord);				    
				}

				for(int x = 0; x < argoniteRate; x++)
				{
					int maxHeight = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Argonite Maximum Spawn Height", 256).getInt();
					int minHeight = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Argonite Minimum Spawn Height", 0).getInt();
					int veinSize = NetherrocksAddenda.config.get("Higher Dimension ID: " + dimensionID, "Argonite Vein Size", 6).getInt();
					
				    int Xcoord = blockX + random.nextInt(16);
				    int Ycoord = random.nextInt(maxHeight - minHeight);
				    int Zcoord = blockZ + random.nextInt(16);
				    new WorldGenHelper(Content.argoniteOre.blockID, veinSize, Block.netherrack).generate(world, random, Xcoord, Ycoord + minHeight, Zcoord);				    
				}
				
				
	
		}
	}
	
}


	
}