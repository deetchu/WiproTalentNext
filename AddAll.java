import java.util.*;
public class AddAll{
public static void main(String[] args) { 
	int n,r,s=0; 
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	while(n!=0) 
	{ 
		r=n%10; 
		s=s+r; 
		n=n/10;
	}
	System.out.println(n+"->"+s);
	
       }
}