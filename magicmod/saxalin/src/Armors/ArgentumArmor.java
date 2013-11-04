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

public class ArgentumArmor extends ItemArmor{

	private String texturePatch ="mods:";
	private String iconPath = "mods:";
	
	public ArgentumArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3,
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
			this.setUnlocalizedName(type + "Agentum Helmet");
			this.texturePatch += type + "_layer_1.png";
			this.iconPath +=type + "argentum_helmet";
			break;
		case 1:
			this.setUnlocalizedName(type + "Argentum Chest");
			this.texturePatch += type + "_layer_1.png";
			this.iconPath +=type + "argentum_chest";
			break;
		case 2:
			this.setUnlocalizedName(type + "Argentum Leggings");
			this.texturePatch += type + "_layer_2.png";
			this.iconPath +=type + "argentum_leggings";
			break;
		case 3:
			this.setUnlocalizedName(type + "Argentum Boots");
			this.texturePatch += type + "_layer_1.png";
			this.iconPath +=type + "argentum_boots";
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

