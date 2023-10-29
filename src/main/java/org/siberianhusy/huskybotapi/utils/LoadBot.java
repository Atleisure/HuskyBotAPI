package org.siberianhusy.huskybotapi.utils;
import io.github.kloping.qqbot.Starter;
import io.github.kloping.qqbot.api.Intents;
import org.bukkit.configuration.file.FileConfiguration;
import org.siberianhusy.huskybotapi.Data;
import org.siberianhusy.huskybotapi.plugins.VegetableDog;


public class LoadBot {
    /**
     * @author SiberianHusky
     * 获取机器人信息
     */
    public static Starter factory() {
        FileConfiguration config = Data.config;
        Starter starter = new Starter(config.getString("appId"), config.getString("token"));
        starter.setReconnect(true);
        return starter;
    }
    /**
     * @author SiberianHusky
     * 启动机器人
     */
    public static boolean loadBot(){
        if (Data.isRun){
            return false;
        }else {
            if (Data.isFirstRun){
                Data.isRun = true;
                VegetableDog.reply();
                RegisterEvent.registerEvent();
                Data.starter.run();
            }
            return true;
        }
    }
    /**
     * @author SiberianHusky
     * 关闭机器人
     */
    public static boolean closeBot(){
        if (Data.isRun){
            //关闭机器人链接
            Data.isRun = false;
            Data.starter.getWssWorker().webSocket.close();
            return true;
        }
        else {
            return false;
        }

    }
}
