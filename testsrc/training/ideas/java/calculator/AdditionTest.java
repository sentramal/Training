package training.ideas.java.calculator;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idntam on 7/21/2014.
 */
public class AdditionTest {

    @Test
    public void addTwoIntegers() {
        Addition number = new Addition(2,3);
        Assert.assertEquals(2+3,number.add ());

    }

    @Test
    public void addTwoDouble(){

        Assert.assertEquals(99999.99+11111.11,Addition.add(99999.99,11111.11));
    }


    @Test
    public void arrayAdd() {

        int sum[]={2,3};
       Assert.assertEquals(2+3,Addition.add(sum));
    }

    @Test
    public void arrayDoubleAdd()
    {
        double sum[]={34.11,22.56};
        Assert.assertEquals(34.11+22.56,Addition.add(sum));
    }

    @Test
    public void arrayAddDouble()
    {
        double sum1[]={34.11,22.56,33,25,26,27};
        Assert.assertEquals(34.11+22.56+33+25+26+27,Addition.addDoubleArray(sum1));
    }

    @Test
    public void addNumbersInt()
    {

        Assert.assertEquals(22+33+44+55+66,Addition.addMultipleNumber(22,33,44,55,66));
    }


}


