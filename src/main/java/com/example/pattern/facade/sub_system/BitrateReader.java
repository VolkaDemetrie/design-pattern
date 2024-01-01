package com.example.pattern.facade.sub_system;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 하위 시스템 클래스
 *
 * @author volka
 */
public class BitrateReader {
    public static byte[] read(String fileName, String sourceCodec) {
        File file = new File(fileName);
        try(FileInputStream fis = new FileInputStream(file);) {

            return new byte[256];

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String convert(byte[] buffer, Codec destinationCodec) {
        return "result";
    }
}
