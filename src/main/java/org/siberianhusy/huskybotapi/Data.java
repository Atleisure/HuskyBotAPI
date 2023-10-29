package org.siberianhusy.huskybotapi;

import io.github.kloping.qqbot.Starter;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.siberianhusy.huskybotapi.utils.LoadBot;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {
    //获取插件配置
    public static FileConfiguration config = HuskyBotAPI.huskyBotAPI.getConfig();
    //机器人启动信息
    public static Starter starter = LoadBot.factory();
    //语言文件
    protected static File messagesFile = new File(HuskyBotAPI.huskyBotAPI.getDataFolder(), "Messages/messages.yml");
    //语言文件
    public static FileConfiguration messages = YamlConfiguration.loadConfiguration(messagesFile);
    //问答列表
    public static Map<String,String> questionsAndReply = new HashMap<>();
    //问答列表
    public static Map<String, List<String>> questionsAndManyReply = new HashMap<>();
    //机器人是否启动
    public static boolean isRun = false;
    //机器人是否是第一次启动
    public static boolean isFirstRun  = true;
}
