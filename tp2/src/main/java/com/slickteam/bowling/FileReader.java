package com.slickteam.bowling;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.Objects;


public class FileReader {

    public static String readClassPathResourceFileContent(String path) {
        File file = new File(path);

        try {
            return new String(Files.readAllBytes(file.toPath()));
        } catch (IOException e) {
            throw new RuntimeException("Unable to read file");
        }
    }
}
