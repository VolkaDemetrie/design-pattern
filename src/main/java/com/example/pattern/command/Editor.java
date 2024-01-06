package com.example.pattern.command;

/**
 * Command Pattern
 *
 * 편집기. 비즈니스 로직 존재.
 * 수신기 역할을 하며, 모든 커맨드들은 편집기의 메서드들에 실행을 위임한다.
 *
 */
public class Editor {
    public String text;

    public String getSelection() {
        return this.text;
    }

    public void deleteSelection() {
        this.text = null;
    }

    public void replaceSelection(String text) {
        this.text = text;
    }
}
