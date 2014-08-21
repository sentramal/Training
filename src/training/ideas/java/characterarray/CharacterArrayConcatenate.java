package training.ideas.java.characterarray;

/**
 * Created by idntam on 8/18/2014.
 */
public class CharacterArrayConcatenate {

    public static char[] concatenation(char[] first, char[] second) {

        int lengthOfFirst=first.length;
        int lengthOfSecond=second.length;
        char resultCharacter[]=new char[lengthOfFirst+lengthOfSecond];
        System.arraycopy(first,0,resultCharacter,0,lengthOfFirst);
        System.arraycopy(second,0,resultCharacter,lengthOfFirst,lengthOfSecond);
//        for(int i =0;i<lengthOfFirst;i++)
//        {
//            resultCharacter[i]=first[i];
//        }
//        for(int j=0;j<lengthOfSecond;j++)
//        {
//            resultCharacter[j+lengthOfFirst]=second[j];
//        }
        return resultCharacter;
    }

}
