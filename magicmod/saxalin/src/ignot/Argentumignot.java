package magicmod.saxalin.src.ignot;

import magicmod.saxalin.src.Magicos;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Argentumignot extends Item{

	public Argentumignot(int par1) {
		super(par1);
		
		
		this.setMaxStackSize(64);
		this.setCreativeTab(Magicos.tabMagicos);
		this.setUnlocalizedName("ArgentumIgnot");
	}

	@Override
	public void registerIcons(IconRegister reg)
 {
	 this.itemIcon = reg.registerIcon("mods:argentum_ignot");
 }
}
