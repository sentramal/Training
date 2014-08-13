package training.ideas.java.insertionsort;

/**
 * Created by idntam on 8/4/2014.
 */
public class InsertionSort {


//    private static int[] sort(int[] inputNumbers, SortOrder sortOrder)
//    {
//        int temp = 0;
//        int replaceCounter;
//        for (int elementCounter = 1; elementCounter < inputNumbers.length; elementCounter++) {
//            for (int swapCounter = 0; swapCounter < elementCounter; swapCounter++) {
//                if (sortCondition(inputNumbers,swapCounter,elementCounter,sortOrder)) {
//                    temp = inputNumbers[swapCounter];
//                    inputNumbers[swapCounter] = inputNumbers[elementCounter];
//
//                    for (replaceCounter = elementCounter; replaceCounter > swapCounter; replaceCounter--)
//                        inputNumbers[replaceCounter] = inputNumbers[replaceCounter - 1];
//                    inputNumbers[replaceCounter + 1] = temp;
//                }
//            }
//
//        }
//        return inputNumbers;
//    }

    public enum SortOrder {
        ASC, DESC;
    }

    private static boolean condition(int LHS,int RHS,SortOrder sortOrder){
        if (sortOrder==SortOrder.ASC){
            return LHS >RHS;
        }
        else return LHS<RHS;
    }


    public static int[] desc(final int[] inputNumbers) {
        return Sort(inputNumbers, SortOrder.DESC);
    }

    public static int[] asc(final int[] inputNumbers) {
        return Sort(inputNumbers, SortOrder.ASC);
    }

    private static int[] Sort(final int[] numbers, SortOrder sortOrder) {
        int lengthOfNumber = numbers.length;
        int hold;
        int counter;

        for (int indexCounter = 0; indexCounter < lengthOfNumber; indexCounter++) {
            hold = numbers[indexCounter];
            counter = indexCounter - 1;
            while (counter >= 0 && condition(numbers[counter], hold, sortOrder)) {
                numbers[counter + 1] = numbers[counter];
                numbers[counter] = hold;
                counter = counter - 1;
            }
        }
        return numbers;

    }
}
