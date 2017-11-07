package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Isaac
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        Date now = new Date();
        Calendar now2 = Calendar.getInstance();
        //GregorianCalendar now3 = new GregorianCalendar();    
        Date now3 = now2.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyy");
        
        //Convert Date to String
        String fmtDate = sdf.format(now3);
        System.out.println(fmtDate);
        
        //Convert String to Date
        String inputDate = "1/1/2000";
        Date date = sdf.parse(inputDate);        
        now2.setTime(date);
        
        Calendar now4 = Calendar.getInstance();
        now4.set(2019, Calendar.APRIL, 1);
        now4.set(2000, Calendar.APRIL, 1);
        now4.add(Calendar.YEAR, 10);
        now4.add(Calendar.YEAR, -10);
        now4.add(Calendar.MONTH, 10);
        now4.getActualMaximum(Calendar.DATE);
        
        Calendar start = Calendar.getInstance();
        start.set(2000, 1, 1);
        Calendar end = Calendar.getInstance();
        
        long startMs = start.getTimeInMillis();
        long endMs = end.getTimeInMillis();
        long diffMs = endMs - startMs;
        
        long hour = 1000 * 60 * 60;
        
        long hours = diffMs / hour;
        
        Locale loc = new Locale("de", "DE");       
        TimeZone tz = TimeZone.getTimeZone("Europe/Berlin)");
        Calendar cal = Calendar.getInstance(tz, loc);
        System.out.println(cal);
    }
}