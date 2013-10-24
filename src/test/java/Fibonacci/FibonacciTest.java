package Fibonacci;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: rlatta
 * Date: 10/23/13
 * Time: 8:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class FibonacciTest {

    private Fibonacci fib;
    @Before
    public void setUp() throws Exception {
        fib = new Fibonacci();
    }

    @Test
    public void testSingleFibonacciRecursive() throws Exception {
        Assert.assertEquals(2, fib.recursiveFibonacci(3));
        Assert.assertEquals(1, fib.recursiveFibonacci(1));
        Assert.assertEquals(0, fib.recursiveFibonacci(0));
        Assert.assertEquals(3, fib.recursiveFibonacci(4));
        Assert.assertEquals(5, fib.recursiveFibonacci(5));
    }

    @Test
    public void testPrintFibonacci() throws Exception {
        Assert.assertEquals("0 1 1", fib.fibonacciSequenceAsString(3));
        Assert.assertEquals("0 1 1 2 3", fib.fibonacciSequenceAsString(5));
    }
}

