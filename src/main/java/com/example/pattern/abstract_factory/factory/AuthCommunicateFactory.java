package com.example.pattern.abstract_factory.factory;

import com.example.pattern.abstract_factory.product.ktalk.Ktalk;
import com.example.pattern.abstract_factory.product.mail.Mail;
import com.example.pattern.abstract_factory.product.sms.Sms;
import lombok.extern.slf4j.Slf4j;

/**
 * 인증 관련 통신 팩토리
 *
 * @author volka
 */
@Slf4j
public class AuthCommunicateFactory implements CommunicateFactory {
    @Override
    public Mail makeMail() {

        Mail.Auth authMail = new Mail.Auth();
        authMail.setSenderMail("sender@gmail.com");
        authMail.setReceiverMail("receiver@gmail.com");
        authMail.setAuthKey("something");
        authMail.setContentHtml("htmldjdjdj");

        return authMail;
    }

    @Override
    public Sms makeSMS() {
        Sms.Auth authSms = new Sms.Auth();
        authSms.setSenderMobile("01055553333");
        authSms.setReceiverMobile("01012341234");
        authSms.setMsg("[메시지] 메시지~");
        authSms.setAuthKey("1234");

        return authSms;
    }

    @Override
    public Ktalk makeKtalk() {
        Ktalk.Auth authKtalk = new Ktalk.Auth();

        authKtalk.setTemplateCode(123);
        authKtalk.setKtalkChannelCode("volkaChannel");
        authKtalk.setReceiverMobile("01012341234");
        authKtalk.setMsg("[인증]");
        authKtalk.setAuthKey("1234");

        return authKtalk;
    }
}
