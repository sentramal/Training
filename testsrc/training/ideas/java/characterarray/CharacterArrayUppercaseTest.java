package training.ideas.java.characterarray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idntam on 8/18/2014.
 */
public class CharacterArrayUppercaseTest {

    @Test
    public void given_character_array_return_uppercase_array()
    {
        char givenArray[]={'a','f','e','v','b'};
        char expectedArray[]={'A','F','E','V','B'};
        Assert.assertArrayEquals(expectedArray,CharacterArrayUppercase.upperCaseConversion(givenArray));
    }

    @Test
    public void given_character_array_with_mixed_characters_return_uppercase_array()
    {
        char givenArray[]={'a','F','E','v','b'};
        char expectedArray[]={'A','F','E','V','B'};
        Assert.assertArrayEquals(expectedArray,CharacterArrayUppercase.upperCaseConversion(givenArray));
    }
}
