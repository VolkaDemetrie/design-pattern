package com.example.pattern.pattern.abstract_factory.product.sms;

import com.example.pattern.pattern.abstract_factory.product.Communicatable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * SMS
 */
@Data
public class Sms extends Communicatable {
    private String senderMobile;
    private String receiverMobile;
    private String msg;


    @EqualsAndHashCode(callSuper = true)
    @Data
    public static class Auth extends Sms {
        private String authKey;
    }

    @EqualsAndHashCode(callSuper = true)
    @Data
    public static class Event extends Sms {
        private String eventCode;
    }

}
