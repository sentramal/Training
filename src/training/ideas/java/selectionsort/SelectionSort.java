package training.ideas.java.selectionsort;

/**
 * Created by idntam on 8/4/2014.
 */
public class SelectionSort {





   private static enum SortOrder {ASC, DESC};

   private static boolean sortCondition(int[]inputNumbers,int swapCounter, int smallest, SortOrder sortOrder ){
       if(sortOrder==sortOrder.ASC)
       {
           return inputNumbers[swapCounter] < inputNumbers[smallest];
       }
       else
       {
           return inputNumbers[swapCounter] > inputNumbers[smallest];
       }
   }

//   private static int[] sort (int[] inputNumbers, SortOrder sortOrder){
//
//       int temp=0;
//       for(int elementCounter=0;elementCounter<inputNumbers.length;elementCounter++)
//       {
//           for (int swapCounter=elementCounter+1;swapCounter<inputNumbers.length;swapCounter++){
//               if(sortCondition(inputNumbers,swapCounter,elementCounter,sortOrder))
//               {
//                   temp=inputNumbers[elementCounter];
//                   inputNumbers[elementCounter]=inputNumbers[swapCounter];
//                   inputNumbers[swapCounter]=temp;
//               }
//           }
//       }
//       return inputNumbers;
//   }

    private static int[] sort (int[] inputNumbers, SortOrder sortOrder){

        int temp=0;
        for(int elementCounter=0;elementCounter<inputNumbers.length-1;elementCounter++)
        {  int smallest=elementCounter;
            for (int swapCounter=elementCounter+1;swapCounter<inputNumbers.length;swapCounter++)
            {

                if(sortCondition(inputNumbers,swapCounter,smallest,sortOrder))
                {
                    smallest=swapCounter;

                }
            }
            temp=inputNumbers[elementCounter];
            inputNumbers[elementCounter]=inputNumbers[smallest];
            inputNumbers[smallest]=temp;
        }
        return inputNumbers;
    }

    public static int[] asc(int[] inputNumbers) {

    return sort(inputNumbers,SortOrder.ASC);
    }

    public static int[] desc(int[] inputNumbers) {

    return sort(inputNumbers,SortOrder.DESC);
    }
}
