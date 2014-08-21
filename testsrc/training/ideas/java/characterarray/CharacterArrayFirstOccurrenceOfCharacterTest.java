package training.ideas.java.characterarray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idntam on 8/18/2014.
 */
public class CharacterArrayFirstOccurrenceOfCharacterTest {

    @Test
    public void given_character_array_with_an_index_and_character_return_next_index_of_the_character()
    {
        char inputCharacters[]={'a','d','g','t','j','w','g'};
        char givenCharacter='g';
        int givenIndex=2;
        int expectedIndex=6;
        junit.framework.Assert.assertEquals(expectedIndex,CharacterArrayFirstOccurrenceOfCharacter.findNextIndex(inputCharacters, givenCharacter, givenIndex));
    }

    @Test
    public void given_character_array_with_an_index_and_character_return_next_occurring_index_of_the_character()
    {
        char inputCharacters[]={'a','d','g','t','j','w','g'};
        char givenCharacter='d';
        int givenIndex=1;
        int expectedIndex=-1;
        junit.framework.Assert.assertEquals(expectedIndex,CharacterArrayFirstOccurrenceOfCharacter.findNextIndex(inputCharacters, givenCharacter, givenIndex));
    }
}
