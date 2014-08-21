package training.ideas.java.characterarray;

/**
 * Created by idntam on 8/18/2014.
 */
public class CharacterArrayUppercase {

    public static char[] upperCaseConversion(char[] givenArray) {
        char resultArray[]=new char[givenArray.length];
        for(int indexCounter=0;indexCounter<givenArray.length;indexCounter++)
        {
            resultArray[indexCounter]=Character.toUpperCase(givenArray[indexCounter]);
        }

        return resultArray;
    }

}
