package programming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class collections {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//String s = scan.nextLine();
		
//		TreeSet<Character> set = new TreeSet<Character>();
//		for(int i=0;i<s.length();i++) {
//			char ch = s.charAt(i);
//			set.add(ch);
//		}
//		Iterator<Character>iter=set.iterator();
//		String t="";
//		while(iter.hasNext()) {
//			char ch = iter.next();
//			t=t+ch;
//			
//		}
//		System.out.println(t);
		
//		String[]ar=s.split(",");
//		TreeSet<String> set = new TreeSet<String>();
//		for(int i=0;i<ar.length;i++) {
//			set.add(ar[i]);
//		}
//		Iterator<String> iterator = set.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//			
//		}
		
		
//		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>(); 
//		for(int i=0;i<s.length();i++){
//			
//			if(map.containsKey(s.charAt(i))) {
//				int count = map.get(s.charAt(i));
//				map.put(s.charAt(i),count+1);
//			}
//			else {
//				map.put(s.charAt(i),1);
//			}
//			
//		}
//		
//		String t="";
//		
//		Set<Entry<Character, Integer>> entry = map.entrySet();
//			
//		for(Entry<Character,Integer> entries:entry) {
//			
//			System.out.println(entries.getKey()+" "+entries.getValue());
//			
//		}
		
//		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
//		for(int i=0;i<s.length();i++) {
//			set.add(s.charAt(i));
//		}
//		
//		String t="";
//		
//		Iterator<Character> itr = set.iterator();
//		while(itr.hasNext()) {
//			
//			Character ch = itr.next();
//			
//			t=t+ch;
//			
//		}
//		System.out.println(t);
		
//		
//		
//		
//		
//		int n = scan.nextInt();
//		int[]ar= new int[n];
//		for (int i = 0; i < ar.length; i++) {
//            ar[i] = scan.nextInt();
//        }
//		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
//		
//		for(int i=0;i<ar.length;i++) {
//			set.add(ar[i]);
//		}
//		
//		Iterator<Integer> itr = set.iterator();
//		while(itr.hasNext()) {
//			System.out.print(itr.next()+" ");
//		}
//		
		
//		String[] ar=s.split(",");
//		
//		 TreeSet<String> set = new TreeSet<String>();
//		 for(int i=0;i<ar.length;i++) {
//			 set.add(ar[i]);
//		 }
//		 
//		 Iterator<String> iterator = set.iterator();
//		 while(iterator.hasNext()) {
//			 System.out.println(iterator.next());
//		 }
//			
//		
//		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
//		
//		for(int i=0;i<s.length();i++) {
//			char ch = s.charAt(i);
//			if(map.containsKey(ch))
//			{
//				int count = map.get(ch);
//				map.put(ch, count+1);
//			}
//			else {
//				map.put(ch,1);
//			}
//			
//			
//		}
//		String t="";
//		Set<Entry<Character, Integer>> entries = map.entrySet();
//		for(Entry<Character, Integer> e: entries) {
//			t=t+e.getKey()+""+e.getValue();
//		}
//		System.out.println(t);
//		
		
		
		int n = scan.nextInt();
        int[] ar = new int[n];
        
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            if (map.containsKey(ar[i])) {
                int count = map.get(ar[i]);
                map.put(ar[i], count + 1);
            } else {
                map.put(ar[i], 1);
            }
        }
        
        int pairs = 0;
        Collection<Integer> values = map.values();
        for (int value : values) {
            pairs += value / 2; // Counting pairs correctly
        }
        
        System.out.println(pairs);
		
	
		
	}

}
