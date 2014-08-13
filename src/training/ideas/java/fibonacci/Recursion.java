package training.ideas.java.fibonacci;

/**
 * Created by idntam on 8/7/2014.
 */
public class Recursion {

    public static int[] fibonacciCalculationRecursion(int num)
    {
        int[] fibonacciSeriesArray = new int[num];
        for(int i=0;i<num;i++)
        {
            fibonacciSeriesArray[i]=fibonacciSeries(i);
        }
        return fibonacciSeriesArray;
    }
    public static int fibonacciSeries(int elementIndex)
    {

        if(elementIndex==0)
        {
            return 0;
        }
        if(elementIndex==1)
        {
            return 1;
        }
        else
        {
            return fibonacciSeries(elementIndex-1)+fibonacciSeries(elementIndex-2);
        }
    }
}
