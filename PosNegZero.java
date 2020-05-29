import java.util.Scanner;
public class PosNegZero
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = s.nextInt();
        if(n > 0)
        {
            System.out.println("The given num "+n+" is Positive");
        }
        else if(n < 0)
        {
            System.out.println("The given num "+n+" is Negative");
        }
        else
        {
            System.out.println("The given num "+n+" is Zero ");
        }
    }
}