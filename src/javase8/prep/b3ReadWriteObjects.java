package javase8.prep;

//Know how to read or write to object fields

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class b3ReadWriteObjects {
    public static void main (String args[]){
        int area;
        int h = 0;
        int w = 0;
        String strH = "";
        String strW = "";

        BufferedReader reader;
        reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the height: ");
        try {
            strH = reader.readLine(); //takes as string
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(2);
        }

        System.out.print("Enter the width: ");
        try {
            strW = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(2);
        }

        h = Integer.parseInt(strH);
        w = Integer.parseInt(strW);

        area = h * w;
        System.out.println("Area = " + area);


        Scanner in = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = in.nextInt();
        System.out.print("enter b: ");
        int b = in.nextInt();
        in.close();
        int sum = a + b;
        System.out.print(a + " + " + b + " = " + sum);
    }

}
