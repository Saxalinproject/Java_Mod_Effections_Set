package magicmod.saxalin.src.Ores;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import magicmod.saxalin.src.Magicos;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class ArgentumOre extends BlockOre {

	public ArgentumOre(int par1) {
		super(par1);
		this.setHardness (4.3F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setUnlocalizedName("ArgentumOre");
		this.setCreativeTab(Magicos.tabMagicos);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg)
	{
		this.blockIcon = reg.registerIcon("mods:argentum_ore");
	}
	
	
}
