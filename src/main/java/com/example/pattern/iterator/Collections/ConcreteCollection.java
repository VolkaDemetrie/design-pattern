package com.example.pattern.iterator.Collections;

import com.example.pattern.iterator.iterator.ConcreteIterator;
import com.example.pattern.iterator.iterator.Iterator;

import java.util.List;

/**
 * Iterator Pattern
 *
 * 구상 컬렉션
 * 구상 이터레이터에 해당하는 클래스의 인스턴스를 생성한다.
 *
 * @author volka
 */
public class ConcreteCollection {

    private List<String> elementList;

    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public String getElement(int idx) {
        return elementList.get(idx);
    }

    public int getSize() {
        return elementList.size();
    }

}
