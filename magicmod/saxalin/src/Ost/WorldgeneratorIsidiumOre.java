package magicmod.saxalin.src.Ost;
import java.util.Random;

import magicmod.saxalin.src.Magicos;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
public class WorldgeneratorIsidiumOre implements IWorldGenerator
{
public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
{
switch (world.provider.dimensionId)
{
case -1: generateNether(world, random, chunkX*16, chunkZ*16);
case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
}
}

public void generateSurface(World world, Random random, int chunkX, int chunkZ)
{
for(int i=0; i < 40; i++)
{
int randPosX=chunkX + random.nextInt(16);
int randPosY=random.nextInt(120);
int randPosZ=chunkZ + random.nextInt(16);
(new WorldGenMinable(Magicos.IsidiumOre.blockID, 4)).generate(world, random, randPosX, randPosY, randPosZ);
}

for(int i=0; i < 100; i++)
{
int randPosX=chunkX + random.nextInt(16);
int randPosY=random.nextInt(150);
int randPosZ=chunkZ + random.nextInt(16);
(new WorldGenMinable(Magicos.ArisolOre.blockID, 4)).generate(world, random, randPosX, randPosY, randPosZ);
}

for(int i=0; i < 20; i++)
{
int randPosX=chunkX + random.nextInt(16);
int randPosY=random.nextInt(70);
int randPosZ=chunkZ + random.nextInt(16);
(new WorldGenMinable(Magicos.ArgentumOre.blockID, 4)).generate(world, random, randPosX, randPosY, randPosZ);
}

}

private void generateNether(World world, Random random, int chunkX, int chunkZ)
{

}
}