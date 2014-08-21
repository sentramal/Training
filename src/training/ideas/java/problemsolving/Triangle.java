package training.ideas.java.problemsolving;

/**
 * Created by idntam on 8/14/2014.
 */
public class Triangle {
    public static enum TriangleType{NOTRIANGLE,EQUILATERAL,ISOSCELES,RIGHTANGLE,TRIANGLE};

    public static TriangleType triangleTypes(double angle1, double angle2, double angle3) {


        if (angle1 + angle2 + angle3 == 180 && angle1!=0 &&angle2 !=0&&angle3!=0) {

            if (angle1 == angle2 && angle2 == angle3 && angle1==angle3) {
                return TriangleType.EQUILATERAL;
            }

            else {

                if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                    return TriangleType.RIGHTANGLE;
                }
                else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {

                        return TriangleType.ISOSCELES;
                }
                else {
                    return TriangleType.TRIANGLE;
                }
            }
        }
        else
        {
            return TriangleType.NOTRIANGLE;
        }

    }
}
