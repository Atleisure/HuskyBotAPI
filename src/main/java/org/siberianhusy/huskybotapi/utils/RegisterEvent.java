package org.siberianhusy.huskybotapi.utils;

import io.github.kloping.qqbot.api.message.MessageEvent;
import io.github.kloping.qqbot.entities.qqpd.message.RawMessage;
import io.github.kloping.qqbot.impl.EventReceiver;
import io.github.kloping.qqbot.impl.ListenerHost;
import org.siberianhusy.huskybotapi.Data;

public class RegisterEvent {
    /**
     * @author SiberianHusky
     * 注册事件
     */
    protected static void registerEvent(){
        Data.starter.registerListenerHost(new ListenerHost() {
            @Override
            public void handleException(Throwable e) {
            }
            @EventReceiver
            private void event(MessageEvent event) {
                RawMessage message = event.getRawMessage();
                String question = message.getContent();
                if (Data.questionsAndReply.containsKey(question)){
                    message.send(Data.questionsAndReply.get(question));
                } else if (Data.questionsAndManyReply.containsKey(question)) {
                    SendMessage.replyMessage(message,Data.questionsAndManyReply.get(question));
                }
                else if (question.equals("mcs")){
                    SendMessage.replyMessage(message,Get.getServerInfo());
                }
            }
        });
    }
}
