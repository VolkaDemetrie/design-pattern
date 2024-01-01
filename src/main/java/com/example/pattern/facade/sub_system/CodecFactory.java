package com.example.pattern.facade.sub_system;

import java.io.File;

/**
 * 하위 시스템 클래스
 *
 * @author volka
 */
public class CodecFactory {
    public String extract(File file) {
        return file.getName().substring(file.getName().lastIndexOf("."));
    }
}
