package com.example.pattern.command.command;

import com.example.pattern.command.Editor;
import com.example.pattern.command.invoker.CommandInvoker;

/**
 * Command Pattern
 *
 * 자르기 커맨드
 *
 * @author volka
 */
public class CutCommand extends Command {

    public CutCommand(CommandInvoker invoker, Editor editor) {
        super(invoker, editor);
    }

    @Override
    public boolean execute() {
        saveBackup();
        invoker.clipboard = editor.getSelection();
        editor.deleteSelection();
        return true;
    }

}
