package training.ideas.java.problemsolving;

/**
 * Created by idntam on 8/10/2014.
 */
public class FizBuzz {
    public static String[] fizBuzz(int num) {

        String outputNumbers[]= new String[num];
        for(int indexCounter=0;indexCounter<num;indexCounter++)
        {
            if((indexCounter+1)%3==0 && (indexCounter+1)%5==0)
                outputNumbers[indexCounter] = "FizzBuzz";
                else if((indexCounter+1)%3==0)

                    outputNumbers[indexCounter]= "Fizz";
                else if((indexCounter+1)%5==0)
                    outputNumbers[indexCounter]= "Buzz";
                else
                    outputNumbers[indexCounter]= String.valueOf(indexCounter+1);

        }
        return outputNumbers;

    }

}
