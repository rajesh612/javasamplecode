package String;

import java.util.HashMap;
import java.util.Map;

public class PracticeAnagram {

	public static boolean isAnagram(String s1,String s2) {
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		s1=s1.replaceAll(" ","");
		s2=s2.replaceAll(" ", "");
		
		if(s1==null&&s2==null || s1.isEmpty() && s2.isEmpty()) {
			return true;
		}
		if(s1==null || s2==null || s1.isEmpty() ||s2.isEmpty()) {
			return false;
		}
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		Map<Character,Integer> hm = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			Character key= s1.charAt(i);
			Integer value= hm.get(key);
			if(value==null) {
				value=1;
			} else {
				value=value+1;
			 }
			hm.put(key,value);
		}
		
		
		for(int j=0;j<s2.length();j++) {
			Character key1=s2.charAt(j);
			Integer value1=hm.get(key1);
			if(value1==null) {
				return false;
			} if(value1==1) {
				hm.remove(key1);
			} else {
				hm.put(key1, value1-1);
			}
		}
		
		return hm.isEmpty();
	}
	
	
	
	
	public static void main(String[] args) {
		if(PracticeAnagram.isAnagram(" "," ")) {
			System.out.println("yes,anagram");
		} else {
			System.out.println("no, not anagram");
		}
	}

}
