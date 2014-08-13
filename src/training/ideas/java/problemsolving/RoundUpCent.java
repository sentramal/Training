package training.ideas.java.problemsolving;

/**
 * Created by idntam on 8/11/2014.
 */
public class RoundUpCent {
    public static double roundUp(double amount) {

        int amountWithoutDecimal = (int) amount * 100;
        int remainder = amountWithoutDecimal % 5;
        if (amount*100%5 == 0) {
            return amount;
        }
       return (amount*100 + 5 -(amount*100%5))/100;
//          return Math.ceil(amount/20)* 20;





    }
}
