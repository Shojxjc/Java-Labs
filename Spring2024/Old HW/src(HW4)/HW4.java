
/*
Author: Joshua Cajuste
Email: Jcajuste2022@my.fit.edu
Course: Data Strucuters and algorthims /CSE2010
Section: 23
Description of this file: an exchange system for fitcoin aka ft uwu
*/

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class HW4 {

   public static void main(String[] args) throws IOException {
      
      // Grabs the niput txt
      final Path uri = Paths.get(args[0]);
      final Scanner user = new Scanner (uri, "US-ASCII");

      // my 2 little heaps
      HeapPriorityQueue<Integer,Order> buyer = new HeapPriorityQueue<>();
      HeapPriorityQueue<Integer,Order> seller = new HeapPriorityQueue<>();

      while (user.hasNext()) {

         // grabs the commands 
         String input = user.nextLine();
         System.out.print(input + " ");
         // splits that bad boy
         String [] hclic = input.split(" ");
         // grabs the case
         String louis = hclic[0];


         switch (louis) {
            case "EnterBuyOrder":
            // for fomatting puprposes
               System.out.println("");
               // assigns out varibles to be added to the order class
               String time1 = hclic[1];
               String name1 = hclic[2];
               int price1 = Integer.parseInt(hclic[3]);
               int quanity1 = Integer.parseInt(hclic[4]);
               // makes and order
               Order addy1 = new Order(time1, name1, price1, quanity1, "Buyer");
               // insert order into buyer heap
               buyer.insert2(price1, addy1);
               // excutes them sales
               executeBuySellOrders(buyer, seller);
               break;
            case "EnterSellOrder":
               System.out.println("");
               // also for fomrating
               String time2 = hclic[1];
               String name2 = hclic[2];
               int price2 = Integer.parseInt(hclic[3]);
               int quanity2 = Integer.parseInt(hclic[4]);
               // makes le seller roder
               Order addy2 = new Order(time2, name2, price2, quanity2, "Seller");
               // adsd that hot stuff to the heap
               seller.insert(price2, addy2);
               // check to see if any busniess is made
               executeBuySellOrders(buyer, seller);
               break;
            case "DisplayHighestBuyOrder":
               // womp womp just prints the higest 
               int time3 = Integer.parseInt(hclic[1]);
               HeapPriorityQueue<Integer,Order> tempbuyer = buyer;
               for (int i = 0; i < buyer.size();i++) {
                  Order tempo = tempbuyer.min().getValue();
                  if(tempo.getTime() <= time3) {
                     tempo.printtoconsole();
                     break;
                  }else {
                     tempbuyer.removeMin();
                  }
               }
               
               break;
            case "DisplayLowestSellOrder":
               // womp womp just prints the lowest
               int time4 = Integer.parseInt(hclic[1]);
               HeapPriorityQueue<Integer,Order> tempseller = seller;
               for (int i = 0; i < seller.size();i++) {
                  Order tempo = tempseller.min().getValue();
                  if(tempo.getTime() <= time4) {
                     tempo.printtoconsole();
                     break;
                  }else {
                     tempseller.removeMin();
                  }
               }

                   
            default:
               break;
         }         
      }
      System.out.println(" ");
      user.close();
   }

   public static void executeBuySellOrders(HeapPriorityQueue<Integer, Order> buyer, HeapPriorityQueue<Integer, Order> seller) {
      // them roots lookin fine
       Entry<Integer, Order> highestBuyOrder = buyer.min();
       Entry<Integer, Order> lowestSellOrder = seller.min();

       while (highestBuyOrder != null && lowestSellOrder != null && highestBuyOrder.getKey() >= lowestSellOrder.getKey()) {
         // caclautes the price 
           int mPrice = (highestBuyOrder.getKey() + lowestSellOrder.getKey()) / 2;
           int sllabym = Math.min(highestBuyOrder.getValue().getQuantity(), lowestSellOrder.getValue().getQuantity());

           // printing womp wompp
           System.out.println("ExecuteBuySellOrders " + mPrice + " " + sllabym);
           System.out.println("Buyer: " + highestBuyOrder.getValue().getName() + " " + (highestBuyOrder.getValue().getQuantity() - sllabym));
           System.out.println("Seller: " + lowestSellOrder.getValue().getName() + " " + (lowestSellOrder.getValue().getQuantity() - sllabym));

           // update remaining quantities of the cuzzos who just interacted
           highestBuyOrder.getValue().quanity = (highestBuyOrder.getValue().getQuantity() - sllabym);
           lowestSellOrder.getValue().quanity = (lowestSellOrder.getValue().getQuantity() - sllabym);

           // remove them sellers/ buyers if their quantity became nada
           if (highestBuyOrder.getValue().getQuantity() == 0)
               buyer.removeMin();
           if (lowestSellOrder.getValue().getQuantity() == 0)
               seller.removeMin();

           // update highestBuyOrder and lowestSellOrder for the next reec
           highestBuyOrder = buyer.min();
           lowestSellOrder = seller.min();
       }
   }
}
