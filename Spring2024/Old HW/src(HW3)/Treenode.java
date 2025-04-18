import java.util.ArrayList;
import java.util.Collections;
/*
Author: Joshua Cajuste
Email: Jcajuste2022@my.fit.edu
Course: Data Strucuters and algorthims /CSE2010
Section: not sure 
Description of this file: THis class forms the node for the tree
*/
public class Treenode {

   // establish the parameter for the node
   public Treenode parent;
   public ArrayList<Treenode> children = new ArrayList<>();
   public String contentA;
   public String country = "";
   public int medals = 0;
   public boolean goldmedal = false;

   

   // intalizes the node based on String for the content and a parent for linking puposes
   public Treenode(String c, Treenode p){
      contentA = c;
      parent = p;
   }
   // makes a copy of the node
   public Treenode(Treenode x) {
      contentA = x.contentA;
      country = x.country;
   }

   // makes a null node
   public Treenode(){

   }

   // Inserts a child then sorts the array of chilrens
   public void insertChild(Treenode dna){
      children.add(dna);
      orderchilrdren(children);
   }
   public static void orderchilrdren
   (ArrayList<Treenode> list) {
        Collections.sort(list, (node1, node2) -> node1.contentA.compareTo(node2.contentA));
    }

    // just adds child
   public void appendChild(Treenode dna){
      children.add(dna);
   }

   // returns the child asscoatied with the Search and Destroy String
   public Treenode getChild(String sad){
      for (Treenode myb : children) {
         
         if(myb.contentA.equals(sad)){
            return myb;
         }
      }
      return null;
   }

   // prints a certain child 
   public void printXChild(int x) {
      System.out.print(children.get(x).contentA);
   }

   // prints all the children
   public void printChildren() {
      for (Treenode myb: children) {
         System.out.print(myb.contentA + " ");
      }
      System.out.println();
   }

   // returns the parent
   public Treenode getParent(){
      return parent;
   }
}

