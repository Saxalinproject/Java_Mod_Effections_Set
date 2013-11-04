package magicmod.saxalin.src;

import ibxm.Player;

import java.awt.print.Paper;

import magicmod.saxalin.src.Armors.Armor;
import magicmod.saxalin.src.Block.ArisolBlock;
import magicmod.saxalin.src.Block.IsidiumBlock;
import magicmod.saxalin.src.Instrums.ArisolPickaxe;
import magicmod.saxalin.src.Instrums.IsidiumPickaxe;
import magicmod.saxalin.src.Ores.ArgentumOre;
import magicmod.saxalin.src.Ores.ArisolOre;
import magicmod.saxalin.src.Ores.IsidiumOre;
import magicmod.saxalin.src.Ost.DustArgentum;
import magicmod.saxalin.src.Ost.DustArisol;
import magicmod.saxalin.src.Ost.DustIsidium;
import magicmod.saxalin.src.Ost.DustNikel;
import magicmod.saxalin.src.Ost.EnergyStone;
import magicmod.saxalin.src.Ost.TabMagicos;
import magicmod.saxalin.src.Ost.TabMagicosEat;
import magicmod.saxalin.src.Ost.WorldgeneratorIsidiumOre;
import magicmod.saxalin.src.ignot.Argentumignot;
import magicmod.saxalin.src.ignot.Arisolignot;
import magicmod.saxalin.src.ignot.Isidiumignot;
import magicmod.saxalin.src.ignot.NikelIgnot;
import magicmod.saxalin.src.weapon.ArchangelSword;
import magicmod.saxalin.src.weapon.ArisolAxe;
import magicmod.saxalin.src.weapon.ArisolSword;
import magicmod.saxalin.src.weapon.IsidiumAxe;
import magicmod.saxalin.src.weapon.IsidiumSword;
import magicmod.saxalin.src.weapon.LuceferSword;
import magicmod.saxalin.src.weapon.RebornAxe;
import magicmod.saxalin.src.weapon.SplitSword;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.Slot;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLLoadEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.common.EnumHelper;

