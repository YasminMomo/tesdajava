package chapter1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Toy toy1 = new Toy();
        toy1.name = "Barbie Doll";
        toy1.brand = "Toy Kingdom";
        toy1.price = 19.99;
        toy1.quantity = 10;
        System.out.println("Toy Name: " + toy1.name);
        System.out.println("Brand: " + toy1.brand);
        System.out.println("Price: $" + toy1.price);
        System.out.println("Quantity: " + toy1.quantity);
    }
}