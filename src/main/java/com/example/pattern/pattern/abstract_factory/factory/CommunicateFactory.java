package com.example.pattern.pattern.abstract_factory.factory;

import com.example.pattern.pattern.abstract_factory.product.ktalk.Ktalk;
import com.example.pattern.pattern.abstract_factory.product.mail.Mail;
import com.example.pattern.pattern.abstract_factory.product.sms.Sms;

/**
 * 추상 팩토리 인터페이스
 *
 * 추상 팩토리는 싱글톤 패턴도 적용 가능하다. :: 해당 프로젝트를 S/F로 만들었으므로 구상 팩토리의 객체 관리를 스프링 컨테이너에 위임한다.
 * 각 팩토리의 클라이언트 코드는 통신 유틸이 될 것이므로 초기화는 거기서 한다.
 *
 * @author volka
 */
public interface CommunicateFactory {

    Mail makeMail();

    Sms makeSMS();

    Ktalk makeKtalk();
}
