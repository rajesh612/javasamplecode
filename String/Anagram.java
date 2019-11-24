package String;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	
	public static boolean IsAnagram(String s1,String s2) {
		
		
		// preprocessing of strings 
		// incase of spaces and upper and lower cases
		s1=s1.replaceAll(" ","");
		s2=s2.replaceAll(" ","");
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		// incase of both empty strings and null strings
		if(s1==null&& s2==null || s1.isEmpty()&&s2.isEmpty()) {
			return true;
		}
		// incase of either of the string is empty and null
		if(s1==null||s2==null || s1.isEmpty()||s2.isEmpty()) {
			return false;
		}
		// will check whether the lengths of two string are equal are not
		if(s1.length()!=s2.length()) {
			return false;
		}
		// will populate the hashmap by iterating over the first string
		Map<Character,Integer> hm = new HashMap<>();
		for(int i=0;i<s1.length();i++) {
			Character key=s1.charAt(i);
			Integer value=hm.get(key);
			if(value==null) {
				value=1;
			} else {
				value=value+1;
			}
			hm.put(key,value);
		}
		
		//iterate the second string and check 
		//if the characters form the second strings are present in the hashmap
		for (int j = 0; j < s2.length(); j++) {
			Character key1=s2.charAt(j);
			Integer value1=hm.get(key1);
			if(value1==null) {
				return false;
			} if(value1==1)  {
				hm.remove(key1);
			} else {
				hm.put(key1, value1-1);
			}
		}
		
		return hm.isEmpty();
	}
	
	

	public static void main(String[] args) {
		if(Anagram.IsAnagram("","silent")) {
			System.out.println("yes, the given strings are anagram");
		} else {
			System.out.println("yes, the given strings are not anagram");

		}
	}

}
