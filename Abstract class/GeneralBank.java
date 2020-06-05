public abstract class GeneralBank {
	public abstract double getSaving();	
	public abstract double getFixed();
}
public class ICICIBank extends GeneralBank {
	@Override
	public double getSaving() {
		return 4;
	}
	@Override
	public double getFixed() {
		return 8.5;
	}
}
public class KotMBank extends GeneralBank {
	@Override
	public double getSaving() {
		return 6;
	}
	@Override
	public double getFixed() {
		return 9;
	}
}public class Bank{
	public static void main(String[] args) {
		ICICIBank iciciBank = new ICICIBank();
		KotMBank kotMBank = new KotMBank();
		System.out.println(iciciBank.getSaving());
		System.out.println(iciciBank.getFixed());
		System.out.println(kotMBank.getSaving());
		System.out.println(kotMBank.getFixed());		
		GeneralBank gb1=new ICICIBank();
		GeneralBank gb2=new KotMBank();		
		System.out.println(gb1.getSaving());
		System.out.println(gb1.getFixed());
		System.out.println(gb2.getSaving());
		System.out.println(gb2.getFixed());
	}

}