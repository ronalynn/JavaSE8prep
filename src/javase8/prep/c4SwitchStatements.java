package javase8.prep;

import java.util.Scanner;

//Use a switch statement
public class c4SwitchStatements {
    public static void main (String[] args){

        /**
         * Use switch instead of if when: You are comparing multiple possible
         * conditions of an expression and the expression itself is non-trivial.
         */

        Scanner in = new Scanner(System.in);
        System.out.print("Pick a colour, I'll tell you the tfl tube line: ");
        String colour = in.nextLine();
        in.close();

        switch(colour){
            case "brown":
                System.out.println("Bakerloo");
                break; //When Java reaches a break keyword, it breaks out of the switch block.
            case "red":
                System.out.println("District");
                break;
            case "yellow":
                System.out.println("Circle");
                break;
            case "green":
                System.out.println("District");
                break;
            case "pink":
                System.out.println("Hammersmith & City");
                break;
            case "grey":
                System.out.println("Jubilee");
                break;
            case "purple":
                System.out.println("Metropolitan");
                break;
            case "black":
                System.out.println("Northern");
                break;
            case "navy":
                System.out.println("Picadilly");
                break;
            case "light blue":
                System.out.println("Victoria");
                break;
            default: //The default keyword specifies some code to run if there is no case match:
                System.out.println("Pick a colour so I can tell you the tube line!");
        }
    }
}
