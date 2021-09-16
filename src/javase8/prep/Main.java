package javase8.prep;

public class Main {

    public static void main(String[] args) {

        //a2ClassStructure
        a2ClassStructure inside = new a2ClassStructure(); //create new object
        System.out.println(inside.x + 4); //access variables within that object
        System.out.println(inside.greeting);

        a2ClassStructure anotherObject = new a2ClassStructure(); //can create multiple objects from the same class
        anotherObject.printHi("Ronalyn"); //prints using the print statement inside the method printHi()

    }
}
