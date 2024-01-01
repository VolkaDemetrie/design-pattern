package com.example.pattern.decorator.client;

import com.example.pattern.decorator.abst_component.DataSource;

/**
 * 외부에서 데코레이터 호출 클라이언트 소스
 *
 * @author volka
 */
public class DecoratorExternalClient {
    private DataSource dataSource;

    public DecoratorExternalClient(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String load() {
        return dataSource.readData();
    }

    public void save(String data) {
        dataSource.writeData(data);
    }
}
