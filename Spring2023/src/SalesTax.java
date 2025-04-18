/**************************************************************************

 * @By: Joshua Cajute

 * @Lab: 

 * @CSE 1001 Fund Software, Spring 2021

 * @Date:

 * @Description: 

 * **************************************************************************/
 import java.util.*;

public class SalesTax{
 public static void main(String[] args){
   
   Scanner user = new Scanner(System.in);
   double price, total, Ftp, Stp, Ctp;
   int Ft,St,Ct;
   
   System.out.println("Enter Iteam price: $");
   price = user.nextDouble();
   System.out.println("Enter Federal Tax Rate: %");
   Ft = user.nextInt();
   System.out.println("Enter State Tax Rate: $");
   St = user.nextInt();
   System.out.println("Enter County Tax Rate: $");
   Ct = user.nextInt();
   
   Ftp = (price*Ft)/100;
   Stp = (price*St)/100;
   Ctp = (price*Ct)/100;
   total = price + Ftp + Stp + Ctp;
   
   
   System.out.println("Price : $" + price);
   System.out.println("Federal Tax Rate: $" + Ftp);
   System.out.println("Enter State Tax Rate: $" + Stp);
   System.out.println("Enter County Tax Rate: $" + Ctp);
   System.out.println("Total Price: $" + total);
   
   
   
   
  }
 }