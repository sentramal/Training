package training.ideas.java.fibonacci;

/**
 * Created by idntam on 8/5/2014.
 */
public class FibonacciSeries {
//    public static int[] fibonacciCalculation(int num) {
//        int first = 1;
//        int second = 1;
//        
//      int[] fibonacciSeriesArray = new int[num];
//        fibonacciSeriesArray[0]=first;
//        fibonacciSeriesArray[1]=second;
//        for (int i = 2; i < num; i++) {
//            fibonacciSeriesArray[i] = first + second;
//            first = second;
//            second = fibonacciSeriesArray[i];
//        }
//        return fibonacciSeriesArray;
//
//    }

    public static int[] fibonacciCalculation(int num) {
        int[] fibonacciSeriesArray = new int[num];
        fibonacciSeriesArray[0]=0;
        if(num==1){
            return fibonacciSeriesArray;
        }
        fibonacciSeriesArray[1]=1;

        for (int i = 2; i < num; i++) {
            fibonacciSeriesArray[i]= fibonacciSeriesArray[i-1]+fibonacciSeriesArray[i-2];
        }
        return fibonacciSeriesArray;

    }

    public static int[] fibonacciWithoutLoops(int limit)
    {
        int[] fiboNumbers= new int[limit];
        int first=0,second=1,third=0;
        int count=2;
        fiboNumbers[0]=0;
        fiboNumbers[1]=1;

        while(count<limit)
        {
            third=swaps(first,second);
            fiboNumbers[count]=third;
            count++;
        }
        return fiboNumbers;
    }

    public static int swaps(int first,int second)
    {
        //int third=0;
        int third=first+second;
        first=second;
        second=third;
        return third;
    }

}
