package com.example.pattern.facade;

import com.example.pattern.facade.sub_system.*;

import java.io.File;

/**
 * Facade class
 *
 * @author volka
 */
public class VideoConverter {
    public File convert(String fileName, String format) {
        File file = new VideoFile(fileName);
        String sourceCodec = (new CodecFactory()).extract(file);

        Codec destinationCodec = null;

        if(format.equals(sourceCodec)) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }

        byte[] buffer = BitrateReader.read(fileName, sourceCodec);
        String result = BitrateReader.convert(buffer, destinationCodec);
        result = (new AudioMixer()).fix(result);

        return new File(result);
    }
}
