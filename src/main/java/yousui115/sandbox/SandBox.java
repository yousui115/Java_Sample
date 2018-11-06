package yousui115.sandbox;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import yousui115.sandbox.proxy.CommonProxy;

@Mod(modid = SandBox.MOD_ID, name = SandBox.MOD_NAME, version = SandBox.MOD_VERSION, useMetadata = true)
public class SandBox
{
    public static final String MOD_ID = "yousui115.sandbox";
    public static final String MOD_NAME = "SandBox";
    public static final String MOD_VERSION = "1.0";

    private static Logger logger;

    //■インスタント
    @Mod.Instance(MOD_ID)
    public static SandBox instance;

    //■クライアント側とサーバー側で異なるインスタンスを生成
    @SidedProxy(clientSide = MOD_ID + ".proxy.ClientProxy", serverSide = MOD_ID + ".proxy.CommonProxy")
    public static CommonProxy proxy;

    /**
     * ■ぷりいにっと
     * @param event
     */
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //■ろがー
        logger = event.getModLog();

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}
