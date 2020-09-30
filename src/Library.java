import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the returned date");
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("Enter the due date");
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        int fine;
        if(y2 == y1 || y1 < y2){
            if(m2 == m1 || m1 < m2){
                if(d2 == d1 || d1 < d2){
                    fine = 0;
                }
                else
                    fine = (d1 - d2) * 15;
            }
            else
                fine = (m1 - m2) * 500;
        }
        else
            fine = 10000;
       String date1=Integer.toString(y2)+"-"+Integer.toString(m2)+"-"+Integer.toString(d2);
       String date2=Integer.toString(y1)+"-"+Integer.toString(m1)+"-"+Integer.toString(d1);
//        System.out.println(date1);
//        System.out.println(date2);
//        LocalDate dateBefore = LocalDate.parse(date1);
//        LocalDate dateAfter = LocalDate.parse(date2);
//        long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
//        System.out.println(noOfDaysBetween);
        System.out.println("Your Fine after Calculation is $"+fine);


    }
}