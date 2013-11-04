package magicmod.saxalin.src.Ores;

import magicmod.saxalin.src.Magicos;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class ArisolOre extends BlockOre{

	public ArisolOre(int par1) {
		super(par1);
		
		
		this.setHardness(3.0F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setUnlocalizedName("arisolOre");
		this.setCreativeTab(Magicos.tabMagicos);
	}
	@Override
	public void registerIcons(IconRegister reg)
	{
		this.blockIcon =reg.registerIcon("mods:arisol_ore");
	}
}
