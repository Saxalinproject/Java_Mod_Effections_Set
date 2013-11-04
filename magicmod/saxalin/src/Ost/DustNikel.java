package magicmod.saxalin.src.Ost;

import magicmod.saxalin.src.Magicos;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class DustNikel extends Item {

	public DustNikel(int par1) {
		super(par1);
		this.setMaxStackSize(64);
		this.setCreativeTab(Magicos.tabMagicos);
		this.setUnlocalizedName("DustNikel");
	}

	@Override
	public void registerIcons(IconRegister reg)
 {
	 this.itemIcon = reg.registerIcon("mods:dustnikel");
 }
}
