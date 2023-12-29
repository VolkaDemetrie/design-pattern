package com.example.pattern.builder.sample.layerd.abstraction;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author : volka <volka5091@gmail.com>
 * description    : 계층적 구조를 가진 클래스에 사용하면 좋은 빌더 패턴 예시
 */
public abstract class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}
    final Set<Topping> topppings;

    public abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        protected abstract Pizza build();

        //하위 클래스는 오버라이딩 하여 this를 반환하도록 해야한다.
        protected abstract T self();
    }

    protected Pizza(Builder<?> builder) {
        topppings = builder.toppings.clone();
    }
}
