package org.siberianhusy.huskybotapi.plugins;

import org.siberianhusy.huskybotapi.Data;

import java.util.ArrayList;
import java.util.List;

public class VegetableDog {
    /**
     * @author SiberianHusky
     * 回复菜狗
     */
    public static void reply(){
        List<String> list = new ArrayList<>();
        list.add("<emoji:317>");
        list.add("杂鱼<emoji:66>~");
        Data.questionsAndManyReply.put("菜狗",list);
    }
}
