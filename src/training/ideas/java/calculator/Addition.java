package training.ideas.java.calculator;

/**
 * Created by idntam on 7/21/2014.
 */
public class Addition {


    private final int first;
    private final int second;

    public Addition(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int add() {
        return first+second;
    }


    public static double add(double first, double second)
    {
        return first+second;
    }



    public static int add(int sum[])
    {
        int total = 0;

        for(int i=0;i<sum.length;i++)
        {
            total = total + sum[i];
        }

        return total;

    }

    public static double add(double[] a)

    {
        double result = 0;
        for(int i =0;i<a.length;i++)
        {
            result = result + a[i];

        }
        return result;
    }

    public static double addDoubleArray(double[] b) {

        double total = 0;
        int counter = 0;
        while (counter<b.length){
            total +=b[counter];
            counter++;
        }
        return total;
    }

    public static int addMultipleNumber(int... numbers) {

        int total=0;
        for(int individualElement: numbers)
        {
            total=total+individualElement;
        }
        return total;
    }



}
