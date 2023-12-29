package com.example.pattern.composite.component;

/**
 * @author : volka <volka5091@gmail.com>
 * description    : 컴포지트 패턴의 컴포넌트 역할 인터페이스
 */
public interface Graphic {
    void move(int x, int y);
    void draw();
}
