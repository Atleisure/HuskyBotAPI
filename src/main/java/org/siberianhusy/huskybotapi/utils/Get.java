package org.siberianhusy.huskybotapi.utils;

import io.github.kloping.qqbot.entities.qqpd.Channel;
import io.github.kloping.qqbot.entities.qqpd.Guild;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.siberianhusy.huskybotapi.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Get {
    /**
     * @author SiberianHusky
     * 获取服务器信息
     */
    protected static String getServerInfo(){
        List<String> playerList = getPlayerList();
        StringBuilder players = new StringBuilder();
        if (playerList.isEmpty()){
            players = new StringBuilder("无玩家在线！");
        }
        else {
            for (int i = 0; i < playerList.size(); i++) {
                if (i!=playerList.size()-1){
                    players.append(playerList.get(i)).append(" , ");
                }
                else {
                    players.append(playerList.get(i));
                }
            }
        }
        String msg ="服务器信息\n" +
                "在线人数：" + playerList.size()+"\n"+
                "游戏版本：" + Bukkit.getVersion() + "\n"+
                "玩家列表：" + players;
        return msg;
    }
    /**
     * @author SiberianHusky
     * 获取服务器在线玩家信息
     */
    private static List<String> getPlayerList(){
        List<String> playerList = new ArrayList<>();
        for (Player player : Bukkit.getOnlinePlayers()){
            playerList.add(player.getName());
        }
        return playerList;
    }
    /**
     * @author SiberianHusky
     * 获取频道机器人所在频道列表
     */
    public static List<Guild> getGuild(){
        return new ArrayList<>(Data.starter.getBot().guilds());
    }
    /**
     * @author SiberianHusky
     * 获取频道所对应子频道
     */
    public static List<Channel> getChild(Guild guild){
        return new ArrayList<>(Arrays.asList(Data.starter.getBot().guildBase.getChannels(guild.getId())));
    }

}
