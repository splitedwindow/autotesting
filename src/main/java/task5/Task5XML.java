package task5;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Task5XML {
    public static void main(String[] args) {
        File inputXML = new File("src/main/resources/task5/input.xml");
        File outputXML = new File("src/main/resources/task5/output.xml");

        XmlMapper xmlMapper = new XmlMapper();
        try {
            ColorPalette colorPalette = xmlMapper.readValue(Files.readString(inputXML.getAbsoluteFile().toPath()), ColorPalette.class);
            System.out.println(colorPalette);

            List<String> colors =  colorPalette.getColors();
            colors.add("purple");
            colorPalette.setColors(colors);

            xmlMapper.writeValue(outputXML, colorPalette);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

