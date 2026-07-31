package chapter3;

public class StringLesson {
    public static void main(String[] args) {
        String name = "fluffy";
        String a = "1";
        a = "0"; // Immutable
        a += "2";
        a += "3";
        String b = "1";
        String name2 = "fluffy";
        name2 = null;
        name2 = "fluffy"; // Still the same fluffy from the string pool
        String name3 = new String("fluffy");
        System.out.println(a);

        // String limit for max charseq. integer.maxvalue


        // String Methods
        // length()
        System.out.println();
        String string = "animals";
        System.out.println(string.length());

        // charAt()
        System.out.println();
        String string2 = "_penguin "; // Space counted
        System.out.println(string2.length());
        System.out.println(string2.charAt(0));

        // indexOf()
        System.out.println();
        String string3 = "kangaroo";
        System.out.println(string3.indexOf('o'));
        System.out.println(string3.indexOf("ar"));
        System.out.println(string3.indexOf('a', 2));
        System.out.println(string3.indexOf('b'));
        System.out.println(string3.indexOf("ar", 5));

        // substring
        System.out.println();
        String string4 = "dolphins";
        System.out.println(string4.substring(3));
        System.out.println(string4.substring(string4.indexOf('h')));
        System.out.println(string4.substring(3, 4));
        System.out.println(string4.substring(3, 5));
        System.out.println(string4.substring(3, 7));
        System.out.println(string4.substring(3, 8));
        System.out.println(string4.substring(3, 3)); // Empty string
        // System.out.println(string4.substring(3, 2)); Throws exception, can't go backwards
        // System.out.println(string4.substring(3, 9)); Throws exception, out of bounds

        // toLowerCase, toUpperCase
        System.out.println();
        String string5 = "_ABcde123fgH";
        System.out.println(string5.toLowerCase());
        System.out.println(string5.toUpperCase());
        String word = "Stand Alone";
        word = word.toUpperCase();
        System.out.println(word);

        // equals(), equalsIgnoreCase()
        System.out.println();
        String word2 = "Hello World";
        System.out.println(word.equals("Stand Alone"));
        System.out.println(word.equals("Stand Alone "));
        System.out.println(word2.equals("Hello World"));
        System.out.println(word.equalsIgnoreCase("Stand Alone"));

        // startsWith(), endsWith()
        System.out.println();
        System.out.println("abc".startsWith("a"));
        System.out.println("abc".startsWith("A"));
        System.out.println("abc".startsWith("ab"));
        System.out.println("abc".endsWith("c"));
        System.out.println("abc".endsWith("bc"));

        // contains()
        System.out.println();
        System.out.println("abc".contains("b"));
        System.out.println("abc".contains("B"));
        System.out.println("abc ".contains(" "));

        // replace()
        System.out.println();
        System.out.println("abcabc".replace("a", "A"));
        System.out.println("abcabc".replace('b', 'B'));
        System.out.println("abcabc".replace('e', 'E'));
        System.out.println("abcabc".replace("ab", "AB"));
        System.out.println("abcdabcd".replace(("abcdabcd".charAt(7)), 'D'));
        System.out.println("abcdabcd".replace(("abcdabcd".substring(6, 7)), "D"));
        System.out.println("hello".replace(("abcdabcd".charAt(1)), 'D'));
        System.out.println("abcdabcd".replace(("hello".charAt(1)), 'D'));

        // trim()
        System.out.println();
        System.out.println("abc".trim());
        System.out.println("\t   a b c\n");
        System.out.println("\t   a b c \n".trim());
    
    
        System.out.println();
        String sample1 = "abcd";
        String sample2 = "abcd";
        String sample3 = "abcd ";
        //compile time
        System.out.println(sample1==sample2); //True
        System.out.println(sample1==sample3); // False
        System.out.println(sample2==sample3); // False
        //runtime
        System.out.println(sample1.equals(sample2)); // True
        System.out.println(sample1.equals(sample3)); // False
        System.out.println(sample2.equals(sample3)); // False

        System.out.println(sample1.equals(sample3.trim())); // True
        System.out.println(sample2.equals(sample3.trim())); // True
    }
}