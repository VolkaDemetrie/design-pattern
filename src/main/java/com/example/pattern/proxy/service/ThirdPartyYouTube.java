package com.example.pattern.proxy.service;

import com.example.pattern.proxy.ThirdPartyYouTubeLib;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class ThirdPartyYouTube implements ThirdPartyYouTubeLib {
    @Override
    public List<String> listVideos() {
        System.out.println("communicate YouTube and return Resposne");
        return Collections.emptyList();
    }

    @Override
    public String getVideoInfo(String id) {
        return "getVideoInfo";
    }

    @Override
    public File downloadVideo(String id) {
        return new File("videoFile");
    }
}
