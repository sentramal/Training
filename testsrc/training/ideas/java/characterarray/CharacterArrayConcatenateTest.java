package training.ideas.java.characterarray;


import org.junit.Assert;
import org.junit.Test;
/**
 * Created by idntam on 8/18/2014.
 */
public class CharacterArrayConcatenateTest {

    @Test
    public void given_two_character_array_return_concatenate_array()
    {
        char first[]={'a','b','c','d'};
        char second[]={'i','j','k','l'};
        char expectedOutput[]={'a','b','c','d','i','j','k','l'} ;
        Assert.assertArrayEquals(expectedOutput,CharacterArrayConcatenate.concatenation(first,second));

    }

    @Test
    public void given_two_character_array_return_concatenate_arrays()
    {
        char first[]={'a','b'};
        char second[]={'i','j','k','l'};
        char expectedOutput[]={'a','b','i','j','k','l'} ;
        Assert.assertArrayEquals(expectedOutput,CharacterArrayConcatenate.concatenation(first,second));

    }

}
