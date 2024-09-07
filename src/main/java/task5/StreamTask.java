package task5;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;

import static java.util.stream.IntStream.range;

public class StreamTask {

    public static void main(String[] args) {
        Random random = new Random();
        int n = 10;
        if(args.length > 0)
        {
            n = Integer.parseInt(args[0]);
        }


        List<ColorPalette> inputList = range(1, 10).mapToObj(i -> {
            ColorPalette colorPalette = new ColorPalette();
            Rgb rgb = new Rgb();

            rgb.setR(random.nextInt(0, 255));
            rgb.setG(random.nextInt(0, 255));
            rgb.setB(random.nextInt(0, 255));

            colorPalette.setRgb(rgb);
            colorPalette.setIsPrimary(random.nextBoolean());

            String colorString = UUID.randomUUID().toString().substring(0, 10);
            String colorString2 = UUID.randomUUID().toString().substring(0, 10);
            List<String> colors = List.of(colorString, colorString2);

            colorPalette.setColors(colors);


            return colorPalette;
        }).collect(Collectors.toList());

        inputList.forEach(System.out::println);

        System.out.println();
        
        List<ColorPalette> outputList = inputList.stream()
                .sorted(Comparator.comparing(ColorPalette::getIsPrimary))
                .sorted(Comparator.comparing(
                        cp -> cp.getRgb().getR()))
                .filter(item -> {
                    return item.getColors().get(0).contains("a");
                })
                .collect(Collectors.toList());

        System.out.println(outputList);
    }
}
