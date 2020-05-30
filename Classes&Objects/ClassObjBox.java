import java.util.*;
public class ClassObjBox 
{
    double h,w,d;
    ClassObjBox(double width,double height,double depth)
    {
        h=height;
        w=width;
        d=depth;
    }
    double volume()
    {
         double v;
         v=h*w*d;
         return v;
    }
    public static void main(String[] args) 
    {
        ClassObjBox bc = new ClassObjBox(8.5,80.3,9.6);
        System.out.println(bc.volume());
    }
}