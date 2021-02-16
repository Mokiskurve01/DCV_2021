package Beispiele;


/***
 * https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {
    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println(currentDate);
        SimpleDateFormat timeFormat=new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeFormat.format(currentDate));

        SimpleDateFormat dayFormat=new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dayFormat.format(currentDate));

        SimpleDateFormat dayOfDayWeek=new SimpleDateFormat("EEEE");
        System.out.println(dayOfDayWeek.format(currentDate));

        SimpleDateFormat clockFormat=new SimpleDateFormat("h:mm a");
        System.out.println(clockFormat.format(currentDate));
    }
}
