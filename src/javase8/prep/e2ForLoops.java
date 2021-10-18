package javase8.prep;

//Create and use for loops including the enhanced for loop
public class e2ForLoops {
    public static void main (String[] args){
        for(int i = 10; i > 0; i--){
            System.out.println(i);
        }

        System.out.println("\nNew For Loop");
        int[] numbers = {1,2,3,4,5};
        int sum = 0;
        for(int number: numbers){ //for (data-type element : collection)
            sum += number;
            System.out.println(sum);
        }
        System.out.println("Sum = " + sum);

    }
}
