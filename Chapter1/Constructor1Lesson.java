package chapter1;

public class Constructor1Lesson {
    public static void main(String[] args) {
        Chicken c1 = new Chicken();
        Chicken c2 = new Chicken();
        System.out.println();
    } 
}

class Chicken { // Constructor is the name of class
    int numEggs = 0;
    String name;
    public Chicken(){
        name = "Duke";
    }
}

class Chick {
    public Chick() {
        System.out.println("🐣 in constructor");
    }
    public void NewChick() {
        System.out.println("🐥💬 I'm a method");
    }
}

class Swan {
    int numEggs;
    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numEggs = 1; // writing Object fields
        System.out.println(mother.numEggs); // reading Object fields
    }
}

class Name {
    String first = "Yasmin";
    String last = "Momo";
    String full = first + last;

    public static void main(String[] args) {
        Name name1 = new Name();
        System.out.println("Name: " + name1.full);
        name1.first = "Nami";
        name1.last = "Yassy";
        System.out.println("Name: " + name1.full);
    }
}