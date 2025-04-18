public class testing {

   public static void main(final String [] args) {
      MyArrayList uh = new MyArrayList();
      MyArrayList what = new MyArrayList(5);

      System.out.println(uh.size());
      System.out.println(what.size());
      
      uh.add(2);
      uh.add(3);
      uh.add(4);
      uh.add(5);
      System.out.println(uh.size());
      System.out.println(uh.toString());
      System.out.println();

      int rah = 0;
      uh.remove(rah);
      uh.remove(rah);
      System.out.println(uh.size());
      System.out.println(uh.toString());

      uh.set(0,99);
      System.out.println(uh.size());
      System.out.println(uh.toString());

      uh.clear();
      System.out.println(uh.toString());

   }

   public static void Parry(String [] x){
      for (int i = 0; i < x.length; i ++){
         System.out.print(x[i]);
      }
   }
   
}
