package String;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
			String name="rajashekar";
			StringBuffer sb =new StringBuffer();
			
			Set<Character> hs = new HashSet<>();
			for (int i = 0; i < name.length(); i++) {
				Character ch=name.charAt(i);
				if(!hs.contains(ch)) {
					hs.add(ch);
					sb.append(ch);
				}
			}
			System.out.println(sb);
	
	}

}
