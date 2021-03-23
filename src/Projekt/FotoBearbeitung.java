package Projekt;

import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class FotoBearbeitung {

    public static void main(String[] args) throws IOException {
        //import Datei
        var pathName = "C:\\Users\\DCV\\Desktop\\";
        var fileName = "halfter1";
        var extention = ".png";

        BufferedImage image = null;

        //datei vorhanden und in Ordnunng
        try {
            image = ImageIO.read(new File(pathName + fileName + extention));
        } catch (IIOException | NullPointerException iioe) {
            System.out.println(iioe.getMessage());
        }

        // use Image 'Filter'
        assert image != null;
        grayScale(image, pathName, fileName, extention);
        whiteToAlpha(image, pathName, fileName, extention);

    }

    static void grayScale(BufferedImage image, String pathName, String fileName, String extention) {
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {


                //getARGB gibt ein int zurück, wir müssen 32bit in 4x8bit Variablen für unsere A R G B Kanäle aufteilen
                //   (Alpha)     (Red)       (Green)     (Blue)
                //[(0000 0000) (0000 0000) (0000 0000) (0000 0000)] <- 32Bit Integer

                int pixel = image.getRGB(x, y);
                int blue = pixel & 0xff;
                int green = (pixel >> 8) & 0xff;//java bitwise - hexadezimalen
                int red = (pixel >> 16) & 0xff;
                int alpha = (pixel >> 24) & 0xff;


               //Um ein Bild auszublenden, müssen wir jedes Pixel auf den Durchschnitt von R G & B (R + G + B) / 3 einstellen
                //Wenn R G & B gleich ist, ist die Farbe Grau (255 255 255 ist gleich Schwarz und 0 0 0 ist gleich Weiß)
                int average = (red + blue + green) / 3;
                int newPixel = 0;
                newPixel = newPixel | average;
                newPixel = newPixel | (average << 8);
                newPixel = newPixel | (average << 16);
                newPixel = newPixel | (alpha << 24);

                image.setRGB(x, y, newPixel);
            }
        }
        saveImage(image, pathName, fileName, extention, "_GrayScaled");
    }

    static void whiteToAlpha(BufferedImage inputImage, String pathName, String fileName, String extention) {
        var image = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(), BufferedImage.TYPE_INT_ARGB);


        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {

                //getARGB returns an int, we need to split 32bit in 4x8bit variables for our A R G B channels
                //   (Alpha)     (Red)       (Green)     (Blue)
                //[(0000 0000) (0000 0000) (0000 0000) (0000 0000)] <- 32Bit Integer

                int pixel = inputImage.getRGB(x, y);
                int blue = pixel & 0xff;
                int green = (pixel >> 8) & 0xff;
                int red = (pixel >> 16) & 0xff;
                int alpha = (pixel >> 24) & 0xff;

                if ((red + blue + green) / 3 > 200 && red > 180 && green > 180 && blue > 180) {
                    alpha = 0;
                }

                int newPixel = 0;
                newPixel = newPixel | blue;
                newPixel = newPixel | (green << 8);
                newPixel = newPixel | (red << 16);
                newPixel = newPixel | (alpha << 24);

                image.setRGB(x, y, newPixel);
            }
        }
        saveImage(image, pathName, fileName, ".png", "_WhiteToAlpha");
    }


    static void saveImage(BufferedImage image, String pathName, String fileName, String extention, String fileNameAddon) {
        //Save Image To File
        try {
            File outputfile = new File(pathName + fileName + fileNameAddon + extention);
            ImageIO.write(image, extention.substring(1), outputfile);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
}

