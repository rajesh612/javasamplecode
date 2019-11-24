package String;

public class WordsCountInaString {

	public static void main(String[] args) {
		
		String name="my name   is rajashekar";
		
		System.out.println(name.split("\\s+").length);
		System.out.println(countWord(name));
	
	}
	public static int countWord(String word) {
		int wordcount=1;
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i)==' ' && i<word.length()-1 && word.charAt(i+1)!=' ') {
				wordcount=wordcount+1;
			}
		}
		
		
		return wordcount;
	}

}
