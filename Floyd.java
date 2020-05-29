import java.util.*;
public class Floyd
{
  public static void main(String args[])
  {
    int n,i,j;
    Scanner s = new Scanner(System.in);
    n=s.nextInt();
    if(n==0){
		System.out.println("Enter an integer number");}
	else{
		for(i=0;i<n;i++){
			for(j=0;j<i;j++){
				System.out.println("*");}
			System.out.println();
		   }
	    }
	
   }
}