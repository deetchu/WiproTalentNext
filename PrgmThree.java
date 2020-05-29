import java.util.*;
public class PrgmThree
{
    public static void main (String[] args) {
        if(args.length>0)
        {
            System.out.println(args[0]);
            for(int i=1;i<args.length;i++)
            {
                System.out.println(","+args[i]);
            }
        }
        else
        {
            System.out.println("No values");
        }
    }
}