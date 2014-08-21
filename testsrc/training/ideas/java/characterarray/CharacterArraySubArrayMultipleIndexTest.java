package training.ideas.java.characterarray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idntam on 8/18/2014.
 */
public class CharacterArraySubArrayMultipleIndexTest {

    @Test
    public void given_character_array_start_index_and_an_end_index_return_subArray()
    {
        char givenArray[]={'a','b','c','d','e','f'};
        int startIndex=1;
        int endIndex=4;
        char expectedArray[]={'b','c','d','e'};
        Assert.assertArrayEquals(expectedArray,CharacterArraySubArrayMultipleIndex.subArrayStartIndexEndIndex(givenArray, startIndex, endIndex));
    }
}
