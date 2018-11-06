package yousui115.sandbox.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import yousui115.sandbox.SandBox;

@EventBusSubscriber
public class SBRegister
{
    /**
     * ■ブロックの登録
     */
    @SubscribeEvent
    protected static void registerBlocks(RegistryEvent.Register<Block> eventIn)
    {
        SBBlocks.init(eventIn);
    }

    /**
     * ■アイテムの登録
     * @param eventIn
     */
    @SubscribeEvent
    protected static void registerItems(RegistryEvent.Register<Item> eventIn)
    {
        SBItems.init(eventIn);
    }

    /**
     * ■アイテムモデルの登録
     * @param eventIn
     */
    @SubscribeEvent
    protected static void registerItemModel(ModelRegistryEvent eventIn)
    {
        SandBox.proxy.registerItemModel();
    }
}
