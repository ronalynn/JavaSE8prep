package javase8.prep;

//Develop code that uses wrapper classes such as Boolean, Double, and Integer

public class b5WrapperClasses {
    /**
     * Each java primitive has a corresponding wrapper class.
     * A wrapper class creates an object.
     * You don't always have to construct a wrapper class before using because jave support auto-boxing
     *      - Whenever a method or a constructor expect a wrapper class, you can use the corresponding primitive type because
     *      java will automatically convert the primitive type into the wrapping class
     */

    public static void main (String args[]){
        int x = 20;
        Integer y = Integer.valueOf(x); //converts int a into integer
        Integer z = x; //autoboxing will write integer.valueof(a) internally

        System.out.println(x + " " +y+ " " + z);

        byte b=10;
        short s=20;
        int i=30;
        long l=40;
        float f=50.0F;
        double d=60.0D;
        char c='a';
        boolean b2=true;

        //Autoboxing: Converting primitives into objects
        Byte byteobj=b;
        Short shortobj=s;
        Integer intobj=i;
        Long longobj=l;
        Float floatobj=f;
        Double doubleobj=d;
        Character charobj=c;
        Boolean boolobj=b2;

        //Printing objects
        System.out.println("---Printing object values---");
        System.out.println("Byte object: "+byteobj);
        System.out.println("Short object: "+shortobj);
        System.out.println("Integer object: "+intobj);
        System.out.println("Long object: "+longobj);
        System.out.println("Float object: "+floatobj);
        System.out.println("Double object: "+doubleobj);
        System.out.println("Character object: "+charobj);
        System.out.println("Boolean object: "+boolobj);

        //Unboxing: Converting Objects to Primitives
        byte bytevalue=byteobj;
        short shortvalue=shortobj;
        int intvalue=intobj;
        long longvalue=longobj;
        float floatvalue=floatobj;
        double doublevalue=doubleobj;
        char charvalue=charobj;
        boolean boolvalue=boolobj;

        //Printing primitives
        System.out.println("---Printing primitive values---");
        System.out.println("byte value: "+bytevalue);
        System.out.println("short value: "+shortvalue);
        System.out.println("int value: "+intvalue);
        System.out.println("long value: "+longvalue);
        System.out.println("float value: "+floatvalue);
        System.out.println("double value: "+doublevalue);
        System.out.println("char value: "+charvalue);
        System.out.println("boolean value: "+boolvalue);

    }

}
