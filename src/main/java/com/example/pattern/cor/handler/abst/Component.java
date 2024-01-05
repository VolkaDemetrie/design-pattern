package com.example.pattern.cor.handler.abst;

/**
 * Chain Of Responsibility Pattern
 *
 * Base Handler
 *
 * @author volka
 */
public abstract class Component implements ComponentHelpHandler {
    public String tooltipText;

    //컴포넌트의 컨테이너는 핸들러 체인의 다음 링크 역할을 한다.
    protected Container container;

    //컴포넌트는 툴팁이 할당되었을 때 툴팁을 반환한다.
    //그렇지 않으면 컨테이너가 있는 경우 호출을 해당 컨테이너로 전달한다.
    @Override
    public String showHelp() {
        if(tooltipText != null) {
            return tooltipText;
        } else {
            return container.showHelp();
        }
    }
}
