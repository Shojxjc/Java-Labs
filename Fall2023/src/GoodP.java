/*
*hey hey hey
*Author:  Iam Joshua Cajuste, jcajuste2022@my.fit.edu
* Course:  CSE 1002, Fall 2023
* Project: mystery
*
*/
import java.util.Scanner;
import java.util.ArrayList;


public class GoodP {
   public static void main (final String[] args) {

      final Scanner user = new Scanner (System.in, "US-ASCII");
      int des;
      int lowervar;
      int highervar;
      int temp;
      boolean switc = true;
      boolean fuck = true;
      boolean correct = false;
      ArrayList<Integer> finalz =  new ArrayList<Integer>();
      ArrayList<Integer> testing = new ArrayList<Integer>();
      
      
      

      while(user.hasNext()){

         temp = 0;
         fuck = true;
         correct = false;
         switc = true;

 

         des = user.nextInt();
         lowervar = des;
         highervar = des;
         finalz.add(des / 1000);
         temp = des - (finalz.get(0) * 1000);
         finalz.add(temp / 100);
         temp = temp - (finalz.get(1) * 100);
         finalz.add(temp / 10);
         temp = temp - (finalz.get(2) * 10);
         finalz.add(temp);

         if(finalz.get(0) == 0 && finalz.get(1) == 0 && finalz.get(2) == 0){
           finalz.remove(2);finalz.remove(1);finalz.remove(0);
         } else if(finalz.get(0) == 0 && finalz.get(1) == 0){
           finalz.remove(1);finalz.remove(0);
         }else if(finalz.get(0) == 0){
           finalz.remove(0);
         }

         while(correct == false){

           if(fuck){
             for(int i = 1; i < finalz.size(); i++){
               if( !check2(finalz.get(i-1),finalz.get(i)) ){
                 fuck = false;
                 break;
               }
             }
           }

           if(fuck){
             System.out.print(finalz);
             correct = true;
           }

           if(!fuck){
             if(switc){
              lowervar--;
              if(HulkStrong(lowervar)){
                correct = true;
                System.out.println(lowervar);
              }else{
                switc = false;
              }
             }else{
              highervar++;
              if(HulkStrong(highervar)){
                correct = true;
                System.out.println(highervar);
              }else{
                switc = true;
              }
             }

           }
          
            
         }
         System.out.println();
         System.out.println();
         testing.clear();
         finalz.clear();
         

      }
   

         
         user.close();
      }

   public static boolean HulkStrong(int tn){

     ArrayList<Integer> testing = new ArrayList<Integer>();
     int temp;

     testing.add(tn / 1000);
     temp = tn - (testing.get(0) * 1000);
     testing.add(temp / 100);
     temp = temp - (testing.get(1) * 100);
     testing.add(temp / 10);
     temp = temp - (testing.get(2) * 10);
     testing.add(temp);
     for(int i = 1; i < testing.size(); i++) {
       if( !check2(testing.get(i-1),testing.get(i)) ){
         return false;
       }
     }

     return true;
   }

   
   public static boolean check(ArrayList<Integer> limit, int nc){

    for (int i = 0; i < limit.size(); i++){

      if(limit.get(i) == nc){
        return true;
      }

    }

    return false;

   }
   public static boolean check2(int prev, int wn){

    ArrayList<Integer> limit =  lazy(prev);

    for (int i = 0; i < limit.size(); i++){

      if(limit.get(i) == wn){
        return true;
      }

    }

    return false;

   }


    public static ArrayList<Integer> helpme (){

      ArrayList<Integer> possible = new ArrayList<Integer>();
      possible.clear();
      possible.add(0);possible.add(1);possible.add(2);possible.add(3);possible.add(4);
      possible.add(5);possible.add(6);possible.add(7);possible.add(8);possible.add(9);
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

   public static ArrayList<Integer> lazy (int cn) {
      
      ArrayList<Integer> possible = helpme();

      switch (cn) {

         case 0:
            possible.clear();
            possible.add(0);
            break;
          case 1:
            break;
          case 2:
            possible.remove(4);possible.remove(7);
            break;
          case 3:
            possible.clear();
            possible.add(3);possible.add(6);possible.add(9);possible.add(0);
            break;
          case 4:
            possible.remove(1);possible.remove(2);possible.remove(3);
            break;
          case 5:
            possible.remove(1);possible.remove(2);possible.remove(3);possible.remove(4);
            break;
          case 6:
            possible.clear();
            possible.add(6);possible.add(9);
            break;
          case 7:
            possible.clear();
            possible.add(7);possible.add(8);possible.add(9);possible.add(0);
            break;
          case 8:
            possible.clear();
            possible.add(8);possible.add(9);possible.add(0);
            break;
          case 9:
            possible.clear();
            possible.add(9);
            break;

      }

      return possible;

   }

  
}
