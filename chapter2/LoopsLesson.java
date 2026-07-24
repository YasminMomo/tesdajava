package chapter2;

public class LoopsLesson {
    public static void main(String[] args) {
        int a = 1;
        while (a<=10)
            System.out.println("a = " + a++);
            System.out.println("End of program");

        // Infinite Loop
        /* byte b = 1;
        while (b<=10)
            System.out.println("b = " + b--);
            System.out.println("End of program");
        */

        do
            System.out.println("do while : a = " + a--);
        while (a<10);
            System.out.println("End of program");
    }
}
