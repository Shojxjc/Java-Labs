import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
/*
*hey hey hey
*Author:  Iam Joshua Cajuste, jcajuste2022@my.fit.edu
* Course:  CSE 1002, Fall 2023
* Project: molecularweight
*
*/
public class MolecularWeight {

   record Element(String name, String atomicNumber, String symbol, String atomicWeight) {
   }
   public static void main (final String[] args) throws IOException {
      if (args.length != 1) {
         System.err.println("dumb dumb dumb dumb do you want some bubble gum");
      }
      // Gets reeady to read any files in the command line
      final Path path = Paths.get (args[0]);
      final Scanner iCanSeeYou = new Scanner (System.in, "US-ASCII");
      final Scanner imInYourWalls = new Scanner (path, "US-ASCII");
      final ArrayList<Element> n177013 = new ArrayList<Element>();
      String header = imInYourWalls.nextLine();
      String CE = "";
      int stopHammerTime = 0;
      
      header = header + ""; // To filter out Heading cz we dont need it
      while (imInYourWalls.hasNextLine()) {
         // Takes in a line from CSV
         final String imComingForYou = imInYourWalls.nextLine();
         final String [] part = imComingForYou.split(",");
         // Puts info into a really really really big arraylist ss
         final Element lookBehindyou = new Element(part[0], part[1], part[2], part[3]);
         n177013.add(lookBehindyou);
      }
      while (iCanSeeYou.hasNext()) {
         // takes in the line for the elements you trying to calculat
         final String bomb = iCanSeeYou.nextLine();
         // Seprates the elements and/or Numbers
         // The reason its not " " is because it will incorrectly read multiple spaces
         final String [] careful = bomb.split("\\s+");
         boolean fakerdetected = false;
         boolean itwasnotanumber = true;
         boolean pain = true;
         double weight = 0;


         for (int i = 0; i <= careful.length; i++) {

            if (i == careful.length) {
               weight += calculate(CE, stopHammerTime, n177013);
               break;
            }

            for (final char c : careful[i].toCharArray()) {
               if (Character.isDigit(c)) {
                  stopHammerTime = Integer.parseInt(careful[i]);
                  itwasnotanumber = false;
               } else {
                  itwasnotanumber = true;
               }
            }

            if (itwasnotanumber) {
               fakerdetected = whatAreYouDoing(careful[i], n177013);
            }

            if (pain) {
               CE = careful[i];
               stopHammerTime = 1;
               pain = false;
            } else {
               if (itwasnotanumber) {
                  weight += calculate(CE, stopHammerTime, n177013);
                  CE = careful[i];
                  stopHammerTime = 1;
               }
            }

            if (careful.length == 1) {
               weight += calculate(CE, stopHammerTime, n177013);
            }
         }

         // debuging fakerdeteced
         // System.out.println(fakerdetected);
         if (fakerdetected) {
            System.out.printf("Molecular weight of %s = %s%n", bomb, "?????????????????");
         } else {
            System.out.printf("Molecular weight of %s = %s%n", bomb, weight);
         }
      }

      imInYourWalls.close();
      iCanSeeYou.close();
   }

   // Calculates the weight of the given number of moleucles
   public static Double calculate (final String cE, final int i, final ArrayList<Element> uh) {
      for (final Element element : uh) {
         if (element.symbol.equals(cE)) {
            // once it finds the right element it does the math 
            return Double.parseDouble(element.atomicWeight) * i;
         }
      }

      return 0.0;
   }

   // Checks whether the element is a fraud or not
   public static boolean whatAreYouDoing (final String cE, final ArrayList<Element> uh) {
      for (final Element element : uh) {
         if (element.symbol.equals(cE)) {
            return false;
         }
      }
      // FRAUD DETECED RETURNING TRUE
      return true;
   }
}
