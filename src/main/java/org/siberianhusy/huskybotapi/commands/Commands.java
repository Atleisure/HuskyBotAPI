package org.siberianhusy.huskybotapi.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import org.siberianhusy.huskybotapi.Data;
import org.siberianhusy.huskybotapi.utils.LoadBot;
import org.siberianhusy.huskybotapi.utils.ReloadPlugin;
import org.siberianhusy.huskybotapi.utils.SendMessage;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (sender.hasPermission("HuskyBotAPI.admin")){
            //帮助指令
            if (args.length==0||(args.length==1&&args[0].equals("help"))){
                SendMessage.sendMessage(Data.messages.getStringList("help"),sender);
                return true;
            }
            //重载指令
            if (args.length==1&&args[0].equals("reload")){
                ReloadPlugin.reload();
                SendMessage.sendMessage(Data.messages.getString("reload"),sender);
                return true;
            }
            //启动机器人指令
            if (args.length==1&&args[0].equals("run")){
                if (LoadBot.loadBot()){
                    SendMessage.sendMessage(Data.messages.getString("run"),sender);
                }else {
                    SendMessage.sendMessage(Data.messages.getString("Error.run"),sender);
                }
                return true;
            }
            //关闭机器人指令
            if (args.length==1&&args[0].equals("close")){
                if (LoadBot.closeBot()){
                    SendMessage.sendMessage(Data.messages.getString("close"),sender);
                }
                else {
                    SendMessage.sendMessage(Data.messages.getString("Error.close"),sender);
                }
                return true;
            }
            SendMessage.sendMessage(Data.messages.getStringList("help"),sender);
            return true;
        }
        else {
            SendMessage.sendMessage(Data.messages.getString("notHasPermission"),sender);
            return true;
        }
    }
}
