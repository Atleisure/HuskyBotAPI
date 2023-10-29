package org.siberianhusy.huskybotapi.utils;

import io.github.kloping.qqbot.entities.qqpd.message.RawMessage;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class SendMessage {
    /**
     * @author SiberianHusky
     * @param string 要发送的信息(自动替换颜色)
     * @param sender 指令发送者
     */
    public static void sendMessage(String string, @NotNull CommandSender sender){
        sender.sendMessage(Replace.replaceColor(string));
    }
    /**
     * @author SiberianHusky
     * @param strings 要发送的信息列表(自动替换颜色)
     * @param sender 指令发送者
     */
    public static void sendMessage(List<String> strings,CommandSender sender){
        for (String s : strings){
            sender.sendMessage(Replace.replaceColor(s));
        }
    }
    /**
     * @author SiberianHusky
     * @param message 要回复的信息
     * @param reply 回复内容
     */
    public static void replyMessage(RawMessage message,String reply){
        message.send(reply);
    }
    /**
     * @author SiberianHusky
     * @param message 要回复的信息
     * @param reply 回复内容(列表)
     */
    public static void replyMessage(RawMessage message,List<String> reply){
        for (String s : reply){
            message.send(s);
        }
    }
}
