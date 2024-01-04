package com.example.pattern.proxy;

import java.io.File;
import java.util.List;

/**
 * Proxy Pattern
 *
 * 지연된 초기화 캐싱 도입을 위한 프록시 패턴의 서비스 인터페이스
 *
 * @author volka
 */
public interface ThirdPartyYouTubeLib {

    List<String> listVideos();
    String getVideoInfo(String id);

    File downloadVideo(String id);
}
