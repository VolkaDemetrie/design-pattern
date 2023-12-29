package com.example.pattern.bridge.abstraction;

/**
 * 추상화로 두 클래스 계층구조의 제어 부분에 대한 인터페이스를 정의
 * 구현 계층구조의 객체에 대한 참조를 유지하고 모든 실제 작업을 이 객체에 위임한다.
 */
public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.disable();
        }
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
    }

    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }

    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }
}
