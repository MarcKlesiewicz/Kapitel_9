package Opgave_5;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class TestGregorian {

    public static void main(String[] args) {

        System.out.println(new Date().toString());

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(1234567898765L);

        System.out.println("The year is " + calendar.get(Calendar.YEAR) + ", the month is " + calendar.get(Calendar.MONTH) + " and the day is " + calendar.get(Calendar.DATE));


        
        
    }

}
