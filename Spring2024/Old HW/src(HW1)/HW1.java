/*
Author: Joshua Cajuste
Email: Jcajuste2022@my.fit.edu
Course: Data Structures
Section: idk 
Description of this file: Shopping but i made in code and you make the entreis
this assignment hurt me ngl and it was only th first one
pleasee excuse any typos as this was done at 3 am
*/

import java.util.Scanner;

public class HW1 {

   public static void main(String[] args) {

      // innnates scanner and 3 list representing the diffrent products  which are named accordingly 
      final Scanner bbquser = new Scanner (System.in, "US-ASCII");
      SinglyLinkedList<SellerIsWack> appleIphone = new SinglyLinkedList<SellerIsWack> ();
      SinglyLinkedList<SellerIsWack>  earbuds = new SinglyLinkedList<SellerIsWack> ();
      SinglyLinkedList<SellerIsWack>  keyboard = new SinglyLinkedList<SellerIsWack> ();



      // where all the magic happens
      while(bbquser.hasNext()) {

         // takes the input 
         String bbqinput = bbquser.nextLine();
         // splits the inpupt so we can the diffrent commands
         String [] a = bbqinput.split(" ");
         // prints the input
         for (String ligma : a) {
            System.out.print(ligma + " ");
         }
         // new list created to limit the amount of if statemnts made due to the way singly linked list work
         // we can simply assgin another list with the same pointers 
         SinglyLinkedList<SellerIsWack> bbqlist = new SinglyLinkedList<>();
         if (a[1].equals("appleIPhone")) bbqlist = appleIphone;
         if (a[1].equals("earBuds")) bbqlist = earbuds;
         if (a[1].equals("keyboard")) bbqlist = keyboard;
         // If statements representing the diffrent kinda of coommands that can be done
         if(a[0].equals("AddSeller")) {
            // checks for if the quanity is 0 or less which wouldnt ake sense
            if(Integer.parseInt(a[5]) <= 0) {
               System.out.println("NonPositiveQuantityError");
            } else {
               // adds the seller
               addSeller(bbqlist,a);
               System.out.println();
            }
         }
         if(a[0].equals("RemoveSeller")) {
            // first checks to see wheter the seller is present
            if (bbqlist.sad(a[2]) == -1) {
                // is seller is not found produces an error
               System.out.println("NonExistingSellerError");
            } else {
               // i seller is found they are promptly elimanted
               removeSeller(bbqlist,a);
            }
            
         }
         if(a[0].equals("DisplaySellerList")) {
            // displays the seller chart
            System.out.println();
            System.out.printf("%10s %14s %12s %11s %n", "Seller", "ProductPrice", "ShippingCost", "TotalCost");
            DisplaySellerList(bbqlist, "imcomingforyoursweatshop");
         }
         if(a[0].equals("CustomerPurchase")) {
            // simulates a customers purchase
            customerPurchase(bbqlist,a);
         }
         if(a[0].equals("IncreaseInventory")) {
            // increases the inventory 
            increaseInventory(bbqlist,a);
         }

      }
      bbquser.close();
   }

   public static void addSeller(SinglyLinkedList<SellerIsWack>thedudes,String [] bbq) {
      // creates a product to add to the linked list 
      SellerIsWack bbqStore = new SellerIsWack(bbq[2], Double.parseDouble(bbq[3]), Double.parseDouble(bbq[4]), Integer.parseInt(bbq[5]));
      thedudes.addFirst(bbqStore);
      if(thedudes.size() > 1){
         // if theres more than 2 sellers it sorted out by total cost
         thedudes.sort();
      }
   }
   public static void removeSeller(SinglyLinkedList<SellerIsWack>thedudes,String [] bbq) {
      // removes the seller if they are found
      thedudes.myremove(thedudes.sad(bbq[2]));
   }
   public static void increaseInventory(SinglyLinkedList<SellerIsWack>thedudes,String [] bbq) {
      // increases inventory
      SellerIsWack temp = thedudes.get(thedudes.sad(bbq[2]));
      temp.morestack(Integer.parseInt(bbq[3]));
      System.out.println(temp.quan);
   }
   public static void customerPurchase(SinglyLinkedList<SellerIsWack>thedudes,String [] bbq) {
      // checks the 3 condition to see wheter or not a custmoer can purchase the item listed which the demand listed 
      SellerIsWack temp = thedudes.get(thedudes.sad(bbq[2]));
      if (temp.quan == 0){
         thedudes.myremove(thedudes.sad(bbq[2]));
      } else if (temp.quan < Integer.parseInt(bbq[3])) {
         System.out.println("NotEnoughInventoryError");
      } else {
         temp.bought(Integer.parseInt(bbq[3]));
         System.out.println(temp.quan);
         if(temp.quan == 0) {
            System.out.printf("DepletedInventoryRemoveSeller %s %s%n",bbq[2], bbq[3] );
            thedudes.myremove(thedudes.sad(bbq[2]));
         }
      }
   }
   public static void DisplaySellerList(SinglyLinkedList<SellerIsWack>thedudes, String watchyourbacknegro) {
      // self explantory but it does dsplay the sellers
      thedudes.itl();
   }
   

}


 

