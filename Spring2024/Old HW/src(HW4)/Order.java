public class Order {

   // info about the sellers/buyer foreal
   public String stime;
   public Integer itime;
   public String name;
   public int price;
   public int quanity;
   private String type;

   // establish le order
   public Order(String time, String name, int price, int quanity, String type) {
      this.stime = time;
      this.itime = Integer.parseInt(time);
      this.name = name;
      this.price = price;
      this.quanity = quanity;
      this.type = type;

   }

   // a bunch of gets and a print statment 
   public Integer getTime(){
      return itime;
   }
   public String getName(){
      return name;
   }
   public int getPrice(){
      return price;
   }

   public int getQuantity(){
      return quanity;
   }

   public String returntype(){
      return type;
   }

   public void printtoconsole(){
      System.out.println(name + " " + stime + " " + price + " " + quanity);
   }

   


}