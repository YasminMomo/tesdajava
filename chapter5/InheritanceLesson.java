package chapter5;

public class InheritanceLesson {
    public static void main(String[] args) {
        FinalParent fp = new FinalParent();
        Lion lion = new Lion("Roar", 6, 123456);
    }
}

// final class FinalParent - can't be inherited / has no subclass
class FinalParent {
    int number;
    void getParent() {

    }
}

class ChildClass extends FinalParent {
    void getChildParent() {
        getParent();
        System.out.println(number);
    }
}

class Animal2 extends java.lang.Object {
    String name;
    int age;
    public Animal2(String name, int age) { // Super is calling this parent
        this.name =  name;
        this.age = age;
    }
}

class Lion extends Animal2 {
    int LionId;
    public Lion(String name, int age, int LionId) { // Inlcude the parameters of the parent class in the constructor of the child class
        super(name, age); 
        this.LionId = LionId;
        System.out.println(super.name);
    }
}

class MountainLion extends Lion {
    String locationString;
    public MountainLion(String name, int age, int LionId, String locationString) {
        super(name, age, LionId);
        this.locationString = locationString;
    }
}

class Canine {
    static int dogFoodID = 5234;
    public boolean hasFangs = true;
    public double getAverageWeight() {
        return 50;
    }
}

class Pug extends Canine {
    public double getAverageWeight() {
        this.hasFangs = false;
        System.out.println("Pug: " + hasFangs + " " + super.hasFangs);
        return super.getAverageWeight() - 30;
    }
}

class Wolf extends Canine {
    public double getAverageWeight() {
        return super.getAverageWeight() + 20; // Overriding a method
    }


    Canine getAnimal() {
        Wolf w1 = null; // Covariants allowed
        Canine w2 = null;
        return w1;
    }

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
        System.out.println(new Pug().getAverageWeight());
        Dog h1 = new Dog();
    }
}

// Abstract
abstract class Hayop {
    int age;
    String name;
    public void eat() {
        System.out.println("Hayop is eating  ");
    }

    public abstract String getName(); // Abstract method - has no body
    abstract int getAge();
    abstract void setAge(int age);
}

abstract class Mammal extends Hayop {
    abstract void sayImMammal();
}

class Dog extends Mammal {
    public String getName() { // The abstract method in parent class is required
        return name;
    }

    int getAge() {
        return age;
    }

    @Override
    void sayImMammal() {
        System.out.println("I'm a mammal");
    }

    public void setAge(int age) {
        
    }
}

// Interface
abstract interface CanBurrow {
    public static final int MINIMUM_DEPTH = 2;
    public abstract int getMaximumDepth();
}

interface CanBurrow2 extends CanBurrow {
    int MINIMUM_DEPTH2 = 2;
    int getMaximumDepth2();

    // 2 ways to declare a method body within an interface
    default int getMinDepth() {
        return 1;
    }

    static boolean isInWater() {
        return false;
    }
}

class FieldMouse extends Hayop implements CanBurrow, CanBurrow2 { // Multiple Inheritance
    public int getMaximumDepth() {
        return MINIMUM_DEPTH - 1;
    }

    public int getMaximumDepth2() {
        return MINIMUM_DEPTH;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    int getAge() {
        return age;
    } 

    @Override
    void setAge(int age) {
        
    }
}