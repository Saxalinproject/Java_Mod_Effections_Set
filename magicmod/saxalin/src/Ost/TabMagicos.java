package magicmod.saxalin.src.Ost;

import magicmod.saxalin.src.Magicos;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.*;

public class TabMagicos extends CreativeTabs {

public TabMagicos(int position, String tabID)
{
super(position, tabID);
}

@SideOnly(Side.CLIENT)
public int getTabIconItemIndex()
{
return Magicos.IsidiumSword.itemID;
}

public String getTranslatedTabLabel()
{
return "EffectShop";
}
}