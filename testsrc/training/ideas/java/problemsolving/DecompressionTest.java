package training.ideas.java.problemsolving;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idntam on 8/11/2014.
 */
public class DecompressionTest {

    @Test
    public  void decompression_string_for_an_input_string()
    {
        String input="A3B3C2D3";
        String output="AAABBBCCDDD";
        Assert.assertEquals(output, Decompression.decompress(input));
    }

    @Test
    public  void decompression_string_for_input_string()
    {
        String input="A3B3CD3";
        String output="AAABBBCDDD";
        Assert.assertEquals(output, Decompression.decompress(input));
    }

//    @Test
//    public  void decompression_string_for_input_string()
//    {
//        String input="A3B3CD33";
//        String output="AAABBBCDDD";
//        Assert.assertEquals(output, Decompression.decompress(input));
//    }

}
