package Beispiele;

public class NestedForLoops {
    public static void main(String[] args) {
        String[] colors = {"blue", "Black", "Red"};

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
        System.out.println("-------------------");

        String[][] fancyColers = {{"Yello", "Green", "Orange"},
                {"blue", "Black", "Red"}};
        for (int row = 0; row < 2; row++) {
            for (int colums = 0; colums < 3; colums++) {
                System.out.println(fancyColers[row][colums]);
            }
        }
        System.out.println("-------------------");
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <10 ; j++) {
                System.out.println("i ="+i+","+"j ="+j);
            }

        }
    }
}
