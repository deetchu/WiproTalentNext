import java.util.*
public class Palindrome {
    public static void main(String[] args) {
        int n, r=0, rem;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
        while(n!=0 )
        {
            rem=n% 10;
            r=r*10+rem;
            n=n/10;
        }
        if (n==r)
            System.out.println(n+ "palindrome");
        else
            System.out.println(n+ "not palindrome");
    }
}
