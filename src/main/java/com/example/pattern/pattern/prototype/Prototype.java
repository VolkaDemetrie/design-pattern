package com.example.pattern.pattern.prototype;

public abstract class Prototype {

    private String name;

    Prototype() {
        super();
    }

    Prototype(Prototype prototype) {
        this();
        this.name = prototype.name;
    }

    @Override
    protected abstract Prototype clone();
}
