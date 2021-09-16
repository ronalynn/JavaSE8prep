package javase8.prep;
/**
 * Create executable Java applications with a main method;
 * run a Java program from the command line;
 * produce console output
 */
public class a3ExecutableMain {

    public static void main(String[] args){
        //a3ExecutableMain
        a3ExecutableMain numToCube = new a3ExecutableMain();
        numToCube.cubed(5);
    }

    void cubed(int num){
        System.out.println(num * num * num);
    }

    /**
     * To print from console:
     * 1. cd into file
     * 2. javac <file name>.java
     * 3. java <file name>.java
     */

}
