public class Task8 {
    public static void main(String[] args) {
        int[] a = {12, 13, 14};
        
        System.out.println("Total sum: " + sum(a));
    }

    public static int sum(int... numbers) {
        int cumulativeSum = 0;
        int eachSum = 0;

        for (int number : numbers) {
            System.out.print("Parameter " + number + ": ");
            
            for (int i = 1; i <= number; i++) {
                eachSum += i;
            }
            
            System.out.print("sum = " + eachSum);
            cumulativeSum += eachSum;
            System.out.println(", cumulative sum = " + cumulativeSum);
            
            eachSum = 0;
        }

        return cumulativeSum;
    }
}