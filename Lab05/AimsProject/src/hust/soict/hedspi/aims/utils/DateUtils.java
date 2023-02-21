package hust.soict.hedspi.aims.utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public DateUtils(){}
    public void compareDate(String d1, String d2) throws ParseException {
        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdFormat.parse(d1);
        Date date2 = sdFormat.parse(d2);
        if (date1.compareTo(date2) > 0) {
            System.out.println("Date 1 occurs after Date 2");
        } else if (date1.compareTo(date2) < 0) {
            System.out.println("Date 1 occurs before Date 2");
        } else if(date1.compareTo(date2) == 0) {
            System.out.println("Both dates are equal");
        }
    }
    //Before to after
    public void upperSortDate(String... List) throws ParseException {
        int dem=0;
        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date[] date = new Date[List.length];
        for (String dateList : List) {
            date[dem] = sdFormat.parse(dateList);
            dem++;
        }
        for (int i = 0; i < List.length - 1; i++) {
            for (int j = i + 1; j < List.length; j++) {
                if(date[i].compareTo(date[j]) > 0) {
                    Date dateTmp = date[i];
                    date[i] = date[j];
                    date[j] = dateTmp;
                    String tmp = List[i];
                    List[i] = List[j];
                    List[j] = tmp;
                }
            }
        }
        for (int i = 0; i < List.length; i++) {
            System.out.println(List[i] + " ");
        }
    }
}