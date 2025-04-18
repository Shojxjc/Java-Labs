/*
*hey hey hey
*Author:  Iam Joshua Cajuste, jcajuste2022@my.fit.edu
* Course:  CSE 1002, Fall 2023
* Project: mystery
*
*/
import java.util.Scanner;

public class High {
   public static void main (final String[] args) {

      final Scanner user = new Scanner (System.in, "US-ASCII");
      String first = "win";
      String last = "win";
      int score = 6;
      String hfirst = "win";
      String hlast = "win";
      int hscore = 0;
      
      while (user.hasNext()) {
         first = user.next();
         last = user.next();
         score = user.nextInt();

         if (score > hscore) {
            hscore = score;
            hfirst = first;
            hlast = last;
         }

      }
      System.out.printf("%s", hfirst);
      System.out.print(" ");
      System.out.printf("%s", hlast);
      System.out.print(" ");
      System.out.printf("%d", hscore);

   
   }
}