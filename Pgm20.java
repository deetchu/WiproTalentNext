import java.util.*;
public class Pgm20 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("1. Add 2.Sub");
		int choice = s.nextInt();
		int a=s.nextInt();;
		int b=s.nextInt();;
		int result;
		if (choice == 1){
			result=a+b;
		} 
		else {
			result=a-b;
		}
		
		System.out.println("Result: " + result);
		
		System.out.println("To continue? Y or y");	
		choice = s.nextLine().charAt(0);
		if (choice == 'Y' || choice == 'y') main(args);
	}
}