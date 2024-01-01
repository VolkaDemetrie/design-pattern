package com.example.pattern.decorator.client;

import com.example.pattern.decorator.abst_component.DataSource;
import com.example.pattern.decorator.concrete_component.CompressionDecorator;
import com.example.pattern.decorator.concrete_component.EncryptionDecorator;
import com.example.pattern.decorator.concrete_component.FileDataSource;

/**
 * Decorator Pattern의 설정.
 * 설정 또는 환경에 따라 런타임 때 다양한 데코레이터 스택들을 조합할 수 있다.
 *
 * @author volka
 */
public class DecoratorConfigurator {

    boolean enabledEncryption = false;
    boolean enabledCompression = true;

    void configuration() {
        DataSource source = new FileDataSource("config.dat");

        if(enabledEncryption) source = new EncryptionDecorator(source);
        if(enabledCompression) source = new CompressionDecorator(source);

        DecoratorExternalClient client = new DecoratorExternalClient(source);
        String data = client.load();

        System.out.println(data);
    }
}
