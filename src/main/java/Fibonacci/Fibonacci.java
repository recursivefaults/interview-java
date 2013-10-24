package Fibonacci;

/**
 * Fibonacci number interview questions.
 *
 * The first, and most basic is print the fibonacci sequence.
 */
public class Fibonacci {

    public Fibonacci() {

    }


    /**
     * Recursively generate the nTH fibonacci number.
     * @param numberInSequence the nth number in fibonacci (2 would be the 2nd number in the sequence)
     * @return the requested fibonacci number in sequence.
     */
    public int recursiveFibonacci(int numberInSequence) {
        if(numberInSequence == 0 || numberInSequence == 1) {
            return numberInSequence;
        }
        return recursiveFibonacci(numberInSequence - 2) + recursiveFibonacci(numberInSequence - 1);
    }

    /**
     *
     */
    public String fibonacciSequenceAsString(int toNumber) {
        String fib = "";
        for(int i = 0; i < toNumber; ++i) {
            fib += recursiveFibonacci(i);
            if(i + 1 != toNumber) {
                fib += " ";
            }
        }
        return fib;
    }
}
