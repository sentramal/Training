package training.ideas.java.problemsolving;


import org.junit.Test;

/**
 * Created by idntam on 8/11/2014.
 */
public class RoundUpCentTest {

    @Test
    public  void verify_round_up_to_5_cents_for_a_given_numbers_(){

        double amount =20.32;
        double expectedNumber= 20.35;
        junit.framework.Assert.assertEquals(expectedNumber,RoundUpCent.roundUp(amount));

    }

    @Test
    public  void verify_round_up_to_5_cents_for_a_random_numbers(){

        double amount =55.68;
        double expectedNumber= 55.70;
        junit.framework.Assert.assertEquals(expectedNumber,RoundUpCent.roundUp(amount));

    }

    @Test
    public  void verify_round_up_to_5_cents_for_a_exact_numbers(){

        double amount =55.00;
        double expectedNumber= 55.00;
        junit.framework.Assert.assertEquals(expectedNumber,RoundUpCent.roundUp(amount));

    }

    @Test
    public  void verify_round_up_to_5_cents_for_exact_numbers(){

        double amount =55.55;
        double expectedNumber= 55.55;
        junit.framework.Assert.assertEquals(expectedNumber,RoundUpCent.roundUp(amount));

    }
}
