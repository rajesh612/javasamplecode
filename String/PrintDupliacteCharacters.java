package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintDupliacteCharacters {

	public static void main(String[] args) {
		String name="rajashekar";
		
		Map<Character,Integer> hm = new HashMap<>();
		for (int i = 0; i < name.length(); i++) {
			Character key=name.charAt(i);
			Integer value=hm.get(key);
			if(value==null) {
				value=1;
			} else {
				value=value+1;
			}
			hm.put(key, value);
		}
		
		Set<Entry<Character, Integer>> me = hm.entrySet();
		for(Entry<Character,Integer> j:me) {
			if(j.getValue()>1) {
				System.out.print(j.getKey()+" ");
			}
		}
	}

}
