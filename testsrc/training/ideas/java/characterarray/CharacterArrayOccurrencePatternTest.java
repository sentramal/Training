package training.ideas.java.characterarray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idntam on 8/18/2014.
 */
public class CharacterArrayOccurrencePatternTest {

    @Test
    public void given_two_character_arrays_return_occurrence_of_second_array_for_given_index()
    {
        char firstArray[]={'t','h','i','s','i','s','t','h','i','s'};
        char secondArray[]={'t','h','i','s'};
        int givenIndex=2;
        int expectedIndex=6;
        Assert.assertEquals(expectedIndex,CharacterArrayOccurrencePattern.occurrenceOfSecondArrayForGivenIndex(firstArray,secondArray,givenIndex));
    }

    @Test
    public void given_two_characters_arrays_return_occurrence_of_second_array_for_given_index()
    {
        char firstArray[]={'t','h','i','s','i','s','t','t','h','i','s'};
        char secondArray[]={'t','h','i','s'};
        int givenIndex=2;
        int expectedIndex=7;
        Assert.assertEquals(expectedIndex,CharacterArrayOccurrencePattern.occurrenceOfSecondArrayForGivenIndex(firstArray,secondArray,givenIndex));
    }

    @Test
    public void given_two_characters_arrays_return_occurrences_of_second_array_for_given_index()
    {
        char firstArray[]={'t','h','i','s','i','s','t','t','h','i','s'};
        char secondArray[]={'t','h','i','t'};
        int givenIndex=2;
        int expectedIndex=0;
        Assert.assertEquals(expectedIndex,CharacterArrayOccurrencePattern.occurrenceOfSecondArrayForGivenIndex(firstArray,secondArray,givenIndex));
    }
}
