/*
 * Author: Joshua Cajuste, Jcajuste2022@my.fit.edu
 * Course: CSE 1002, Section 7, Spring 2021
 * Project: Lost at Sea
*/

import java.util.ArrayList;
import java.util.Scanner;

public class MainManatee {

   record Watchout (int y, int x) {
   }
   public static void main (final String[] args) {

      // intalizing The scanner, list of dangers, max & min and manatee
      final Scanner user = new Scanner (System.in, "US-ASCII");
      final ArrayList<Watchout> dangers = new ArrayList<>();
      final int dangerAmount = user.nextInt();
      final int min = -10000;
      final int max = 10000;
      final Manatee yourHere = new Manatee(0, 0);
      // a Mystery mouse ka tool for later 
      boolean end = false;
      // places danger spots
      for (int i = 0; i < dangerAmount; i++) {
         final int x = user.nextInt();
         final int y = user.nextInt();
         final Watchout orpn = new Watchout(y, x);
         dangers.add(orpn);
         if (x == 0 && y == 0) {
            end = true;
         }
      }

      // remeber that mystery mouse ka tool
      while (user.hasNext()) {
         if (end) {
            System.out.println("The end");
            break;
         }
         // takes in the commands and splits into actions
         final String move = user.nextLine().toUpperCase();
         final String [] ps4 = move.split("");      
         for (final String word : ps4) {
            yourHere.move(word);
            // condinatonals
            for (final Watchout watchout : dangers) {
               if (yourHere.getyLoc() == watchout.y && yourHere.getxLoc() == watchout.x) {
                  end = true;
                  System.out.println("The end");
                  break;
               }
            }
            if (end) {
               break;
            }
            if (yourHere.getyLoc() == 0 && yourHere.getxLoc() == -1) {
               end = true;
               System.out.println("Home at last");
               break;
            }
            if (yourHere.getyLoc() >= max ||  yourHere.getyLoc() <= min 
                  || yourHere.getxLoc() >= max) {
               end = true;
               System.out.println("Terra incognita");
               break;
            }
            if (yourHere.getxLoc() <= -1) {
               end = true;
               System.out.println("Beached");
               break;
            }
         }
      }
         
      if (!end) {
         System.out.println("Lost at sea ");
      }


      user.close(); 
   }
}
// barbecue bacon burger
// barbecue bacon burger
// barbecue bacon burger
// barbecue bacon burger

// barbecue bacon burger
// barbecue bacon burger
// barbecue bacon burger
// barbecue bacon burger
// barbecue bacon burger

// barbecue bacon burger
// barbecue bacon burger
// barbecue bacon burger
// barbecue bacon burger
// barbecue bacon burger
