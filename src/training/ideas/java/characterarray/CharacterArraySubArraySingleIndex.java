package training.ideas.java.characterarray;

/**
 * Created by idntam on 8/18/2014.
 */
public class CharacterArraySubArraySingleIndex {

    public static char[] subArrayEndIndex(char[] givenArray, int endIndex) {
        char resultArray[]=new char[endIndex+1];
        for(int indexCounter=0;indexCounter<=endIndex;indexCounter++)
        {
            resultArray[indexCounter]=givenArray[indexCounter];
        }
        return resultArray;
    }
}
