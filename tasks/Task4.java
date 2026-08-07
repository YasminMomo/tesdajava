import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();
        String palindrome = new StringBuilder(input).reverse().toString();

        if(palindrome.equals(input)) {
            System.out.println("The input string is a palindrome.");
        }
        else {
            System.out.println("The input string is not a palindrome.");
        }
    }
}