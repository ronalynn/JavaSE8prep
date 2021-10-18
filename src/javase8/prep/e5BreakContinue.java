package javase8.prep;

public class e5BreakContinue {
    public static void main (String[] args){
        //break statement can also be used to jump out of a loop

        System.out.println("In a FOR loop: ");
        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                break; //will stop loop when i = 7
            }
            System.out.println(i);
        }

        System.out.println("\n");

        for (int j = 0; j < 10; j++) {
            if (j == 7) {
                continue; //skips the value of 7
            }
            System.out.println(j);
        }

        System.out.println("\nIn a WHILE loop: ");
        int x = 0;
        while (x <10){
            System.out.println(x);
            x++;
            if(x == 5){
                break; //stops loop when x = 5
            }
        }

        System.out.println("continue");

        int y = 0;
        while (y < 10) {
            if (y == 5) {
                y++;
                continue;
            }
            System.out.println(y);
            y++;
        }
    }


}
