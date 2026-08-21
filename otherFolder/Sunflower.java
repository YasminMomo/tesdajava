package otherFolder;
import chapter1.*;
import chapter4.*;

public class Sunflower {
    Toy toy1 = new Toy();
    public static void main(String[] args) {
        AccessModifier acm1 = new AccessModifier();
        acm1.greetMe();
        // acm1.greetMe2(); - can't be called because its private
        // acm1.greetMe3(); - can't be called because its protected and Sunflower is not in the same package as AccessModifier
        // acm1.greetMe4(); - can't be called because its default and Sunflower is not in the same package as AccessModifier
    }
}

class MoonFlower extends AccessModifier { // becomes a subclass of AccessModifier
    public static void main(String[] args) {
        MoonFlower mf1 = new MoonFlower();
        mf1.greetMe();
        // mf1.greetMe2(); - can't be called because its private
        mf1.greetMe3(); // can be called because MoonFlower is a subclass of AccessModifier
        // mf1.greetMe4(); - can't be called because its default and MoonFlower is not in the same package as AccessModifier
        System.out.println(VarArgsLesson.marsGravity); // can be called because its public
    }

}
