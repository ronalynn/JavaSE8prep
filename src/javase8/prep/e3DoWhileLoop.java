package javase8.prep;
//Create and use do/while loops
public class e3DoWhileLoop {
    public static void main (String[] args){
        int i = 10;
        do{
            System.out.println(i);
            i--;
        }while (i>0);

        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("\n");
        do {
            System.out.println(array[i]);
            i++;
        } while (i<9);
    }
}
