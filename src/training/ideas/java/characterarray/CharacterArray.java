package training.ideas.java.characterarray;

/**
 * Created by idntam on 8/15/2014.
 */
public class CharacterArray {
    public static char[] concatenation(char[] first, char[] second) {

        int lengthOfFirst=first.length;
        int lengthOfSecond=second.length;
        char resultCharacter[]=new char[lengthOfFirst+lengthOfSecond];
        System.arraycopy(first,0,resultCharacter,0,lengthOfFirst);
        System.arraycopy(second,0,resultCharacter,lengthOfFirst,lengthOfSecond);
//        for(int i =0;i<lengthOfFirst;i++)
//        {
//            resultCharacter[i]=first[i];
//        }
//        for(int j=0;j<lengthOfSecond;j++)
//        {
//            resultCharacter[j+lengthOfFirst]=second[j];
//        }
        return resultCharacter;
    }


    public static int findIndex(char[] inputCharacters, char givenCharacter) {
        int resultIndex=0;

        for(int indexCounter=0;indexCounter<inputCharacters.length;indexCounter++)
        {
            if(inputCharacters[indexCounter]==givenCharacter)
            {
                resultIndex=indexCounter;
                break;
            }
            else
            {
                resultIndex=-1;
            }
        }
        return resultIndex;
    }

    public static int findNextIndex(char[] inputCharacters, char givenCharacter, int givenIndex) {
        int resultIndex=0;
        for(int indexCounter=givenIndex+1;indexCounter<inputCharacters.length;indexCounter++)
        {
            if(inputCharacters[indexCounter]==givenCharacter)
            {
                resultIndex=indexCounter;
                break;
            }
            else
            {
                resultIndex=-1;
            }
        }

        return resultIndex;
    }

    public static char[] upperCaseConversion(char[] givenArray) {
        char resultArray[]=new char[givenArray.length];
        for(int indexCounter=0;indexCounter<givenArray.length;indexCounter++)
        {
            resultArray[indexCounter]=Character.toUpperCase(givenArray[indexCounter]);
        }

        return resultArray;
    }

    public static char[] lowerCaseConversion(char[] givenArray) {
        char resultArray[]=new char[givenArray.length];
        for(int indexCounter=0;indexCounter<givenArray.length;indexCounter++)
        {
            resultArray[indexCounter]=Character.toLowerCase(givenArray[indexCounter]);
        }

        return resultArray;
    }


    public static char[] subArrayEndIndex(char[] givenArray, int endIndex) {
        char resultArray[]=new char[endIndex+1];
        for(int indexCounter=0;indexCounter<=endIndex;indexCounter++)
        {
            resultArray[indexCounter]=givenArray[indexCounter];
        }
        return resultArray;
    }

    public static char[] subArrayStartIndexEndIndex(char[] givenArray, int startIndex, int endIndex) {
        int length=(endIndex-startIndex)+1;
        char resultArray[]=new char[length];
        for(int indexCounter=0;indexCounter<length;indexCounter++)
        {
            resultArray[indexCounter]=givenArray[indexCounter+startIndex];
        }
        return resultArray;
    }

    public static int occurrenceOfGivenCharacter(char[] givenArray, char givenCharacter) {
        int count=0;
        for(int indexCounter=0;indexCounter<givenArray.length;indexCounter++)
        {
            if(givenArray[indexCounter]==givenCharacter)
            {
                count++;
            }
            else
            {
                count=-1;
            }
        }
        return count;
    }

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
