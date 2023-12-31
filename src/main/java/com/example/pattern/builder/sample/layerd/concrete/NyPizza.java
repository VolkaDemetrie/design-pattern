package com.example.pattern.builder.sample.layerd.concrete;

import com.example.pattern.builder.sample.layerd.abstraction.Pizza;

import java.util.Objects;

/**
 * @author : volka <volka5091@gmail.com>
 * description    :
 */
public class NyPizza extends Pizza {
    public enum Size {SMALL, MEDIUM, LARGE}
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
