package training.ideas.java.characterarray;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idntam on 8/15/2014.
 */
public class CharacterArrayTest {

    @Test
 public void given_two_character_array_return_concatenate_array()
    {
        char first[]={'a','b','c','d'};
        char second[]={'i','j','k','l'};
       char expectedOutput[]={'a','b','c','d','i','j','k','l'} ;
       Assert.assertArrayEquals(expectedOutput,CharacterArray.concatenation(first,second));

    }

    @Test
    public void given_two_character_array_return_concatenate_arrays()
    {
        char first[]={'a','b'};
        char second[]={'i','j','k','l'};
        char expectedOutput[]={'a','b','i','j','k','l'} ;
        Assert.assertArrayEquals(expectedOutput,CharacterArray.concatenation(first,second));

    }

    @Test
    public void given_character_array_and_character_return_index_of_the_character()
    {
        char inputCharacters[]={'a','d','g','t','j','w','g'};
        char givenCharacter='g';
        int expectedIndex=2;
        junit.framework.Assert.assertEquals(expectedIndex,CharacterArray.findIndex(inputCharacters,givenCharacter));
    }

    @Test
    public void given_character_array_and_nonExisting_character_return_index_of_the_character()
    {
        char inputCharacters[]={'a','d','g','t','j','w','g'};
        char givenCharacter='k';
        int expectedIndex=-1;
        junit.framework.Assert.assertEquals(expectedIndex,CharacterArray.findIndex(inputCharacters,givenCharacter));
    }

    @Test
    public void given_character_array_with_an_index_and_character_return_next_index_of_the_character()
    {
        char inputCharacters[]={'a','d','g','t','j','w','g'};
        char givenCharacter='g';
        int givenIndex=2;
        int expectedIndex=6;
        junit.framework.Assert.assertEquals(expectedIndex,CharacterArray.findNextIndex(inputCharacters, givenCharacter, givenIndex));
    }

    @Test
    public void given_character_array_with_an_index_and_character_return_next_occurring_index_of_the_character()
    {
        char inputCharacters[]={'a','d','g','t','j','w','g'};
        char givenCharacter='d';
        int givenIndex=1;
        int expectedIndex=-1;
        junit.framework.Assert.assertEquals(expectedIndex,CharacterArray.findNextIndex(inputCharacters, givenCharacter, givenIndex));
    }

    @Test
    public void given_character_array_return_uppercase_array()
    {
        char givenArray[]={'a','f','e','v','b'};
        char expectedArray[]={'A','F','E','V','B'};
        Assert.assertArrayEquals(expectedArray,CharacterArray.upperCaseConversion(givenArray));
    }

    @Test
    public void given_character_array_with_mixed_characters_return_uppercase_array()
    {
        char givenArray[]={'a','F','E','v','b'};
        char expectedArray[]={'A','F','E','V','B'};
        Assert.assertArrayEquals(expectedArray,CharacterArray.upperCaseConversion(givenArray));
    }

    @Test
    public void given_character_array_return_lowercase_array()
    {
        char givenArray[]={'A','F','E','V','B'};
        char expectedArray[]={'a','f','e','v','b'};
        Assert.assertArrayEquals(expectedArray,CharacterArray.lowerCaseConversion(givenArray));
    }

    @Test
    public void given_character_array_with_mixed_characters_return_lowercase_array()
    {
        char givenArray[]={'A','F','e','v','B'};
        char expectedArray[]={'a','f','e','v','b'};
        Assert.assertArrayEquals(expectedArray,CharacterArray.lowerCaseConversion(givenArray));
    }

    @Test
    public void given_two_character_arrays_return_index_of_first_occurrence_of_second_array()
    {
        char firstArray[]={'t','h','i','s','i','s','t','e','s','t'};
        char secondArray[]={'t','e','s','t'};
        int expectedIndex=6;
        junit.framework.Assert.assertEquals(expectedIndex,CharacterArray.occurrenceOfSecondArray(firstArray,secondArray));
    }

    @Test
    public void given_two_character_arrays_return_first_index_of_occurrence_of_second_array()
    {
        char firstArray[]={'i','n','d','i','a','d','i'};
        char secondArray[]={'d','i'};
        int expectedIndex=2;
        junit.framework.Assert.assertEquals(expectedIndex,CharacterArray.occurrenceOfSecondArray(firstArray,secondArray));
    }

    @Test
    public void given_two_character_arrays_return_occurrence_of_second_array_for_given_index()
    {
        char firstArray[]={'t','h','i','s','i','s','t','h','i','s'};
        char secondArray[]={'t','h','i','s'};
        int givenIndex=2;
        int expectedIndex=6;
        junit.framework.Assert.assertEquals(expectedIndex,CharacterArray.occurrenceOfSecondArrayForGivenIndex(firstArray,secondArray,givenIndex));
    }

    @Test
    public void given_character_array_and_an_end_index_return_subArray()
    {
        char givenArray[]={'a','b','c','d','e','f'};
        int endIndex=4;
        char expectedArray[]={'a','b','c','d','e'};
        Assert.assertArrayEquals(expectedArray,CharacterArray.subArrayEndIndex(givenArray,endIndex));
    }

    @Test
    public void given_character_array_start_index_and_an_end_index_return_subArray()
    {
        char givenArray[]={'a','b','c','d','e','f'};
        int startIndex=1;
        int endIndex=4;
        char expectedArray[]={'b','c','d','e'};
        Assert.assertArrayEquals(expectedArray,CharacterArray.subArrayStartIndexEndIndex(givenArray, startIndex, endIndex));
    }

    @Test
    public void given_character_array_and_character_return_occurrence_of_the_character()
    {
        char givenArray[]={'a','b','c','d','c','e','f','c'};
        char givenCharacter='c';
        int occurrence=3;
        junit.framework.Assert.assertEquals(occurrence,CharacterArray.occurrenceOfGivenCharacter(givenArray,givenCharacter));
    }

    @Test
    public void given_character_array_and_wrong_character_return_occurrence_of_the_character()
    {
        char givenArray[]={'a','b','c','d','c','e','f','c'};
        char givenCharacter='z';
        int occurrence=-1;
        junit.framework.Assert.assertEquals(occurrence,CharacterArray.occurrenceOfGivenCharacter(givenArray,givenCharacter));
    }
}
