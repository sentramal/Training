package training.ideas.java.fibonacci;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idntam on 8/5/2014.
 */
public class FibonacciSeriesTest {

    @Test
    public  void given_fibonacci_series_of_10_numbers(){
        int num=10;
      int expectedNumber[]={0,1,1,2,3,5,8,13,21,34};
        Assert.assertArrayEquals(expectedNumber, FibonacciSeries.fibonacciCalculation(num));
    }

    @Test
    public  void given_fibonacci_series_of_2_numbers(){
        int num=2;
        int expectedNumber[]={0,1};
        Assert.assertArrayEquals(expectedNumber, FibonacciSeries.fibonacciCalculation(num));
    }

    @Test
    public  void given_fibonacci_series_of_1_numbers(){
        int num=1;
        int expectedNumber[]={0};
        Assert.assertArrayEquals(expectedNumber, FibonacciSeries.fibonacciCalculation(num));
    }

    @Test
    public  void given_fibonacci_series_of_6_numbers(){
        int num=6;
        int expectedNumber[]={0,1,1,2,3,5};
        Assert.assertArrayEquals(expectedNumber, FibonacciSeries.fibonacciWithoutLoops(num));
    }
}
