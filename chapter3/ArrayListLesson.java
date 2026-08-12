package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListLesson {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);

        // New
        ArrayList<Integer> list4 = new ArrayList<>();
        ArrayList<String> list5 = new ArrayList<>();
        List<String> list6 = new ArrayList<>();
        //ArrayList<String> list6 = new List<>(); Doesn't compile - List is an interface so it can't instantiate; only classes can instantiate

        // Without Generics - you can add anything
        list1.add(1);
        list1.add('c');
        list1.add(true);
        list1.add("asdfa");
        System.out.println(list1);
        // <> - diamond operator allows you to specify the type

        // With Generics
        list4.add(null);
        list4.add(4);
        list4.add(5);
        //list4.add("b"); // Error - must be an integer
        System.out.println(list4);

        list5.add(null);
        list5.add("a");
        list5.add("hello");
        System.out.println(list5);
        System.out.println(list5.add("hi")); // True
        list5.add(0, "string");
        System.out.println(list5);

        // ArrayList Methods
        // remove()
        System.out.println();
        System.out.println(list5.remove("hello"));
        System.out.println(list5.remove("goodnight"));
        System.out.println(list5.remove(3));

        // set()
        System.out.println();
        list5.add("good morning");
        System.out.println(list5 + " " + list5.size());
        System.out.println(list5.set(3, "good night"));
        System.out.println(list5);
        list5.add(1, null);
        System.out.println(list5);
        System.out.println(list5.remove(null) + " " + list5);

        // isEmpty(), size()
        System.out.println();
        System.out.println(list5.isEmpty());
        System.out.println(list5.size());

        // clear()
        System.out.println();
        list5.clear();
        System.out.println(list5.isEmpty());

        // equals()
        System.out.println();
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        System.out.println(one.equals(two));
        one.add("a");
        two.add(0, "a");
        System.out.println(one.equals(two));

        
        // Wrapper Classes
        int q = 10;
        Integer w = 20;

        int primitive = Integer.parseInt("123"); // String to int (String to Primitive)
        Integer wrapper = Integer.valueOf("123"); // String to an Integer wrapper class

        // Autoboxing - automatic conversion from primtive to the relevant wrapper class
        List<Double> weights = new ArrayList<>();
        weights.add(50.5);
        weights.add(new Double(60));
        weights.remove(50.5);
        double first = weights.get(0); // Autoboxing
        System.out.println(first);

        List nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.remove(1);
        System.out.println(nums);


        // Converting between Array and List
        System.out.println();
        list6.add("hawk");
        list6.add("robin");
        Object[] objectArray = list6.toArray();
        System.out.println(objectArray.length);
        String[] stringArray = list6.toArray(new String[0]);
        System.out.println(stringArray.length);

        String[] array = {"hawk", "robin"};
        List<String> list7 = Arrays.asList(array); //returns fixed size list
        System.out.println(list7.size());
        list7.set(1, "test");
        array[0] = "new";
        for(String b : array)
            System.out.print(b + " ");
        //list7.remove(1); exception - size can't be changed


        // With Varargs
        List<String> list8 = Arrays.asList("one", "two");


        // Sorting
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers);
        System.out.println("\n\n" + numbers);

        List nums2 = Arrays.asList(7, 8, 7, 1, 5, 3);
        Collections.sort(nums2);
        System.out.println(nums2);
        Collections.reverse(nums2);
        System.out.println(nums2);
        Collections.shuffle(nums2);
        System.out.println(nums2);
    }
}
