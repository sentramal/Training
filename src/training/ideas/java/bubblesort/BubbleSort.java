package training.ideas.java.bubblesort;

/**
 * Created by idntam on 8/4/2014.
 */
public class BubbleSort {


    private static enum SortOrder {ASC, DESC};

    private static boolean sortCondition(int swapCounter, int[]inputNumbers,SortOrder sortOrder ){
        if(sortOrder==sortOrder.ASC){
            return inputNumbers[swapCounter]>inputNumbers[swapCounter+1];
        }
        else {
            return  inputNumbers[swapCounter]<inputNumbers[swapCounter+1];
        }
    }

    private static int[] sort (int[] inputNumbers, SortOrder sortOrder){
        int temp=0;
        for(int elementCounter=0;elementCounter<inputNumbers.length-1;elementCounter++){
            for(int swapCounter=0;swapCounter<inputNumbers.length-1-elementCounter;swapCounter++)
            {
                if (sortCondition( swapCounter,inputNumbers,sortOrder))
                {
                    temp = inputNumbers[swapCounter];
                    inputNumbers[swapCounter]=inputNumbers[swapCounter+1];
                    inputNumbers[swapCounter+1]=temp;
                }
            }

        }
        return inputNumbers;
    }
    public static int[] asc(int[] inputNumbers)
    {
        return sort(inputNumbers, SortOrder.ASC);
    }

    public static int[] desc(int[] inputNumbers)
    {
        return sort(inputNumbers,SortOrder.DESC);
    }
}
