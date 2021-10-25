package javase8.iWorkingWithSelectedClassesFromTheJavaAPI;

import java.util.Arrays;
import java.util.List;

//Manipulate data using the StringBuilder class and its methods
public class StringBuilderDemo {
    public static void main(String[] args) {
        List<String> trees = Arrays.asList("oak", "elm", "ash", "birch", "willow");
        System.out.println(listToString(trees));
    }

    private static String listToString(List<String> list){
        StringBuilder sb = new StringBuilder();

        for (String el : list){
            sb.append(el).append(", ");
        }
        return sb.toString();
    }
}
