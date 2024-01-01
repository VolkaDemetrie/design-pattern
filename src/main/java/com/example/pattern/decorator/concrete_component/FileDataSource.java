package com.example.pattern.decorator.concrete_component;

import com.example.pattern.decorator.abst_component.DataSource;

/**
 * Decorator Pattern 구상 컴포넌트
 *
 * @author volka
 */
public class FileDataSource implements DataSource {

    private String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(String data) {
        System.out.println("file write");
    }

    @Override
    public String readData() {
        return "file read";
    }
}
