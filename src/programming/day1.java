package programming;

import java.util.Scanner;

public class day1 {
	static boolean isprime(int n){
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		else
		{
			return false;
		}
	}

	
	static void printprime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(isprime(i))
			{
				
			System.out.println(i);
			}
		}
	}
	static void printprime2(int n,int m) {
		for(int i=n;i<=m;i++) {
			if(isprime(i)) {
				System.out.println(i);
			}
		}
	}
	
	static void printNprime(int n) {
		int count=0;
		for(int i=0;count<n;i++) {
			if(isprime(i)) {
				System.out.println(i);
				count++;
			}
		}
	}
	
	
	
	static void factors(int n,int m) {
		for(int i=n;i>=1;i--) {
			if(n%i==0 && m%i==0) {
				System.out.println(i);
				break;
			}
		}
	}
	
	
	
	static void fibonaciSeries(int n) {
		
		int first=0;
		int second=1;
		
		for (int i=1;i<=n;i++) {
			System.out.println(first+" ");
			
			int sum = first+second;
			first=second;
			second =sum;
			
			
		}
	}
	
	
	static void arraysum(int[]ar) {
		
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			
			sum = sum+ar[i];
			
		}
		System.out.println(sum);
	}
	
	
	
	static int largestelement(int[]ar) {
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		return max;
		
	}
	
	static int smallestelement(int[]ar) {
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<ar.length;i++) {
			
			if(ar[i]< min)
			{
				min=ar[i];
			}
		}
		return min;
	}
	
	static void occuranceoflargest(int[]ar) {
		int largest=ar[0];
		int count=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>largest) {
				largest=ar[i];
				
			}
		}
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==largest) {
				count++;
				
			}
		}
		System.out.println(count);
		
	}
	
	
	static int secondlargest(int[]ar) {
		
		int fl=Integer.MIN_VALUE;
		int sl=Integer.MAX_VALUE;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>fl) {
				sl=fl;
				fl=ar[i];
			}
			else if(ar[i]>sl) {
				sl=ar[i];
			}
		}
		return sl;
	}
	
	
	static int maxPairSum(int[]ar) {
		int fl=Integer.MIN_VALUE;
		int sl=Integer.MAX_VALUE;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>fl) {
				sl=fl;
				fl=ar[i];
			}
			else if(ar[i]>sl)
			{
				sl=ar[i];
			}
		}
		return fl+sl;
	}
	
	
	static void CountOccuranceofAll(int[]ar) {
		
		int count=1;
		
		for(int i=0;i<ar.length-1;i++) {
			
			if(ar[i]==ar[i+1]) {
				count++;
			}
			else {
				System.out.println(ar[i]+" " +count);
				count=1;
			}
		}
		System.out.println(ar[ar.length-1]+" "+count);
		
	}
	
	
	static void arrayMerger(int[]ar1, int [] ar2) {
		
		int k= ar1.length+ar2.length;
		int []res= new int[k];
		int r=0;
		for(int i=0;i<ar1.length;i++) {
			res[r]=ar1[i];
			r++;
		}
		for(int i=0;i<ar2.length;i++) {
			res[r]= ar2[i];
			r++;
		}
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
			
		}
		
	}
	
	
	
	static void countUnique(int[]ar1) {
		int count=0;
		
		for(int i=0;i<ar1.length-1;i++)
		{
			if(i==ar1.length-1||ar1[i] != ar1[i+1])
			{
				count++;
			}
			
			
			
		}
		System.out.println(count);
		
		
		
		
		}
	
	
	
	static void swap(int[]ar1) {
		int temp=0;
		
		for(int i=0;i<ar1.length;i=i+2) {
			
			temp=ar1[i];
			ar1[i]=ar1[i+1];
			ar1[i+1]=temp;
			
			
			
			
		}
		for(int i=0;i<ar1.length;i++) {
			System.out.print(ar1[i]+" ");
		}
		
	}
	
	
	
	static void repeatOfK(int[]ar1,int k) {
		int count=0;
		
		for(int i=0;i<ar1.length;i++) {
			
			if(ar1[i]==k) {
				count++;
				
			}
		}
		System.out.println(count);
	}
	
	
	
	static void summax(int[]ar1){
		
		int min= Integer.MAX_VALUE;
		int max= Integer.MIN_VALUE;
	    int sum=0;
	    
	    for(int i=0;i<ar1.length;i++) {
	    	
	    	if(ar1[i]>max) {
	    		max=ar1[i];
	    	}
	    	if(ar1[i]<min) {
	    		min=ar1[i];
	    		
	    	}
	    	sum=sum+ar1[i];
	    }
	    System.out.println(sum-max);
	    System.out.println(sum-min);
	    
		
		
	}
	static boolean chechArrayAssending(int[]ar1) {
		
		
		for(int i=0;i<ar1.length;i++) {
			
			if(ar1[i]>ar1[i+1]) {
				
				return false;
			}
			
		}
		return true;
	}
	
	
	
	
	static void assendingOrNot(int[]ar1) {
		
		for(int i=0;i<ar1.length-1;i++) {
			
			if(ar1[i]==ar1[i+1]-1) {
				
				
			}
			else {
				System.out.println("not continuous");
			}
			
			
		}
		System.out.println("c0ntinuous");
		
	}
	
	
	
	
	static void printPairs(int[]ar1) {
		
		for(int i=0;i<ar1.length-1;i++) {
			
			for(int j=i+1;j<ar1.length;j++) {
				
				System.out.println(ar1[i]+" "+ar1[j]);
			}
		}
		
	}
	
	static void maxpair(int[]ar1) {
		
	for(int i=0;i<ar1.length-1;i++) {
				
				for(int j=i+1;j<ar1.length;j++) {
					
					if(ar1[i]<ar1[j]) {
						
						System.out.println(ar1[i]+" "+ar1[j]);
					}
				}
			}
			
			
		}
	
	
	
	
	
	
	
	
	static void printpairsum(int[]ar1,int k) {
		
		for(int i=0;i<ar1.length;i++) {
			for(int j=i;j<ar1.length;j++) {
			if(ar1[i]-ar1[j]==k || ar1[j]-ar1[i]==k) {
				
				System.out.println(ar1[i]+" "+ar1[j]);
			}
				
			}
		}
		
		
	}
	
static void allPossibleSubArrays(int[]ar1) {
		
		for(int i=0;i<ar1.length;i++) {
			for(int j=i;j<ar1.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(ar1[k]+" ");
				}
				System.out.println();
			}
		}
	}
	
	
	
	
	static void differentSizesofSubarrays(int[]ar1) {
		
		for(int size=1;size<ar1.length;size++) {
			
			for(int i=0;i<ar1.length-size;i++) {
				
				for(int j=i;j<i+size;j++) {
					System.out.print(ar1[j]+" ");
				}
				System.out.println();
			}
			
		}
	}
	
	
	
	
	
	
	
	

	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//int k = scan.nextInt();
		int n = scan.nextInt();
		int [] ar1=new int[n];
		for(int i=0;i<ar1.length;i++) 
		{
			ar1[i]= scan.nextInt();
			
		}
//		int m = scan.nextInt();
//		int[] ar2= new int[m];
//		for(int i=0;i<ar2.length;i++) {
//			ar2[i]= scan.nextInt();
//		}
		
		differentSizesofSubarrays(ar1);
		
		
		//System.out.println(res);
		
		
	}	

}
