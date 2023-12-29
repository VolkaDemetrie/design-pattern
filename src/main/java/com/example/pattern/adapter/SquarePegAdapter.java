package com.example.pattern.adapter;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg sPeg;

    public SquarePegAdapter(SquarePeg sPeg) {
        super(0);
        this.sPeg = sPeg;
    }

    @Override
    public int getRadius() {
        return (int) (sPeg.getWidth() * Math.sqrt(2) / 2);
    }

}
