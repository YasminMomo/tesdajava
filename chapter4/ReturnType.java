package chapter4;

public class ReturnType {
    void startEngine() {
        System.out.println("Engine is running");
        return; // can also be omitted
    }

    int getAge() {
        return (byte) 23; //  can return covariant types
        // return (long) 23; - incompatible
        // System.out.println("Hello"); - unreachable code because return statement is placed before it
    }

    Avocado getAvocado() {
        return new Avocado(); // can return an object
    }

    boolean oddOrEven(int a) {
        // boolean result = ((a % 2) == 0) ? true : false;
        // return result;
        return ((a % 2) == 0) ? true : false;
    }

    int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Access Modifier Lesson
        AccessModifier acm = new AccessModifier();
        acm.greetMe();
        // acm.greetMe2(); // can be used within its own class only
        acm.greetMe3();
        acm.greetMe4();

        // Return Type Lesson
        System.out.println();
        ReturnType rt = new ReturnType();
        System.out.println("Good Morning you are now " + rt.getAge() + " years old");
        int y = 1234567;
        System.out.println("Is the value " + y + " even number?: " + rt.oddOrEven(y));
        System.out.println("a = " + y + "\nb = " + y + "\na + b = " + rt.addTwoNumbers(y, y));
        Avocado avocado = new Avocado();
        rt.getAvocado();
    }
}

class Avocado {
    
}
