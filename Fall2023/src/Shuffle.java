/*
*hey hey hey
*Author:  Iam Joshua Cajuste, jcajuste2022@my.fit.edu
* Course:  CSE 1002, Fall 2023
* Project: mystery
*
*/
import java.util.Random;

public class Shuffle {

   private static final Random RNG = new Random (Long.getLong ("seed", System.nanoTime()));

   public static void main (final String[] args) {

      // intalizies multiple variables 
      final int m = Integer.parseInt(args[0]);
      final int n = Integer.parseInt(args[1]);
      int [] j = new int [n];
      final int [][] results = new int [n][n];
      // Intalaizing final output
      for (int i = 0; i < n; i++) {
         for (int k = 0; k < n; k++) {
            results[i][k] = 0;
         }
      }


      for (int i = 0; i < m; i++) {
         // Function that shuffles around the array "Perm" which is now j
         for (int topg = 0; topg < n; topg++) {
            j[topg] = topg;
         }
         j = gamble(j, n);
         for (int k = 0; k < n; k++) {
            // records results
            results[j[k]][k]++; 
         }
      }
      // Print results
      for (int i = 0; i < n; i++) {
         for (int k = 0; k < n; k++) {
            System.out.print(results[i][k] + " ");
         }
         System.out.println("");
      }
   }

   // The shuffling method
   public static int [] gamble (final int [] x, final int n) {
      int temp;
      for (int i = 0; i < n; i++) {
         final int r = i + RNG.nextInt (n-i);
         // Exchange x[i] and x[r]
         temp = x[i];
         x[i] = x[r];
         x[r] = temp;
         // System.out.print(x[i] + " ");
      }
      return x;
   }
}
