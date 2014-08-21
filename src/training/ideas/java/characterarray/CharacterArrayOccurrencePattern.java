package training.ideas.java.characterarray;

/**
 * Created by idntam on 8/18/2014.
 */
public class CharacterArrayOccurrencePattern {

    public static int occurrenceOfSecondArrayForGivenIndex(char[] firstArray, char[] secondArray, int givenIndex) {
        int resultIndex=0;

        int indexCounter,compareCounter,element;

        for(indexCounter=givenIndex;indexCounter<firstArray.length;indexCounter++)
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
