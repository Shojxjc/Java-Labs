/*
Author: Joshua Cajuste
Email: Jcajuste2022@my.fit.edu
Course: Data Strucuters and algorthims /CSE2010
Section: not sure 
Description of this file: THis class makes a tree based on a input and reseponds to queires about said tree
lokwey this assignment broke me a littlewwwwwwwwwwwwww
*/

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class HW3 {

   public static void main(String[] args) throws IOException {

      // sets up tthe scanner
      final Path uri = Paths.get(args[0]);
      final Path uri2 = Paths.get(args[1]);
      final Scanner firstInput = new Scanner (uri, "US-ASCII");
      final Scanner que = new Scanner (uri2, "US-ASCII");

      // intaites the root node
      String fInput = firstInput.nextLine();
      String [] fSeprate = fInput.split(" ");
      // System.out.println(fSeprate[0]);
      Treenode start = new Treenode(fSeprate[0], null);
      for(int i = 1; i < fSeprate.length; i++) {
         Treenode km = new Treenode(fSeprate[i], start);
         start.appendChild(km);
         // start.printChildren();
      }

      // begggingn of tree
      Tree Olympics = new Tree(start);

      // forms the tree
      while (firstInput.hasNextLine()) {

         String input = firstInput.nextLine();
         String [] seprate = input.split(" ");
         String parent = seprate[0];
         // System.out.println(parent);
         Treenode tParent = igms(Olympics.root, parent);
         for(int i = 1; i < seprate.length; i++) {
            Treenode addie = new Treenode(seprate[i], igms(Olympics.root, parent));
            int cmlitp = seprate[i].indexOf(":");
            if(cmlitp != -1 && i == 1) {
               addie.goldmedal = true;
            }
            if(cmlitp != -1) {
               String [] bdsiufbjb = seprate[i].split(":");
               addie.country = bdsiufbjb[1];
               tParent.insertChild(addie);
            } else {
               tParent.appendChild(addie);
            }
            // tParent.printChildren();
         }
         // System.out.println();
      }
      firstInput.close();

      // takes in the querries
      while (que.hasNext()){
         String input = que.nextLine();
         System.out.print(input  + " ");
         String [] seprate = input.split(" ");
         String is = seprate[0];
         switch (is) {
            case "GetEventsBySport":
               String pen = seprate[1];
               Treenode cC = igms(Olympics.root, pen);
               cC.printChildren();
               break;

            case "GetWinnersAndCountriesBySportAndEvent":
               String pen1 = seprate[2];
               Treenode cC1 = igms(Olympics.root, pen1);
               cC1.printChildren();
               break;

            case "GetGoldMedalistAndCountryBySportAndEvent":
               String pen2 = seprate[2];
               Treenode cC2 = igms(Olympics.root, pen2);
               cC2.printXChild(0);    
               System.out.println();     
               break;

            case "GetAthleteWithMostMedals":
               ArrayList<Treenode> womp = new ArrayList<>();
               womp = gawm(Olympics.root, womp);
               finaldecider(womp);
               System.out.println();
               break;

            case "GetAthleteWithMostGoldMedals":
               ArrayList<Treenode> womp2 = new ArrayList<>();
               womp2 = gawmModified(Olympics.root, womp2);
               finaldecider(womp2);
               System.out.println();
               break;
            case "GetCountryWithMostMedals":
               ArrayList<Treenode> womp3 = new ArrayList<>();
               womp3 = gawm(Olympics.root, womp3);
               fd2(womp3);
               System.out.println();
               break;
            case "GetCountryWithMostGoldMedals":
               ArrayList<Treenode> womp4 = new ArrayList<>();
               womp4 = gawmModified(Olympics.root, womp4);
               fd2(womp4);
               System.out.println();
               break;
            case "GetSportAndEventByAthlete":
               ArrayList<Treenode> ii = new ArrayList<>();
               ii = gath(Olympics.root, ii, seprate[1]);
               for(Treenode shdaj: ii) {
                  System.out.print(" " + shdaj.contentA);
               }
               System.out.println();
               break;
         
            default:
               break;
         }
      }

      que.close();

   }

   // goes through the tree to recursively find the node whos content is SEARCH AND DESTROY 
   public static Treenode igms(Treenode C,String sad) {

      if(C.contentA.equals(sad)) {
         // le base case
         return C;
      }

      for (Treenode offspring : C.children) {
         Treenode result = igms(offspring, sad);
         if(result != null) {
            return result;
         }
      }
   return null;
   }

   // recursivelly goes through the tree to find how many times a athelete appers and what the parent node is there
   public static ArrayList<Treenode>gath(Treenode C, ArrayList<Treenode> ram,String name) {

      ArrayList<Treenode> cpux = ram;

      if(C.children.size() == 0) {
         String [] phlder = C.contentA.split(":");
         if(phlder[0].equals(name)){
            cpux.add(C.getParent());
         }
         
      }
      for(Treenode offspring : C.children){
         gath(offspring, cpux, name);
      }
      

      return cpux;
   }
   
   // rc goes through the tree to get all the winners with duplicates which will be sorted later 
   public static ArrayList<Treenode> gawm(Treenode C, ArrayList<Treenode> duh) {
      ArrayList<Treenode> balls = duh;


      if(C.children.size() == 0) {
         Treenode adding = new Treenode(C);
         balls.add(adding);
         return balls;
      }
      for(Treenode offspring : C.children){
         gawm(offspring,balls);
      }

      return balls;

   }

   // a modfied version of the method above but fr gold medals
   public static ArrayList<Treenode> gawmModified(Treenode C, ArrayList<Treenode> duh) {
      ArrayList<Treenode> balls = duh;

      if(C.children.size() == 0) {
         if(C.goldmedal) {
            Treenode adding = new Treenode(C);
            balls.add(adding);
            return balls;
         }
      }
      for(Treenode offspring : C.children){
         gawmModified(offspring,balls);
      }

      return balls;

   }

   // sorts through an array list to find who has the most medals 
   public static void finaldecider(ArrayList<Treenode> rah) {

      ArrayList<Treenode> withMedals = new ArrayList<>();
      ArrayList<Treenode> winner = new ArrayList<>();
      Treenode anaswer = new Treenode();

      // makes the new list without duplicates
      for(Treenode smp : rah) {
         boolean found = false;
         for(Treenode pms : withMedals) {
            if(pms.contentA.equals(smp.contentA)) {
               pms.medals++;
               found = true;
               break;
            }
         }
         if(!found){
            withMedals.add(smp);
         }

      }

      for(Treenode smp: withMedals) {
         if(smp.medals > anaswer.medals) {
            anaswer = smp;
         }
      }
      winner.add(anaswer);
      for(Treenode smp: withMedals) {
         if(anaswer.medals == smp.medals && !(anaswer.contentA.equals(smp.contentA))) {
            winner.add(smp);
         }
      }

      System.out.print(anaswer.medals+1 + " ");
      for(Treenode wym: winner) {
         System.out.print(wym.contentA + " ");
      }

   }

   // same as above but tailred for country 
   public static void fd2(ArrayList<Treenode> rah) {

      ArrayList<Treenode> withMedals = new ArrayList<>();
      ArrayList<Treenode> winner = new ArrayList<>();
      Treenode anaswer = new Treenode();
      
      // makes the new list without duplicates
      for(Treenode smp : rah) {
         boolean found = false;
         for(Treenode pms : withMedals) {
            if(pms.country.equals(smp.country)) {
               pms.medals++;
               found = true;
               break;
            }
         }
         if(!found){
            withMedals.add(smp);
         }

      }

      for(Treenode smp: withMedals) {
         if(smp.medals > anaswer.medals) {
            anaswer = smp;
         }
      }
      winner.add(anaswer);
      for(Treenode smp: withMedals) {
         if(anaswer.medals == smp.medals && !(anaswer.contentA.equals(smp.contentA))) {
            winner.add(smp);
         }
      }

      System.out.print(anaswer.medals+1 + " ");
      if(winner.size() > 1) {
         for(Treenode wym: winner) {
            System.out.print(wym.country + " ");
         }
      } else {
         System.out.print(anaswer.country);
      }

   }

}
