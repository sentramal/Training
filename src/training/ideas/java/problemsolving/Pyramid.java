package training.ideas.java.problemsolving;

/**
 * Created by idntam on 8/19/2014.
 */
public class Pyramid {

//    public static void pyramidArray(String args[])
//    {
//        String name="RAHUL";
//        int size=name.length();
//        for(int rowCounter=0;rowCounter<size;rowCounter++)
//        {
//            for(int spaceCounter=size-1;spaceCounter>rowCounter;spaceCounter--)
//            {
//                System.out.print("\b");
//            }
//            for(int elementCounter=rowCounter;elementCounter>=0;elementCounter--)
//            {
//                System.out.print(name.charAt(elementCounter));
//            }
//            for(int elementCounter=0;elementCounter<=rowCounter;elementCounter++)
//            {
//                System.out.print(name.charAt(elementCounter));
//            }
//            for(int spaceCounter=size-1;spaceCounter>rowCounter;spaceCounter--)
//            {
//                System.out.print("\b");
//            }
//            System.out.println("\n");
//        }
//    }

    public static void main (String args[])
    {
        String name="RAHUL";

        String output="";
        String output2="";
        for(int i=0;i<name.length();i++)
        {
           String space="";
            String givenSubString=name.substring(i,i+1);
            output=givenSubString+output+givenSubString;
            for(int j=name.length()-1;j>i;j--)
            {
                space=space+" ";
            }
            System.out.println(space+output+space);

        }
         for(int i=name.length()-2;i>=0;i--)
         {
            String space="";
             String subString2="";

             String subString1=name.substring(0,i+1);
             for(int k=subString1.length()-1;k>=0;k--)
             {
                 subString2=subString2+subString1.charAt(k);
             }
             output2=subString2+subString1;
             for(int j=name.length()-2;j>i;j--)
             {
                 space=space+" ";
             }
             System.out.println(space+output2+space);
         }

    }
    }





