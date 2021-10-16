package javase8.prep;
// Create if and if/else and ternary constructs

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class c3IfElseTernary {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Age?: ");
        int age = in.nextInt();
        in.close();

//        if (age >= 57){
//            System.out.println("ok boomer");
//        } else {
//            System.out.println("follow me on tiktok");
//        }

        /**
         * Overall, you should only use ternary statements when the resulting statement is short.
         * Otherwise, write a normal if statement.
         * The purpose of a ternary operator is to make your code more concise and readable.
         */
        String canVote = (age >= 18) ? "You can vote" : "You cannot vote";
        //(condition) ? (expression 1) : (expression 2)
        System.out.println(canVote);




    }
}
