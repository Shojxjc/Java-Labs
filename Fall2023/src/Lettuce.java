/*
 * Author: Joshua Cajuste, Jcajuste2022@my.fit.edu
 * Course: CSE 1002, Fall 2023
 * Project: Fast Food Finder
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Lettuce {

   record Stores(String name, String modName, int price) {
   }

   public static void main (final String [] args) {

      final Scanner lookOut = new Scanner (System.in, "US-ASCII");
      final int n = lookOut.nextInt();
      int budget = lookOut.nextInt();
      final ArrayList<Stores> lmaoz = new ArrayList<Stores>();

      for (int i = 0; i <= n; i++) {
         final String n177013 = lookOut.nextLine();
         final String [] metamorphosis = n177013.split(",\\s+");
         if (metamorphosis.length > 1) {
            final String nameInput = metamorphosis[0];
            final String modNameInput = metamorphosis[0].toUpperCase();
            final int priceInput = Integer.parseInt(metamorphosis[1]);
            final Stores n420173 = new Stores(nameInput, modNameInput, priceInput);
            lmaoz.add(n420173);
         }
      }

      Collections.sort (lmaoz, Comparator.comparing 
            (Stores::price).thenComparing(Stores::modName));
      System.out.println(lmaoz);
      int count = 0;
      for (final Stores stores : lmaoz) {
         if (budget >= stores.price) {
            budget -= stores.price;
            System.out.printf("%s @ $%s %n", stores.name, stores.price);
            count++;
         } else {
            break;
         }
      }

      System.out.printf("%s with $%s left over", count, budget);
      lookOut.close();
   }
}
   
