package magicmod.saxalin.src.Instrums;

import magicmod.saxalin.src.Magicos;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Text;

public class IsidiumPickaxe extends ItemPickaxe {

	public IsidiumPickaxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setMaxStackSize(1);
		this.setCreativeTab(Magicos.tabMagicos);
		this.setUnlocalizedName("IsidiumPickaxe");
	}
	
	@Override
	public void registerIcons(IconRegister reg)
 {
	 this.itemIcon = reg.registerIcon("mods:isidium_pickaxe");
 }
}
