package com.example.pattern.prototype.client;

import com.example.pattern.prototype.prototype.MechanicalKeyboard;
import com.example.pattern.prototype.prototype.Prototype;

import java.util.List;

public class Client {
    private List<Prototype> prototypeList;

    public Client() {
        MechanicalKeyboard mechanicalKeyboard = new MechanicalKeyboard();
        mechanicalKeyboard.setTenKeyless("tenkeyless");
        prototypeList.add(mechanicalKeyboard);
        prototypeList.add(mechanicalKeyboard.clone());

        MechanicalKeyboard tenkeyKeyboard = new MechanicalKeyboard();
        tenkeyKeyboard.setTenKeyless("tenkey");

        prototypeList.add(tenkeyKeyboard);
        prototypeList.add(tenkeyKeyboard.clone());
    }

    public void biz() {
        
    }
}


