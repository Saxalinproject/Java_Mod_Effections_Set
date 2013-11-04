package magicmod.saxalin.src.Ost;

import magicmod.saxalin.src.Magicos;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class DustArgentum extends Item {

	public DustArgentum(int par1) {
		super(par1);
		this.setMaxStackSize(64);
		this.setCreativeTab(Magicos.tabMagicos);
		this.setUnlocalizedName("DustArgentum");
	}

	@Override
	public void registerIcons(IconRegister reg)
 {
	 this.itemIcon = reg.registerIcon("mods:argentumdust");
 }
}
