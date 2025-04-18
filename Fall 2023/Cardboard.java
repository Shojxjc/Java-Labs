/*
*hey hey hey
*Author:  Iam Joshua Cajuste, jcajuste2022@my.fit.edu
* Course:  CSE 1002, Fall 2023
* Project: Cardboard
*
*/
import java.util.Scanner;

public class container {
   public static void main (final String[] args) {

      final Scanner user = new Scanner (System.in, "US-ASCII");
      final int volume = user.nextInt();
      final int [] d = new int[3];
      final int same = 0; 
      int sa = 0;

      for (int length = 1; length <= volume; length++) {
         if (volume % length == 0) { 
            for (int height = 1; height <= volume; height++) {
               if (volume % length == 0) { 
                  for (int width = 1; width <= volume; width++) {
                     if (length * height * width == volume) {
                        d [0] = length;
                        d [1] = width;
                        d [2] = height;
                        System.out.println(d[0] + " " + d[1] + " " + d[2]);
                        sa = 2*((d[0]*d[1]) + (d[0]*d[2]) + (d[1]*d[2]));
                        System.out.println(sa);
                        break;
                     }
                  }
               }
            }
         }
      }


      sa = 2*((d[0]*d[1]) + (d[0]*d[2]) + (d[1]*d[2]));
      System.out.println(sa);
   }
}
