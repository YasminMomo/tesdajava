package chapter3;

import java.util.Arrays;

public class ArrayLesson {
    //public static void main(String args[])
    //public static void main(String... args) - varargs
    public static void main(String[] args) {
        int [] numbers1 = new int[3];
        int[] numbers2 = new int[]{1, 54, 75};
        int numbers3 []= {1, 54, 75};
        
        Student[] batch2 = {new Student(), new Student(), new Student(), new Student(), null};
        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        //againStrings[0] = new StringBuilder(); - won't compile as String won't accept StringBuilder but Object can
        //objects[0] = new StringBuilder(); - careful!

        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length); // 3
        System.out.println(mammals[0] + ", " + mammals[1] + ", " + mammals[2]);

        String[] birds = new String[6];
        System.out.println(birds.length); // 6

        System.out.println();
        int[] numbers = new int[10];
        for(int i = 0; i<numbers.length; i++) {
            numbers[i] = i + 5;
            System.out.println(numbers[i]);
        }

        System.out.println();
        for(int a = 0; a<numbers2.length; a++) 
        System.out.println(numbers2[a]);

        // Array Methods
        // Sorting
        System.out.println();
        int[] numbers4 = {1, 54, 75, 5, 76, 34, 7, 3, 8, 10, 34};
        Arrays.sort(numbers4);
        for(int number4: numbers4)
            System.out.print(number4 + " ");
        System.out.println();

        String[] numbersString = {"1", "!", "@", "54", "75", "#", "$", "5", "A", "76", "-", "34", "7", "a", "3", "8", "10", "34"};
        System.out.println("34 search result: " + Arrays.binarySearch(numbersString, "1"));
        Arrays.sort(numbersString);
        for(String numberString: numbersString)
            System.out.print(numberString + " ");
        System.out.println();

        // Searching
        System.out.println("\n34 search result: " + Arrays.binarySearch(numbers4, 34));
        System.out.println("52 and 53 search result: " + Arrays.binarySearch(numbers4, 52) + " " + Arrays.binarySearch(numbers4, 53));
        System.out.println("A search result: " + Arrays.binarySearch(numbersString, "A"));
        

        // Multidimensional Array
        //int[][] vars1 - 2D Array
        //int[] vars2[] - 2D Array: add both []
        //int[] vars3[], space[][] - a 2D Array and a 3D Array

        int[][] differentSize = {{1, 4}, {3}, {9, 8, 7}};
    }
}

class Student{
    String fullName;
    int age;
    String address;
    String course;
    int yearLevel;
}

