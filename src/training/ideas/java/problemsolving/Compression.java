package training.ideas.java.problemsolving;

/**
 * Created by idntam on 8/10/2014.
 */
public class Compression {
    public static String compress(String input) {

        String result="";
        char temporary;
        for (int elementCounter = 0; elementCounter < input.length(); elementCounter++)
        {
            temporary = input.charAt(elementCounter);
            int count = 1;

            if(input.indexOf(temporary)<elementCounter)
                continue;
            for(int comparingElement=elementCounter+1;comparingElement<input.length();comparingElement++)
            {
                if (input.charAt(comparingElement) == temporary)
                    count++;
            }
                if (count == 1)
                    result = result + temporary;
                else
                    result = result + temporary + String.valueOf(count);

        }
        return result;
    }
}
