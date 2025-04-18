/*
 * Author: Joshua Cajuste, Jcajuste2022@my.fit.edu
 * Course: CSE 1002, Fall 2023
 * Project: Manatee Games
*/

import java.util.Scanner;

public class Tictactoe {

   public static void main (final String[] args) {
      
      final Scanner user = new Scanner (System.in, "US-ASCII");

      // Barbabuce bacon burger
      // Takes in the game grid
      final String lin1 = user.nextLine();
      final String lin2 = user.nextLine();
      final String lin3 = user.nextLine();
      final String [][] board = new String[3][3];

      // Barbabuce bacon burger
      // Splits up game grid
      final String[] spil1 = lin1.split("");
      final String[] spil2 = lin2.split("");
      final String[] spil3 = lin3.split("");

      // Barbabuce bacon burger
      // Fills in the board with proper input
      for (int i = 0; i < 3; i++) {
         board[0][i] = spil1[i];
      }
      for (int i = 0; i < 3; i++) {
         board[1][i] = spil2[i];
      }
      for (int i = 0; i < 3; i++) {
         board[2][i] = spil3[i];
      }


      // Barbabuce bacon burger
      // Calacutle lates a prints results
      final int sWins = indiv (board);
      doub (board, sWins);
      user.close();
   }

   // Barbabuce bacon burger
   // you reed that wrong
   // functions go brrrrrr
   public static int indiv (final String[][] board) {
      int wins = 0;
   
      // Barbabuce bacon burger
      // Calculates rows (R)
      for (int row = 0; row < 3; row++) {
         if (board[row][0].equals(board[row][1]) && board[row][0].equals(board[row][2])) {
            wins++;
         }
      }
      // Barbabuce bacon burger
      // Calaculates col
      for (int col = 0; col < 3; col++) {
         if (board[0][col].equals(board[1][col]) && board[0][col].equals(board[2][col])) {
            wins++;
         }
      }
      // Barbabuce bacon burger
      if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])) {
         wins++;
      }
      if (board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0])) {
         wins++;
      }
   
      // Returns wins and stuff
      System.out.println(wins);
      return wins;
   }

   // Barbabuce bacon burger
   // next one
   public static void doub (final String[][] board, final int x) {
      int dwins = 0;
      // Barbabuce bacon burger
      // same as above
      for (int row = 0; row < 3; row++) {
         if (board[row][0].equals(board[row][1]) || (board[row][0].equals(board[row][2]))
               || (board[row][1].equals(board[row][2]))) {
            dwins++;
         }
      }
      // Barbabuce bacon burger
      for (int col = 0; col < 3; col++) {
         if (board[0][col].equals(board[1][col]) || board[0][col].equals(board[2][col])
               || (board[1][col].equals(board[2][col]))) {
            dwins++;
         }
      }
      // Barbabuce bacon burger
      if (board[0][0].equals(board[1][1]) || board[0][0].equals(board[2][2])
            || (board[1][1].equals(board[2][2]))) {
         dwins++;
      }
      if (board[0][2].equals(board[1][1]) || board[0][2].equals(board[2][0]) 
            || (board[1][1].equals(board[2][0]))) {
         dwins++;
      }

      // I dont need reuturn Dwins cz Barbabvue bacon burger
      System.out.println(dwins - x);
   }
































































   


   // System.out.print(YourHomeAddress);
}
