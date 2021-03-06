package magicmod.saxalin.src.Armors;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import magicmod.saxalin.src.Magicos;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArisolArmor extends ItemArmor{

	private String texturePatch ="mods:";
	private String iconPath = "mods:";
	
	public ArisolArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3,
			int par4, String type) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		
		this.setMaxStackSize (1);
		this.setCreativeTab(Magicos.tabMagicos);
		this.SetArmorType (type.toLowerCase (), par4);
	}
	// 0 = helmet
	// 1 = chestplate
	// 2 = leggings
	// 3 - boots
	private void SetArmorType(String type, int par4) 
	{
		switch(par4)
		{
		case 0:
			this.setUnlocalizedName(type + "Arisol Helmet");
			this.texturePatch += type + "_layer_1.png";
			this.iconPath +=type + "arisol_helmet";
			break;
		case 1:
			this.setUnlocalizedName(type + "Arisol Chest");
			this.texturePatch += type + "_layer_1.png";
			this.iconPath +=type + "arisol_chest";
			break;
		case 2:
			this.setUnlocalizedName(type + "Arisol Leggings");
			this.texturePatch += type + "_layer_2.png";
			this.iconPath +=type + "arisol_leggings";
			break;
		case 3:
			this.setUnlocalizedName(type + "Arisol Boots");
			this.texturePatch += type + "_layer_1.png";
			this.iconPath +=type + "arisol_boots";
			break;
	
		}
		
	}

	
		@SideOnly(Side.CLIENT)
		public void registerIcons (IconRegister reg)
		{
			
			this.itemIcon = reg.registerIcon(this.iconPath);
		
		}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
	{
		 return this.texturePatch;
	}
}

