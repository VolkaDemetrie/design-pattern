package com.example.pattern.command.command;

import com.example.pattern.command.Editor;
import com.example.pattern.command.invoker.CommandInvoker;

/**
 * Command Pattern
 *
 * 붙여넣기 커맨드
 *
 * @author volka
 */
public class PasteCommand extends Command {

    public PasteCommand(CommandInvoker invoker, Editor editor) {
        super(invoker, editor);
    }

    @Override
    public boolean execute() {
        saveBackup();
        editor.replaceSelection(invoker.clipboard);
        return true;
    }

}
