import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

public class test {
    public static void main(String[] args) throws Exception {
        String date = "MAY 1 2013";
        SimpleDateFormat format = new SimpleDateFormat("MMM d yyyy", Locale.ENGLISH);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(format.parse(date));
        int day = calendar.get(Calendar.DAY_OF_YEAR);
        if (day % 2 == 0) day = 0; else day = 1;

        System.out.println(day);
    }
}