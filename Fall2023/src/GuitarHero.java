/*
*hey hey hey
*Author:  I am Joshua Cajuste, jcajuste2022@my.fit.edu
* Course:  CSE 1002, Fall 2023
* Project: Guitar
*
*/
import java.util.Scanner;

public class GuitarHero {

   public static void main (final String[] args) {

      final Scanner barbecuebacnonburger = new Scanner (System.in, "US-ASCII");

      while (barbecuebacnonburger.hasNext()) {
         // takes in freq and duration
         final double bbquh = barbecuebacnonburger.nextDouble();
         final double duration = barbecuebacnonburger.nextDouble();
         final GuitarString uhhhh = new GuitarString(bbquh);
         // 440 Hz for 1 sec
         final double freq = 440.0;
         final int  iHateMagis = 35000;
         uhhhh.pluck();
         // barbecue bacon burger barbecue bacon burger
         for (int i = 0; i <= iHateMagis*duration; i++) {
            MyAudio.play(uhhhh.sample());
            uhhhh.tic();
            // poggy woggy barbecue bacon pog burger
         }

      }

      barbecuebacnonburger.close();
   }      
}


