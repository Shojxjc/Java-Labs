/*
*hey hey hey
*Author:  I am Joshua Cajuste, jcajuste2022@my.fit.edu
* Course:  CSE 1002, Fall 2023
* Project: Josephus
*
*/

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Josephus {


   public static void main(String[] args) throws Exception{

      final Scanner user = new Scanner (System.in, "US-ASCII");
      long stime, etime, total = 0;

      final Class<?> clazz = Class.forName("java.util.ArrayList");

      @SuppressWarnings("unchecked")

      final java.util.List<String> barbecueBaconBuger = 
            (java.util.List<String>) clazz.getDeclaredConstructor().newInstance();
      while (user.hasNext()) {
         barbecueBaconBuger.add(user.next());
      }

         
      final int barbcueBaconpoggywoggy = Integer.parseInt(args[0]);
      stime = System.nanoTime();
      System.out.print("The last solider : " + bibleishit(barbecueBaconBuger, barbcueBaconpoggywoggy) + " ");
      etime = System.nanoTime();
      total += etime - stime;

      final int bomb = 1000000000;
      double mariahcarey = Long.valueOf(total).doubleValue();
      mariahcarey = mariahcarey/bomb;
      System.out.print("time taken : " + mariahcarey);

      user.close();
   }

   public static String bibleishit (final List<String> kys, final int bqc) {

      int josh = 0;
      

      while (kys.size() > 1) {

         ListIterator<String> listIterator = kys.listIterator();

         listIterator.next();
         if (josh != bqc) {
            josh++;
         } else {
            josh = 0;
            listIterator.remove();
         }
      }
      return kys.get(0);
   }
}
