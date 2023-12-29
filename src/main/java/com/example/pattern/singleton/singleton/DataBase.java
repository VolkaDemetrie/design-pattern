package com.example.pattern.singleton.singleton;

public class DataBase {

    private static DataBase instance = null;

    private DataBase() {
        super();
    }

    public static DataBase getInstance() {
        if (instance == null) instance = new DataBase();
        return instance;
    }

    public boolean insert(String query) {
        System.out.println("insert");
        return true;
    }
}
