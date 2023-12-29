package com.example.pattern.abstract_factory.product.mail;

import com.example.pattern.abstract_factory.product.Communicatable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Mail
 *
 * @author volka
 */
@Data
public class Mail extends Communicatable {
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
