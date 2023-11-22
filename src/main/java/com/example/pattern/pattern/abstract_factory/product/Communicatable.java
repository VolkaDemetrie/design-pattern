package com.example.pattern.pattern.abstract_factory.product;

import lombok.Data;

/**
 * 통신가능 인터페이스
 */
@Data
public class Communicatable {
    private String sendType;
    private String attribute;
}
