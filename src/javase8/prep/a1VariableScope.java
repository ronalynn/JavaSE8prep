package javase8.prep;

public class a1VariableScope {

    //GLOBAL VARIABLE SCOPE:
    static int g = 9; // Can be in the methods within these curly braces

    public static void main(String[] args){

        if(g == 9) {
            System.out.println("i see g: " + g); //works because declared globally
        }

        //cannot use a or b here as they have not been declared yet
        int a = 0; // a is now declared so can be used below
        if (a == 0){
            int b = 1; //b has been declared below, but only within this if block
            System.out.println("i see a: " + a);
            System.out.println("i see b: " + b);
        }
        System.out.println("i can still see a: " + a);
        //cannot see b


        //SCOPE IN METHODS:
        int f = 10; //can only be seen within these curly braces
        add(3,4); //method can be used even tho declared after
        //cannot see e variable here
    }

    private static void add(int c, int d) {
        int e = 1; //can only see e variable inside this block
        System.out.println(c+d);
        //variable f cannot be seen in this method.
    }
}
