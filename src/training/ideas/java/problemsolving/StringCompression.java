package training.ideas.java.problemsolving;

/**
 * Created by idntam on 8/17/2014.
 */
public class StringCompression {
    public static String[] combineString(String input) {
        String combinedString[]=new String[input.length()];
        for(int i=0;i<input.length();i++)
        {
            combinedString[i]=combine(input,i);
            input=combinedString[i];
        }

        return combinedString;
    }

    private static String combine(String input, int i) {
        String temp="";
        if(i==0)
        {
            for(int j=0;j<input.length();j++)
            {

                temp=temp+input.charAt(j);
            }
            return temp;
        }

        else
        {

            temp=temp+input.charAt(input.length()-1);
            for(int k=0;k<input.length()-1;k++)
            {
                temp=temp+input.charAt(k);
            }
            return temp;
        }
    }

}
