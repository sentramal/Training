package training.ideas.java.characterarray;

/**
 * Created by idntam on 8/18/2014.
 */
public class CharacterArrayIndexOfCharacter {

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
}
