import java.util.*;
public class Reverse{
    public static void main(String[] args) {
        int n=1234,r=0,d;
        while(n!=0) {
            d=n%10;
            r=r*10+d;
            n=n/10;
	}
	System.out.println(r);
    }
}