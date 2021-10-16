package javase8.prep;

//Use Java operators; use parentheses to override operator precedence

public class c1JavaOperators {
    /**
     * Operator precedence:
     *      1. Assignments: =, +=, -=, *=, /=, %=
     *      2. Ternary: ?:
     *      3. Logical OR: ||
     *      4. Logical AND: &&
     *      5. Bitwise OR: |
     *      6. Bitwise XOR: ^
     *      7. Bitwise AND: &
     *      8. equality: !=, ==
     *      9. Relational:  <, <=, >, >=, instance of
     *      10. Shift: >>, <<, >>>
     *      11. Additive String Concatenation: -, +
     *      12. Multiplication, Division, Modulus: *, /, %
     *      13.Cast object creation: -, +, ~, !, (type)
     *      14. Unary pre-increment/decrement: i++, i--
     *      15. Unary post-inc/dec: ++i, --i
     *      16. Dot operator, parentheses, array subscript: ., (), []
     *
     * When operators have the same precedence, the execution is from left to right,
     * and parentheses can override operator precedence.
     */

    public static void main(String[] a){
        int i = 5;
        System.out.println("ans: " + (i++ + 10/--i));  //7
        /**
         * eqv: (i++) + 10/(--i)
         *      =(5+1) + 10/(6)
         *      =(5) + 10/(6-1)
         *      =5 + (10 / 5)
         *      =5 + 2
         *      =7
         */
        System.out.println(i++);
        System.out.println(i);
        System.out.println(--i);

    }
}
