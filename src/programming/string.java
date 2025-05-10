package programming;

import java.util.Scanner;

public class string {
	
	
	static String reverse(String s) {
		String t="";
		for(int i=0;i<s.length();i++)
		{
			t=s.charAt(i)+t;
		}
		return t;
	}
	
	static int countWords(String s) {
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)==' ' &&s.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		return count+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String s= scan.nextLine();
		
		int wordcount= countWords(s);
		
		String[] ar = new String[wordcount];
		
		int j=0;
		String t="";
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)!=' ') {
				t=t+s.charAt(i);
			}
			else if(t.length()>0) {
				ar[j]=t;
				j++;
				t=""; 
			}
		}
		ar[j]=t;
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		ar[j]=t;
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+" "+ar[i].length()+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<ar.length;i=i+2) {
			
			System.out.print(ar[i+1]+" "+ar[i]+" ");
		}
		
		System.out.println();

		for(int i=0,k=ar.length-1;i<k;i++,k--) {
			
			System.out.print(ar[i]+ar[k]+" ");
			
		}
		System.out.println();
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(reverse(ar[i]+" "));
		}
		System.out.println();
		
		for(int i=0,k=ar.length-1;i<k;i++,k--) {
			System.out.print(reverse(ar[k])+""+ar[i]+" ");
		}
		
		

		
		
		
		

	}

}
