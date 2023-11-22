package com.example.pattern.pattern.prototype;

public class Keyboard extends Prototype {
    private String keyboardType;

    public Keyboard(Keyboard keyboard) {
        super(keyboard);
        this.keyboardType = keyboard.keyboardType;
    }

    @Override
    public Prototype clone() {
        return new Keyboard(this);
    }
}
