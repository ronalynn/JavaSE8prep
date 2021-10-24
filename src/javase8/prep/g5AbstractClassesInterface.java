package javase8.prep;
//Use abstract classes and interfaces
abstract class g5AbstractClassesInterface {

    /**
     * Interface: the declaration of methods of an object, not the implementation.
     * We define what kind of operation an object can perform.
     *      interface Vehical {
     *             // declaration
     *             void changeGear(int newValue);
     *              void speedUp(int increment);
     *              void applyBrakes(int decrement);
     * }
     * class Car implements Vehical {
     *          int speed = 0;
     *          int gear = 1;
     *          // implementation
     *          void changeGear(int newValue) {
     *                  gear = newValue;
     *           }
     *           void speedUp(int increment) {
     *                  speed = speed + increment;
     *           }
     *            void applyBrakes(int decrement) {
     *                  speed = speed - decrement;
     *            }
     *             void printStates() {
     *                   System.out.println(" speed:" + speed + " gear:" + gear);
     *             }
     * }
     *
     *
     * Abstract Class: used to define default behaviour for a subclass.
     *      When to use:
     *          When using inheritance concept since it provides a common base class
     *          Want to declare non-public members
     *          All methods must be public
     *   When a class is marked as abstract it cannot be instantiated
     *   Methods in an abstract class cannot have a ody.
     *
     *  abstract void sum(int a, int b);
     *
     *
     */


}

