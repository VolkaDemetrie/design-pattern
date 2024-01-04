package com.example.pattern.proxy.client;

import com.example.pattern.proxy.CachedYouTube;
import com.example.pattern.proxy.ThirdPartyYouTubeLib;
import com.example.pattern.proxy.service.ThirdPartyYouTube;

public class YouTubeClient {

    public void init() {
        ThirdPartyYouTubeLib service = new ThirdPartyYouTube();
        ThirdPartyYouTubeLib proxy = new CachedYouTube(service);

        YouTubeManager manager = new YouTubeManager(proxy);
        manager.reactOnUserInput();
    }
}
