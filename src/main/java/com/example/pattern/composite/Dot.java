package com.example.pattern.composite;

import com.example.pattern.composite.component.Graphic;

/**
 * @author : volka <volka5091@gmail.com>
 * description    :
 */
public class Dot implements Graphic {
    private int x;
    private int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.println("draw");
    }
}
