/*
*hey hey hey
*Author:  Iam Joshua Cajuste, jcajuste2022@my.fit.edu
* Course:  CSE 1002, Fall 2023
* Project: fun with squares
*
*/


public class Square {
   public static void main (final String[] args) {

      // pulls command line arguements
      final double ratio = Double.parseDouble (args[0]);
      final int patternLvl = Integer.parseInt (args[1]);
      final int patternNum = Integer.parseInt (args[2]);
      final int zero = 0;
      final int count = 0;
      // have I ever told you how much I hate magic numbers like **** dude
      final int magicnumbersaretrash = 1000;
      final int rahhhhhhhhhhhhhhhhhh = -1000;
      final int painandsuffering = 500;
      final double insertmetalgearrisingmusic = 0.01;

      StdDraw.setCanvasSize(magicnumbersaretrash, magicnumbersaretrash);
      StdDraw.setXscale(rahhhhhhhhhhhhhhhhhh, magicnumbersaretrash);
      StdDraw.setYscale(rahhhhhhhhhhhhhhhhhh, magicnumbersaretrash);
      StdDraw.setPenRadius(insertmetalgearrisingmusic);
      StdDraw.setPenColor(StdDraw.BLUE);

      // StdDraw.filledSquare (0, 0, painandsuffering/2);
       

      switch (patternNum) {
      case 1:
         p1(patternLvl, zero, zero, painandsuffering, ratio, count);
         break;
      case 2:
         p2(patternLvl, zero, zero, painandsuffering, ratio);
         break;
      case 3:
         p3(patternLvl, zero, zero, painandsuffering, ratio);
         break;
      case 4:
         p4(patternLvl, zero, zero, painandsuffering, ratio);
         break;
      default:
         break;
         
      }
      
   }
   public static void dsi (final double x, final double y, final double size) {
      // Draws squares with outlines
      StdDraw.setPenColor(StdDraw.RED);
      StdDraw.filledSquare (x, y, size); 
      StdDraw.setPenColor(StdDraw.BLUE);
      StdDraw.square (x, y, size); 
           

   }


   public static void p1 (final int n, 
         final double x, 
         final double y, 
         final double size, 
         final double ratio, 
         final int count) {

      if (count == n) {
         return;
      }

      // big square    

      // recusrion
      p1(n, x - size/2, y+size/2, size/ratio, ratio, count + 1); // top left
      p1(n, x - size/2, y-size/2, size/ratio, ratio, count + 1); // bottom left
      p1(n, x + size/2, y-size/2, size/ratio, ratio, count + 1); // bottom right
      p1(n, x + size/2, y+size/2, size/ratio, ratio, count + 1); // top right

      dsi(x, y, size/2); 


   }

   public static void p2 (final int n, 
         final double x, 
         final double y, 
         final double size, 
         final double ratio) {

      if (n == 0) {
         return;
      }


      p2(n-1, x - size/2, y+size/2, size/ratio, ratio); // top left
      p2(n-1, x + size/2, y+size/2, size/ratio, ratio); // top right
      p2(n-1, x - size/2, y-size/2, size/ratio, ratio); // bottom left

      // big square
      dsi(x, y, size/2);      

      p2(n-1, x + size/2, y-size/2, size/ratio, ratio); // bottom right




   }

   public static void p3 (final int n, 
         final double x, 
         final double y, 
         final double size, 
         final double ratio) {

      if (n == 0) {
         return;
      }
      dsi(x, y, size/2);      

      p3(n-1, x - size/2, y+size/2, size/ratio, ratio); // top left
      p3(n-1, x - size/2, y-size/2, size/ratio, ratio); // bottom left
      p3(n-1, x + size/2, y-size/2, size/ratio, ratio); // bottom right
      p3(n-1, x + size/2, y+size/2, size/ratio, ratio); // top right


   }

   public static void p4 (final int n, 
         final double x, 
         final double y, 
         final double size, 
         final double ratio) {


      if (n == 0) {
         return;
      }
      

      p4(n-1, x - size/2, y+size/2, size/ratio, ratio); // top left
      p4(n-1, x + size/2, y+size/2, size/ratio, ratio); // top right


      // big square   
      dsi(x, y, size/2);

      p4(n-1, x - size/2, y-size/2, size/ratio, ratio); // bottom left
      p4(n-1, x + size/2, y-size/2, size/ratio, ratio); // bottom right



   }
}

