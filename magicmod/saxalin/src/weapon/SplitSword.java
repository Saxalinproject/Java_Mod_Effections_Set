package magicmod.saxalin.src.weapon;

import java.util.List;

import org.lwjgl.input.Keyboard;

import magicmod.saxalin.src.Magicos;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Text;

public class SplitSword extends ItemSword {

	public SplitSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setMaxStackSize(1);
		this.setCreativeTab(Magicos.tabMagicos);
		this.setUnlocalizedName("SplitSword");
	}
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		
			 par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 20 * 5, 1));
			return par1ItemStack; 		
	}
	
	 public boolean hitEntity(ItemStack par1ItemStack,EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
	 {
	 par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.poison.id, 20 * 5, 1));
	 return true;
	 }
	@Override
	public void registerIcons(IconRegister reg)
 {
	 this.itemIcon = reg.registerIcon("mods:split_sword");
 }

	@Override
	@SuppressWarnings({"rawtypes", "unchecked"})
	public void addInformation(ItemStack is, EntityPlayer player, List list, boolean flag) {
	        if(!Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)){
	                list.add("<Press " + EnumChatFormatting.AQUA+ "Shift" + EnumChatFormatting.GRAY + ">");
	        }else{
	                list.add("\u042D\u0444\u0444\u0435\u043A\u0442 \u0443\u0441\u043A\u043E\u0440\u0435\u043D\u0438\u044F ");
	                list.add("\u042D\u0444\u0444\u0435\u043A\u0442 \u043E\u0442\u0440\u0430\u0432\u043B\u0435\u043D\u0438\u044F ");
	                
	        }
	}
	
	}
	
