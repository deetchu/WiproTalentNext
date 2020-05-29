import java.util.*;
public class import java.util.*;
public class PrgmFive
{
public static void main(String args[])
    {
        ch='y';
        if(ch>=48 && ch<=57)
        {
            System.out.print("Digit");

        }
        else if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
        {
            System.out.print("Alphabet");
        }
        else
        {
            System.out.print("Special character");

        }
    }
}