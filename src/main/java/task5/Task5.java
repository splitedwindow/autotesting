package task5;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Task5 {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File inputJson = new File("src/main/resources/task5/input.json");
            File outputJson = new File("src/main/resources/task5/output.json");

            ColorPalette colorPalette =
                    objectMapper.readValue(Files.readString(inputJson.getAbsoluteFile().toPath()), ColorPalette.class);
            System.out.println(colorPalette);
            colorPalette.isPrimary = false;

            objectMapper.writeValue(outputJson, colorPalette);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
