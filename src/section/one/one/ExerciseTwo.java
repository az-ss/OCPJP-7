package section.one.one;

/**
 * http://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html
 */

public class ExerciseTwo {

    //constants
    private static final int FIRST_ARGUMENT = 12;
    private static final int SECOND_ARGUMENT = 14;

    //local variables
    int a, b, c;         // declares three ints, a, b, and c
    int d = 3, e, f = 5; // declares three more ints, initializing d and f
    byte z = 22;         // initializes z
    double pi = 3.14159; // declares an approximation of pi
    char x = 'x';

    public static void main(String [] args) {
        //class variable
        int result = 0;
        result = FIRST_ARGUMENT + SECOND_ARGUMENT;
        System.out.println("result = " + result);

        int temp = 0; //delete "= 0 " to get an error
        temp = temp + 1;
        System.out.println("temp = " + temp);

    }
}
