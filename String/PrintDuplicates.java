package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		int a[]= {1,2,2,3,4,2,3,4,4,2,3,4,4};
		
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		for(int i:a) {
			Integer count=m.get(i);
			if(count==null) {
				count=1;
			} else {
				count=count+1;
				
			}m.put(i, count);
		}
		
		Set<Map.Entry<Integer, Integer>> me= m.entrySet();
		for(Entry<Integer, Integer> j: me) {
			if(j.getValue()>1) {
				System.out.println(j.getKey());
			}
		}
	}

}
