package com.example.pattern.pattern.prototype;

public class MechanicalKeyboard extends Keyboard {
    private String tenKeyless;

    public MechanicalKeyboard(MechanicalKeyboard mechanicalKeyboard) {
        super(mechanicalKeyboard);
        this.tenKeyless = mechanicalKeyboard.tenKeyless;
    }

    @Override
    public Prototype clone() {
        return new MechanicalKeyboard(this);
    }
}
