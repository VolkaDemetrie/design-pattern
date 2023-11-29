package com.example.pattern.pattern.singleton.client;

import com.example.pattern.pattern.singleton.singleton.DataBase;

public class CalcService {

    public boolean saveCalculation(String calcFunc) {
        DataBase db = DataBase.getInstance();

        db.insert("INSERT INTO ~ calcFunc~");

        return true;
    }
}
