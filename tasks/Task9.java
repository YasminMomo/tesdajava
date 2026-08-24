import static java.lang.Math.*;

public class Task9 {

    public static int add(int a, int b) {
        int sum = addExact(a, b);
        return sum;
    }

    public static int subtract(int a, int b) {
        int difference = subtractExact(a, b);
        return difference;
    }

    public static int multiply(int a, int b) {
        int product = multiplyExact(a, b);
        return product;
    }

    public static float divide(int a, int b) {
        float quotient = (int)(floorDiv(a, b));
        return quotient;
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + add(10, 5));
        System.out.println("Difference: " + subtract(10, 5));
        System.out.println("Product: " + multiply(10, 5));
        System.out.println("Quotient: " + divide(10, 5));
    }
}