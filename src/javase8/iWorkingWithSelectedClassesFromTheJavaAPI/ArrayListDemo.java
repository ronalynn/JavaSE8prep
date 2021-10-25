package javase8.iWorkingWithSelectedClassesFromTheJavaAPI;

import java.util.ArrayList;

//Declare and use an ArrayList of a given type
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<String>();
        subjects.add("Mathematics");
        subjects.add("English");
        subjects.add("French");
        subjects.add("P.E.");

        //accessing elements
        for (Object s : subjects){
            System.out.println("subject " + subjects.indexOf(s) + ": " + s);
        }
    }
}
