package training.ideas.java.problemsolving;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idntam on 8/10/2014.
 */
public class CompressionTest {

    @Test
    public  void compression_string_for_an_input_string()
    {
        String input="AAABBBCCDDD";
        String output="A3B3C2D3";
        Assert.assertEquals(output,Compression.compress(input));
    }
}
