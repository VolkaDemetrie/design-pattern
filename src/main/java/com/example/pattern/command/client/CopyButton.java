package com.example.pattern.command.client;

import com.example.pattern.command.command.Command;

/**
 * Command Pattern
 *
 * 클라이언트 클래스
 *
 * @author volka
 */
public class CopyButton {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
}
