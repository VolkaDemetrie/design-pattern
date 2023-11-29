package com.example.pattern.pattern.prototype.prototype;


public class Keyboard extends Prototype {
    private String keyboardType;

    public Keyboard() {
        super();
    }

    public Keyboard(Keyboard keyboard) {
        super(keyboard);
        this.keyboardType = keyboard.keyboardType;
    }

    @Override
    public Keyboard clone() {
        return new Keyboard(this);
    }
}
