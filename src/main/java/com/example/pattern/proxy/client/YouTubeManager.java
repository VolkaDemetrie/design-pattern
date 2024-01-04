package com.example.pattern.proxy.client;

import com.example.pattern.proxy.ThirdPartyYouTubeLib;

import java.util.List;

/**
 * Proxy Pattern
 *
 * 클라이언트 코드. 생성자를 통해 프록시 또는 실제 서비스 객체를 전달 받는다.
 *
 * @author volka
 */
public class YouTubeManager {
    protected ThirdPartyYouTubeLib service;

    public YouTubeManager(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    public String renderVideoPage(String id) {
        return service.getVideoInfo(id);
    }

    public List<String> renderListPanel() {
        return service.listVideos();
    }

    public void reactOnUserInput() {
        renderListPanel();
        renderListPanel();
    }

}
