package Projekt;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Pixel {
    BufferedImage image;
    int width;
    int height;

    public Pixel() {
        try {
            File input = new File("C:\\Users\\DCV\\Desktop\\html.png");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();

            int count = 0;
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < width; y++) {
                    count++;
                    Color c = new Color(image.getRGB(x, y));
                    System.out.println("Pixel Anzahl: " + count +
                            " Red: " + c.getRed() +
                            " Green: " + c.getGreen() +
                            " Blue: " + c.getBlue());
                }
            }
        } catch (Exception e) {
        }
    }
    static public void main(String args[]) throws Exception {
        Pixel obj = new Pixel();
    }

}
