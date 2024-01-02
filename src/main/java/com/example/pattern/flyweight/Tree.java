package com.example.pattern.flyweight;

import com.example.pattern.flyweight.context.TreeType;

import java.awt.*;

/**
 * Flyweight Pattern
 *
 * Flyweight 역할
 *
 * @author volka
 */
public class Tree {
    public int x;
    public int y;
    public TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Canvas canvas) {
        type.draw(canvas, this.x, this.y);
    }
}
