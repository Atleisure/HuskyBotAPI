package org.siberianhusy.huskybotapi.utils;

public class Replace {
    /**
     * @author SiberianHusky
     * @param s 要替换颜色的文字(&替换为§)
     */
    public static String replaceColor(String s){
        return s.replace("&","§");
    }
    /**
     * @author SiberianHusky
     * @param s 要替换颜色的文字(&替换为§)
     * @param name 文字中的name替换为name变量
     */
    public static String replaceName(String s,String name){
        return replaceColor(s.replace("name",name));
    }
}
