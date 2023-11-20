package com.example.pattern.pattern.abstract_factory.client;

import com.example.pattern.pattern.abstract_factory.factory.AuthCommunicateFactory;
import com.example.pattern.pattern.abstract_factory.factory.CommunicateFactory;
import com.example.pattern.pattern.abstract_factory.factory.EventCommunicateFactory;
import com.example.pattern.pattern.abstract_factory.product.ktalk.Ktalk;
import com.example.pattern.pattern.abstract_factory.product.mail.Mail;
import com.example.pattern.pattern.abstract_factory.product.sms.Sms;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class CommunicateUtil {

    private final AuthCommunicateFactory authCommunicateFactory;
    private final EventCommunicateFactory eventCommunicateFactory;

    public boolean action(String type) throws RuntimeException {
        CommunicateFactory factory = null;

        if (type.equals("AUTH")) {
            factory = authCommunicateFactory;
            return sendAll(factory);

        } else if (type.equals("EVENT")) {
            factory = eventCommunicateFactory;
            return sendAll(factory);
        } else {
            throw new RuntimeException("Undfined Aciton Type");
        }
    }

    private boolean sendAll(CommunicateFactory factory) {
        sendSms(factory.makeSMS());
        sendKtalk(factory.makeKtalk());
        sendMail(factory.makeMail());

        return true;
    }


    public boolean sendSms(Sms sms) {
        return true;
    }

    public boolean sendKtalk(Ktalk ktalk) {
        return true;
    }

    public boolean sendMail(Mail mail) {
        return true;
    }

}
