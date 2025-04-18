/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 22

 * @CSE 1001 Fund Software, Spring 2021

 * @Date: 4-6-23

 * @Description: 

 * **************************************************************************/
 
 import java.util.*;

public class anglicizebig {

   public static Scanner kb = new Scanner(System.in);

   // Outputs the english equivalent of n, for 0 < n < 1000000
   public static void main(String[] args) {
      int x;
      String s;

      System.out.print("Enter a postive integer:");
      x = kb.nextInt();
      if (x <= 0)
         System.out.println("Number is too small");
      else if (x >= 1000000000)
         System.out.println("Number is too large");
      else {
         s = anglicize1(x);
         System.out.println(s);
      }
   }
   
   // Returns the english equivalent of n, for 0 < n < 10000000
   public static String anglicize1(int n) {
      String s;

      if (n < 1000000)
         s = anglicize2(n);
      else
         s = anglicize2(n/1000000) + "million " + anglicize2(n%1000000);

      return s;
   }
   
   // Returns the english equivalent of n, for 0 < n < 1000000
   public static String anglicize2(int n) {
      String s;

      if (n < 100000)
         s = anglicize3(n);
      else
         s = anglicize3(n/100000) + "hundred " + anglicize3(n%100000); 

      return s;
   }
   
   // Returns the english equivalent of n, for 0 < n < 1000000
   public static String anglicize3(int n) {
      String s;

      if (n < 100000)
         s = anglicize4(n);
      else
         s = anglicize4(n/100000) + "thousand " + anglicize4(n%100000);

      return s;
   }
   
   // Returns the english equivalent of n, for 0 < n < 10000
   public static String anglicize4(int n) {
      String s;

      if (n < 1000)
         s = anglicize5(n);
      else
         s = anglicize5(n/1000) + "thousand " + anglicize5(n%1000); 

      return s;
   }
  
   // Returns the english equivalent of n, for 0 < n < 1000
   public static String anglicize5(int n) {
      String s;

      if (n < 100)
         s = anglicize6(n);
      else
         s = digitName(n/100) + "hundred " + anglicize6(n%100);

      return s;
   }
   
   // Returns the english equivalent of n, for 0 < n < 100
   public static String anglicize6(int n) {
      String s;

      if (n < 10)
         s = digitName(n);
      else if (n < 20)
         s = teenName(n);
      else // n >= 20
         s = tensName(n/10) + digitName(n%10);

      return s;
   }

   // Returns the english equivalent of 10*n, for 2 <= n <= 9
   public static String tensName(int n) {
      if (n == 2) return "twenty ";
      else if (n == 3) return "thirty ";
      else if (n == 4) return "forty ";
      else if (n == 5) return "fifty ";
      else if (n == 6) return "sixty ";
      else if (n == 7) return "seventy ";
      else if (n == 8) return "eighty ";
      else return "ninety ";
   }
   
   // Returns the english equivalent of n, for 10 <= n <= 19
   public static String teenName(int n) {
      if (n == 10) return "ten ";
      else if (n == 11) return "eleven ";
      else if (n == 12) return "twelve ";
      else if (n == 13) return "thirteen ";
      else if (n == 14) return "fourteen ";
      else if (n == 15) return "fifteen ";
      else if (n == 16) return "sixteen ";
      else if (n == 17) return "seventeen ";
      else if (n == 18) return "eighteen ";
      else return "nineteen ";
   }

   // Returns the english equivalent of n, for 0 < n < 10
   // Returns "", if n = 0
   public static String digitName(int n) {
      if (n == 0) return "";
      else if (n == 1) return "one ";
      else if (n == 2) return "two ";
      else if (n == 3) return "three ";
      else if (n == 4) return "four ";
      else if (n == 5) return "five ";
      else if (n == 6) return "six ";
      else if (n == 7) return "seven ";
      else if (n == 8) return "eight ";
      else return "nine ";
   }
}
