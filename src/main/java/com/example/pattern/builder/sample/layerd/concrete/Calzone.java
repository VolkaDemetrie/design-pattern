package com.example.pattern.builder.sample.layerd.concrete;

import com.example.pattern.builder.sample.layerd.abstraction.Pizza;

import java.util.Objects;

/**
 * @author : volka <volka5091@gmail.com>
 * description    :
 */
public class Calzone extends Pizza {

    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false;

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        public Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }
}
