package bowling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

class FileReader {

    static String readClassPathResourceFileContent(String path) {

        File file = new File(path);

        try {
            return new String(Files.readAllBytes(file.toPath()));
        } catch (IOException e) {
            throw new RuntimeException("Unable to read file");
        }

    }
}
