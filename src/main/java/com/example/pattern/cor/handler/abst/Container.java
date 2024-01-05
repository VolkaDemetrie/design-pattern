package com.example.pattern.cor.handler.abst;


import java.util.List;

/**
 * Chain Of Responsibility Pattern
 *
 * 추상 핸들러
 * 여기서 체인 관계들이 설립된다.
 *
 * @author volka
 */
public abstract class Container extends Component {
    protected List<Component> componentList;

    public void add(Component component) {
        componentList.add(component);
        component.container = this;
    }
}
