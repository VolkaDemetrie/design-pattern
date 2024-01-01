package com.example.pattern.decorator.client;

import com.example.pattern.decorator.abst_component.DataSource;
import com.example.pattern.decorator.concrete_component.CompressionDecorator;
import com.example.pattern.decorator.concrete_component.EncryptionDecorator;
import com.example.pattern.decorator.concrete_component.FileDataSource;

/**
 * Decorator Pattern Client Code
 *
 * @author volka
 */
public class DecoratorClient {

    public void dumbUsageExample() {

        String record = "any record";

        DataSource source = new FileDataSource("file.dat");
        source.writeData(record);

        source = new CompressionDecorator(source);
        source.writeData(record);

        source = new EncryptionDecorator(source);
        source.writeData(record);
    }
}
