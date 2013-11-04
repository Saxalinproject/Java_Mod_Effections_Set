package magicmod.saxalin.src.Ost;

import magicmod.saxalin.src.Magicos;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class DustIsidium extends Item {

	public DustIsidium(int par1) {
		super(par1);
		this.setMaxStackSize(64);
		this.setCreativeTab(Magicos.tabMagicos);
		this.setUnlocalizedName("DustIsidium");
	}

	@Override
	public void registerIcons(IconRegister reg)
 {
	 this.itemIcon = reg.registerIcon("mods:dustisidium");
 }
}
