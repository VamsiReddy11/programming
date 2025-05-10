package programming;

import java.util.Scanner;

public class amstrong {
	
	static void amstrong1(int n) {
		int rem=0;
		int sum=0;
		
		while(n!=0) {
			
			rem = n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
			
			
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n=scan.nextInt();
		
		amstrong1(n);
	}

}
