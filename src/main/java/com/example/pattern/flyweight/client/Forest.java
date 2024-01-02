package com.example.pattern.flyweight.client;

import com.example.pattern.flyweight.Tree;
import com.example.pattern.flyweight.context.TreeType;
import com.example.pattern.flyweight.factory.TreeFactory;

import java.awt.*;
import java.util.List;

/**
 * Flyweight Pattern
 *
 * 클라이언트 역할
 *
 * @author volka
 */
public class Forest {
    public List<Tree> trees;

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, type);

        trees.add(tree);
    }

    public void draw(Canvas canvas) {
        for (Tree tree : trees) {
            tree.draw(canvas);
        }
    }
}
