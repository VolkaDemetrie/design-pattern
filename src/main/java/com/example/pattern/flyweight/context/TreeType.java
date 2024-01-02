package com.example.pattern.flyweight.context;

import lombok.Getter;

import java.awt.*;

/**
 * Flyweight Pattern
 *
 * Context 역할.
 * 멤버변수들이 모두 유니크하다.
 *
 * @author volka
 */
@Getter
public class TreeType {
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(Canvas canvas, int x, int y) {
        System.out.println("draw this canvas " + canvas);
    }
}
