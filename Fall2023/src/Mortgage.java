import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
/*
*hey hey hey
*Author:  Iam Joshua Cajuste, jcajuste2022@my.fit.edu
* Course:  CSE 1002, Fall 2023
* Project: mystery
*
*/
public class Mortgage {

   public static void main (final String[] args) {

      // all the variables that need to be intalized right away
      final Scanner imBehindyou = new Scanner (System.in, "US-ASCII");
      BigDecimal bal = new BigDecimal(imBehindyou.next());
      final BigDecimal cero = new BigDecimal("0");
      final BigDecimal intrest = new BigDecimal(imBehindyou.next());



      while (imBehindyou.hasNext()) {
         // 𓅋 is either a payment or bal check
         final String 𓅋 = imBehindyou.next();
         String brokie = "left";
         if (bal.compareTo(cero) == -1) {

            brokie = "over";
         }
         // for bal check
         if (𓅋.toUpperCase().equals("BALANCE")) {
            BigDecimal l58u2HnU43jSCF0FvDX = new BigDecimal("0");
            l58u2HnU43jSCF0FvDX = l58u2HnU43jSCF0FvDX.abs();
            System.out.printf("balance: %s %s%n", l58u2HnU43jSCF0FvDX, brokie);
         } else {
            // if it is a payment
            final BigDecimal pay = new BigDecimal(𓅋);
            bal = bal.add(intrest.multiply(bal));
            bal = bal.subtract(pay);
            bal = bal.setScale(2, RoundingMode.HALF_UP);
         }
      }

      imBehindyou.close();
   }
}
