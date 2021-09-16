package javase8.prep;
import javase8.a4ImportPackage.Calculator;
/**
 * Import other Java packages to make them accessible in your code
 */

public class a4ImportPackages {

    public static void main(String[] args){
        int x = 10;
        int y = 5;

        Calculator obj = new Calculator();
        obj.printNum(x,y);
        System.out.println(obj.addition(x,y));
        System.out.println(obj.subtract(x,y));
        System.out.println(obj.multiply(x,y));
        System.out.println(obj.divide(x,y));

    }
}
