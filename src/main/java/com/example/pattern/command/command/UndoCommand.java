package com.example.pattern.command.command;

import com.example.pattern.command.Editor;
import com.example.pattern.command.invoker.CommandInvoker;

/**
 * Command Pattern
 *
 * 실행취소 커맨드
 *
 * @author volka
 */
public class UndoCommand extends Command {

    public UndoCommand(CommandInvoker invoker, Editor editor) {
        super(invoker, editor);
    }

    @Override
    public boolean execute() {
        invoker.undo();
        return false;
    }

}
