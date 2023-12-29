package com.example.pattern.adapter;

public class RoundHole {
    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public boolean isFit(RoundPeg peg) {
        return this.radius >= peg.getRadius();
    }
}
