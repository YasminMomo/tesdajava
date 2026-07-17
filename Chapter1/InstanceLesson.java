package chapter1;

public class InstanceLesson {
    InstanceLesson(){
        code = 0; // constructor - used to assign values to instance variables
    }

    int code = 1; // instance variable
    {
        System.out.println(code); // instance initializer - used to assign default values to instance variables
    }

    public static void main(String[] args) {
        InstanceLesson ini = new InstanceLesson(); // constructor is printed last
        System.out.println(ini.code);
        {System.out.println("feathers");}
    }

    { // instance initializer are printed first
        System.out.println("Snowy");
        code = 123456;
        System.out.println(code);
    }
}
