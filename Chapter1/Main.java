package Chapter1;

public class Main {
    public static void main(String[] args) { //main entry point psvm
        Toy toy = new Toy(); //new object of Toy class and new instance of Toy class
        toy.name = "Teddy Bear"; //state
        toy.brand = "ABC Toys"; //state
        toy.price = 19.99; //state
        toy.quantity = 10; //state

        System.out.println("Toy Name: " + toy.name + "\nBrand: " + toy.brand + "\nPrice: $" + toy.price + "\nQuantity: " + toy.quantity); //behavior
    }
}