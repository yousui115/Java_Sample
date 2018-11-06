package yousui115.sandbox.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import yousui115.sandbox.SandBox;

public class SBItems
{
    public static Item SAMPLE_BLOCK_ITEM;


    public static void init(RegistryEvent.Register<Item> eventIn)
    {
        create();

        register(eventIn);
    }


    /**
     * ■
     */
    protected static void create()
    {
        SAMPLE_BLOCK_ITEM = new ItemBlock(SBBlocks.SAMPLE_BLOCK).setRegistryName(SandBox.MOD_ID, "sample_block");
    }


    /**
     * ■
     */
    protected static void register(RegistryEvent.Register<Item> eventIn)
    {
        eventIn.getRegistry().register(SAMPLE_BLOCK_ITEM);
    }
}
