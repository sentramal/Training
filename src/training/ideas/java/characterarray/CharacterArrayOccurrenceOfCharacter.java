package training.ideas.java.characterarray;

/**
 * Created by idntam on 8/18/2014.
 */
public class CharacterArrayOccurrenceOfCharacter {

    public static int occurrenceOfGivenCharacter(char[] givenArray, char givenCharacter) {
        int count=0;

        for(int indexCounter=0;indexCounter<givenArray.length;indexCounter++)
        {
            if(givenArray[indexCounter]==givenCharacter)
            {
                count++;
            }


        }
        return count;
    }
}
