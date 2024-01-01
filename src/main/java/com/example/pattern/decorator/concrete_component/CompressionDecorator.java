package com.example.pattern.decorator.concrete_component;

import com.example.pattern.decorator.abst_component.DataSource;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    public void writeData(String data) {
        data = "compressed data";
        wrappee.writeData(data);
    }

    public String readData() {
        String data = wrappee.readData();
        data = "unzip data";

        return data;
    }
}
