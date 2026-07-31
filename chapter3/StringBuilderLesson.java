package chapter3;

public class StringBuilderLesson {
    public static void main(String[] args) {
        // StringBuilder is mutable
        StringBuilder sb = new StringBuilder("Start");
        sb.append("+Middle");
        String s = "Start";
        s.concat("+Middle");
        System.out.println(sb); // Start+Middle = Mutable
        System.out.println(s); // Immutable


        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        // 3 ways to construct a StringBuilder
        System.out.println();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(2);
        sb3.append("anim"); // Can exceed pre-allocated capacity - Java allocates additional space (always +16) until the object can accomodate all characters
        System.out.println(sb3.length());
        sb3.append("als");
        System.out.println(sb3);


        // StringBuilder Methods
        // charAt(), indexOf(), length(), and substring()
        System.out.println();
        StringBuilder sb4 = new StringBuilder("animals");
        String sub = sb4.substring(sb4.indexOf("a"), sb4.indexOf("al"));
        int len = sb4.length();
        char ch = sb4.charAt(6);
        System.out.println(sub + " " + len + " " + ch);

        // append()
        System.out.println();
        StringBuilder sb5 = new StringBuilder().append(1).append(1.0).append(2.0);
        sb5.append('c').append("-").append(true);
        System.out.println(sb5.append(" printed"));

        // insert()
        System.out.println();
        StringBuilder sb6 = new StringBuilder("animals");
        System.out.println(sb6.insert(7, "-")); // animals-
        System.out.println(sb6.insert(0, "-")); // -animals-
        
        // delete()
        System.out.println();
        StringBuilder sb7 = new StringBuilder("abcdef");
        System.out.println(sb7.delete(1, 3)); // adef
        System.out.println(sb7.deleteCharAt(3));

        // reverse()
        System.out.println();
        StringBuilder sb8 = new StringBuilder("ABC");
        System.out.println(sb8.reverse());

        // toString() - because StringBuilder is not a string yet, comparing it with a string will result in incompatibility
        StringBuilder sb9 = new StringBuilder("string");
        String s9 = sb9.toString();
        String s1 = "string";
        Boolean b1 = sb9.equals(s1);
        Boolean b2 = s9.equals(s1);
        System.out.println(b1 + " " + b2);


        // Equality
        System.out.println();
        StringBuilder one = new StringBuilder("HELLO");
        StringBuilder two =  new StringBuilder("HELLO");
        //StringBuilder three = one.append('a');
        String four = new String("HELLO");
        String five = new String("HELLO");
        System.out.println(one == two); // False - Different objects/memories
        System.out.println(four == five); // False
        //System.out.println(one == three); // True

        System.out.println();
        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y); // True - String is immutable
        String z = "  Hello World";
        System.out.println(x == z.trim()); // False
        System.out.println(x.equals(z.trim())); // True - use equals() instead of ==
        System.out.println(one.equals(two)); // False - convert to string first
        System.out.println(one.toString().equals(two.toString())); // False - convert to string first
        System.out.println(four.equals(five));

        
    }
}
 