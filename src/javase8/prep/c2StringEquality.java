package javase8.prep;

//Test equality between Strings and other objects using == and equals ()

import java.util.Objects;
import java.util.Scanner;

public class c2StringEquality {

    /**
     * a == b is true when a and b are primitive data with the same value or object reference
     * two numeric primitive types are automatically promoted, 5 == 5.00 is true
     * String reference variables that are the same also satisfy
     *
     * a.equals(b)
     * Object classes have the equals() method. Returns true when a == b.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("what is your favourite fruit?: ");
        String fruit = in.nextLine();

        if(fruit.equalsIgnoreCase("banana")){
            System.out.println("banana's are yellow");
        } else if(fruit.equalsIgnoreCase("cherry")){
            System.out.println("cherries are red");
        } else{
            System.out.println("thats a nice fruit");
        }
    }

}
