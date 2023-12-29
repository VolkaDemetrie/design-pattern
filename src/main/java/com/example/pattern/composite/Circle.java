package com.example.pattern.composite;

/**
 * @author : volka <volka5091@gmail.com>
 * description    :
 */
public class Circle extends Dot {
    float radius;

    public Circle(int x, int y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    public void draw() {
        System.out.println("circle draw");
    }

}
