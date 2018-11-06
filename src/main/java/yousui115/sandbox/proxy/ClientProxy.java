package yousui115.sandbox.proxy;

import yousui115.sandbox.init.SBItems;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerItemModel()
    {
        net.minecraftforge.client.model.ModelLoader.setCustomModelResourceLocation(SBItems.SAMPLE_BLOCK_ITEM, 0,
                new net.minecraft.client.renderer.block.model.ModelResourceLocation(SBItems.SAMPLE_BLOCK_ITEM.getRegistryName(), "inventory"));
    }
}
