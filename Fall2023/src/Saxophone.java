/*
*hey hey hey
*Author:  I am Joshua Cajuste, jcajuste2022@my.fit.edu
* Course:  CSE 1002, Fall 2023
* Project: Saxophone
*
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Saxophone {

   public static void main (final String[] args) {
      // final this final that when are you gonna finally touch some grass style checker
      final Scanner bbbdwltcpafnfbs = new Scanner (System.in, "US-ASCII");
      final HashMap<String, Set<Integer>> dora = new HashMap<String, Set<Integer>>();
      final Integer[] pc = {2, 3, 4, 7, 8, 9, 10};
      final Set<Integer> c = new HashSet<>(Arrays.asList(pc));
      final Integer[] pd = {2, 3, 4, 7, 8, 9};
      final Set<Integer> d = new HashSet<>(Arrays.asList(pd));
      final Integer[] pe = {2, 3, 4, 7, 8};
      final Set<Integer> e = new HashSet<>(Arrays.asList(pe));
      final Integer[] pf = {2, 3, 4, 7};
      final Set<Integer> f = new HashSet<>(Arrays.asList(pf));
      final Integer[] pg = {2, 3, 4};
      final Set<Integer> g = new HashSet<>(Arrays.asList(pg));
      final Integer[] pa = {2, 3};
      final Set<Integer> a = new HashSet<>(Arrays.asList(pa));
      final Integer[] pb = {2};
      final Set<Integer> b = new HashSet<>(Arrays.asList(pb));
      final Integer[] pC = {3};
      final Set<Integer> bC = new HashSet<>(Arrays.asList(pC));
      final Integer[] pD = {1, 2, 3, 4, 7, 8, 9};
      final Set<Integer> bD = new HashSet<>(Arrays.asList(pD));
      final Integer[] pE = {1, 2, 3, 4, 7, 8};
      final Set<Integer> bE = new HashSet<>(Arrays.asList(pE));
      final Integer[] pF = {1, 2, 3, 4, 7};
      final Set<Integer> bF = new HashSet<>(Arrays.asList(pF));
      final Integer[] pG = {1, 2, 3, 4};
      final Set<Integer> bG = new HashSet<>(Arrays.asList(pG));
      final Integer[] pA = {1, 2, 3};
      final Set<Integer> bA = new HashSet<>(Arrays.asList(pA));
      final Integer[] pB = {1, 2};
      final Set<Integer> bB = new HashSet<>(Arrays.asList(pB));
      dora.put("c", c);
      dora.put("d", d);
      dora.put("e", e);
      dora.put("f", f);
      dora.put("g", g);
      dora.put("a", a);
      dora.put("b", b);
      dora.put("C", bC);
      dora.put("D", bD);
      dora.put("E", bE);
      dora.put("F", bF);
      dora.put("G", bG);
      dora.put("A", bA);
      dora.put("B", bB);
      while (bbbdwltcpafnfbs.hasNext()) {
         
         final String babyShark = bbbdwltcpafnfbs.nextLine();
         final String [] mommyShark = babyShark.split("");
         final int [] damn =  new int [10];
         for (int i = 0; i < 10; i++) {
            damn[i] = 0;
         }
         String previous = "";
         String current = "";
         Set<Integer> mybalx = c;
         Set<Integer> imComingforyou = new HashSet<Integer>();
         for (final String i: mommyShark) {
            current  = i;
            if (previous.equals("")) {
               mybalx = dora.get(i);
               for (final Integer drats : mybalx) {
                  damn[drats-1]++;

               }
            } else {
               imComingforyou = dora.get(previous);
               mybalx = dora.get(i);
               // System.out.println("diffc " + diffc);
               // System.out.println("ICFY " + imComingforyou);
               // diffc.removeAll(imComingforyou);
               // System.out.println("AfterDiffc" + diffc);
               for (final Integer bbq : mybalx) {
                  if (!imComingforyou.contains(bbq)) {
                     damn[bbq-1]++;
                  }
                  
               }
            }
            // System.out.println("Before " + previous);
            // System.out.println(dora.get(previous));
            previous = current;
            // System.out.println("After " +previous);
            // System.out.printf("%s %s %s %s %s %s %s %s %s %s%n", 
            // damn[0], damn[1], damn[2], damn[3], 
            // "0", "0", damn[6], damn[7], damn[8], damn[9]);
         }
         // System.out.println(c);
         // System.out.println(d);
         System.out.printf("%s %s %s %s %s %s %s %s %s %s%n", 
                           damn[0], damn[1], damn[2], damn[3], 
                           "0", "0", damn[6], damn[7], damn[8], damn[9]);

      }

      
      bbbdwltcpafnfbs.close();
   }

}
