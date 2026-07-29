package chapter2;

import java.util.Scanner;

public class LoopsLesson {
    static boolean op() {
        return true;
    }
    public static void main(String[] args) {
        // While Loop
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

        // Do-while Loop
        do
            System.out.println("do while : a = " + a--);
        while (a<10);
            System.out.println("End of program \n");

        
        // For Loop
        for(int b = 0; b<10; b++)
            System.out.println("b = " + b);

        for(int b = 0; b<10; ) // Possible w/o the update statement
            System.out.println("b = " + b++); // Transfer update statement here

        int b = 0;
        for( ; b<10; )
            System.out.println("b = " + b++); 

        int c = 0;
        for(System.out.println("Initiatlization"); c<10 ; System.out.println("Update Statement"))
            System.out.println("c = " + c++);
        
        /*  for ( ; ; ) Infinite Loop
            System.out.println("b = " + b++); 

            for ( ; op(); ) // Method
            System.out.println("b = " + b++); 
        */

        // Multiple Terms
        int d = 0;
        for(long y = 0, z = 4; d<5 && y<10; d++, y++) {
            System.out.println(y + " ");
        }
        System.out.println(d);


        // Pyramid
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a valid number: ");
        int limit = s.nextInt();
        for(int e = 1; e<limit; e++) {
            for(int f = 1; f<=e; f++) {
                System.out.print(e);
            }
            System.out.println();
        }

        
        // For-each
        String[] colors = {"black", "red", "pink", "yellow", "white", "blue"};
        for(String color: colors)
            System.out.println("Color: " + color);


        // Optional Labels
        ROW_TABLE:  for(int g = 1; g<=10; g++) {
        COL_TABLE:      for(int h = 1; h<=10; h++) {
                            if(h==5)
                                //break COL_TABLE; // Break Statement
                                continue COL_TABLE;
                            System.out.print(g*h + "\t"); 
                        }
                        System.out.println();
        }
    }
}
