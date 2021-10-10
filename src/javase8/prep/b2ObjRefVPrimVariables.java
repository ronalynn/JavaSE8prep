package javase8.prep;

//Differentiate between object reference variables and primitive variables

import java.util.Locale;

public class b2ObjRefVPrimVariables {

    public static void main (String args[]){

        /**
         * Primitive Types hold simple values:
         *  byte, short, int, long, float, double and char are all primitive types
         *  The variable contains the value
         */

        int i = 22; // i -> 22 at some address
        char a = 'a'; //a -> a at some address

        int x = 7;
        int y = x;  //stores it's own 5/x value


        /**
         * Reference Types hold more complex values / objects
         *  String is a Reference type
         *  The variable contains the ADDRESS of the value.
         *  The variable REFERENCES the value, hence why they are called Reference Types
         */

        String s = "hello"; // hello stored in some address, s -> some address

        String s1 = "apple"; // apple stored in some address, s1 -> some address
        String s2 = s1; // s2 points to same address s1 is pointing to.

        NumberObj originalNum = new NumberObj();
        System.out.println(originalNum.x);
        NumberObj plusTwo = new NumberObj();
        System.out.println(plusTwo.x + 2);



    }


}
