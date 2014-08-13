package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idntam on 7/25/2014.
 */
public class MinLOSCalculationTest {
//@Test
//public void given_FPLOS_is_NYYYYYY_then_MINLOS_should_be_2(){
//    String fplos[]={"N","Y","Y","Y","Y","Y","Y"};
//    Assert.assertEquals(2,MinLOSCalculation.generateMINLOS(fplos));

//}

    @Test
    public void given_FPLOS_is_NNYYYYY_then_MINLOS_should_be_2(){

        Assert.assertEquals(3,MinLOSCalculation.generateMINLOS("NNYYYYY"));

    }

}
