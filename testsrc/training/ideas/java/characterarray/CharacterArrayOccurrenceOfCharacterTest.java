package training.ideas.java.characterarray;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idntam on 8/18/2014.
 */
public class CharacterArrayOccurrenceOfCharacterTest {

    @Test
    public void given_character_array_and_character_return_occurrence_of_the_character()
    {
        char givenArray[]={'a','b','c','d','c','e','f','c'};
        char givenCharacter='c';
        int occurrence=3;
        Assert.assertEquals(occurrence,CharacterArrayOccurrenceOfCharacter.occurrenceOfGivenCharacter(givenArray,givenCharacter));
    }

    @Test
    public void given_character_array_and_wrong_character_return_occurrence_of_the_character()
    {
        char givenArray[]={'a','b','c','d','c','e','f','c'};
        char givenCharacter='z';
        int occurrence=0;
        Assert.assertEquals(occurrence,CharacterArrayOccurrenceOfCharacter.occurrenceOfGivenCharacter(givenArray,givenCharacter));
    }
}


