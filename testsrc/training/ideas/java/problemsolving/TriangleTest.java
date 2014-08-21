package training.ideas.java.problemsolving;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idntam on 8/14/2014.
 */
public class TriangleTest {

    @Test
    public  void angle_for_equilateral()
    {
        double angle1=60;
        double angle2= 60;
        double angle3=60;
        Assert.assertEquals(Triangle.TriangleType.EQUILATERAL,Triangle.triangleTypes(angle1,angle2,angle3));
    }

    @Test
    public  void angle_for_normal()
    {
        double angle1=0;
        double angle2=90;
        double angle3=90;
        Assert.assertEquals(Triangle.TriangleType.NOTRIANGLE,Triangle.triangleTypes(angle1,angle2,angle3));
    }

    @Test
    public  void angle_for_not_a_triangle()
    {
        double angle1=10;
        double angle2= 50;
        double angle3=60;
        Assert.assertEquals(Triangle.TriangleType.NOTRIANGLE,Triangle.triangleTypes(angle1,angle2,angle3));
    }

    @Test
    public  void angle_for_isosceles()
    {
        double angle1=55;
        double angle2= 55;
        double angle3=70;
        Assert.assertEquals(Triangle.TriangleType.ISOSCELES,Triangle.triangleTypes(angle1,angle2,angle3));
    }

    @Test
    public  void angle_for_rightAngle()
    {
        double angle1=90;
        double angle2= 45;
        double angle3=45;
        Assert.assertEquals(Triangle.TriangleType.RIGHTANGLE,Triangle.triangleTypes(angle1,angle2,angle3));
    }
}
