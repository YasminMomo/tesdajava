package chapter4;

public class ConstructorLesson {
    //public ConstructorLesson() {} - Empty Default Constructor (Automatically included)

    public static void main(String[] args) {
        ConstructorLesson cl = new ConstructorLesson(); // Calls the default constructor
        Bunny bunny1 = new Bunny("Bugs"); // Calls the Bunny Constructor
        Bunny bunny2 = new Bunny("Lola");
        Hamster hamster1 = new Hamster(2);
        Hamster hamster2 = new Hamster(2,"White");
        Hamster hamster3 = new Hamster();
        System.out.println();
    }
}

class Bunny { 
    String name; // Instance Variable
    public Bunny(String name) { // Constructor
        this.name = name;
        System.out.println("this is Bunny Constructor");
    }
}

// Overloading Constructors
class Hamster {
    private String color;
    private int weight;
    public Hamster(int weight) { // First Constructor
        //this.weight = weight;
        //color = "brown"; // Default
        this(weight, "brown");
    }

    public Hamster(int weight, String color) { // Second Constructor
        this.weight = weight;
        this.color = color;
    }

    public Hamster() {
        this(15, "pink");
    }
}

class InitializationOrderSimple {
    private String name = "Torchie";
    { System.out.println(name); } // Prints Instance Initializer next
    private static int COUNT = 0;
    static { System.out.println(COUNT); } // Prints Static first
    static { COUNT += 10;  System.out.println(COUNT); }

    public InitializationOrderSimple() {
        System.out.println("constructor"); // Prints Constructor last
    }

    public static void main(String[] args) {
        InitializationOrderSimple init = new InitializationOrderSimple();
    }
}
