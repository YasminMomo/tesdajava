package chapter4;

public class AccessModifier {
    public void greetMe () { // can be called from anywhere
        System.out.println("Public Access Modifier");
    }

    private void greetMe2 () { // can only be called from within the class
        System.out.println("Private Access Modifier");
    }

    protected void greetMe3 () { // can be called from within the class, from subclasses, and from classes in the same package
        System.out.println("Protected Access Modifier");
    }

    void greetMe4 () { // can be called from within the class and from classes in the same package
        System.out.println("Default Access Modifier");
    }

    public static void main(String[] args) {
        AccessModifier acm1 = new AccessModifier();
        acm1.greetMe();
        acm1.greetMe2();
        acm1.greetMe3();
        acm1.greetMe4();
    }
}

class ClassZ {
    public static void main(String[] args) {
        AccessModifier acm1 = new AccessModifier();
        acm1.greetMe();
        // acm1.greetMe2(); - can't be called because its private
        acm1.greetMe3();
        acm1.greetMe4();
    }
}