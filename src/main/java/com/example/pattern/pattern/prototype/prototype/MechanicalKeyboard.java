package com.example.pattern.pattern.prototype.prototype;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MechanicalKeyboard extends Keyboard {
    private String tenKeyless;

    public MechanicalKeyboard() {
        super();
    }

    public MechanicalKeyboard(MechanicalKeyboard mechanicalKeyboard) {
        super(mechanicalKeyboard);
        this.tenKeyless = mechanicalKeyboard.tenKeyless;
    }

    @Override
    public MechanicalKeyboard clone() {
        return new MechanicalKeyboard(this);
    }
}
