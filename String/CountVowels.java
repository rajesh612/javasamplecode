package String;

public class CountVowels {

	public static void main(String[] args) {
		String name="rajashekar";
		char[] ch=name.toCharArray();
		int count=0;
		for(char c:ch) {
		   switch(c) {
		   case 'a':
		   case 'e':
		   case 'i':
		   case 'o':
		   case 'u':
			   count++;
			break;   
		   }
		}
		System.out.println(count);
		
	}

}
