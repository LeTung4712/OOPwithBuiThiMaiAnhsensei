package hust.soict.hedspi.test.utils;
import java.text.ParseException;
import java.util.Scanner;

import hust.soict.hedspi.aims.utils.DateUtils;
import hust.soict.hedspi.aims.utils.MyDate;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        //MyDate date1 = new MyDate();
        //date1.date2.printDate(choiceNumber); //February 18th 2019
        //date1.print();

        MyDate date2 = new MyDate("second", "february", "thirty oh one");
        DateUtils date3 = new DateUtils();

        date2.print();		//print current date
        System.out.println("*********************************************");
        
        date3.compareDate("2020-12-12", "2021-12-12");
        //yyyy-MM-dd
        date3.upperSortDate("2013-12-12", "2020-1-10", "2019-12-14", "2021-2-11", "2021-10-09");

        System.out.println("*********************************************"); 
        
        int choiceNumber;
        Scanner scanner = new Scanner(System.in);
        try {
            for (;;) {
                System.out.print(
                        "\n|------------Menu------------\n" +
                                "|1. YYYY-MM-dd \n" +
                                "|2. d/M/yyyy \n" +
                                "|3. dd-MMM-yyyy \n" +
                                "|4. MMM d yyyy \n" +
                                "|5. mm-dd-yyyy \n"+
                                "|0. exit\n");

                do {
                    System.out.println("Select the style you want to format: ");
                    choiceNumber = scanner.nextInt();
                } while ((choiceNumber < 0) || (choiceNumber > 5));

                date2.accept(choiceNumber);
            }
        } finally {
            scanner.close();
        }

    }
}