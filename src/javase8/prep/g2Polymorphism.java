package javase8.prep;

/**
 * Develop code that makes use of polymorphism;
 * develop code that overrides methods;
 * differentiate between the type of a reference and the type of an object
 */
public class g2Polymorphism {

    /**
     * POLYMORPHISM:
     *  performing a single action in different ways.
     *  in java we can perform polymorphism in java by method overloading and method overriding
     */

    public static void main(String[] args) {
        Shapes myShape = new Shapes();  // Create a Shapes object
        Shapes myTriangle = new Triangle();  // Create a Triangle object
        Shapes myCircle = new Circle();  // Create a Circle object
        myShape.area();
        myTriangle.area();
        myShape.area();
        myCircle.area();
    }
}

class Shapes {
    public void area() {
        System.out.println("The formula for area of ");
    }
}
class Triangle extends Shapes {
    public void area() {
        System.out.println("Triangle is ½ * base * height ");
    }
}
class Circle extends Shapes {
    public void area() {
        System.out.println("Circle is 3.14 * radius * radius ");
    }
}

/**
 * OVERLOADING
 *  creating multiple methods of the same name in the same class and all methods work in
 *  different ways.
 *
 *  class Shapes {
 *   public void area() {
 *     System.out.println("Find area ");
 *   }
 * public void area(int r) {
 *     System.out.println("Circle area = "+3.14*r*r);
 *   }
 *
 * public void area(double b, double h) {
 *     System.out.println("Triangle area="+0.5*b*h);
 *   }
 * public void area(int l, int b) {
 *     System.out.println("Rectangle area="+l*b);
 *   }
 * }
 *
 * class Main {
 *   public static void main(String[] args) {
 *     Shapes myShape = new Shapes();  // Create a Shapes object
 *
 *     myShape.area();
 *     myShape.area(5);
 *     myShape.area(6.0,1.2);
 *     myShape.area(6,2);
 *
 *   }
 * }
 *
 * OUTPUT:
 *      Find area
 *      Circle area = 78.5
 *      Triangle area=3.60
 *      Rectangle area=12
 *
 */

/**
 * OVERRIDING:
 *      when a subclass or a child class has the same method as declared in the parent class.
 *
 * class Vehicle{
 *   //defining a method
 *   void run(){System.out.println("Vehicle is moving");}
 * }
 * //Creating a child class
 * class Car2 extends Vehicle{
 *   //defining the same method as in the parent class
 *   void run(){System.out.println("car is running safely");}
 *
 *   public static void main(String args[]){
 *   Car2 obj = new Car2();//creating object
 *   obj.run();//calling method
 *   }
 * }
 *
 * OUTPUT:
 *      Car is running safely
 */
