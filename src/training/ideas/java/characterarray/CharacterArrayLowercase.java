package training.ideas.java.characterarray;

/**
 * Created by idntam on 8/18/2014.
 */
public class CharacterArrayLowercase {

    public static char[] lowerCaseConversion(char[] givenArray) {
        char resultArray[]=new char[givenArray.length];
        for(int indexCounter=0;indexCounter<givenArray.length;indexCounter++)
        {
            resultArray[indexCounter]=Character.toLowerCase(givenArray[indexCounter]);
        }

        return resultArray;
    }
}
