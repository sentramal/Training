package training.ideas.java.fibonacci;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idntam on 8/7/2014.
 */
public class RecursionTest {

    @Test
    public  void given_recursion_series_of_10_numbers(){
        int num=10;
        int expectedNumber[]={0,1,1,2,3,5,8,13,21,34};
        Assert.assertArrayEquals(expectedNumber, Recursion.fibonacciCalculationRecursion(num));
    }

    @Test
    public  void given_recursion_series_of_2_numbers(){
        int num=2;
        int expectedNumber[]={0,1};
        Assert.assertArrayEquals(expectedNumber, Recursion.fibonacciCalculationRecursion(num));
    }

    @Test
    public  void given_recursion_series_of_1_numbers(){
        int num=1;
        int expectedNumber[]={0};
        Assert.assertArrayEquals(expectedNumber, Recursion.fibonacciCalculationRecursion(num));
    }
}
