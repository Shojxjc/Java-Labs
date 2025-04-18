/*
*hey hey hey
*Author:  Iam Joshua Cajuste, jcajuste2022@my.fit.edu
* Course:  CSE 1002, Fall 2023
* Project: mystery
*
*/
import java.util.Scanner;

public class Knitting {
   public static void main (final String[] args) {

      final Scanner user = new Scanner (System.in, "US-ASCII");
      
      // Takes in th amount of stitches per row, rows
      final int n = user.nextInt();
      final int m = user.nextInt();

      // for knowing how much the pattern changes
      // pattern here is the array
      final int k = user.nextInt();
      final int[] pattern = new int[k];
      for (int i = 0; i < k; i++) {
         // Saves the pattern
         pattern[i] = user.nextInt();
      }

      final int answer = math(n, m, k, pattern);
      System.out.print(answer);
    
      
   }

   // I thought seprating this would make the program look better
   public static int math (final int n, final int m, final int k, final int[] p) {
      // All the math 
      // p is the array, Pattern is the part of the pattern its on
      int st = n;
      int pattern = 0;
      int total = 0;
      for (int i = 0; i < m; i++) {
         total += st; 
         st += p[pattern];
         pattern++;
         // Tells the program when the pattern is restarting
         if (pattern == k) {
            pattern = 0;
         }
      }
      return total;
   }
}
