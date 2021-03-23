package Projekt;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class FotoBearbeitung2 {

    public static BufferedImage img;

    public static void main(String[] args) {
        //import Datei



        readImage();
        changeColor(-1,0);
        writeImage();
    }

    public static void readImage() {
        var pathName = "C:\\Users\\DCV\\Desktop\\";
        var fileName = "halfter2";
        var extention = ".png";

        img = null;

        try {
            img = ImageIO.read(new File(pathName + fileName + extention));;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void changeColor(int a, int b) {




    }

    public static void writeImage(){
        File output = new File("C:\\Users\\DCV\\IdeaProjects\\DCV_2021\\src\\halfter1Change.png");
        try {
            ImageIO.write(img,"png",output);
            System.out.println("Image write complete");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
