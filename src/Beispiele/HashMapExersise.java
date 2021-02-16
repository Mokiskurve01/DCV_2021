package Beispiele;

import java.util.HashMap;


public class HashMapExersise {
    /*public static void main(String[] args) {

        HashMap<String, Integer> happy = new HashMap<String, Integer>();
        happy.put("a", 10);
        happy.put("b", 3);
        happy.put("c", 88);
        System.out.println(happy);
    }
     */
    public static void main(String[] args) {
        HashMap<String,String> fun=new HashMap<String,String>();
        fun.put("blablabla@gmx.at","BaluerHimmel");
        fun.put("123@hotmail.de","zyx");
        fun.put("huihuihui@gmail.com","DunkleNacht");
        System.out.println(fun.containsValue("zyx"));//prüfung des passwort
        System.out.println(fun);//alles
        System.out.println("-------------------------");
        System.out.println(fun.keySet());//key(z.b.-e mail)
        System.out.println("-------------------------");
        System.out.println(fun.entrySet());
        System.out.println("-------------------------");
        fun.replace("huihuihui@gmail.com","ABC");//value geändert
        System.out.println(fun);



    }
}
