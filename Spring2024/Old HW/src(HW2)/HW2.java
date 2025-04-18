/*
Author: Joshua Cajuste
Email: Jcajuste2022@my.fit.edu
Course: Data Strucuters and algorthims /CSE2010
Section: not sure 
Description of this file: Takes in Mutiple classes and time and makes a scedule base on the given 
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Path;

public class HW2 {

   public static void main(String[] args) throws IOException {

      // intailzes scanner , a arraylist holding classes submited, and amount of classed submited
      final Path uri = Paths.get(args[0]);
      final Scanner user = new Scanner (uri, "US-ASCII");
      ArrayList<SchoolClass> submissions = new ArrayList<>();    
      int submissioncount = 0; 

      // goes through input and oragnnizes inputs into vlass object
      while (user.hasNext()) {

         String input = user.nextLine();
         String [] seprate = input.split(" ");
         SchoolClass submit = new SchoolClass(seprate);
         submissions.add(submit);
         submissioncount++;

      }
      user.close();

      // System.out.println("Submitted Class");
      // System.out.println("_______________");
      // for(SchoolClass cr: submissions) {
      //    if(cr == null) {
      //       break;
      //   }
      //   cr.printToString();
      // }
      // System.out.println("_______________");

      // intalizes an array to hold the best scedule, rejected classes and priorty counter
      ArrayList<SchoolClass> bbqbest = new ArrayList<>();
      ArrayList<SchoolClass> bbqsorry = new ArrayList<>();
      int bbqPriorty = Integer.MAX_VALUE;
      ArrayList<ArrayList<SchoolClass>> sojover = new ArrayList<>();
      // RAAHHHHHHH RECURSION RAAAAAAAAAAHHHHHHHHHHHHHHH
      sojover = recursiveSelector(0, submissioncount, submissions, bbqbest, sojover);
      // System.out.println("AASize is " + sojover.size());
      // System.out.println("Permanitaion Scheduls");
      // System.out.println("_______________");

      // for (int p = 0; p < sojover.size(); p++){
      //    ArrayList<SchoolClass> bbqbtemp = sojover.get(p);
      //    System.out.println("Should print " + bbqbtemp.size());
      //    for (SchoolClass enis: bbqbtemp) {
      //       enis.printToStringWithTTime();
      //    }
      //    System.out.println("                      Scedule end");
      // }

      System.out.println("---Course Schedule---");
      
      // sorts throught the arrary of scedules 
      // First it priotizes by amount of classes than order of submissions
      for(int p = 0; p < sojover.size(); p++) {
         ArrayList<SchoolClass> possible = new ArrayList<>(sojover.get(p));
         ArrayList<SchoolClass> rejectedClasses = new ArrayList<>();
         int pCounter = 0;
         // System.out.println("A class with a size of " + possible.size());
         // System.out.println("Current classes being checked");
         // for (SchoolClass test: possible){
         //    test.printToStringWithTTime();
         // }
         // to keep track of priorty when e is formatted
         int p2Counter = 0;
         for(int e = 0; e < possible.size(); e++) {
            // turns if a class is reemoved
            boolean wasRemoved = false;
            p2Counter++;
            for(int n = 0; n < e; n++) {
               // if a class conflicts removes from sceudle and adds it to rejected list
               if(checkOverlap(possible.get(e), possible.get(n))) {
                  // System.out.println("Size must change");
                  // System.out.println("Current size " + possible.size());
                  // System.out.print("Class removed : ");
                  // possible.get(e).printToStringWithTTime();
                  rejectedClasses.add(possible.get(e));
                  possible.remove(e);
                  wasRemoved = true;
                  e--;
                  // System.out.println("New Size " + possible.size());
                  break;
               } 
            }
            if (!wasRemoved){
               // System.out.println("Class not removed Priorty up by " + p2Counter);
               pCounter = pCounter + p2Counter;
            }
         }
         // Boolean decider takes into account if it has more classes and if they a higher priorty 
         // System.out.println("Done final size " + possible.size());
         // System.out.println("Champ size " + bbqbest.size());
         // System.out.println("Is possible bigger than bbqbest " + (possible.size() >  bbqbest.size()));
         // System.out.println("If its the same size what that order lookin like");
         // System.out.println("Contender pri " + pCounter);
         // System.out.println("Champ pri " + bbqPriorty);
         boolean decider = (possible.size() > bbqbest.size()) || (pCounter < bbqPriorty && possible.size() == bbqbest.size());
         // System.out.println(decider);
         // System.out.println();
         if(decider) {
            // System.out.println("Contender wins best class changed");
            bbqbest = new ArrayList<>(possible);
            bbqsorry = new ArrayList<>(rejectedClasses);
            bbqPriorty = pCounter;               
         }  
      }

      // prints out best ssceudle
      for(SchoolClass i: bbqbest) {
         i.printToStringWithTTime();
      }
      // System.out.println("_______________");
      if(bbqsorry.size() >= 1) {
         System.out.println("---Courses with a time conflict---");
         // System.out.println("_______________");
         // prints out rejected courses
         for(SchoolClass i: bbqsorry) {
            i.printToStringWithTTime();
         }
      }

      
   }

   public static ArrayList<ArrayList<SchoolClass>> recursiveSelector(int pos, int s, ArrayList<SchoolClass> p, ArrayList<SchoolClass> start, ArrayList<ArrayList<SchoolClass>> sojover) {

      // Intalizes my array of sceudeles and a array to represent scedules
      // recurse in the form a tree with it going left most first
      ArrayList<ArrayList<SchoolClass>> sojovers = sojover;
      ArrayList<SchoolClass> ba = new ArrayList<>(start);

      if(pos >= s) {
         // base case indactes end of branch or a leaf
         sojover.add(ba);
         return sojover;
      }
      

      for (int i = 0; i < p.get(pos).timesize(); i++) {
         // reinatliztes the class and adds to the arry to be returned
         String ntemp = p.get(pos).name;
         itsTime ttemp = new itsTime(p.get(pos).timeIndex(i));
         SchoolClass temp = new SchoolClass(ntemp,ttemp);
         start.add(temp);
         recursiveSelector(pos+1, s, p, start, sojovers);
         start.remove(temp);
      }

      // end of method
      return sojover;
   }

   public static boolean checkOverlap(SchoolClass x, SchoolClass y) {

      // first checks if they are on the sameday
      // then check if they start at the same time
      // then check is they overlap 
      if(x.trueTime.day.equals(y.trueTime.day)){
         if (x.trueTime.startTime == y.trueTime.startTime) { 
            return true;
         }
         if (x.trueTime.startTime > y.trueTime.startTime && x.trueTime.startTime < y.trueTime.endTime) {
            return true;
         }
         if (y.trueTime.startTime > x.trueTime.startTime && y.trueTime.startTime < x.trueTime.endTime) {
            return true;
         }
      }


      return false;
   }

}