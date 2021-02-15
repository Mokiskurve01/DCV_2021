package project;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;


public class FotoBearbeitung {

    public static void main(String[] args) {

        var pathName = "C:\\Users\\DCV\\Desktop\\";
        var fileName = "halfter4";
        var extention = ".png";

        BufferedImage image = null;
        try {

            image = ImageIO.read(new File(pathName + fileName + extention));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getStackTrace());
        }

        // use Image 'Filter'
        grayScale(image, pathName, fileName, extention);

    }

    static void grayScale(BufferedImage image, String pathName, String fileName, String extention) {

        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {

                //getARGB returns an int, we need to split 32bit in 4x8bit variables for our A R G B channels
                //   (Alpha)     (Red)       (Green)     (Blue)
                //[(0000 0000) (0000 0000) (0000 0000) (0000 0000)] <- 32Bit Integer

                int pixel = image.getRGB(x, y);
                int blue = pixel & 0xff;
                int green = (pixel >> 8) & 0xff;
                int red = (pixel >> 16) & 0xff;
                int alpha = (pixel >> 24) & 0xff;

                //to gray out an image we need to set every pixel to the average of R G & B (R+G+B)/3 when R G & B are equals the color is Gray(255 255 255 equals black and 0 0 0 equals white)
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