@Mod(modid="Efficient set", name="Efficient set", version="1.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Magicos {
	
	
	public static CreativeTabs tabMagicos= new TabMagicos(CreativeTabs.getNextID(),"TutorialCreativeTab");
	public static CreativeTabs tabMagicosEat= new TabMagicosEat(CreativeTabs.getNextID(),"TutorialCreativeTab");
	
	
	//Material Section 
	
		//Weapon material
	public static EnumToolMaterial Split = EnumHelper.addToolMaterial("Split", 4, 1500, 6, 6, 12);
	public static EnumToolMaterial Arkhangel = EnumHelper.addToolMaterial("Arkhangel", 4, 1900, 8, 9, 15);
	public static EnumToolMaterial Lucifer = EnumHelper.addToolMaterial("Lucefer", 2, 1500, 5, 6, 10);
	public static EnumToolMaterial Reborn = EnumHelper.addToolMaterial("Reborn", 2, 1500, 7, 9, 20);
	public static EnumToolMaterial Isidium = EnumHelper.addToolMaterial("Isidium", 1, 1000, 4, 5, 10);  
	public static EnumToolMaterial Arisol = EnumHelper.addToolMaterial("Arisol", 2, 500, 4, 3, 7);
	public static EnumToolMaterial IsidiumAxe1 = EnumHelper.addToolMaterial("IsidiumAxe1", 1, 1000, 5, 6, 10);  
	public static EnumToolMaterial ArisolAxe1 = EnumHelper.addToolMaterial("ArisolAxe1", 1, 500, 5, 5, 10);  
		//Armor Materil
	public static EnumArmorMaterial IsidiumArmor = 
	EnumHelper.addArmorMaterial("IsidiumArmor", 20, new int [] { 3, 6, 3, 4 }, 10);
	public static EnumArmorMaterial ArisolArmor = 
			EnumHelper.addArmorMaterial("ArisolArmor", 17, new int [] { 2, 5, 2, 3 }, 7);
	public static EnumArmorMaterial ArgentumArmor = 
			EnumHelper.addArmorMaterial("ArgentumArmor", 25, new int [] { 3, 5, 4, 4 }, 7);
	
	public static EnumArmorMaterial NikelArmor = 
			EnumHelper.addArmorMaterial("NikelArmor", 35, new int [] { 5, 6, 5, 5 }, 12);
		//Pickaxe material
	public static EnumToolMaterial ArisolPickAxe = EnumHelper.addToolMaterial("ArisolPickAxe", 3, 1561, 6.3F, 2.5F, 10);  
	public static EnumToolMaterial IsidiumPickAxe = EnumHelper.addToolMaterial("IsidiumPickAxe", 3, 1561, 10.0F, 4.0F, 10);
	
	//Armor Sections
	public  static Item IsidiumHelmet;
	public  static Item IsidiumChest;
	public  static Item IsidiumLeggins;
	public  static Item IsidiumBoots;	
	
	public  static Item ArgentumHelmet;
	public  static Item ArgentumChest;
	public  static Item ArgentumLeggins;
	public  static Item ArgentumBoots;	
	
	public  static Item ArisolHelmet;
	public  static Item ArisolChest;
	public  static Item ArisolLeggins;
	public  static Item ArisolBoots;	
	
	public  static Item NikelHelmet;
	public  static Item NikelChest;
	public  static Item NikelLeggings;
	public  static Item NikelBoots;
	
	public static Item Pizza = new Pizza(7000, 1, 0.4F, false).setUnlocalizedName("Pizza");
	

	//Armor ID Section
	int IsidiumHelmetID;
	int IsidiumChestID;
	int IsidiumLeggingsID;
	int IsidiumBootsID;
	
	int ArisolHelmetID;
	int ArisolChestID;
	int ArisolLeggingsID;
	int ArisolBootsID;
	
	int ArgentumHelmetID;
	int ArgentumChestID;
	int ArgentumLeggingsID;
	int ArgentumBootsID;
	
	int NikelHelmetID;
	int NikelChestID;
	int NikelLeggingsID;
	int NikelBootsID;
	
		// -----------------------
	
				// Block ID Section
				int IsidiumBlockID;
				int IsidiumOreBlockID;
				int IsidiumIgnotItemID;
				int ArisolBlockID;
				
	
				//ore id
				int ArisolOreBlockID;
				int ArisolIgnotItemID;
				int ArgentumOreBlockID;
				int ArgentumIgnotID;
				int NikelIgnotID;
	
				// weapon id
				int IsidiumSwordID;
				int ArisolSwordID;
				int LuceferSwordID;
				int ArchangelSwordID;
				int SplitSwordID;
				int IsidiumAxeID;
				int ArisolAxeID;
				int RebornAxeID;
				
				//pickaxe id
				int ArisolPickaxeID;
				int IsidiumPickaxeID;
				
				//Item's id static
				int DustIsidiumID;
				int DustArisolID;
				int DustNikelID;
				int EnergyStoneID;
				int DustArgentumID;
			// --------------------------
	
	// Block Section
	public static Block IsidiumBlock;
	public static Block IsidiumOre;
	public static Block ArisolBlock;
	public static Block ArisolOre;
	public static Block ArgentumOre;
	
			
	// Item Section
	public static Item NikelIgnot;
	public static Item ArgentumIgnot;
	public static Item IsidiumIgnot;
	public static Item ArisolIgnot;
	public static Item IsidiumSword;
	public static Item ArisolSword;
	public static Item ArisolPickaxe;
	public static Item IsidiumPickaxe;
	public static Item DustIsidium;
	public static Item DustArisol;
	public static Item DustNikel;
	public static Item LuceferSword;
	public static Item ArchangelSword;
	public static Item SplitSword;
	public static Item EnergyStone;
	public static Item DustArgentum;
	public static Item IsidiumAxe;
	public static Item ArisolAxe;
	public static Item RebornAxe;
	
	// Instance of our Mod
	public static Magicos instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	// Configuration Console
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		config.load();
		
		IsidiumBlockID = config.get("Block IDs", "Isidium Block ID", 1000).getInt();
		IsidiumOreBlockID = config.get("Block IDs", "Isidium Ore Block ID", 1001).getInt();
		IsidiumIgnotItemID = config.get("Materials IDs", "Isidium Ignot ID", 1002).getInt();
		ArisolBlockID = config.get("Block IDs", "Arisol Block ID", 1008).getInt();
		ArisolOreBlockID = config.get("Block IDs", "Arisol Ore Block ID", 1009).getInt();
		ArisolIgnotItemID = config.get("Materials IDs", "Arisol Ignot ID", 1010).getInt();
		ArgentumOreBlockID = config.get("Block IDs", "Argentum Ore Block ID", 1030).getInt();
		ArgentumIgnotID = config.get("Materials IDs", "Argentum Ignot ID", 1031).getInt();
		NikelIgnotID = config.get("Materials IDs", "Nikel Ignot ID", 1054).getInt();
				//----------------------
		//weapon
				IsidiumSwordID = config.get("Materials IDs", "Isidium Sword ID", 1015).getInt();
				ArisolSwordID = config.get("Materials IDs", "Arisol Sword ID", 1016).getInt();
				LuceferSwordID = config.get("Materials IDs", "Lucefer Sword ID", 1050).getInt();
				ArchangelSwordID = config.get("Materials IDs", "Archangle Sword ID", 1051).getInt();
				SplitSwordID = config.get("Materials IDs", "Split Sword ID", 1052).getInt();
				IsidiumAxeID = config.get("Materials IDs", "Isidium Axe ID", 1101).getInt();
				ArisolAxeID = config.get("Materials IDs", "Arisol Axe ID", 1102).getInt();
				RebornAxeID = config.get("Materials IDs", "Reborn Axe ID", 1103).getInt();
		
		//Insturm's
				ArisolPickaxeID =config.get("Materials IDs", "Arisol Pickaxe ID",1020).getInt();
				IsidiumPickaxeID =config.get("Materials IDs", "Isidium Pickaxe ID",1021).getInt();
				// -----------------------
		//Itme's static
				DustIsidiumID =config.get("Item IDs", "Dust Isidium ID", 1023).getInt();
				DustArisolID =config.get("Items IDs", "Dust Arusiol ID", 1036).getInt();
				DustNikelID =config.get("Items IDs", "Dust Nikel ID", 1037).getInt();
				EnergyStoneID =config.get("Items IDs", "Energy Stone ID", 1070).getInt();
				DustArgentumID =config.get("Items IDs", "Dust Argentum ID", 1046).getInt();
		
		//config armor
		IsidiumHelmetID = config.get ("Armor IDx", "Isidium Helmet ID", 1004).getInt ();
		IsidiumChestID = config.get ("Armor IDx", "Isidium Chest ID", 1005).getInt ();
		IsidiumLeggingsID = config.get ("Armor IDx", "Isidium Leggings ID", 1006).getInt ();
		IsidiumBootsID = config.get ("Armor IDx", "Isidium Boots ID", 1007).getInt ();
		IsidiumHelmet = new Armor(IsidiumHelmetID, IsidiumArmor, 0, 0, "Isidium");
		IsidiumChest = new Armor(IsidiumChestID, IsidiumArmor, 0, 1, "Isidium");
		IsidiumLeggins = new Armor(IsidiumLeggingsID, IsidiumArmor, 0, 2, "Isidium");
		IsidiumBoots = new Armor(IsidiumBootsID, IsidiumArmor, 0, 3, "Isidium");
		
		
		ArisolHelmetID = config.get ("Armor IDx", "Arisol Helmet ID", 1011).getInt ();
		ArisolChestID = config.get ("Armor IDx", "Arisol Chest ID", 1012).getInt ();
		ArisolLeggingsID = config.get ("Armor IDx", "Arisol Leggings ID", 1013).getInt ();
		ArisolBootsID = config.get ("Armor IDx", "Arisol Boots ID", 1014).getInt ();
		ArisolHelmet = new Armor(ArisolHelmetID, IsidiumArmor, 0, 0, "Arisol");
		ArisolChest = new Armor(ArisolChestID, IsidiumArmor, 0, 1, "Arisol");
		ArisolLeggins = new Armor(ArisolLeggingsID, IsidiumArmor, 0, 2, "Arisol");
		ArisolBoots = new Armor(ArisolBootsID, ArisolArmor, 0, 3, "Arisol");
		
		ArgentumHelmetID = config.get ("Armor IDx", "Argentum Helmet ID", 1032).getInt ();
		ArgentumChestID = config.get ("Armor IDx", "Argentum Chest ID", 1033).getInt ();
		ArgentumLeggingsID = config.get ("Armor IDx", "Argentum Leggings ID", 1034).getInt ();
		ArgentumBootsID = config.get ("Armor IDx", "Argentum Boots ID", 1035).getInt ();
		ArgentumHelmet = new Armor(ArgentumHelmetID, ArgentumArmor, 0, 0, "Argentum");
		ArgentumChest = new Armor(ArgentumChestID, ArgentumArmor, 0, 1, "Argentum");
		ArgentumLeggins = new Armor(ArgentumLeggingsID, ArgentumArmor, 0, 2, "Argentum");
		ArgentumBoots = new Armor(ArgentumBootsID, ArgentumArmor, 0, 3, "Argentum");
		
		
		NikelHelmetID = config.get ("Armor IDx", "Nikel Helmet ID", 1038).getInt ();
		NikelChestID = config.get ("Armor IDx", "Nikel Chest ID", 1039).getInt ();
		NikelLeggingsID = config.get ("Armor IDx", "Nikel Leggings ID", 1044).getInt ();
		NikelBootsID = config.get ("Armor IDx", "Nikel Boots ID", 1045).getInt ();
		NikelHelmet = new Armor(NikelHelmetID, NikelArmor, 0, 0, "Nikel");
		NikelChest = new Armor(NikelChestID, NikelArmor, 0, 1, "Nikel");
		NikelLeggings = new Armor(NikelLeggingsID, NikelArmor, 0, 2, "Nikel");
		NikelBoots = new Armor(NikelBootsID, NikelArmor, 0, 3, "Nikel");
		
		
		config.save();
		
		// Initialize our Blooks
		this.IsidiumBlock = new IsidiumBlock(IsidiumBlockID, Material.rock);
		this.IsidiumOre = new IsidiumOre(IsidiumOreBlockID);
		this.ArisolBlock = new ArisolBlock(ArisolBlockID, Material.rock);
		this.ArisolOre = new ArisolOre(ArisolOreBlockID);
		this.ArgentumOre = new ArgentumOre(ArgentumOreBlockID);
		
		// Initialize our Ignots
		this.IsidiumIgnot = new Isidiumignot(IsidiumIgnotItemID);
		this.ArisolIgnot = new Arisolignot(ArisolIgnotItemID);
		this.ArgentumIgnot = new Argentumignot(ArgentumIgnotID);
		this.NikelIgnot = new NikelIgnot(NikelIgnotID);
		this.EnergyStone = new EnergyStone(EnergyStoneID);
		this.DustArgentum =new DustArgentum(DustArgentumID);
		
		//Weapon
		this.IsidiumSword = new IsidiumSword(IsidiumSwordID, Isidium);
		this.ArisolSword = new ArisolSword(ArisolSwordID, Arisol);
		this.LuceferSword = new LuceferSword(LuceferSwordID, Lucifer);
		this.ArchangelSword = new ArchangelSword(ArchangelSwordID, Arkhangel);
		this.SplitSword = new SplitSword(SplitSwordID, Split);
		this.IsidiumAxe = new IsidiumAxe(IsidiumAxeID, IsidiumAxe1);
		this.ArisolAxe = new ArisolAxe(ArisolAxeID, ArisolAxe1);
		this.RebornAxe = new RebornAxe(RebornAxeID, Reborn);
		//Instrum's
		this.ArisolPickaxe = new ArisolPickaxe(ArisolPickaxeID, ArisolPickAxe);
		this.IsidiumPickaxe = new IsidiumPickaxe(IsidiumPickaxeID, IsidiumPickAxe);
		
		//Item's
		
		this.DustIsidium = new DustIsidium(DustIsidiumID);
		this.DustArisol = new DustArisol(DustArisolID);
		this.DustNikel = new DustNikel(DustNikelID);
		
		
		LanguageRegistry.addName (Pizza, "Pizza");
		
		
		// Isisdium Block stuff
		LanguageRegistry.addName (IsidiumBlock, "Isidium Block");
		MinecraftForge.setBlockHarvestLevel(IsidiumBlock, "pickaxe", 2);
		GameRegistry.registerBlock(IsidiumBlock, "IsidiumBlock");
		
		// Isidium Ore Stuff
		LanguageRegistry.addName (IsidiumOre, "Isidium Ore");
		MinecraftForge.setBlockHarvestLevel(IsidiumOre, "pickaxe", 3);
		GameRegistry.registerBlock(IsidiumOre, "IsidiumOre");
		GameRegistry.registerWorldGenerator(new WorldgeneratorIsidiumOre());
		
		LanguageRegistry.addName (ArgentumOre, "Argentum Ore");
		MinecraftForge.setBlockHarvestLevel(ArgentumOre, "pickaxe", 3);
		GameRegistry.registerBlock(ArgentumOre, "ArgentumOre");
		GameRegistry.registerWorldGenerator(new WorldgeneratorIsidiumOre());
		
		
		
		// Arisol Block stuff
		LanguageRegistry.addName (ArisolBlock, "Arisol Block");
		MinecraftForge.setBlockHarvestLevel(ArisolBlock, "pickaxe", 2);
		GameRegistry.registerBlock(ArisolBlock, "ArisolBlock");
		
		// Arisol Ore stuff
		LanguageRegistry.addName (ArisolOre, "Arisol Ore");
		MinecraftForge.setBlockHarvestLevel(ArisolOre, "pickaxe", 2);
		GameRegistry.registerBlock(ArisolOre, "ArisolOre");

		//Weapon
		LanguageRegistry.addName (IsidiumSword, "Isidium Sword");
		LanguageRegistry.addName (ArisolSword, "Arisol Sword");
		LanguageRegistry.addName (LuceferSword, "\u00a70" + "Lucefer Sword");
		LanguageRegistry.addName (ArchangelSword, "\u00a74" + "Archangel Sword");
		LanguageRegistry.addName (SplitSword, "\u00a71" + "Split Sword");
		LanguageRegistry.addName (IsidiumAxe, "Isidium Axe");
		LanguageRegistry.addName (ArisolAxe, "Arisol Axe");
		LanguageRegistry.addName (RebornAxe, "\u00a71" + "Reborn Axe");
		
		//Instrums
		
		LanguageRegistry.addName (ArisolPickaxe, "Arisol Pickaxe");
		LanguageRegistry.addName (IsidiumPickaxe, "Isidium Pickaxe");
		
		//Items
		LanguageRegistry.addName(DustIsidium, "Isidium Dust");
		LanguageRegistry.addName(DustArisol, "Arisol Dust");
		LanguageRegistry.addName(DustNikel, "Nikel Dust");
		LanguageRegistry.addName(DustArgentum, "Argentum Dust");
		LanguageRegistry.addName(EnergyStone, "Energy Stone");
		LanguageRegistry.addName (NikelIgnot, "Nikel Ingot");
		LanguageRegistry.addName (IsidiumIgnot, "Isidium Ingot");
		LanguageRegistry.addName (ArisolIgnot, "Arisol Ingot");
		LanguageRegistry.addName (ArgentumIgnot, "Argentum Ingot");
		
		// Reciples weapon, ignot, block
		GameRegistry.addSmelting(IsidiumOreBlockID, new ItemStack(IsidiumIgnot) , 0.7f);
		GameRegistry.addSmelting(ArisolOreBlockID, new ItemStack(ArisolIgnot) , 0.7f);
		GameRegistry.addSmelting(ArgentumOreBlockID, new ItemStack(ArgentumIgnot) , 0.7f);
		GameRegistry.addSmelting(ArisolIgnot.itemID, new ItemStack(DustArisol, 1), 1.0F);
		GameRegistry.addSmelting(IsidiumIgnot.itemID, new ItemStack(DustIsidium, 1), 1.0F);
		GameRegistry.addSmelting(DustNikel.itemID, new ItemStack(NikelIgnot, 1), 1.0F);
		GameRegistry.addSmelting(ArgentumIgnot.itemID, new ItemStack(DustArgentum, 1), 1.0F);
		
		GameRegistry.addRecipe(new ItemStack(Magicos.ArisolSword, 1), new Object[]{ 
		"ZXZ", "ZXZ", "Z#Z", Character.valueOf('X'), Magicos.ArisolIgnot, ('#'), Item.stick});
		GameRegistry.addRecipe(new ItemStack(Magicos.IsidiumSword, 1), new Object[]{ 
		"ZXZ", "ZXZ", "Z#Z", Character.valueOf('X'), Magicos.IsidiumIgnot, ('#'), Item.stick});
		GameRegistry.addRecipe(new ItemStack(Magicos.EnergyStone, 1), new Object[]{ 
			"XXX", 
			"ZAJ", 
			"XXX", Character.valueOf('X'), Magicos.DustNikel, ('A'), Item.diamond, Character.valueOf('Z'), Magicos.DustIsidium, ('J'), Magicos.DustArisol});
		GameRegistry.addRecipe(new ItemStack(LuceferSword, 1), new Object[]{ 
			"XXX", 
			"ZXZ", 
			"JAJ", Character.valueOf('X'), Magicos.EnergyStone, ('A'), Item.stick, Character.valueOf('Z'), Magicos.NikelIgnot, ('J'), Magicos.DustNikel});
		GameRegistry.addRecipe(new ItemStack(SplitSword, 1), new Object[]{ 
			"XXX", 
			"ZXZ", 
			"JAJ", Character.valueOf('X'), Magicos.EnergyStone, ('A'), Item.stick, Character.valueOf('Z'), Item.diamond, ('J'), Magicos.DustNikel});
		GameRegistry.addRecipe(new ItemStack(ArchangelSword, 1), new Object[]{ 
			"XXX", 
			"AJA", 
			"AZA", Character.valueOf('X'), Magicos.EnergyStone, ('A'), Item.stick, Character.valueOf('Z'), Magicos.SplitSword, ('J'), Magicos.LuceferSword});
		GameRegistry.addRecipe(new ItemStack(Magicos.IsidiumAxe, 1), new Object[]{ 
			"XXX", "X#X", "Z#Z", Character.valueOf('X'), Magicos.IsidiumIgnot, ('#'), Item.stick});
		GameRegistry.addRecipe(new ItemStack(Magicos.ArisolAxe, 1), new Object[]{ 
			"XXX", "X#X", "Z#Z", Character.valueOf('X'), Magicos.ArisolIgnot, ('#'), Item.stick});
		
		GameRegistry.addRecipe(new ItemStack(Magicos.RebornAxe, 1), new Object[]{ 
			"ZZZ", "X#X", "O#O", Character.valueOf('X'), Magicos.DustNikel, ('#'), Item.stick, ('Z'), Magicos.EnergyStone});
		
		
		
		
		
		
		//Riceple Block
		GameRegistry.addRecipe(new ItemStack(Magicos.ArisolBlock, 1), new Object[]{ 
			"XXX", "XXX", "XXX", Character.valueOf('X'), Magicos.ArisolIgnot});
			GameRegistry.addRecipe(new ItemStack(Magicos.IsidiumBlock, 1), new Object[]{ 
			"XXX", "XXX", "XXX", Character.valueOf('X'), Magicos.IsidiumIgnot});
			
			GameRegistry.addShapelessRecipe(new ItemStack(Magicos.DustNikel, 1), new Object[] {Magicos.DustIsidium, Magicos.DustArisol, Magicos.DustArgentum});
		
		//Item's reciples
			
			

		
		
					// ----------------------------------------
		
						// Reciples armor
		
								// Arisol armor
								GameRegistry.addRecipe(new ItemStack(Magicos.ArisolHelmet, 1), new Object[]{ 
								"XXX", "XZX", "ZZZ", Character.valueOf('X'), Magicos.ArisolIgnot});
								GameRegistry.addRecipe(new ItemStack(Magicos.ArisolChest, 1), new Object[]{ 
								"XZX", "XXX", "XXX", Character.valueOf('X'), Magicos.ArisolIgnot});
								GameRegistry.addRecipe(new ItemStack(Magicos.ArisolLeggins, 1), new Object[]{ 
								"XXX", "XZX", "XZX", Character.valueOf('X'), Magicos.ArisolIgnot});
								GameRegistry.addRecipe(new ItemStack(Magicos.ArisolBoots, 1), new Object[]{ 
								"XZX", "XZX", "ZZZ", Character.valueOf('X'), Magicos.ArisolIgnot});
		
								// Isidium Armor
								GameRegistry.addRecipe(new ItemStack(Magicos.IsidiumHelmet, 1), new Object[]{ 
								"XXX", "XZX", "ZZZ", Character.valueOf('X'), Magicos.IsidiumIgnot});
								GameRegistry.addRecipe(new ItemStack(Magicos.IsidiumChest, 1), new Object[]{ 
								"XZX", "XXX", "XXX", Character.valueOf('X'), Magicos.IsidiumIgnot});
								GameRegistry.addRecipe(new ItemStack(Magicos.IsidiumLeggins, 1), new Object[]{ 
								"XXX", "XZX", "XZX", Character.valueOf('X'), Magicos.IsidiumIgnot});
								GameRegistry.addRecipe(new ItemStack(Magicos.IsidiumBoots, 1), new Object[]{ 
								"XZX", "XZX", "ZZZ", Character.valueOf('X'), Magicos.IsidiumIgnot});
								
								// Argentum Armor
								GameRegistry.addRecipe(new ItemStack(Magicos.ArgentumHelmet, 1), new Object[]{ 
									"XXX", "XZX", "ZZZ", Character.valueOf('X'), Magicos.ArgentumIgnot});
									GameRegistry.addRecipe(new ItemStack(Magicos.ArgentumChest, 1), new Object[]{ 
									"XZX", "XXX", "XXX", Character.valueOf('X'), Magicos.ArgentumIgnot});
									GameRegistry.addRecipe(new ItemStack(Magicos.ArgentumLeggins, 1), new Object[]{ 
									"XXX", "XZX", "XZX", Character.valueOf('X'), Magicos.ArgentumIgnot});
									GameRegistry.addRecipe(new ItemStack(Magicos.ArgentumBoots, 1), new Object[]{ 
									"XZX", "XZX", "ZZZ", Character.valueOf('X'), Magicos.ArgentumIgnot});
									
									//Nikel Armor
									GameRegistry.addRecipe(new ItemStack(Magicos.NikelHelmet, 1), new Object[]{ 
										"XXX", "XZX", "ZZZ", Character.valueOf('X'), Magicos.NikelIgnot});
										GameRegistry.addRecipe(new ItemStack(Magicos.NikelChest, 1), new Object[]{ 
										"XZX", "XXX", "XXX", Character.valueOf('X'), Magicos.NikelIgnot});
										GameRegistry.addRecipe(new ItemStack(Magicos.NikelLeggings, 1), new Object[]{ 
										"XXX", "XZX", "XZX", Character.valueOf('X'), Magicos.NikelIgnot});
										GameRegistry.addRecipe(new ItemStack(Magicos.NikelBoots, 1), new Object[]{ 
										"XZX", "XZX", "ZZZ", Character.valueOf('X'), Magicos.NikelIgnot});
						// --------------------------------------
		
		
								
								
								
								
		// Armor stuff
		LanguageRegistry.addName(IsidiumHelmet, "Isidium Helmet");
		LanguageRegistry.addName(IsidiumChest, "Isidium Chest");
		LanguageRegistry.addName(IsidiumLeggins, "Isidium Leggings");
		LanguageRegistry.addName(IsidiumBoots, "Isidium Boots");
	
		LanguageRegistry.addName(ArisolHelmet, "Arisol Helmet");
		LanguageRegistry.addName(ArisolChest, "Arisol Chest");
		LanguageRegistry.addName(ArisolLeggins, "Arisol Leggings");
		LanguageRegistry.addName(ArisolBoots, "Arisol Boots");
		
		LanguageRegistry.addName(ArgentumHelmet, "Argentum Helmet");
		LanguageRegistry.addName(ArgentumChest, "Argentum Chest");
		LanguageRegistry.addName(ArgentumLeggins, "Argentum Leggings");
		LanguageRegistry.addName(ArgentumBoots, "Argentum Boots");
		
		LanguageRegistry.addName(NikelHelmet, "Nikel Helmet");
		LanguageRegistry.addName(NikelChest, "Nikel Chest");
		LanguageRegistry.addName(NikelLeggings, "Nikel Leggings");
		LanguageRegistry.addName(NikelBoots, "Nikel Boots");
		
				
						// ------------------------------------
		
				//ru-ru weapon, ore, ignot block
		LanguageRegistry.instance().addNameForObject(ArisolSword, "en_US", "Arisol Sword" );
		LanguageRegistry.instance().addNameForObject(ArisolSword, "ru_RU", "\u0410\u0440\u0438\u0441\u043E\u043B\u043E\u0432\u044B\u0439 \u043C\u0435\u0447 ");
		LanguageRegistry.instance().addNameForObject(IsidiumSword, "en_US", "Isidium Sword" );
		LanguageRegistry.instance().addNameForObject(IsidiumSword, "ru_RU", "\u0418\u0441\u0438\u0434\u0438\u0443\u043C\u043E\u0432\u044B\u0439 \u043C\u0435\u0447 ");
		LanguageRegistry.instance().addNameForObject(ArisolIgnot, "en_US", "Arisol Ignot" );
		LanguageRegistry.instance().addNameForObject(ArisolIgnot, "ru_RU", "\u0410\u0440\u0438\u0441\u043E\u043B\u043E\u0432\u044B\u0439 \u0441\u043B\u0438\u0442\u043E\u043A ");
		LanguageRegistry.instance().addNameForObject(IsidiumIgnot, "en_US", "Isidium Ignot" );
		LanguageRegistry.instance().addNameForObject(IsidiumIgnot, "ru_RU", "\u0418\u0441\u0438\u0434\u0438\u0443\u043C\u043E\u0432\u044B\u0439 \u0441\u043B\u0438\u0442\u043E\u043A ");
		LanguageRegistry.instance().addNameForObject(ArisolOre, "en_US", "Arisol Ore" );
		LanguageRegistry.instance().addNameForObject(ArisolOre, "ru_RU", "\u0410\u0440\u0438\u0441\u043E\u043B\u043E\u0432\u0430\u044F \u0440\u0443\u0434\u0430 ");
		LanguageRegistry.instance().addNameForObject(IsidiumOre, "en_US", "Isidium Ore" );
		LanguageRegistry.instance().addNameForObject(IsidiumOre, "ru_RU", "\u0418\u0441\u0438\u0434\u0438\u0443\u043C\u043E\u0432\u0430\u044F \u0440\u0443\u0434\u0430 ");
		LanguageRegistry.instance().addNameForObject(ArisolBlock, "en_US", "Arisol Block" );
		LanguageRegistry.instance().addNameForObject(ArisolBlock, "ru_RU", "\u0410\u0440\u0438\u0441\u043E\u043B\u043E\u0432\u044B\u0439 \u0431\u043B\u043E\u043A ");
		LanguageRegistry.instance().addNameForObject(IsidiumBlock, "en_US", "Isidium Block" );
		LanguageRegistry.instance().addNameForObject(IsidiumBlock, "ru_RU", "\u0418\u0441\u0438\u0434\u0438\u0443\u043C\u043E\u0432\u044B\u0439 \u0431\u043B\u043E\u043A ");
		LanguageRegistry.instance().addNameForObject(ArgentumOre, "en_US", "Argentum Ore" );
		LanguageRegistry.instance().addNameForObject(ArgentumOre, "ru_RU", "\u0421\u0435\u0440\u0435\u0431\u0440\u044F\u043D\u0430\u044F \u0440\u0443\u0434\u0430 ");
		LanguageRegistry.instance().addNameForObject(ArgentumIgnot, "en_US", "Argentum Ingot" );
		LanguageRegistry.instance().addNameForObject(ArgentumIgnot, "ru_RU", "\u0421\u0435\u0440\u0435\u0431\u0440\u044F\u043D\u044B\u0439 \u0441\u043B\u0438\u0442\u043E\u043A  ");
		LanguageRegistry.instance().addNameForObject(DustArisol, "en_US", "Arisol Dust" );
		LanguageRegistry.instance().addNameForObject(DustArisol, "ru_RU", "\u0410\u0440\u0438\u0441\u043E\u043B\u043E\u0432\u0430\u044F \u043F\u044B\u043B\u044C ");			
		LanguageRegistry.instance().addNameForObject(DustIsidium, "en_US", "Arisol Dust" );
		LanguageRegistry.instance().addNameForObject(DustIsidium, "ru_RU", "\u0418\u0441\u0438\u0434\u0438\u0443\u043C\u043E\u0432\u0430\u044F \u043F\u044B\u043B\u044C ");
		LanguageRegistry.instance().addNameForObject(DustNikel, "en_US", "Nikel Dust" );
		LanguageRegistry.instance().addNameForObject(DustNikel, "ru_RU", "\u041D\u0438\u043A\u0435\u043B\u044C\u043D\u0430\u044F \u043F\u044B\u043B\u044C ");
		LanguageRegistry.instance().addNameForObject(DustArgentum, "en_US", "Argentum Dust" );
		LanguageRegistry.instance().addNameForObject(DustArgentum, "ru_RU", "\u0421\u0435\u0440\u0435\u0431\u0440\u044F\u043D\u0430\u044F \u043F\u044B\u043B\u044C ");
		LanguageRegistry.instance().addNameForObject(NikelIgnot, "en_US", "Nikel Ingot" );
		LanguageRegistry.instance().addNameForObject(NikelIgnot, "ru_RU", "\u041D\u0438\u043A\u0435\u043B\u0435\u0432\u044B\u0439 \u0441\u043B\u0438\u0442\u043E\u043A ");
		LanguageRegistry.instance().addNameForObject(SplitSword, "en_US", "Split Ingot" );
		LanguageRegistry.instance().addNameForObject(SplitSword, "ru_RU","\u00a71" + "\u0420\u0430\u0441\u043A\u043E\u043B ");
		LanguageRegistry.instance().addNameForObject(ArchangelSword, "en_US", "Archangel Sword" );
		LanguageRegistry.instance().addNameForObject(ArchangelSword, "ru_RU","\u00a74" + "\u0410\u0440\u0445\u0430\u043D\u0433\u0435\u043B ");
		LanguageRegistry.instance().addNameForObject(LuceferSword, "en_US", "Lucefer Sword" );
		LanguageRegistry.instance().addNameForObject(LuceferSword, "ru_RU","\u00a70" + "\u041B\u044E\u0446\u0438\u0444\u0435\u0440 ");
		LanguageRegistry.instance().addNameForObject(EnergyStone, "en_US", "Energy Stone" );
		LanguageRegistry.instance().addNameForObject(EnergyStone, "ru_RU","\u00a75" + "\u042D\u043D\u0435\u0440\u0433\u0435\u0442\u0438\u0447\u0435\u0441\u043A\u0438\u0439 \u043A\u0430\u043C\u0435\u043D\u044C ");
		// -----------------------------------------
		
		//ru-ru Armor Isidium
		LanguageRegistry.instance().addNameForObject(IsidiumHelmet, "en_US", "Isidium Helmet" );
		LanguageRegistry.instance().addNameForObject(IsidiumHelmet, "ru_RU", "\u0418\u0441\u0438\u0434\u0438\u0443\u043C\u043E\u0432\u044B\u0439 \u0448\u043B\u0435\u043C ");
		LanguageRegistry.instance().addNameForObject(IsidiumLeggins, "en_US", "Isidium Leggings" );
		LanguageRegistry.instance().addNameForObject(IsidiumLeggins, "ru_RU", "\u0418\u0441\u0438\u0434\u0438\u0443\u043C\u043E\u0432\u044B\u0435 \u043F\u043E\u043D\u043E\u0436\u0438 ");
		LanguageRegistry.instance().addNameForObject(IsidiumBoots, "en_US", "Isidium Boots" );
		LanguageRegistry.instance().addNameForObject(IsidiumBoots, "ru_RU", "\u0418\u0441\u0438\u0434\u0438\u0443\u043C\u043E\u0432\u044B\u0435 \u0431\u043E\u0442\u0438\u043D\u043A\u0438 ");
		LanguageRegistry.instance().addNameForObject(IsidiumChest, "en_US", "Isidium Chest" );
		LanguageRegistry.instance().addNameForObject(IsidiumChest, "ru_RU", "\u0418\u0441\u0438\u0434\u0438\u0443\u043C\u043E\u0432\u044B\u0439 \u043D\u0430\u0433\u0440\u0443\u0434\u043D\u0438\u043A ");
		
		
		LanguageRegistry.instance().addNameForObject(NikelHelmet, "en_US", "Nikel Helmet" );
		LanguageRegistry.instance().addNameForObject(NikelHelmet, "ru_RU", "\u041D\u0438\u043A\u0435\u043B\u0435\u0432\u044B\u0439 \u0448\u043B\u0435\u043C ");
		LanguageRegistry.instance().addNameForObject(NikelLeggings, "en_US", "Nikel Leggings" );
		LanguageRegistry.instance().addNameForObject(NikelLeggings, "ru_RU", "\u041D\u0438\u043A\u0435\u043B\u0435\u0432\u044B\u0435 \u043F\u043E\u043D\u043E\u0436\u0438 ");
		LanguageRegistry.instance().addNameForObject(NikelBoots, "en_US", "Nikel Boots" );
		LanguageRegistry.instance().addNameForObject(NikelBoots, "ru_RU", "\u041D\u0438\u043A\u0435\u043B\u0435\u0432\u044B\u0435 \u0431\u043E\u0442\u0438\u043D\u043A\u0438 ");
		LanguageRegistry.instance().addNameForObject(NikelChest, "en_US", "Nikel Chest" );
		LanguageRegistry.instance().addNameForObject(NikelChest, "ru_RU", "\u041D\u0438\u043A\u0435\u043B\u0435\u0432\u044B\u0439 \u043D\u0430\u0433\u0440\u0443\u0434\u043D\u0438\u043A");
		
		
		//ru-ru Armor Arisol
		LanguageRegistry.instance().addNameForObject(ArisolHelmet, "en_US", "Arisol Helmet" );
		LanguageRegistry.instance().addNameForObject(ArisolHelmet, "ru_RU", "\u0410\u0440\u0438\u0441\u043E\u043B\u043E\u0432\u044B\u0439 \u0448\u043B\u0435\u043C ");
		LanguageRegistry.instance().addNameForObject(ArisolLeggins, "en_US", "Arisol Leggings" );
		LanguageRegistry.instance().addNameForObject(ArisolLeggins, "ru_RU", "\u0410\u0440\u0438\u0441\u043E\u043B\u043E\u0432\u044B\u0435 \u043F\u043E\u043D\u043E\u0436\u0438 ");
		LanguageRegistry.instance().addNameForObject(ArisolBoots, "en_US", "Arisol Boots" );
		LanguageRegistry.instance().addNameForObject(ArisolBoots, "ru_RU", "\u0410\u0440\u0438\u0441\u043E\u043B\u043E\u0432\u044B\u0435 \u0431\u043E\u0442\u0438\u043D\u043A\u0438 ");
		LanguageRegistry.instance().addNameForObject(ArisolChest, "en_US", "Arisol Chest" );
		LanguageRegistry.instance().addNameForObject(ArisolChest, "ru_RU", "\u0410\u0440\u0438\u0441\u043E\u043B\u043E\u0432\u044B\u0439 \u043D\u0430\u0433\u0440\u0443\u0434\u043D\u0438\u043A ");
		
		//ru-ru Armor Argentum
		LanguageRegistry.instance().addNameForObject(ArgentumHelmet, "en_US", "Argentum Helmet" );
		LanguageRegistry.instance().addNameForObject(ArgentumHelmet, "ru_RU", "\u0421\u0435\u0440\u0435\u0431\u0440\u044F\u043D\u044B\u0439 \u0448\u043B\u0435\u043C ");
		LanguageRegistry.instance().addNameForObject(ArgentumLeggins, "en_US", "Argentum Leggings" );
		LanguageRegistry.instance().addNameForObject(ArgentumLeggins, "ru_RU", "\u0421\u0435\u0440\u0435\u0431\u0440\u044F\u043D\u044B\u0435 \u043F\u043E\u043D\u043E\u0436\u0438 ");
		LanguageRegistry.instance().addNameForObject(ArgentumBoots, "en_US", "Argentum Boots" );
		LanguageRegistry.instance().addNameForObject(ArgentumBoots, "ru_RU", "\u0421\u0435\u0440\u0435\u0431\u0440\u044F\u043D\u044B\u0435 \u0431\u043E\u0442\u0438\u043D\u043A\u0438 ");
		LanguageRegistry.instance().addNameForObject(ArgentumChest, "en_US", "Argentum Chest" );
		LanguageRegistry.instance().addNameForObject(ArgentumChest, "ru_RU", "\u0421\u0435\u0440\u0435\u0431\u0440\u044F\u043D\u044B\u0439 \u043D\u0430\u0433\u0440\u0443\u0434\u043D\u0438\u043A ");
					// ------------------------------------------
		
		//ru-ru PickAxe
		LanguageRegistry.instance().addNameForObject(ArisolPickaxe, "en_US", "Arisol Pickaxe" );
		LanguageRegistry.instance().addNameForObject(ArisolPickaxe, "ru_RU", "\u0410\u0440\u0438\u0441\u043E\u043B\u043E\u0432\u0430\u044F \u041A\u0438\u0440\u043A\u0430 ");
		LanguageRegistry.instance().addNameForObject(IsidiumPickaxe, "en_US", "Isidium Pickaxe" );
		LanguageRegistry.instance().addNameForObject(IsidiumPickaxe, "ru_RU", "\u0418\u0441\u0438\u0434\u0438\u0443\u043C\u043E\u0432\u0430\u044F \u041A\u0438\u0440\u043A\u0430 ");
	}
	
	
	@EventHandler
	public void load(FMLLoadEvent event) {
		
	}
	
	@EventHandler
	public void postInit (FMLPostInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void ServerStart(FMLServerStartingEvent event){
	
	
	}
	
	
}
	
