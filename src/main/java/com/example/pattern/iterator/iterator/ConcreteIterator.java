package com.example.pattern.iterator.iterator;

import com.example.pattern.iterator.Collections.ConcreteCollection;

/**
 * Iterator Pattenr
 *
 * 구상 이터레이터
 *
 * @author volka
 */
public class ConcreteIterator implements Iterator {

    private ConcreteCollection collection;
    private int iterationState; //반복자 상태

    public ConcreteIterator(ConcreteCollection concreteCollection) {
        collection = concreteCollection;
        iterationState = 0;
    }


    @Override
    public String getNext() {
        return collection.getElement(iterationState);
    }

    @Override
    public boolean hasNext() {
        return collection.getSize() - 1 > iterationState;
    }
}
