package com.example.pattern.bridge.abstraction.concrete;

import com.example.pattern.bridge.abstraction.Device;
import com.example.pattern.bridge.abstraction.RemoteControl;

public class AdvancedRemoteControl extends RemoteControl {
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }
}
