package training.ideas.java.problemsolving;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idntam on 8/10/2014.
 */
public class AngleInClockTest {

    @Test
    public  void angle_between_two_hands_of_a_clock_for5hr21min()
    {
        double hour=5;
        double min= 12;
        Assert.assertEquals(84.0,AngleInClock.angleCalculation(hour,min));
    }

    @Test
    public  void angle_between_two_hands_of_a_clock_for12hr12min()
    {
        double hour=12;
        double min= 12;
        Assert.assertEquals(294.0,AngleInClock.angleCalculation(hour,min));
    }

    @Test
    public  void angle_between_two_hands_of_a_clock_for2hr45min()
    {
        double hour=2;
        double min= 45;
        Assert.assertEquals(187.5,AngleInClock.angleCalculation(hour,min));
    }

    @Test
    public  void angle_between_two_hands_of_a_clock_for9hr00min()
    {
        double hour=3;
        double min= 0;
        Assert.assertEquals(90.0,AngleInClock.angleCalculation(hour,min));
    }
}
