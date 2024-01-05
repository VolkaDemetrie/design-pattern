package com.example.pattern.cor.handler.concrete;

import com.example.pattern.cor.handler.abst.Container;
import lombok.Setter;

/**
 * Chain Of Responsibility Pattern
 *
 * 복잡한 컴포넌트들은 핸들러의 기초 구현을 오버라이드 할 수 있다.
 * 새로운 방식으로 제공할 수 없는 경우 컴포넌트는 언제든지 기초 구현을 호출할 수 있다.
 *
 * @author volka
 */
@Setter
public class Dialog extends Container {
    private String wikiPageURL;

    public Dialog(String budgetReports) {
        super();
    }

    @Override
    public String showHelp() {
        if (wikiPageURL != null) {
            return wikiPageURL;
        } else {
            return super.showHelp();
        }
    }
}
