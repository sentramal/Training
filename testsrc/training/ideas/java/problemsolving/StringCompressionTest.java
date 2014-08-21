package training.ideas.java.problemsolving;



import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idntam on 8/17/2014.
 */
public class StringCompressionTest {


    @Test
    public void given_input_string_output_is_string_combination()
    {
        String input= "abc";
        String expectedOutput[]={"abc","cab","bca"};
        Assert.assertArrayEquals(expectedOutput, StringCompression.combineString(input));
    }

    @Test
    public void given_input_string_output_is_string_combinations()
    {
        String input= "india123";
        String expectedOutput[]={"india123","3india12","23india1","123india","a123indi","ia123ind","dia123in","ndia123i"};
        Assert.assertArrayEquals(expectedOutput, StringCompression.combineString(input));
    }
}
