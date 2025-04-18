/*
*hey hey hey
*Author:  I am Joshua Cajuste, jcajuste2022@my.fit.edu
* Course:  CSE 1002, Fall 2023
* Project: Hurricane
*bqc
*/

import java.util.Collections;
import java.util.List;

public class Main {

   

   public static void main (final String [] args) throws Exception {
      long stime, etime, total = 0;
      double mariahcarey = 0;
      final int barbeuceBaconBuger = Integer.parseInt(args[0]);

      final Class<?> clazz = Class.forName("java.util.ArrayList");

      @SuppressWarnings("unchecked")

      final java.util.List<Integer> balsMusic = 
            (java.util.List<Integer>) clazz.getDeclaredConstructor().newInstance();

      for (int i = 0; i < barbeuceBaconBuger; i++) {
         balsMusic.add(i);
      }

      for (int i = 0; i < 10; i++) {
         Collections.shuffle(balsMusic);
         stime = System.nanoTime();
         sort(balsMusic);
         etime = System.nanoTime();
         total += etime - stime;
      }

      final int bomb = 1000000000;
      mariahcarey = Long.valueOf(total).doubleValue();
      mariahcarey = mariahcarey/bomb;
      System.out.println(mariahcarey);
   }

   public static void sort (final List<Integer> data) {

      int temp;
      int index = 0;

      for (int i = 0; i < data.size(); i++) {
        /* find the min element in the unsorted data[i, i+1, .., n-1] */
           
         /* assume initially that min is the first element in the range */
         int min = data.get(i);
         index = i;
         for (int j = i + 1; j < data.size(); j++) {
            /* if the 'j'th element is less, then it is the new minimum */
            if (data.get(j) < min) {
               /* found new minimum; remember its index */
               min = data.get(j);
               index = j;
            }
         }
         /* swap data at 'min' with data at 'i' */
         /* ... */
         temp = data.get(i);
         data.set(i, min);
         data.set(index, temp);
      }
   }
}
