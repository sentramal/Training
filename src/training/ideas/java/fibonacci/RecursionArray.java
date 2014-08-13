package training.ideas.java.fibonacci;

/**
 * Created by idntam on 8/11/2014.
 */
public class RecursionArray {
    public static int[] fibonacciCalculationRecursionArray(int num) {

        int[] fibonacciSeriesArray = new int[num];
        fibonacciSeries(fibonacciSeriesArray,num);
        return fibonacciSeriesArray;
    }

    public static void fibonacciSeries(int[] fibonacciSeriesArray, int num) {
        if (num == 0)
        {
            return;
        }
        if (num == 1)
        {
            fibonacciSeriesArray[0] = 0;
            return;
        }
        if (num == 2)
        {
            fibonacciSeriesArray[1] = 1;
            return ;
        }
        fibonacciSeries(fibonacciSeriesArray, num - 1);

        fibonacciSeriesArray[num - 1] = fibonacciSeriesArray[num - 2] + fibonacciSeriesArray[num - 3];

    }

}
