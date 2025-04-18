/*
*hey hey hey
*Author:  Iam Joshua Cajuste, jcajuste2022@my.fit.edu
* Course:  CSE 1002, Fall 2023
* Project: Cardboard
*
*/
import java.util.Scanner;

public class Container {
   public static void main (final String[] args) {

      final Scanner user = new Scanner (System.in, "US-ASCII");
      // takes in the volume
      final int volume = user.nextInt();
      // A mystery mouse ka tool for surface area
      final int [] d = new int[3];
      final int same = 0;
      int tempsa = 0; 
      int sa = 0;

      
      for (int length = 1; length <= Math.cbrt(volume); length++) {
         if (volume % length == 0) { 
            for (int width = 1; width <= volume; width++) {
               if (width*length == volume) {
                  d [0] = length;
                  d [1] = width;
                  d [2] = 1;
                  tempsa = 2*((d[0]*d[1]) + (d[0]*d[2]) + (d[1]*d[2]));
                  if (tempsa < sa || sa == 0) {
                     sa = tempsa;
                  }
                  // System.out.println(d[0] + " " + d[1] + " " + d[2]);
                  // System.out.println(tempsa);
                  // System.out.println(sa);
                  break;
               }
               if (volume % length == 0) { 
                  for (int height = 1; height <= volume; height++) {
                     if (length * height * width == volume) {
                        d [0] = length;
                        d [1] = width;
                        d [2] = height;
                        tempsa = 2*((d[0]*d[1]) + (d[0]*d[2]) + (d[1]*d[2]));
                        if (tempsa < sa || sa == 0) {
                           sa = tempsa;
                        }
                        // System.out.println(d[0] + " " + d[1] + " " + d[2]);
                        // System.out.println(tempsa);
                        // System.out.println(sa);
                     }
                  }
               }
            }
         }
      }

      System.out.println(sa);
   }
}
