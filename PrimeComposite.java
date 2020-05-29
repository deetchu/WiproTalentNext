import java.util.*;
public class PrimeComposite { 
public static void main(String[] args) { 
	int n,f,i;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	if(n==0  || n==1)
	{
		System.out.println("Neither prime nor composite");}
	else{

	f=0; 
	for(i=1;i<=n/2;i++) { 
		if(n%i==0) {
			f=1;
			break;
		}		
	}
	if(f==0) 
	{	
		System.out.println("Prime"); }
	else {
		System.out.println("Not Prime"); }
       }
}
}