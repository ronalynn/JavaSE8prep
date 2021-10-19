package javase8.prep;

import java.util.Scanner;

//Apply the static keyword to methods and fields
public class f2Static {
    public static void main(String[] args) {
        /**
         *  if a field is declared static, then exactly a single copy of that field is created and
         *      shared among all instances of that class.
         *
         */

        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String inName = in.nextLine();

        String greet = hello(inName);
        System.out.println("Hello, " + greet);
    }

    public static String hello (String name){
        return name;
    }
}
