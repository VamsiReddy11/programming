package programming;

import java.util.Scanner;

public class test1 {
	
	static void longestincreasingSubString(int[]ar) {
		
		
		int maxlength=1;
		int curlength=1;
		int start=0;
		int startIndex=0;
		
		for(int i=0;i<ar.length-1;i++) {
			
			
			if(ar[i]<ar[i+1]) {
				
				curlength++;
				if(curlength>maxlength) {
					
					maxlength=curlength;
					start=startIndex;
					
					
				}
			}
			else {
				curlength=1;
				startIndex=i+1;
			}
		}
		for(int i=start;i<start+maxlength;i++) {
			System.out.print(ar[i]+" ");
		}
		
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]= scan.nextInt();
			
		}
		longestincreasingSubString(ar);
		

	}

}
