import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers[] = new int[3];
        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        int largest = numbers[0];

        if(numbers[0] == numbers[1] && numbers[1] == numbers[2])
            System.out.println("All numbers are equal.");
        else {
            if(numbers[1] > largest)
                largest = numbers[1];
            if(numbers[2] > largest)
                largest = numbers[2];

            System.out.println(largest);
        }
    }
}
