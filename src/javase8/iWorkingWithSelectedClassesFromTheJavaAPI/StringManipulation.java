package javase8.iWorkingWithSelectedClassesFromTheJavaAPI;
//Create and manipulate Strings
public class StringManipulation {
    /**
     * Strings are an array of Chars
     * Strings are a normal class so you can create new String objects
     * Strings are immutable - once a value is set it cannot be changed.
     * Although immutable, your String object can point to another string object.
     */
    public static void main(String[] args) {

        char[] helloArray = { 'h', 'e', 'l', 'l', 'o'};
        String helloString = new String(helloArray);
        System.out.println( helloString );

        //length method
        int length = helloString.length();
        System.out.println("String length is: " + length);

        //concatenation
        String str2 = " there";
        String helloThereStr = helloString.concat(str2);
        System.out.println(helloThereStr);

        String helloMe = helloThereStr.concat(", Ronalyn!");
        System.out.println(helloMe);


        //formatting strings
        float floatVar= 99.9f;
        int intVar = 10;
        String strVar = "apples";

        String fs = String.format("Float: %f, Integer: %d, String: %s", floatVar, intVar, strVar);
        System.out.println(fs);


    }
}
