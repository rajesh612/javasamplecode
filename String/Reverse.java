package String;

public class Reverse {

	public static void main(String[] args) {
		String s="image";
		String r=" ";
		for (int i=s.length()-1;i>=0; i--) {
			
			Character ch=s.charAt(i);
			r=r+ch;
		}
		System.out.println(r);
	}

}
