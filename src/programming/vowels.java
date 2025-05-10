package programming;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();
		
//		for(int i=0;i<s.length();i++) {
//			char ch = s.charAt(i);
//			
//			if(!(ch =='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')) {
//				System.out.print(ch);
//				
//			}
//			
//		}
		
		String t="";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if((ch>'A'&& ch<'Z')||(ch>'a'&& ch<'z')){
			
				if((ch =='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')) {
					t=t+ch;
				}
				
			}
			else {
				t=t+ch;
			}
		}
		System.out.println(t);

	}

}
