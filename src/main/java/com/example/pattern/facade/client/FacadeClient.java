package com.example.pattern.facade.client;

import com.example.pattern.facade.VideoConverter;
import com.example.pattern.facade.sub_system.VideoFile;

/**
 * Facade Pattern Client Code
 *
 * @author volka
 */
public class FacadeClient {

    public static void main(String[] args) {
        VideoConverter converter = new VideoConverter();
        VideoFile mp4 = (VideoFile) converter.convert("fileNameDD", "mp4");
        mp4.save();
    }
}
