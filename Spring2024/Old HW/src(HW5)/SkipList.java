import java.util.ArrayList;

public class SkipList extends QuadLinkedList{

   private int height;
   public QuadLinkedList begin;
   private FakeRandHeight rand = new FakeRandHeight();
   final public Node bro;
   public Node topHeader;
   public Node topTrailer;


   public SkipList() {
      height = 0;
      QuadLinkedList start = new QuadLinkedList();
      bro = start.header;
      topHeader = start.header;
      topTrailer = start.trailer;
      begin = start;


   }

   public Node get(int time){
      // System.out.printf("Seaching for %d%n", time);
      Node current = topHeader; // start at the head
 
      while (current != null) { // while not on the bottom level
         
         // move right while next node's key is less than the key we want to find
         if (current.next.key < time) {
            // System.out.println("Moving right");
            current = current.next;	
         } else if(current.next.key > time){
            if (current.bot == null) {
               // System.out.println("Returning floor");
               break;
            }
            // System.out.println("Moving down");
            current = current.bot;
         } else {
            // System.out.println("Found key");
            current = current.next;
            while(current.bot != null){
               current = current.getBot();
            }
            break;
         }
          
      }
       return current; // returns the floor Node of the given key
   }
  

   public Node put(int time, String ky) {
      Node checker = get(time); // Find the floor node for the given time
  
      // If the node with the same key already exists, update its value
      if (checker.next != null && checker.next.key == time) {
          return null;
      }
  
      // Otherwise, create a new node
      int newHeight = rand.get();
      Node sof = begin.header;
      Node current = begin.header;
      Node addFather = null;
      for (int i = 0; i <= newHeight; i++) {
         Node newNode = new Node(time, ky, null, null, null, null);
         while(current.getNext()!= null) {
            if(current.getNext().key < time){
               // System.out.println(current.key);
               // PrintSkipList();
               // System.out.println("goes to " + current.next);
               current = current.getNext();
            } else {
               break;
            }
         }
         // PrintSkipList();
         // System.out.println("bein added bet " + current.key + "&" + current.getNext().key);
         addBetween(newNode, current, current.getNext(), null, null);
         if(addFather != null) {
            newNode.setBot(addFather);
         }
         addFather = newNode;
         
         if(height < newHeight) {
            Node nheader = new Node(Integer.MIN_VALUE, "-infdog", null, null, null, topHeader);     
            Node ntrailer = new Node(Integer.MAX_VALUE, "+infdog", header, null, null, topTrailer);
            nheader.setNext(ntrailer);
            topHeader.setTop(nheader);
            topTrailer.setTop(ntrailer);
            topHeader = nheader;
            topTrailer = ntrailer; 
            height++;  
         }
         sof = sof.getTop();
         current = sof;
         // PrintSkipList();
      }
      // PrintSkipList();  
      return null;
  }

   public void remove2(int ky) {
      Node ohno = get(ky);
      if (ohno.key != ky){
         System.out.print("NoActivityError");
      }else {
         System.out.print(ohno.value);
         remove(ohno);
      }
   }

   public ArrayList<Node> subMap(int ky1, int ky2) {
      if (ky1 >= ky2) {
         System.out.println("Invalid range: ky1 should be less than ky2");
         return null;
      }
      ArrayList<Node> rable = new ArrayList<>();
      Node current = bro;
      while (current != null) {
         if (current.key >= ky1 && current.key <= ky2){
            rable.add(current);
         }
         current = current.getNext();
      }

      for (Node fbal:rable) {
         System.out.print( " " + fbal.key + ":" + fbal.value + " ");
      }
      return rable;
   }
   public ArrayList<Node> subMapto(int ky) {

      ArrayList<Node> rable = new ArrayList<>();
      Node current = bro;
      while (current != null) {
         if (current.key >= ky){
            rable.add(current);
         }
         current = current.getNext();
      }

      for (Node fbal:rable) {
         System.out.print( " " + fbal.key + ":" + fbal.value + " ");
      }
      return rable;

   }
   public ArrayList<Node> subMapbyDay(int ky){
      ArrayList<Node> rable  = new ArrayList<>();
      int day = ky/10000;
      System.out.print(day);
      Node current = bro;
      while (current != null) {
         if (current.key/10000 == day){
            rable.add(current);
         }
         current = current.getNext();
      }
      for (Node fbal:rable) {
         System.out.print( " " + fbal.key%10000 + ":" + fbal.value + " ");
      }

      return rable;
   }

   public ArrayList<Node> botList(){

      Node current = bro;
      ArrayList<Node> rable = new ArrayList<>();
      while (current != null) {
         if (current.key >= 0){
            rable.add(current);
         }
         current = current.getNext();
      }
      
      for (Node fbal:rable) {
         System.out.print( " " + fbal.key + ":" + fbal.value + " ");
      }
      return rable;

   }

   public void PrintSkipList(){
      Node current = topHeader;
      Node scurrent = topHeader;
      int i = 0;
      while(current != null) {
         System.out.print("(S" + (height-i) + ")");
         while(current.getNext() != null) {
            if(current.key > 0 ){
               System.out.print( " " + current.key + ":" + current.value);
            }
            current = current.getNext();
         }
         scurrent = scurrent.bot;
         current = scurrent;
         i++;
         System.out.println();
      }
   }
  

}
