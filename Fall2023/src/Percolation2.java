import java.util.Random;
import java.util.Scanner;

/******************************************************************************
 *  Compilation:  javac Percolation.java
 *  Execution:    java Percolation < input.txt
 *  Dependencies: StdArrayIO.java StdDraw.java StdOut.java
 *  Data files:   https://introcs.cs.princeton.edu/java/24percolation/test5.txt
 *                https://introcs.cs.princeton.edu/java/24percolation/test8.txt
 *                https://introcs.cs.princeton.edu/java/24percolation/testD.txt
 *                https://introcs.cs.princeton.edu/java/24percolation/testV.txt
 *                https://introcs.cs.princeton.edu/java/24percolation/testT.txt
 *                https://introcs.cs.princeton.edu/java/24percolation/testF.txt
 *                https://introcs.cs.princeton.edu/java/24percolation/testTiny.txt
 *
 *  % more test5.txt
 *  5 5
 *  0 1 1 0 1
 *  0 0 1 1 1
 *  1 1 0 1 1
 *  1 0 0 0 1
 *  0 1 1 1 1
 *
 *  % java Percolation < test5.txt
 *  5 5
 *  0 1 1 0 1
 *  0 0 1 1 1
 *  0 0 0 1 1
 *  0 0 0 0 1
 *  0 1 1 1 1
 *  true
 *
 *  % more testD.txt
 *  8 8
 *  0 0 0 1 1 1 0 1
 *  1 1 1 0 0 1 1 1
 *  1 0 1 0 0 1 0 0
 *  1 0 1 1 1 1 0 1
 *  1 0 0 1 0 1 0 0
 *  1 1 0 1 0 0 1 0
 *  0 1 1 0 0 1 1 1
 *  0 0 1 0 0 0 0 0
 *
 *  % java Percolation < testD.txt
 *  8 8
 *  0 0 0 1 1 1 0 1
 *  1 1 1 0 0 1 1 1
 *  1 0 1 0 0 1 0 0
 *  1 0 1 1 1 1 0 0
 *  1 0 0 1 0 1 0 0
 *  1 1 0 1 0 0 0 0
 *  0 1 1 0 0 0 0 0
 *  0 0 1 0 0 0 0 0
 *  true
 *
 ******************************************************************************/
/*
 * Author: Joshua Cajuste, jcajuste2022@my.fit.edu
 * Course: CSE 1002, Section 7, Spring 2021
 * Project: Percolation
*/
public class Percolation2 {

   private static final Random RNG = new Random (Long.getLong ("seed", System.nanoTime()));
   // given an n-by-n matrix of open sites, return an n-by-n matrix
   // of sites reachable from the top
   public static boolean[][] flow (final boolean[][] isOpen) {
      final int n = isOpen.length;
      final boolean[][] isFull = new boolean[n][n];
      for (int j = 0; j < n; j++) {
         flow(isOpen, isFull, 0, j);
      }
      return isFull;
   }

   // determine set of full sites using depth first search
   public static void flow (final boolean[][] isOpen, 
                            final boolean[][] isFull, 
                            final int i, final int j) {
      final int n = isOpen.length;

      // base cases
      if (i < 0 || i >= n) return;    // invalid row
      if (j < 0 || j >= n) return;    // invalid column
      if (!isOpen[i][j]) return;      // not an open site
      if (isFull[i][j]) return;       // already marked as full

      // mark i-j as full
      isFull[i][j] = true;

      flow(isOpen, isFull, i+1, j);   // down
      flow(isOpen, isFull, i, j+1);   // right
      flow(isOpen, isFull, i, j-1);   // left
   }


   // does the system percolate?
   public static boolean percolates (final boolean[][] isOpen) {
      final int n = isOpen.length;
      final boolean[][] isFull = flow(isOpen);
      for (int j = 0; j < n; j++) {
         if (isFull[n-1][j]) return true;
      }
      return false;
   }

   // why would I need all that ( Ig its to check but like)
   // draw the n-by-n boolean matrix to standard draw
   // public static void show(boolean[][] a, boolean which) {
   //    int n = a.length;
   //    StdDraw.setXscale(-1, n);
   //    StdDraw.setYscale(-1, n);
   //    for (int i = 0; i < n; i++)
   //        for (int j = 0; j < n; j++)
   //            if (a[i][j] == which)
   //                StdDraw.filledSquare(j, n-i-1, 0.5);
   // }
   // like bro i aint showing my work

   // return a random n-by-n boolean matrix, where each entry is
   // true with probability p
   public static boolean[][] random (final int n, final double p) {
      boolean filledup = false;
      if (RNG.nextDouble() > p) {
         filledup = true;
      } 
      final boolean[][] a = new boolean[n][n];
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            a[i][j] = filledup;
         }
      }
      return a;
   }

   public static void parry2 (final int [][] x) {
      for (int i = 0; i < x.length; i++) {
         for (int cup = 0; cup < x[0].length; cup++) {
            System.out.print(x[i][cup] + " ");
         }
         System.out.println();
      }
   }
   public static int [][] trans (final boolean [][] x) {
      final int [][] bolas = new int [x.length][x[0].length];
      for (int i = 0; i < x.length; i++) {
         for (int cup = 0; cup < x[0].length; cup++) {
            if (x[i][cup]) {
               bolas[i][cup] = 1;
            } else {
               bolas[i][cup] = 0;
            }
         }
      }
      return bolas;
   }

   // test client
   public static void main (final String[] args) {

      final Scanner user = new Scanner (System.in, "US-ASCII");
      final int y = user.nextInt();
      final int x = user.nextInt();
      int temp;
      final boolean[][] isOpen = new boolean[y][x];
      for (int i = 0; i < y; i++) {
         for (int j = 0; j < x; j++) {
            temp = user.nextInt();
            if (temp == 1) {
               isOpen[i][j] = true;
            } else {
               isOpen[i][j] = false;
            }
         }
      }

      System.out.print(y + " " + x);
      parry2(trans(flow(isOpen)));
        
      System.out.println(percolates(isOpen));

      user.close();
   }
}
