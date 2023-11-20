package com.example.pattern.pattern.abstract_factory.product.mail;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Mail
 *
 * @author volka
 */
@Data
public class Mail {
    private String mailTemplateCode;
    private String senderMail;
    private String receiverMail;
    private String contentHtml;

    @EqualsAndHashCode(callSuper = true)
    @Data
    public static class Auth extends Mail {
        private String authKey;
    }

    @EqualsAndHashCode(callSuper = true)
    @Data
    public static class Event extends Mail {
        private String eventCode;
    }
}
