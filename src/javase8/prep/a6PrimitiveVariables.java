package javase8.prep;

public class a6PrimitiveVariables {
    public static void main (String args[]){

        //UNSIGNED CHARACHTER
        char initials = 'N'; //stores single charachter/letter or ASCII value

       //INTEGER
        byte x = 1; //stores whole numbers from -128 to 127
        short mortgage = 30_000; // whole numbers from -32,768 to 32,767
        int year = 2021; //whole numbers from -2,147,483,648 to 2,147,483,647
        long population = 66650000; //whole numbers -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        //FLOATING POINT
        float fredo = 0.2F; //fractional numbers with 6 to 7 decimal digits
        double pi = 3.142; //fractional numbers up to 15 decimal digits

        //BOOLEAN
        boolean isZero = true; //can be true or false

        //casting
        char grade = 'A';
        double d1 = grade;

        System.out.println(d1); // A ASCII value is 65, will print 65.0
        System.out.println(grade * grade); // 65.0 * 65.0 = 4225
    }
}
