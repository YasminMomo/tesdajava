package chapter5;

public class PolymorphismLesson {
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        Object lemurAsObject = lemur;
        System.out.println();

        Primate primate = lemur;
        HasTail hastTail = lemur;
        Lemur lemur2 = (Lemur) primate;
        System.out.println(lemur2.age);
        // System.out.println(primate.age);
        // System.out.println(hastTail.age);
        System.out.println(primate.hasHair());
        // System.out.println(hastTail.hasHair());
        System.out.println(hastTail.isTailStripped());
        System.out.println(lemur.isTailStripped());
        System.out.println(lemur.age);
        System.out.println(lemur.hasHair());
        // System.out.println(lemurAsObject.);

        Rodent rodent = new Rodent();
        // Capybara capybara = (Capybara) rodent;

        // Virtual Method
        Bird bird = new Bird();
        Bird bird2 = new Peacock();
        Bird bird3 = new Maya();
        bird.displayInfo();
        bird2.displayInfo();
        bird3.displayInfo();

        // Polymorphism Parameter
        ZooWorker.feed(new Reptile());
        ZooWorker.feed(new Alligator());
        ZooWorker.feed(new Crocodile());
    }
}

class Lemur extends Primate implements HasTail{
    int age = 10;

    @Override
    public boolean isTailStripped() {
        return true;
    }
}

interface HasTail {
    boolean isTailStripped();
}

class Primate {
    boolean hasHair() {
        return true;
    }
}

class Bird {
    public String getName() {
        return "unknown";
    }

    public void displayInfo() {
        System.out.println("The bird name is: " + getName());
    }
}

class Peacock extends Bird {
    public String getName() {
        return "Peacock";
    }
}

class Maya extends Bird {
    public String getName() {
        return "Maya";
    }
}

class Fish {

}

class Rodent {

}

class Capybara extends Rodent {

}

class Reptile {
    public String getName() {
        return getClass().getSimpleName();
    }
}

class Alligator extends Reptile {

}

class Crocodile extends Reptile {
    
}

class ZooWorker {
    public static void feed(Reptile reptile) {
        System.out.println("Feeding reptile: " + reptile.getName());
    }
}