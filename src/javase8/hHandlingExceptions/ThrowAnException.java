package javase8.hHandlingExceptions;

public class ThrowAnException {
    public static void main(String[] args) {
        try{
            int result = divideInt(10,5);
            System.out.println("10 divided by 5 is " + result);
            divideInt(10,0);
            System.out.println("10 divided by 0 is" +result);
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static int divideInt(int i, int j){
        if(j==0){
            throw new IllegalArgumentException("Divisor cannot be 0!");
        }
        return i/j;
    }
}
