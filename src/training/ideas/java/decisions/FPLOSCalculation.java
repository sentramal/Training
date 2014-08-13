package training.ideas.java.decisions;

/**
 * Created by idntam on 7/24/2014.
 */
public class FPLOSCalculation {
            public static String generateFPLOSPattern( double rateValue,  double[] lrvForSevenDays) {
                String fplosPattern = "";
                double sumOfRateValue = 0.0;
                double sumOfLRV = 0.0;
                for (double lrvForIndividualLOS : lrvForSevenDays) {
                    sumOfRateValue += rateValue;
                    sumOfLRV += lrvForIndividualLOS;
                    if (sumOfRateValue >= sumOfLRV)
                        fplosPattern += "Y";
                    else {
                        fplosPattern += "N";
                    }
                }
                return fplosPattern;

    }
/*
    public static String generateFPLOSPattern( double[] rateValue,  double[] lrvForSevenDays)
    {
        String fplosPattern="";
        double sumOfRateValue=0;
        double sumOfLRV=0;
        for(int individualElement =0;individualElement<7;individualElement++)
        {
            sumOfRateValue+= rateValue[individualElement];

            sumOfLRV+=lrvForSevenDays[individualElement];
                if(sumOfRateValue>=sumOfLRV)
                {
                    fplosPattern+= "Y";
                }
                else
                {
                    fplosPattern+="N";
                }

        }
        return fplosPattern;
    }
*/
    public static String[] generateFPLOSPattern( double[] rateSpectrum,  double[] lrvForSevenDays)
    {
        String[] spectrumFPLOSPattern = new String [rateSpectrum.length];
        int counter =0;
        for(double rateValue: rateSpectrum)
        {
            spectrumFPLOSPattern[counter++]=generateFPLOSPattern(rateValue,lrvForSevenDays);
        }
        return spectrumFPLOSPattern;
    }

}