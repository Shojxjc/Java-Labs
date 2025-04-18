/*
Author: Joshua Cajuste
Email: jcajuste2022@my.fit.edu
Course: data strucutures
Section: 23
Description of this file: does a thingy were we make the tron game and runs once
*/

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class HW6 {

   public static void main (String [] args) throws IOException {

      // takes in user input
      final Path uri = Paths.get(args[0]);
      final Scanner fie = new Scanner (uri, "US-ASCII");
      final Scanner user = new Scanner (System.in, "US-ASCII");

      // intalize board
      String bsize = fie.nextLine();
      String [] bsize2 = bsize.split(" ");
      int bysize = Integer.parseInt(bsize2[0]);
      int bxsize = Integer.parseInt(bsize2[1]);
      char [][] board = new char[bysize][bxsize]; 
      int level = 0;
      while (fie.hasNextLine()) {

         String bbb = fie.nextLine();
         for (int i = 0; i < bbb.length(); i++) {
            // the magix
            board[level][i] = bbb.charAt(i);
         }
         level++;
      }
      Board game = new Board(board);
      game.printBoard();
      // System.out.println("Player is at (" + playerX + "," + playerY + ")");
      System.out.print("Please eneter your next move [u(p), d(own), l(eft), r(ight) :");
      fie.close();
      // does theone move thingy
         String bbqbb = user.next().toUpperCase();
         switch (bbqbb) {
            case "U":
               game.never();
               game.advancegamestate();
               break;
            case "D":
               game.soggy();
               game.advancegamestate();               
               break;
            case "L":
               game.waffles();
               game.advancegamestate();
               
               break;
            case "R":
               game.eat();
               game.advancegamestate();
               
               break;
            default:
               System.out.print("womp womp");
               break;
         }
         System.out.println();

   }

}
