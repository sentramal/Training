package training.ideas.java.characterarray;


import org.junit.Test;
/**
 * Created by idntam on 8/18/2014.
 */
public class CharacterArrayIndexOfCharacterTest {

    @Test
    public void given_character_array_and_character_return_index_of_the_character()
    {
        char inputCharacters[]={'a','d','g','t','j','w','g'};
        char givenCharacter='g';
        int expectedIndex=2;
        junit.framework.Assert.assertEquals(expectedIndex, CharacterArrayIndexOfCharacter.findIndex(inputCharacters, givenCharacter));
    }

    @Test
    public void given_character_array_and_nonExisting_character_return_index_of_the_character()
    {
        char inputCharacters[]={'a','d','g','t','j','w','g'};
        char givenCharacter='k';
        int expectedIndex=-1;
        junit.framework.Assert.assertEquals(expectedIndex, CharacterArrayIndexOfCharacter.findIndex(inputCharacters, givenCharacter));
    }

}
