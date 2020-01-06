package bowling;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.Objects;

class FileReader {

    static String readClassPathResourceFileContent(String path) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        URL resource = classLoader.getResource(path);

        if (Objects.isNull(resource)) {
            throw new RuntimeException("File doesn't exist");
        }

        File file = new File(resource.getFile());

        try {
            return new String(Files.readAllBytes(file.toPath()));
        } catch (IOException e) {
            throw new RuntimeException("Unable to read file");
        }

    }
}
