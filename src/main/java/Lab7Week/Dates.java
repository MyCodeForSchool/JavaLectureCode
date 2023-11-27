package Lab7Week;

import java.util.Date;

public class Dates {
    public static void main(String[] args) {

        Date now = new Date();
        System.out.println(now);

        //number of milliseconds since midnight January 1, 1970 UTC

        System.out.println(now.getTime());

        long milliseconds = now.getTime();
        System.out.println(milliseconds);

        Date dateFromTime = new Date(milliseconds);

        long numberOfMilliseconds = 1234562378765L;
        Date date2009 = new Date (numberOfMilliseconds);
        System.out.println(date2009);

        if (date2009.before(now)) {
            System.out.println("2009 is earlier than now");
        }




    }
}
