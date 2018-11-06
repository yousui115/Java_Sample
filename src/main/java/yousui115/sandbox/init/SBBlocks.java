package yousui115.sandbox.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.event.RegistryEvent;
import yousui115.sandbox.SandBox;

public class SBBlocks
{
    //■
    public static Block SAMPLE_BLOCK;


    public static void init(RegistryEvent.Register<Block> eventIn)
    {
        create();

        register(eventIn);
    }

    /**
     *
     */
    protected static void create()
    {
        //■
        SAMPLE_BLOCK = new Block(Material.CLOTH);

        //■
        SAMPLE_BLOCK
            .setCreativeTab(CreativeTabs.DECORATIONS)
            .setBlockUnbreakable()
            .setHardness(-1)
            .setLightLevel(0)
            .setRegistryName(SandBox.MOD_ID, "sample_block")
            .setUnlocalizedName("sample_block");
    }

    /**
     *
     */
    protected static void register(RegistryEvent.Register<Block> eventIn)
    {
        eventIn.getRegistry().register(SAMPLE_BLOCK);

    }
}
