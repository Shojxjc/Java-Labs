/*
*hey hey hey
*Author:  Iam Joshua Cajuste, jcajuste2022@my.fit.edu
* Course:  CSE 1002, Fall 2023
* Project: mystery
*
*/
import java.util.Scanner;
import java.util.ArrayList;


public class Good {
   public static void main (final String[] args) {

      final Scanner user = new Scanner (System.in, "US-ASCII");
      int des;
      int lowervar;
      int highervar;
      boolean switc;
      boolean hooray;
      boolean correct = false;    

      while (user.hasNext()) {
         hooray = false;
         correct = false;
         switc = true;

         des = user.nextInt();
         lowervar = des;
         highervar = des;
         

         while (!correct) {

            if (hulkStrong(des)) {
               correct = true;
               hooray = true;
               System.out.println(des);
            }

            if (!hooray) {
               if (switc) {
                  lowervar--;
                  if (hulkStrong(lowervar)) {
                     correct = true;
                     System.out.println(lowervar);
                  } else {
                     switc = false;
                  }
               } else {
                  highervar++;
                  if (hulkStrong(highervar)) {
                     correct = true;
                     System.out.println(highervar);
                  } else {
                     switc = true;
                  }
               }

            }
         }
      }         
      user.close();
   }

   public static boolean hulkStrong (final int n) {

      final ArrayList<Integer> testing = new ArrayList<Integer>();
      testing.clear();
      int temp = 0;
      final int thou = 1000;
 
      testing.add(n/ thou);
      temp = n - (testing.get(0) * thou);
      testing.add(temp / 100);
      temp = temp - (testing.get(1) * 100);
      testing.add(temp / 10);
      temp = temp - (testing.get(2) * 10);
      testing.add(temp);

      if (testing.get(0) == 0 && testing.get(1) == 0 && testing.get(2) == 0) { 
         testing.remove(2); testing.remove(1); testing.remove(0);
      } else if (testing.get(0) == 0 && testing.get(1) == 0) {
         testing.remove(1); testing.remove(0);
      } else if (testing.get(0) == 0) {
         testing.remove(0);
      }


      for (int i = 1; i < testing.size(); i++) {
         if (!check2(testing.get(i-1),testing.get(i))) {
            return false;
         }
      }

      return true;
   }
   
   public static boolean check(final ArrayList<Integer> limit, final int nc) {
      for (int i = 0; i < limit.size(); i++) {
         if (limit.get(i) == nc) {
            return true;
         }
      }
      return false;
   }

   public static boolean check2 (final int prev, final int wn) { 
      final ArrayList<Integer> limit =  lazy(prev);
      for (int i = 0; i < limit.size(); i++) {
         if (limit.get(i) == wn) {
            return true;
         }
      }
      return false;
   }

   public static ArrayList<Integer> helpme () {

      final ArrayList<Integer> possible = new ArrayList<Integer>();
      possible.clear();
      possible.add(0); possible.add(1); possible.add(2); possible.add(3); possible.add(4);
      possible.add(5); possible.add(6); possible.add(7); possible.add(8); possible.add(9);
      return possible;
   }

   // 1 can go to all
   // 2 can go 2, 3, 5, 6, 8, 9, and 0
   // 3 can go to 3, 6, 9, 0
   // 4 can go to 4, 5, 6, 7, 8, 9 and 0
   // 5 can go to 5, 6 , 8 , 9 or 0
   // 6 can go only go to 6, 9
   // 7 can go to 7, 8, 9, or 0
   // 8 can go to 8, 9 & 0
   // 9 & 0 can only go to themsleves

   public static ArrayList<Integer> lazy (final int cn) {
      
      final ArrayList<Integer> possible = helpme();

      switch (cn) {

      case 0:
         possible.clear();
         possible.add(0);
         break;
      case 1:
         break;
      case 2:
         possible.remove(4); possible.remove(7);
         break;
      case 3:
         possible.clear();
         possible.add(3); possible.add(6); possible.add(9); possible.add(0);
         break;
      case 4:
         possible.remove(1); possible.remove(2); possible.remove(3);
         break;
      case 5:
         possible.remove(1); possible.remove(2); possible.remove(3); possible.remove(4);
         break;
      case 6:
         possible.clear();
         possible.add(6); possible.add(9);
         break;
      case 7:
         possible.clear();
         possible.add(7); possible.add(8); possible.add(9); possible.add(0);
         break;
      case 8:
         possible.clear();
         possible.add(8); possible.add(9); possible.add(0);
         break;
      case 9:
         possible.clear();
         possible.add(9);
         break;
      default:
         System.out.println("You found an easter egg");
         break;
      }
      return possible;
   }

}
