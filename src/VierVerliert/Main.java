package VierVerliert;

public class Main {


    public static void main(String[] args) {
        Field field = new Field();
        Position position = new Position();
        field.resetField();
        for (CellType type : CellType.values()) {
            System.out.println(type + " = " + type.getSym());
        }
        field.printField();
        int i=0;
        while (i < 7){
            position.selectPosition();
            field.move(position);
            field.printField();
            i++;
        }

    }
}
