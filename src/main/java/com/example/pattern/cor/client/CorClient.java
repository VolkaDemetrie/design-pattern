package com.example.pattern.cor.client;

import com.example.pattern.cor.handler.concrete.Button;
import com.example.pattern.cor.handler.concrete.Dialog;
import com.example.pattern.cor.handler.concrete.Panel;

/**
 * Chain Of Responsibility Pattern
 *
 * 클라이언트 코드
 *
 * @author volka
 */
public class CorClient {

    public void createUI() {
        Dialog dialog = new Dialog("Budget Reports");
        dialog.setWikiPageURL("https://wiki");
        Panel panel = new Panel(0, 0, 400, 800);
        panel.setModalHelpText("model help");

        Button okBtn = new Button(250, 760, 50, 20, "OK");
        okBtn.tooltipText = "OK Button";

        Button cancelBtn = new Button(320, 760, 50, 20, "Cancel");

        panel.add(okBtn);
        panel.add(cancelBtn);
        dialog.add(panel);

    }


}
