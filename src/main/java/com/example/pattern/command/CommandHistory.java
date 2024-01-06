package com.example.pattern.command;

import com.example.pattern.command.command.Command;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


/**
 * Command Pattern
 *
 * 커맨드 히스토리 스택
 *
 * @author volka
 */
public class CommandHistory {
    private LinkedList<Command> history;

    public void push(Command c) {
        history.addLast(c);
    }

    public Command pop() {
        return history.getLast();
    }
}
