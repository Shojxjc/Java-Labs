
public class MyArrayList extends MyListInterface {

   private Integer [] oprn;
   private Integer leng = 0;
   private Integer cap;

   public MyArrayList() {
      oprn = new Integer[10];
      cap = 10;
   }
   public MyArrayList(final int x) {
      if (x < 0) {
         throw new IndexOutOfBoundsException();         
      }
      oprn = new Integer[x];
      cap = x;
   }

   public int size () {
      return leng;
   }

   public void clear () {
      oprn = new Integer[cap];
      leng = 0;
   }

   public boolean add (final Integer x) {
      if (leng < cap) {
         for (int i = 0; i < cap; i++) {
            if (oprn[i] == null) {
               oprn[i] = x;
               break;
            }
         }
      } else {
         final Integer [] newbie = new Integer[cap*2];
         cap = cap*2;
         for (int i = 0; i < leng; i++) {
            newbie[i] = oprn[i];
         }
         newbie[leng] = x;
         oprn = newbie;
         leng++;
         cap++;
         return true;
      }
      leng++;
      return true;
   }

   public Integer get (final int x) {
      hector(x);
      return oprn[x];
   }

   public Integer set (final int index, final Integer element) {
      hector(index);
      oprn[index] = element;
      return element;
   }

   public Integer remove (final int index) {
      hector(index);

      final Integer [] newbie = new Integer[cap];
      int rileyreid = 0;
      for (int i = 0; i < cap; i++) {
         if (!(i == index)) {
            newbie[rileyreid] = oprn[i];
            rileyreid++;
         }
         
      }
      leng--;
      oprn = newbie;
      return leng;
   }

   public boolean remove (final Integer element) {

      final Integer [] newbie = new Integer[cap];
      Integer barbuceebaconburger = 0;
      for (Integer i = 0; i < cap; i++) {
         if (!(oprn[i] == element)) {
            newbie[barbuceebaconburger] = oprn[i];
            barbuceebaconburger++;
         }
      }
      oprn = newbie;
      leng--;
      return true;
   }

   public String toString () {
      if (leng == 0) {
         return "[]";
      }

      String balls = "[";
      for (int i = 0; i < leng; i++) {
         if (i != leng-1) {
            balls = balls + oprn[i] + ", ";
         } else {
            balls = balls + oprn[i] + "]";
         }
      }

      return balls;

   }

   private boolean hector (final int index) {
      if (index < 0) {
         throw new IndexOutOfBoundsException();
      }
      if (index >= leng) {
         throw new IndexOutOfBoundsException();
      } else {
         return true;
      }
   }
   
}
