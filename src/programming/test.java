package programming;

import java.util.Scanner;

public class test {
	
	static int repeating(String s) {
		int Maxcount=0;
		int curCount=0;
		
		for(int i=0;i<s.length()-1;i++) {
			
			if(s.charAt(i)==s.charAt(i+1)) {
				curCount++;
				if(curCount>Maxcount) {
					Maxcount= curCount;
				}
			}
			else {
				curCount=1;
			}
			
			
		}
		return Maxcount;
		
		
	}
	


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		int res=repeating(s);
		System.out.println(res);
		

	}

}
