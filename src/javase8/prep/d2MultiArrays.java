package javase8.prep;

public class d2MultiArrays {
    public static void main (String[] args){
        int[][] twoD = new int[3][4]; // creates an array with 12 elements, 3 rows, 4 columns
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);

        int[][][] threeD = {
                { { 1, 2, 3 },
                        { 4, 5, 6 } },
                { { 1, 4, 9 },
                        { 16, 25, 36 } },
                { { 1, 8, 27 },
                        { 64, 125, 216 } } };

        System.out.println("\n3x2x3 array is given below:");
        //print the 3-d array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(threeD[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }



    }
}
