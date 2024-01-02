package com.example.pattern.flyweight.factory;

import com.example.pattern.flyweight.context.TreeType;

import java.util.List;

/**
 * Flyweight Pattern
 *
 * Factory
 * 팩토리는 기존 플라이웨이트를 재사용할지 아니면 새로운 객체를 생성할지 결정한다.
 *
 * @author volka
 */
public class TreeFactory {
    private static List<TreeType> treeTypes;

    public static TreeType getTreeType(String name, String color, String texture) {
        TreeType type = null;

        for (TreeType treeType : treeTypes) {
            if (treeType.getName().equals(name)
                && treeType.getColor().equals(color)
                && treeType.getTexture().equals(texture)
            ) {
                type = treeType;
            }
        }

        if (type == null) {
            type = new TreeType(name, color, texture);
            treeTypes.add(type);
        }

        return type;
    }


}
