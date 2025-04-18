import java.util.ArrayDeque;
import java.util.Random;
/*
*hey hey hey
*Author:  I am Joshua Cajuste, jcajuste2022@my.fit.edu
* Course:  CSE 1002, Fall 2023
* Project: Guitar
*
*/
public class GuitarString {

   // variable stuff
   final  ArrayDeque<Double> bbqbaconArray = new ArrayDeque<Double>();
   private static final Random RNG = new Random (Long.getLong ("seed", System.nanoTime()));
   int sizel;

   // barbecue
   GuitarString (final double frequency) {
      final double ferq = 440;
      final double frequencity = ferq * Math.pow(2.0, frequency / 12.0);
      final int size = (int) (44100 / frequencity);   
      sizel = size;   
   }

   // bacon 
   void pluck () {
      bbqbaconArray.clear();
      for (int i = 0; i < sizel; i++) {
         final double expectmesoon = RNG.nextDouble() - 0.5f;
         bbqbaconArray.add(expectmesoon);
      }

   }

   // burger
   void tic () {
      // saves first deletes first takes first agian = getting second
      final Double first = bbqbaconArray.getFirst();
      bbqbaconArray.removeFirst();
      final Double second = bbqbaconArray.getFirst();
      Double av = (first + second)/2;
      // idk why i have to multiply it by 0.99 but it works
      final double magicisstupid = 0.99;
      av = av * magicisstupid;
      bbqbaconArray.addLast(av);
   }

   double sample () {
      return bbqbaconArray.getFirst();
   }

}
