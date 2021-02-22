package VierVerliert;

public class Main {

    public static void main(String[] args) {
        Field field = new Field();
        Position position = new Position();
        Logic logic = new Logic();
        field.resetField();
        for (CellType type : CellType.values()) {
            System.out.println(type + " = " + type.getSym());
        }
        field.printField();
        int i = 0;
        while (i < 100) {//schleife beenen bei logic true
            position.selectPosition();
            field.move(position);
            field.printField();
            if (logic.check(position,field, false)) {
                System.out.println("Sieler"+field.player+"ist der Sieger");
                break;
            }
            i++;
        }
    }
}
