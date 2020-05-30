import java.util.*;
public class ClassObjCal
{
    public static void main(String[] args) 
    {
        System.out.println(Calculator.powerDouble(85.0, 2));
        System.out.println(Calculator.powerInt(85,3));
    }
}
class Calculator
    {
        static double powerInt(int n1,int n2)
        {
            return Math.pow(n1,n2);
        }
        static double powerDouble(double n1,int n2)
        {       
            return Math.pow(n1,n2);
        }
    }
