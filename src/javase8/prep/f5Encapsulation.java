package javase8.prep;

//Apply encapsulation principles to a class

public class f5Encapsulation {
    public static void main(String[] args) {
        /**
         * Encapsulation is the technique of making the fields in a class private
         * and providing access to the fields via public methods
         *
         * BENEFITS:
         *  Class can have total control over what is stored in its fields
         *  The fields of a class can be made read-only or write-only
         */

        Student s = new Student();
        s.setId(1);
        s.setName("OCA");
        System.out.println(s.getId() + "  " + s.getName());
    }
}

class Student {
    /**
     * without the private access modifier any class within same package of that class can
     *  assign and change values to those variables by creating object for that class.
     * By this , We wouldn’t have control over what values are going to be stored in
     *  Student class variables
     */
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals("") && !name.equals(null))
            this.name = name;
    }

    public void setId(int id) {
        if (id > 0)
            this.id = id;
    }

}
