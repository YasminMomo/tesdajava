package Chapter1;

public class Main {

   public static void main(String[] var0) {
      Toy var1 = new Toy();
      var1.name = "Teddy Bear";
      var1.brand = "ABC Toys";
      var1.price = 19.99;
      var1.quantity = 10;
      System.out.println("Toy Name: " + var1.name + "\nBrand: " + var1.brand + "\nPrice: $" + var1.price + "\nQuantity: " + var1.quantity);
   }
}