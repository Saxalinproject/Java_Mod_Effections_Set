package magicmod.saxalin.src.weapon;

import magicmod.saxalin.src.Magicos;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ArisolAxe extends ItemSword {

	public ArisolAxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setMaxStackSize(1);
		this.setCreativeTab(Magicos.tabMagicos);
		this.setUnlocalizedName("ArisolAxe");
	}
	
	@Override
	public void registerIcons(IconRegister reg)
 {
	 this.itemIcon = reg.registerIcon("mods:arisol_axe");
 }
}

