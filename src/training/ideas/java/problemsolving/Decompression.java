package training.ideas.java.problemsolving;

/**
 * Created by idntam on 8/11/2014.
 */
public class Decompression {
    public static String decompress(String input) {
        String output= "";
        char temporary;
        //int digit=0;
        for(int elementCounter=0; elementCounter<input.length();elementCounter++)
        {
            if(Character.isLetter(input.charAt(elementCounter)))
            {
                temporary=input.charAt(elementCounter);
                int digit=1;
                for(int checkDigit=elementCounter+1;checkDigit<input.length();checkDigit++)
                {

                    if(Character.isDigit(input.charAt(checkDigit)))
                    {
                       digit=Character.getNumericValue(input.charAt(checkDigit));
                    }
                    else
                    {

                        break;
                    }
                }

                for(int printLetterCounter=0;printLetterCounter<digit;printLetterCounter++)
                {
                   output=output+temporary;
                }

            }
            else
                continue;

        }

        return output;
    }
}
