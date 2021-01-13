package Objekt;

public class Objekt {

    public static void main(String[] args) {
        // Objekte sind Instanzen von Klassen und exisitieren zur Laufzeit
        Child maria = new Child("Maria");//Objekt wird mit dem new Operater erzeugt
        Child franz = new Child("Franz");//Instanzvariablen werden über die Klasse Konstruktor zugewiesen
        Child claudia = new Child("Claudia");
        maria.setBestFriend(franz);//über .Setmethode in der Klasse wird dem Objekt best friend zugewiesen
        franz.setBestFriend(claudia);//
        //claudia.setBestFriend(maria);

        Schoolroom schoolroom = new Schoolroom();// new Objekt Vector wird erst in der Klasse erzeugt
        schoolroom.addChild(maria);//über addChild methode wird in der Klasse Schoolroom Objekt der Vectorliste angefügt
        schoolroom.addChild(franz);
        schoolroom.addChild(claudia);

        Ball blueBall = new Ball("blue");
        Ball redBall = new Ball("red");

        ToyBox ballBox = new ToyBox();
        ballBox.addBall(blueBall);
        ballBox.addBall(redBall);

        franz.playWithBall(redBall);//über das Objekt franz wird in der Klasse Child die methode playWithBall aufgerufen
        System.out.println(franz.toString());
        System.out.println(ballBox.toString());
        System.out.println(schoolroom.toString());
    }
}
