package com.example.pattern.pattern.abstract_factory.client;

import com.example.pattern.pattern.abstract_factory.factory.AuthCommunicateFactory;
import com.example.pattern.pattern.abstract_factory.factory.CommunicateFactory;
import com.example.pattern.pattern.abstract_factory.factory.EventCommunicateFactory;
import com.example.pattern.pattern.abstract_factory.product.Communicatable;
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

    //추상 팩토리, 빌더 패턴, 프로토타입 패턴들은 모두 싱글턴으로 구현이 가능하다. 마찬가지로 스프링 컨테이너에 객체 관리를 위임해 Bean 등록하여 구상 팩토리들을 싱글턴으로 관리한다.
    private final AuthCommunicateFactory authCommunicateFactory;
    private final EventCommunicateFactory eventCommunicateFactory;

    public boolean send(Communicatable communicatable) throws RuntimeException {
        CommunicateFactory factory = getFactory(communicatable.getAttribute());

        //Psuedo 코드이니 if와 문자열 비교로 대체. 실제로 사용시엔 enum으로 구현하자
        switch (communicatable.getSendType()) {
            case "MAIL":
                return sendMail(factory.makeMail());
            case "SMS":
                return sendSms(factory.makeSMS());
            case "KTALK":
                return sendKtalk(factory.makeKtalk());
            default: throw new RuntimeException("Undfined sendType");
        }
    }

    /**
     * 팩토리
     * @param attribute
     * @return
     */
    private CommunicateFactory getFactory(String attribute) {
        switch (attribute) {
            case "AUTH":
                return authCommunicateFactory;
            case "EVENT":
                return eventCommunicateFactory;
            default:
                throw new RuntimeException("Undfined attribute");
        }
    }


    private boolean sendSms(Sms sms) {
        //send sms logic :: webClient.mutate() something
        return true;
    }

    private boolean sendKtalk(Ktalk ktalk) {
        //send sendKtalk logic :: webClient.mutate() something
        return true;
    }

    private boolean sendMail(Mail mail) {
        //send sendMail logic :: webClient.mutate() something
        return true;
    }

}
