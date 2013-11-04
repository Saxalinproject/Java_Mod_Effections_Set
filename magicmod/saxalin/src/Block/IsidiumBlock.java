package magicmod.saxalin.src.Block;

import magicmod.saxalin.src.Magicos;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class IsidiumBlock extends Block{

	public IsidiumBlock(int par1, Material par2Material) {
		super(par1, par2Material);	
		
		this.setHardness(4.0F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setUnlocalizedName("IsidiumBlock");
		this.setCreativeTab(Magicos.tabMagicos);
	}
 
	@Override
	public void registerIcons(IconRegister reg)
 {
	 this.blockIcon = reg.registerIcon("mods:isidium_block");
 }
	
	
}
