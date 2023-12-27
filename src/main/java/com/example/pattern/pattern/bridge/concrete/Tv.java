package com.example.pattern.pattern.bridge.concrete;

import com.example.pattern.pattern.bridge.abstraction.Device;

public class Tv implements Device {

    private boolean isEnabled = false;
    private int volume = 0;
    private int channel = 0;

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    @Override
    public void enable() {
        isEnabled = true;
    }

    @Override
    public void disable() {
        isEnabled = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        volume = volume + percent;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }
}
