/*
 * Author: Joshua Cajuste, Jcajuste2022@my.fit.edu
 * Course: CSE 1002, Section 7, Spring 2021
 * Project: Lost at Sea
*/

class Manatee {

   // wil be used for postioning
   private int y;
   private int x;
   // intalizing
   public Manatee (final int y, final int x) {
      this.x = x;
      this.y = y;
   }

   String getLoc () {
      return (y + "," + x);
      // testing
   }
   int getyLoc () {
      // returns y value
      return y;
   }
   int getxLoc () {
      // returns x value
      return x;
   }

   // moves manatee
   void move (final String d) {
      switch (d) {
      case "N":
         y += 1;
         break;
      case "E":
         x += 1; 
         break;
      case " S":
         y -= 1;
         break;
      case "W":
         x -= 1;
         break;
      default:
         // balls
         break;
      }
   }
}

