package chapter2;

public class IfSwitchStatementLesson {
    public static void main(String[] args) {

        // Conditional Statements
        int hourOfDay = 22;
        if(hourOfDay<11)
            System.out.println("Good Morning"); // Won' be printed because condition is false
            System.out.println("Kumain kana ba?"); // Next line will be printed instead because there's no curly brace

        // if-else
        if(hourOfDay<11)
            System.out.println("Good Morning");
        else
            System.out.println("Good Afternoon");
            System.out.println("Good Evening");

        // if, else if, else
        if(hourOfDay<18)
            System.out.println("Good Eve");
        else if(hourOfDay<=12)
            System.out.println("Good Afternoon");
        else
            System.out.println("Good Morning");

        // (boolean expression) ? T : F;
        System.out.println((hourOfDay<=18)?"Good Eve":"Good Night");
        System.out.println((hourOfDay<=18)?"Good Night":(hourOfDay<=12)?"Good Afternoon":"Good Morning");

        // Switch Statement
        // Supports int, byte, short, char, string, and enum values
        // switch(hourOfDay) {} // Zero Case Branch
        int dayOfWeek = 6;
        switch (dayOfWeek) {
            case 1: System.out.println("Monday");
                    break;
            case 2: System.out.println("Tuesday");
                    break;
            case 3: System.out.println("Wednesday");
                    break;
            case 4: System.out.println("Thursday");
                    break;
            case 5: System.out.println("Friday");
                    break;
            case 6:
            case 7: System.out.println("Weekends");
                    break; // Same output with case 6
            default:
                    System.out.println("Invalid day!"); // Can be placed anywhere
        }
    }
}