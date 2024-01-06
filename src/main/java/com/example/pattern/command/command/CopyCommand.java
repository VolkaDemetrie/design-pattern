package com.example.pattern.command.command;

import com.example.pattern.command.Editor;
import com.example.pattern.command.invoker.CommandInvoker;

/**
 * Command Pattern
 *
 * 복사 커맨드
 *
 * @author volka
 */
public class CopyCommand extends Command {

    public CopyCommand(CommandInvoker commandInvoker, Editor activeEditor) {
        super(commandInvoker, activeEditor);
    }

    @Override
    public boolean execute() {
        invoker.clipboard = editor.getSelection();
        return false;
    }

}
