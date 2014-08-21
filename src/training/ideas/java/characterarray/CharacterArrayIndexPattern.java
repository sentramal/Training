package training.ideas.java.characterarray;

/**
 * Created by idntam on 8/18/2014.
 */
public class CharacterArrayIndexPattern {

    public static int occurrenceOfSecondArray(char[] firstArray, char[] secondArray) {
        int resultIndex=0;

        int indexCounter,compareCounter,element;

        for(indexCounter=0;indexCounter<firstArray.length;indexCounter++)
        {
            element=indexCounter;
            for (compareCounter=0;compareCounter<secondArray.length;compareCounter++)
            {
                if(firstArray[element]==secondArray[compareCounter])
                {
                    element++;
                }
                else
                    break;
            }
            if(compareCounter==secondArray.length)
            {
                resultIndex=indexCounter;
                break;
            }

        }

        return resultIndex;
    }

}
