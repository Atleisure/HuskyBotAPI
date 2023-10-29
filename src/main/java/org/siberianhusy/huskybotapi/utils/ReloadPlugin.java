package org.siberianhusy.huskybotapi.utils;

import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.siberianhusy.huskybotapi.Data;
import org.siberianhusy.huskybotapi.HuskyBotAPI;

import java.io.File;

public class ReloadPlugin {
    /**
     * @author SiberianHusky
     * 重载插件
     */
    public static void reload(){
        HuskyBotAPI.huskyBotAPI.reloadConfig();
        Data.config = HuskyBotAPI.huskyBotAPI.getConfig();
        File messagesFile = new File(HuskyBotAPI.huskyBotAPI.getDataFolder(), "Messages/messages.yml");
        Data.messages = YamlConfiguration.loadConfiguration(messagesFile);
    }
}
