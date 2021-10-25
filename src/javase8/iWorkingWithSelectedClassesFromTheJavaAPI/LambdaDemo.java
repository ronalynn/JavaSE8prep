package javase8.iWorkingWithSelectedClassesFromTheJavaAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//Write a simple Lambda expression that consumes a Lambda Predicate expression
public class LambdaDemo {
    public static void main(String[] args) {
        /**
         * Predicate in general meaning is a statement about something that is either true or false.
         * In programming, predicates represent single argument functions that return a boolean value
         */

        List<Integer> nums = List.of(2, 3, 1, 5, 6, 7, 8, 9, 12);
        BiggerThanFive<Integer> btf = new BiggerThanFive<>();
        nums.stream().filter(btf).forEach(System.out::println);

        System.out.println("\nBigger than 2:");
        //with lambda
        Predicate<Integer> bt2 = n -> n > 2;
        nums.stream().filter(bt2).forEach(System.out::println);

        //removeIf
        var colours = new ArrayList<String>();
        colours.add("Red");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue"); //
        colours.add("Orange");
        colours.add("Purple");
        colours.add("Indigo");
        colours.add("Pink"); //
        colours.add("Chartruese");
        colours.add("Lime"); //

        Predicate<String> hasFourChars = colour -> colour.length() == 4;
        colours.removeIf(hasFourChars);
        System.out.println(colours);
    }
}

class BiggerThanFive<E> implements Predicate<Integer> {

    @Override
    public boolean test(Integer v) {
        Integer five = 5;
        return v > five;
    }
}

