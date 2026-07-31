package chapter3;

import java.util.Arrays;

public class ArrayLesson {
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


        

        /*int numbers3 = {1, 54, 75};
        Student[] batch2 = {new Student(), new Student()}
        int[] numbers4 = {1, 54, 75, 5, 76, 34, 7, 3, 8, 10, 34};
        Arrays.sort(numbers4);
        for(int number4: numbers4)
            System.out.println(number4 + ", ");
        System.out.println();
        String[] numbersString = {"1, 54, 75, 5, 76, 34, 7, 3, 8, 10, 34"};
        Arrays.sort(numbersString);
        for(String numberString: numbersString)
            System.out.println(numberString + ", ");
        System.out.println(); */
    }
}

class Student{
    String fullName;
    int age;
    String address;
    String course;
    int yearLevel;
}

