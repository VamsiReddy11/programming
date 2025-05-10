package programming;

import java.util.Scanner;

public class day2 {
	
	static void palindrome(String s){
		
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)==s.charAt(j)) {
				
				i++;
				j--;
				
			}
			else {
			System.out.println("false");
			return;
			}
		}
		System.out.println("true");
		
	}
	
	
	static void reverse(String s) {
		
		String t="";
		for (int i=s.length()-1;i>=0;i--) {
			t=t+s.charAt(i);
			
		}
		System.out.println(t);
		
	}
	
	
	
	static void amstrong(int n) {
		
		int sum=0;
		int rem =0;
		
		while(n !=0) {
			rem = n%10;
			sum = sum+(rem*rem*rem);
			n =n/10;
		}
		System.out.println(sum);
		
	}
	
	static void printnum(int n) {
		
	    if(n<100) {
			
			System.out.println(n);
			printnum(n+1);
		}
	}
	
	
	static void integersum(int n) {
		
		int sum=0;
		int rem =0;
		
		while (n!=0) {
			rem = n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
	}
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
     	String s= scan.nextLine();
     	
     	
     	
//		
//		reverse(s);
//		int n = scan.nextInt();
////		int[] ar = new int[n];
////		for(int i=0;i<ar.length;i++) {
////			ar[i]= scan.nextInt();
////		}
////	    integersum(n);
		
//		
		
		

	}

}
