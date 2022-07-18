package stringAnagram;
import java.util.Scanner;
public class StringAnagram {

	public static void main(String[] args) {
//		String a = "aab";
//		String b = "abc";
//		String a = "act";
//		String b = "cat";
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();

		boolean isAnagram = false;
		boolean visited[] = new boolean[b.length()];
		if(a.length()==b.length()) {
		for(int i=0;i<a.length();i++) {
			char c = a.charAt(i);
			isAnagram=false;
			for(int j=0;j<b.length();j++) {
				if(b.charAt(j)==c && !visited[j]) {
					isAnagram = true;
					visited[j]=true;
					break;
				}
			}
			if(!(isAnagram)) {
				break;
			}
		}
		}
		if(isAnagram) {
			System.out.println("Anagram Strings");
		}
		else {
			System.out.println("not Anagram Strings");
		}

	}

}
