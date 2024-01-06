package com.example.pattern.command.invoker;

import com.example.pattern.command.CommandHistory;
import com.example.pattern.command.Editor;
import com.example.pattern.command.client.CopyButton;
import com.example.pattern.command.command.Command;
import com.example.pattern.command.command.CopyCommand;

import java.util.List;

/**
 * Command Pattern
 *
 * 커맨드 인보커 클래스는 객체 관계들을 설정하여 발신자(invoker) 역할을 한다.
 * 요청을 수행해야 할 때 커맨드 객체를 만들고 실행한다.
 *
 * @author volka
 */
public class CommandInvoker {
    public String clipboard;
    private List<Editor> editorList;
    private Editor activeEditor;
    private CommandHistory history;

    public void executeCommand(Command command) {
        if(command.execute()) {
            history.push(command);
        }
    }

    public void undo() {
        Command command = history.pop();
        if(command != null) command.undo();
    }

    public void createUI() {
        copyInit();
    }

    private CopyButton copyInit() {
        CopyButton copyButton = new CopyButton();
        copyButton.setCommand(new CopyCommand(this, activeEditor));

        return copyButton;
    }


}
