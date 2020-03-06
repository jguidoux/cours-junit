package bowling;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.Objects;

class FileReader {

    static String readClassPathResourceFileContent(String path) {

        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        try {
            URL url = classLoader.getResource(path);
            if (Objects.isNull(url)) {
                throw new RuntimeException("Unable to read file");
            }

            File file = new File(url.getFile());
            return new String(Files.readAllBytes(file.toPath()));
        } catch (IOException e) {
            throw new RuntimeException("Unable to read file");
        }

    }
}
