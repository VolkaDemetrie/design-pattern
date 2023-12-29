package com.example.pattern.abstract_factory.product.ktalk;

import com.example.pattern.abstract_factory.product.Communicatable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class Ktalk extends Communicatable {
    private int templateCode;
    private String msg;
    private String ktalkChannelCode;
    private String receiverMobile;


    @EqualsAndHashCode(callSuper = true)
    @Data
    public static class Auth extends Ktalk {
        private String authKey;
    }


    @EqualsAndHashCode(callSuper = true)
    @Data
    public static class Event extends Ktalk {
        private String eventCode;
    }
}
