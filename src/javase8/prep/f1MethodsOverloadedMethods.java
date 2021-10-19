package javase8.prep;

//Create methods with arguments and return values; including overloaded methods

import java.util.Scanner;

public class f1MethodsOverloadedMethods {
    public static void main(String[] args) {
        /**
         * ACCESS MODIFIERS:
         *  public, private, protected, default(no modifier)
         *
         * SPECIFIER:
         *  static, abstract, synchronized, final, native, strict
         *
         * RETURN TYPE:
         *  void, primitive, an object
         *
         * METHOD OVERLOADING:
         *
         *
         */

        Scanner in = new Scanner(System.in);
        System.out.print("x: ");
        int x = in.nextInt();
        System.out.print("y: ");
        int y = in.nextInt();
        in.close();

        int xySum = add(x, y);
        System.out.println("x + y = " + xySum);


    }

    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }
}
