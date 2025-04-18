/*
*hey hey hey
*Author:  I am Joshua Cajuste, jcajuste2022@my.fit.edu
* Course:  CSE 1002, Fall 2023
* Project: Hurricane
*
*/
import java.util.*;

public class Template {

   public static void main (final String[] args) {

      final Scanner user = new Scanner (System.in, "US-ASCII");

      System.out.println(user.nextLine());

      user.close();
   }

   public static void Parry(String [] x){
      for (int i = 0; i < x.length; i ++){
         System.out.print(x[i]);
      }
   }

   public static void parry2(String [][] x){
      for (int i = 0; i < x.length; i++) {
         for (int cup = 0; cup < x[0].length; cup++) {
            System.out.print(x[i][cup] + "");
         }
         System.out.println();
      }
   }
}