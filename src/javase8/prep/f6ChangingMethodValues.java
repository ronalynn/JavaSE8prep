package javase8.prep;

//Determine the effect upon object references and primitive values when they are passed into methods that change the values

public class f6ChangingMethodValues {
    public static void main(String[] args) {
        /**
         * Primitive Values:
         *  A copy is passed in, chaenges the value inside the method body,
         *  original copy won't be affected.
         *
         * Object Reference:
         *  A pointer to the reference is passed in.
         *  Object can be changed via the object reference.
         */

        int x = 1;
        int y = 2;
        System.out.println("Before Primitive Modification - x: " + x + ", y: " + y);

        primitiveMod(x, y);
        System.out.println("After Primitive Modification - x: " + x + ", y: " + y);
        // Does not change

        objNumbs objNumbs = new objNumbs(22, 11);
        System.out.println("Before Object Modification - a: " + objNumbs.getA() + ", b: " + objNumbs.getB());
        changeObj(objNumbs);
        System.out.println("After Primitive Modification - a: " + objNumbs.getA() + ", b: " + objNumbs.getB());
        // Does change!!!!



    }

    private static void primitiveMod(int x, int y){
        x = 99;
        y = 100;
    }

    public static void changeObj(objNumbs o){
        o.setA(27);
        o.setB(5);
    }

    static class objNumbs{
        private int a;
        private int b;

        public objNumbs(int a, int b) {
            this.a = a;
            this.b = b;
        }
        public objNumbs() {
            this.a = 0;
            this.b = 0;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
    }
}
