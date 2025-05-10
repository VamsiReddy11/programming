package programming;

import java.util.Scanner;

public class num {
	
	static void reverse(String s) {
		
		char[] ar=s.toCharArray();
		
		for(int i=0;i<ar.length-1;i=i+2) {
			
			char temp=ar[i];
			ar[i]=ar[i+1];
			ar[i+1]=temp;
			
		}
		System.out.println(ar);
		
	}
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		
		reverse(s);
	}

}
