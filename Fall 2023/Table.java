/*
*hey hey hey
*Author:  Joshua Cajuste
* Course:  CSE 1002, Fall 2023
* Project: Table
*
*/
import java.time.Month;
import java.util.Locale;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.TextStyle;


public final class Table {
   public static void main (final String[] args) {
      // args[] is an array of strings. If we want to use the value,
      // we have to convert it from string to int
      final int n = Integer.parseInt (args[0]);

      // print your value
      final int loopline = 64;
      System.out.printf ("Your argument is %1$d, the program will print %1$d lines%n", n);
      System.out.printf("%9s%9s%9s%9s%9s%9s%9s%n", "i", "hex", "bits", "log2i*i", "i*i", "i*i*i", "pcnt");
      for (int loop = 1; loop <= loopline; loop++) {
         System.out.print("_");
      }
      System.out.println(" ");
      double templogvar;
      double templogvar2;
      final LocalDate rawdate = LocalDate.now();
      final int numday = rawdate.getDayOfMonth();
      final int year = rawdate.getYear();
      final Locale spanish = new Locale("es");
      final Month month = rawdate.getMonth();
      final DayOfWeek day = rawdate.getDayOfWeek();
      final String sMonth = month.getDisplayName(TextStyle.FULL, spanish);
      final String sDay = day.getDisplayName(TextStyle.FULL, spanish);

      // the number of loops is the number of your input argument.
      for (int i = 1; i <= n; i++) {
         System.out.printf("%9d ", i);
         System.out.printf("0x%06d", i);

         templogvar = Math.log(i)/ Math.log(2);
         templogvar2 = Math.log(i*i)/ Math.log(2);
         System.out.printf("%9d", (int) (Math.ceil(templogvar)));
         System.out.printf("%9.2f", templogvar2);

         System.out.printf("%9d", i*i);
         System.out.printf("%9d", i*i*i);
         System.out.printf("%9d%%%n", i*100/n);
      }
      for (int loop = 1; loop <= loopline; loop++) {
         System.out.print("_");
      }
      System.out.printf("%n%31s, %d %s %d", sDay, numday, sMonth, year);
   }
}