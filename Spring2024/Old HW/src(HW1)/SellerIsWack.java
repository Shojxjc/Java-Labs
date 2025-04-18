public class SellerIsWack {

   public String name;
   public double price;
   public double ship;
   public double tc;
   public int quan;

   // innaites the seller with all the qualties
   // making the seller the object allow for easy storage and asscositin of variables
   public SellerIsWack (String name, double price, double ship, int quan) {

      this.name = name;
      this.price = price;
      this.ship = ship;
      tc = price + ship;
      this.quan = quan;

   }

   // unused get methods 
   public String bbqseller() {
      return name;
   }

   public double bbqtc() {
      return tc;
   }

   public int bbqquan() {
      return quan;
   }

   // used for when the adding stock to a product and subtracting stock froma product
   public void morestack (int i) {
      quan = quan + i;
   }
   public void bought (int buyed) {
      if (quan == 0 ) {

      } else {
         quan = quan - buyed;
      }
   }

   // more get methods
   public double gettc() {
      return tc;
   }

   public void bbqString () {

      System.out.printf("%10s %14s %12s %11s %n", name, price, ship, tc);

   }

}
