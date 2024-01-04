package com.example.pattern.proxy;

import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * Proxy Pattern
 *
 * Proxy
 *
 * @author volka
 */
public class CachedYouTube implements ThirdPartyYouTubeLib {

    private ThirdPartyYouTubeLib service;
    private List<String> listCache;
    private String videoCache;

    public boolean needReset;

    public CachedYouTube(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    @Override
    public List<String> listVideos() {

        if (listCache == null || needReset) {
            listCache = service.listVideos();
        }

        return listCache;
    }

    @Override
    public String getVideoInfo(String id) {
        if (videoCache == null || needReset) {
            videoCache = service.getVideoInfo(id);
        }

        return videoCache;
    }

    @Override
    public File downloadVideo(String id) {

        File file = null;

        if(!existFile(id) || needReset) {
            file = service.downloadVideo(id);
        }

        return file;
    }

    private boolean existFile(String id) {
        File file = new File(id);

        return file.exists();
    }
}
