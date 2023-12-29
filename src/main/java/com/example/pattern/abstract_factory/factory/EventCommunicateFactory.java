package com.example.pattern.abstract_factory.factory;

import com.example.pattern.abstract_factory.product.ktalk.Ktalk;
import com.example.pattern.abstract_factory.product.mail.Mail;
import com.example.pattern.abstract_factory.product.sms.Sms;
import lombok.extern.slf4j.Slf4j;


/**
 * 이벤트 통신 구상 팩토리
 *
 * @author volka
 */
@Slf4j
public class EventCommunicateFactory implements CommunicateFactory {
    @Override
    public Mail makeMail() {

        Mail.Event eventMail = new Mail.Event();
        eventMail.setSenderMail("sender@gmail.com");
        eventMail.setReceiverMail("receiver@gmail.com");
        eventMail.setContentHtml("htmldjdjdj");
        eventMail.setEventCode("event1234");

        return eventMail;
    }

    @Override
    public Sms makeSMS() {
        Sms.Event eventSms = new Sms.Event();
        eventSms.setSenderMobile("01055553333");
        eventSms.setReceiverMobile("01012341234");
        eventSms.setMsg("[메시지] 메시지~");
        eventSms.setEventCode("evnet2222");

        return eventSms;
    }

    @Override
    public Ktalk makeKtalk() {
        Ktalk.Event eventKtalk = new Ktalk.Event();

        eventKtalk.setTemplateCode(123);
        eventKtalk.setKtalkChannelCode("volkaChannel");
        eventKtalk.setReceiverMobile("01012341234");
        eventKtalk.setEventCode("EVENT123");
        eventKtalk.setMsg("이벤트~");

        return eventKtalk;
    }
}
