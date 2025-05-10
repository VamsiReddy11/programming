package programming;

import java.util.Scanner;

class BusinessMan{
	
	private float si;
	private float p;
	private float t;
	private static float r;
	
	static
	{
		r=15.0f;
	}
	
	public void acceptInput() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principle Amount");
		p = scan.nextFloat();
		System.out.println("Enter the time duration");
		t= scan.nextFloat();
		
	}
	public void calcSI() {
		si=(p*t*r)/100;
	}
	public void disp() {
		System.out.println(si);
	}
}

public class Static {

	public static void main(String[] args) {
		BusinessMan b1 = new BusinessMan();
		BusinessMan b2 = new BusinessMan();
		BusinessMan b3 = new BusinessMan();
		b1.acceptInput();
		b1.calcSI();
		b1.disp();
		
		b2.acceptInput();
		b2.calcSI();
		b2.disp();
		
		b3.acceptInput();
		b3.calcSI();
		b3.disp();
	}

}
