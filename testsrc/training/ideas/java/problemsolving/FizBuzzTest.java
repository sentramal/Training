package training.ideas.java.problemsolving;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idntam on 8/10/2014.
 */
public class FizBuzzTest {

    @Test
    public  void print_fiz_buzz_for_given_numbers(){
        int num=20;
        String expectedNumber[]={"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz","16","17","Fizz","19","Buzz"};
        Assert.assertArrayEquals(expectedNumber, FizBuzz.fizBuzz(num));
    }
}
