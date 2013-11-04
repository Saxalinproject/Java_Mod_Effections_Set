package magicmod.saxalin.src;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;


public class Pizza extends ItemFood
{
public Pizza(int par1, int par2, float par3, boolean par4)
        {
         super(par1, par2, par4);
         this.setCreativeTab(Magicos.tabMagicosEat);
   maxStackSize = 64;
        }
@Override
public void registerIcons(IconRegister par1IconRegister)
{
                                this.itemIcon = par1IconRegister.registerIcon("mods:Pizza");
}
}