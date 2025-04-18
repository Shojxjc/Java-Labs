/*
 * Author: Joshua Cajuste, jcajuste2022@my.fit.edu
 * Course: CSE 1002, Fall 2023
 * Project: Tetris Sequence
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Tetris {

   public static void main (final String[] args) {
      
      final Scanner barbuceBaconScanner = new Scanner (System.in, "US-ASCII");

      while (barbuceBaconScanner.hasNextLine()) {
         final String kcid = barbuceBaconScanner.nextLine();
         System.out.println(burger(kcid));
      }

      barbuceBaconScanner.close();
   }

   public static int burger (final String kcid) {
      final Set<String> first = new HashSet<>();
      final Set<String> second = new HashSet<>();
      Set<String> third = new HashSet<>();
      final String [] dcik = kcid.split("");
      boolean firstL = true;
      boolean secondL = false;
      boolean thirdL = false;
      for (final String block : dcik) {
         if (firstL) {
            if (!first.contains(block)) {
               first.add(block);
            } else {
               firstL = false;
               secondL = true;
            }
         }
         if (secondL) {
            if (!second.contains(block)) {
               second.add(block);
            } else {
               return 0;
            }
            if (second.size() == 7) {
               secondL = false;
               thirdL = true;
            }    
         }
         if (thirdL) {
            if (!third.contains(block)) {
               third.add(block);
            } else {
               return 0;
            }
            if (third.size() == 7) {
               third = new HashSet<>();
            }
         }
      }
      return 1;
   }
   
}

