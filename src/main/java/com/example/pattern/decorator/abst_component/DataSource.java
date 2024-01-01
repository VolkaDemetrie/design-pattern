package com.example.pattern.decorator.abst_component;

/**
 * Decorator Pattern :: 컴포넌트 역할
 * @author volka
 */
public interface DataSource {

    void writeData(String data);
    String readData();
}
