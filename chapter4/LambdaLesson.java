package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaLesson {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true,1));
        animals.add(new Animal("kangaroo", true, false,5));
        animals.add(new Animal("rabbit",true, false,2));
        animals.add(new Animal("turtle", false, true,30));
        animals.add(new Animal("camel",false,false,10));
        animals.add(new Animal("frog",true,true,1));
        // Animal.print(animals, new CheckIfHopper());

        // Animal.print(animals, new CheckIfSwimmer());
        System.out.println("animals that can hop");
        Animal.print(animals, a->a.canHop());
        System.out.println("animals that can swim");
        Animal.print(animals, a->a.canSwim());
        System.out.println("animals that cant swim and cant hop");
        Animal.print(animals, a->!a.canSwim() && !a.canHop());
        System.out.println("animals that can swim and can hop");
        Animal.print(animals, a->a.canSwim() && a.canHop());
        System.out.println("animals that 5 years older");
        Animal.print(animals, a->a.getAge()>5);
        twoNumbersOps addNums = (a,b,c)->a+b;
        System.out.println(addNums.aOpsB(21, 5,true));
        Discount tenPercent = dc->dc-(dc*0.10);
        Discount twentyPercent = dc->dc-(dc*0.20);
        Discount fiftyPercent = dc->dc-(dc*0.50);

        double price = 1000;
        System.out.println(tenPercent.dc(price));
        System.out.println(twentyPercent.dc(price));
        System.out.println(fiftyPercent.dc(price));
        
    }
}


class Animal{
    private String species;
    private boolean canHop;
    private boolean canSwim;
    private int age;


    public Animal(String species, boolean canHop, boolean canSwim, int age) {
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
        this.age=age;
    }
    public static void print(List<Animal> animals, Predicate<Animal> checker){
        for(Animal animal:animals){
            if(checker.test(animal)){
                System.out.print(animal+", ");
            }
            
        }
    }
    public boolean canHop(){
        return canHop;
    }
    public boolean canSwim(){
        return canSwim;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return species;
    }
    
}

// interface CheckTrait{
//     boolean test(Animal a);
// }
// class CheckIfHopper implements  CheckTrait{
//     public boolean test(Animal a){
//         return a.canHop();
//     }
// }
// class CheckIfSwimmer implements  CheckTrait{
//     public boolean test(Animal a){
//         return a.canSwim();
//     }
// }

interface twoNumbersOps{
    double aOpsB(double a,double b,boolean c);
}
interface Discount{
    double dc(double a);
}