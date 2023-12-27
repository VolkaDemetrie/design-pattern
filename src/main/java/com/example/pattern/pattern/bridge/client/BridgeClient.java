package com.example.pattern.pattern.bridge.client;

import com.example.pattern.pattern.bridge.abstraction.RemoteControl;
import com.example.pattern.pattern.bridge.concrete.AdvancedRemoteControl;
import com.example.pattern.pattern.bridge.concrete.Radio;
import com.example.pattern.pattern.bridge.concrete.Tv;

public class BridgeClient {

    public void doSomething() {
        Tv tv = new Tv();
        RemoteControl remote = new RemoteControl(tv);
        remote.togglePower();

        Radio radio = new Radio();
        remote = new AdvancedRemoteControl(radio);

        remote.togglePower();
        remote.channelUp();
    }
}
