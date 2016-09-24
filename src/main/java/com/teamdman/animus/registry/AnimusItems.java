package com.teamdman.animus.registry;

import WayofTime.bloodmagic.BloodMagic;
import WayofTime.bloodmagic.ConfigHandler;
import WayofTime.bloodmagic.api.Constants;
import WayofTime.bloodmagic.api.registry.OrbRegistry;
import WayofTime.bloodmagic.util.helper.InventoryRenderHelper;
import com.teamdman.animus.Animus;
import com.teamdman.animus.items.ItemKama;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by User on 9/18/2016.
 */
public class AnimusItems {
    public static Item kamaWood;

    public static void init() {
        kamaWood = setupItem(new ItemKama(Item.ToolMaterial.WOOD), "itemKamaWood", Animus.tabMain);
    }

    private static Item setupItem(Item item, String name, CreativeTabs tab) {
        if (item.getRegistryName() == null)
            item.setRegistryName(name);
        item.setUnlocalizedName(name);
        item.setCreativeTab(tab);
        GameRegistry.register(item);
        Animus.proxy.tryHandleItemModel(item, name);

        return item;
        //TODO: Animus Config Blacklist
    }

    @SideOnly(Side.CLIENT)
    public static void initRenders() {

    }

}
