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
public class Panel extends Container {
    private String modalHelpText;

    public Panel(int i, int i1, int i2, int i3) {
        super();
    }

    @Override
    public String showHelp() {
        if(modalHelpText != null) {
            return modalHelpText;
        } else {
            return super.showHelp();
        }
    }
}
