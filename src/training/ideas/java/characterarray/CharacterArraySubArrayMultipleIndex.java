package training.ideas.java.characterarray;

/**
 * Created by idntam on 8/18/2014.
 */
public class CharacterArraySubArrayMultipleIndex {

    public static char[] subArrayStartIndexEndIndex(char[] givenArray, int startIndex, int endIndex) {
        int length=(endIndex-startIndex)+1;
        char resultArray[]=new char[length];
        for(int indexCounter=0;indexCounter<length;indexCounter++)
        {
            resultArray[indexCounter]=givenArray[indexCounter+startIndex];
        }
        return resultArray;
    }
}
