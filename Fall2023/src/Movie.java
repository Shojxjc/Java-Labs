/*
*hey hey hey
*Author:  I am Joshua Cajuste, jcajuste2022@my.fit.edu
* Course:  CSE 1002, Fall 2023
* Project: Elect
*
*/

// imports
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Movie {
   // my records
   record Bnp(int index, int round1, int round2) { 
   }
   public static void main (final String [] args) {

      // intalizes arraylist and scanner
      final Scanner iCanHearYou = new Scanner (System.in, "US-ASCII");
      final ArrayList<Bnp> n177013 = new ArrayList<Bnp>();
      final ArrayList<Bnp> n150309 = new ArrayList<Bnp>();

      // Takes in N & K
      final int aOM = iCanHearYou.nextInt();
      final int nOW = iCanHearYou.nextInt();

      for (int i = 0; i < aOM; i++) {
         // Takes in first and second round votes
         final int temp = iCanHearYou.nextInt();
         final int temp2 = iCanHearYou.nextInt();

         final Bnp lookBehindyou = new Bnp(i+1, temp, temp2);
         n177013.add(lookBehindyou);
         
      }

      // sorts first round
      Collections.sort (n177013, Comparator.comparing 
            (Bnp::round1, Comparator.reverseOrder()));
      for (int i = 0; i < nOW; i++) {
         // takes in the first set of winners
         n150309.add(n177013.get(i));
      }
      // sorts second round
      Collections.sort (n150309, Comparator.comparing 
            (Bnp::round2, Comparator.reverseOrder()).thenComparing(Bnp::index));



      // youll never catch me doing printf again
      System.out.print(n150309.get(0).index);
      System.out.print(" ");
      System.out.print(n150309.get(n150309.size()-1).index);

      iCanHearYou.close();
   } 
}
