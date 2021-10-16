package javase8.prep;

//Declare, instantiate, initialize and use a one-dimensional array

import java.util.Arrays;

public class d1OneDimArray {
    public static void main(String[] args){
        int[] myArray;          //declaration: my array will hold int data types
        myArray = new int[5];   //instantiation: to use the declared array we have to instantiate it using keyword 'new'
        myArray[0] = 99;        //initialization: initializes position 0 in myArray as 10
        System.out.println(myArray[0]);

        int[] nums = {1, 2, 3, 4, 5}; //declaration, instantiation, and initialization all in one
        System.out.println(Arrays.toString(nums));

        for(int i=0; i<5 ; i++){
            nums[i] *= 5;
            System.out.println(nums[i]);
        }



    }
}
