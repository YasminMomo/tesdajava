import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input");
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Output");
        System.out.println("Sum: " + add(a, b));
        System.out.println("Difference: " + subtract(a, b));
        System.out.println("Product: " + multiply(a, b));

        if (b == 0)
            System.out.println("Invalid input. Cannot divide by 0.");
        else
            System.out.println("Quotient: " + divide(a, b));
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int subtract(int a, int b) {
        int difference = a - b;
        return difference;
    }

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int divide(int a, int b) {
        int quotient = a / b;
        return quotient;
    }
}
