package Chapter1;

/*
 * Toy Project
 * has property of name, brand, price and quantity
 * with a method to set the price of the toy
 */

public class Toy {
    String name;
    String brand;
    double price;
    int quantity;

    void setPrice(double price) { //method
        this.price = price; //this keyword refers to the current object
    }

    public static void main(String[] args) { //main entry point psvm / you can change args to any name you want, but it is a convention to use args
        Toy toy1 = new Toy(); //new object of Toy class and new instance of Toy class
        toy1.name = "Barbie Doll"; //state
        toy1.brand = "Toy Kingdom"; //state
        toy1.price = 19.99; //state
        toy1.quantity = 10; //state
        toy1.setPrice((toy1.price * 0.5)); //method call
        System.out.print(toy1.price); //print the price of the toy / ctrl to see link of method
    }

    // To create a javadoc, use the command: javadoc name.java

}