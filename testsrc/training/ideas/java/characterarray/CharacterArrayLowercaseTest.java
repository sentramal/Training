package training.ideas.java.characterarray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idntam on 8/18/2014.
 */
public class CharacterArrayLowercaseTest {

    @Test
    public void given_character_array_return_lowercase_array()
    {
        char givenArray[]={'A','F','E','V','B'};
        char expectedArray[]={'a','f','e','v','b'};
        Assert.assertArrayEquals(expectedArray,CharacterArrayLowercase.lowerCaseConversion(givenArray));
    }

    @Test
    public void given_character_array_with_mixed_characters_return_lowercase_array()
    {
        char givenArray[]={'A','F','e','v','B'};
        char expectedArray[]={'a','f','e','v','b'};
        Assert.assertArrayEquals(expectedArray,CharacterArrayLowercase.lowerCaseConversion(givenArray));
    }

}
