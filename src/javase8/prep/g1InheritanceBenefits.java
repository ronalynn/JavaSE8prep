package javase8.prep;

// Describe inheritance and its benefits
public class g1InheritanceBenefits {
    /**
     * Use keyword EXTENDS to establish inheritance between superclass to subclass.
     *  class SubClass extends SuperClas{...}
     *
     * All public and protected methods and variables are accessible to the subclass.
     *
     * Benefits:
     *  Code re-usability
     */
        public static void main(String args[]) {
            Dog d = new Dog();
            d.bark();
            d.eat();
        }
    }

class Animal{
    void eat(){

        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}

