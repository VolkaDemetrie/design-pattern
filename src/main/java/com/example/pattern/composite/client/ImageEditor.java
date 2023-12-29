package com.example.pattern.composite.client;

import com.example.pattern.composite.Circle;
import com.example.pattern.composite.CompoundGraphic;
import com.example.pattern.composite.Dot;
import com.example.pattern.composite.component.Graphic;

import java.util.List;

/**
 * @author : volka <volka5091@gmail.com>
 * description    :
 */
public class ImageEditor {
    private CompoundGraphic all;

    public void load() {
        all = new CompoundGraphic();
        all.add(new Dot(1, 2));
        all.add(new Circle(5, 3, 10));
    }

    public void groupSelected(List<Graphic> graphicList) {
        CompoundGraphic group = new CompoundGraphic();
        graphicList.forEach(graphic -> {
            group.add(graphic);
            all.remove(graphic);
        });
        all.add(group);
        all.draw();
    }
}
