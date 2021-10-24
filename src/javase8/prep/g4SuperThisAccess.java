package javase8.prep;
//Use super and this to access objects and constructors
public class g4SuperThisAccess {
    /**
     * THIS:
     *  a key word used to reference instance variables and methods declared in current class or subclass
     *  When local variable and instance variable hav ethe same name, local variable hides the instance vairbale
     *
     * SUPER:
     *  a keyword used to reference instance variable and methods declared in superclass
     */

    int a;
    int b;

    public void setData(int a, int b){
        this.a = a;
        this.b = b;
        //without this, would be 0.

    }

    public void showData(){
        System.out.println("Value of A ="+a);
        System.out.println("Value of B ="+b);
    }
    public static void main(String[] args) {
        Car c = new Car();

        g4SuperThisAccess obj = new g4SuperThisAccess();
        obj.setData(2,3);
        obj.showData();
    }
}

/* superclass Person */
class Vehicle {
    Vehicle() {
        System.out.println("Vehicle class Constructor");
    }
}

/* subclass Student extending the Person class */
class Car extends Vehicle {
    Car() {
        // invoke or call parent class constructor
        super();
        System.out.println("Car class Constructor");
    }
}
