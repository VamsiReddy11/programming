package programming;

import java.util.Scanner;

public class Strings {
	
	static void reverse(String s) {
		String t="";
		String y="";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(ch>='A'&& ch<='Z'||ch>='a'&& ch<='z') {
				
				t=ch+t;
			}
			
		
		}
		int k=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
		
			
			if((ch>='A'&& ch<='Z'||ch>='a'&& ch<='z')) {
				
				y=y+t.charAt(k++);
			}
			else {
				y=y+ch;
			}
			
			
			
		}
		System.out.println(y);
		
			
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String s= scan.nextLine();
		reverse(s);
	}

}
