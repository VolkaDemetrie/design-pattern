package com.example.pattern.decorator.concrete_component;

import com.example.pattern.decorator.abst_component.DataSource;

/**
 * 암호화 데코레이터
 *
 * @author volka
 */
public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    public void writeData(String data) {
        data = "encrypted data";
        super.wrappee.writeData(data);
    }

    public String readData() {
        String data = wrappee.readData();
        data = "decrypt data";
        return data;
    }
}
