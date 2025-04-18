/*
*hey hey hey
*Author:  Iam Joshua Cajuste, jcajuste2022@my.fit.edu
* Course:  CSE 1002, Fall 2023
* Project: Fun with Hyperscyloids
*
*/


public class Spirograph {
   public static void main (final String[] args) {
      
      final double big = Double.parseDouble(args[0]);
      double small = Double.parseDouble(args[1]);
      final double penOff = Double.parseDouble(args[2]);
      final double zpo = 0.01;
      final double ihatethis = 0.05;
      final int hunforfive = 145;
      final double threezz = 300;
      final double nthreezz = -300;
      final int fivehun = 500;
      final int thousand = 1000;

      final double x = 0.5, y = 0.5;   // center of square
      final double size = 0.5;   // side length of square
      
      // plot a square, centered on (x,y) of the given side length
      // This will make set the cnavas size and make the background black
      StdDraw.setCanvasSize(fivehun, fivehun);
      StdDraw.setXscale(nthreezz, threezz);
      StdDraw.setYscale(nthreezz, threezz);
      StdDraw.setPenColor (StdDraw.BLACK);
      StdDraw.filledSquare (x, y, fivehun);

      StdDraw.setPenRadius(zpo);
      StdDraw.setPenColor(StdDraw.RED);

      int ginyu = 0;
      int changenow = 0;

      for (double jermanecole = 0.0; jermanecole < thousand; jermanecole += ihatethis) {
         if (small == 0) {
            small = zpo; // avoid mathmical error
         } 
         // equation 1
         final double pointx = (big + small) * Math.cos(jermanecole) - (small + penOff) * Math.cos(((big + small) / small) * jermanecole);
         // equation 2
         final double pointy = (big + small) * Math.sin(jermanecole) - (small + penOff) * Math.sin(((big + small) / small) * jermanecole);
         
         // does haha funny funny switch colorrs
         changenow++;
         if (changenow % hunforfive == 0) {
            switch (ginyu) {
            case 0:
               StdDraw.setPenColor(StdDraw.RED);
               ginyu++;
               break;
            case 1:
               StdDraw.setPenColor(StdDraw.BLUE);
               ginyu++;
               break;
            case 2:
               StdDraw.setPenColor(StdDraw.GREEN);
               ginyu++;
               break;
            default:
               StdDraw.setPenColor(StdDraw.YELLOW);
               ginyu = 0;
               break;
            }
         }
         // Draw
         StdDraw.point(pointx, pointy);
      }

   }
}
