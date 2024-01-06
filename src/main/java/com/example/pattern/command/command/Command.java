package com.example.pattern.command.command;

import com.example.pattern.command.Editor;
import com.example.pattern.command.invoker.CommandInvoker;

/**
 * Command Pattern
 *
 * 기초 커맨드 클래스.
 * 모든 구상 커맨드에 대한 공통 인터페이스를 정의한다.
 *
 * @author volka
 */
public abstract class Command {
    protected CommandInvoker invoker;
    protected Editor editor;
    protected String backup;

    public Command(CommandInvoker invoker, Editor editor) {
        this.invoker = invoker;
        this.editor = editor;
    }

    public void saveBackup() {
        backup = editor.text;
    }

    public void undo() {
        editor.text = backup;
    }

    public abstract boolean execute();
}
