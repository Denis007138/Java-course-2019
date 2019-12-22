package lesson8;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Main {
    public static void main(String[] args) throws ParseException {
//        String pattern="yyyy/MMMM/dd";
//        SimpleDateFormat SimpleDateFormat=new SimpleDateFormat(pattern);
//        String date=SimpleDateFormat.format(new Date(90,11,14));
//        System.out.println(date);
        String pattern="yyyy-MM-dd";
        SimpleDateFormat SimpleDateFormat=new SimpleDateFormat(pattern);
        Date date= SimpleDateFormat.parse("2018-09-09");
        System.out.println(date);
    }
}
