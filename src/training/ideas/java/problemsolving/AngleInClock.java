package training.ideas.java.problemsolving;

/**
 * Created by idntam on 8/10/2014.
 */
public class AngleInClock {

    public static double angleCalculation(int hour, int min)
    {
        double hourAngle, minAngle, angle;
        hourAngle=(double)((60*hour)+min)/2;
        minAngle=(double)6*min;
        angle= hourAngle-minAngle;
        if(hourAngle<minAngle)
        {
            return angle*(-1);
        }
        return angle;
    }
}
