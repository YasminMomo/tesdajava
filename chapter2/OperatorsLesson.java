package chapter2;

public class OperatorsLesson {
    public static void main(String[] args) {

        // Shift Operators
        System.out.println(2 << 2); // shift
        System.out.println(15 >>> 1); // unsigned
        // 0 0 1 0
        // 8 4 2 1

        // 2 << 2 = 8
        // 0 0 1 0
        // 0 1 0 0 shift to left by 2
        // 1 0 0 0 shift to left by 2


        System.out.println(+ 3 + + 6);
        System.out.println(-3 + +6);
        System.out.println(+3 + -(+6));


        // Increment and Decrement Operators
        int a = 0;
        System.out.println(a++); // use the value first then increment, value is 0
        System.out.println(a); // value is incremented, it is now 1
        
        int b = 0;
        System.out.println(++b); // increment first then use the value, value is 2
        System.out.println(b); // value is 2

        int c = 4;
        double d = 3 + 2 * --c;
        System.out.println("c: " + c + ", d: " + d); // 3 + 2 * 3 = 9.0

        int e = 3;
        System.out.println(++e+e++);
        e = +e++;


        // Ternary Operator
        int age = 20;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println(status);
        

        // Data Type Promotion
        short x = 10;
        short y = 30; // x + y wont compile because x + y is promoted to int
        short z = (short) (x + y); // need to cast because x + y is promoted to int

        int f = (byte)26;
        byte g = (byte)f;
        System.out.println(g);

        
        //Short Circuit
        boolean sc = true || (y < 4); // Short circuit (||) doesn't evaluate the code on the right side - this will output true immediately
        System.out.println(sc);


        //Boolean
        boolean isActive = false;
        System.out.println(!!!!!!!isActive);

        boolean isActive2 = false, isActive3;
        isActive=isActive2=isActive3=true;
        System.out.println(isActive);
        System.out.println(isActive2);
        System.out.println(isActive3);
    }
}
