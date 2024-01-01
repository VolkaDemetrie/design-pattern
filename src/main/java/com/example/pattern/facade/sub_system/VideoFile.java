package com.example.pattern.facade.sub_system;

import java.io.File;
import java.net.URI;

/**
 * 하위 시스템 클래스
 *
 * @author volka
 */
public class VideoFile extends File {
    public VideoFile(String pathname) {
        super(pathname);
    }

    public VideoFile(String parent, String child) {
        super(parent, child);
    }

    public VideoFile(File parent, String child) {
        super(parent, child);
    }

    public VideoFile(URI uri) {
        super(uri);
    }

    public void save() {
        System.out.println("save");
    }
}
