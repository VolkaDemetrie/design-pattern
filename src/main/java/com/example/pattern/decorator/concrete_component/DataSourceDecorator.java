package com.example.pattern.decorator.concrete_component;

import com.example.pattern.decorator.abst_component.DataSource;

/**
 * Decorator Pattern 기초 데코레이터
 * 참조변수로 선언된 인터페이스와 동일한 인터페이스를 구현 및 참조변수로 해당 인터페이스를 참조해야한다.
 *
 * @author volka
 */
public class DataSourceDecorator implements DataSource {

    protected DataSource wrappee;

    public DataSourceDecorator(DataSource wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
