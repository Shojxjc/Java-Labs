/*
*hey hey hey
*Author:  Iam Joshua Cajuste, jcajuste2022@my.fit.edu
* Course:  CSE 1002, Fall 2023
* Project: Mumble
*
*/
import java.util.Scanner;

public class Mumble {
   public static void main(final String[] args) {
   
      final Scanner user = new Scanner (System.in, "US-ASCII");
      String ifs;

      while (user.hasNext()) {
         ifs = user.next();
         getdigit(ifs);
          
      }


   }

   public static void getdigit (final String x) {
      char [] y = new char [x.length()];
      String temp = "0";
      int digit = 0;
      int high = 0;
      for (int i = 0; i < x.length(); i++) {
         y[i] = x.charAt(i);
      }


      for (int i = 0; i < x.length(); i++){
         if (Character.isDigit(y[i])){
            temp = temp + y[i];
         }
         if (i-1 != -1) {
            if ((!(Character.isDigit(y[i])) && Character.isDigit(y[i-1] )) || i == x.length()-1) {
               digit = Integer.parseInt(temp);
               if(high < digit) {
                  high = digit;
               }
               temp = "0";
            }
         }
         
      }
      System.out.println(High);
   }

}