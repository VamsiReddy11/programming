package programming;

import java.util.Arrays;
import java.util.Scanner;

public class sort {
	
	static void arraysort(int[] ar) {
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		int n=ar.length;
		
		int fl= ar[0];
		int sl=ar[1];
		System.out.println(fl+sl);
		
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
		arraysort(ar);
	}

}
