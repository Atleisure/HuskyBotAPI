package org.siberianhusy.huskybotapi;

import io.github.kloping.qqbot.api.Intents;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.siberianhusy.huskybotapi.commands.Commands;
import org.siberianhusy.huskybotapi.utils.LoadBot;

import java.util.Objects;

public final class HuskyBotAPI extends JavaPlugin {
    public static HuskyBotAPI huskyBotAPI;
    @Override
    public void onEnable() {
        //保存配置文件
        saveDefaultConfig();
        huskyBotAPI = this;
        //订阅私域事件
        Data.starter.getConfig().setCode(Intents.PRIVATE_INTENTS.getCode());
        //保存语言文件
        this.saveResource("Messages/messages.yml", false);
        //注册指令
        Objects.requireNonNull(Bukkit.getPluginCommand("HuskyBotAPI")).setExecutor(new Commands());

    }

    @Override
    public void onDisable() {
        LoadBot.closeBot();
    }
}
