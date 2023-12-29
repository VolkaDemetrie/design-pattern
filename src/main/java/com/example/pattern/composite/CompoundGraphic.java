package com.example.pattern.composite;

import com.example.pattern.composite.component.Graphic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : volka <volka5091@gmail.com>
 * description    :
 */
public class CompoundGraphic implements Graphic {

    private final List<Graphic> componentList = new ArrayList<>();

    public void add(Graphic graphic) {
        componentList.add(graphic);
    }

    public void remove(Graphic graphic) {
        componentList.remove(graphic);
    }

    @Override
    public void move(int x, int y) {
        componentList.forEach(graphic -> move(x, y));
    }

    @Override
    public void draw() {
        componentList.forEach(graphic -> draw());
    }
}
