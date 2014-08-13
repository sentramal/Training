package training.ideas.java.decisions;

/**
 * Created by idntam on 7/25/2014.
 */
public class MinLOSCalculation {


    public static int generateMINLOS(String fplosPattern) {
       return fplosPattern.toUpperCase().indexOf("Y")+1;
//        int minlos=0;
//        for(;minlos<fplos.length;minlos++){
//            if(fplos[minlos]=="Y")
//            {
//              minlos+=1;
//                break;
//            }
//        }
//        return minlos;
    }
}
