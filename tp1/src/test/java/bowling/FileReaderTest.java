package bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void should_read_file_content() {
        String fileContent = FileReader.readClassPathResourceFileContent("score2.csv");

        assertNotNull(fileContent);
    }

    @Test
    void should_throw_runtime_exception_when_file_not_found() {

        RuntimeException exception = assertThrows(RuntimeException.class, () ->
                FileReader.readClassPathResourceFileContent("not_exist")
        );

        assertEquals("File doesn't exist", exception.getMessage());
    }

}
