package userStringAnagram;
import java.util.Scanner;
public class UserStringAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
			boolean isAnagram = false;
			boolean visited[] = new boolean[str2.length()];
			if(str1==null && str2==null) {
			 if(str1.length()==str2.length()) {
				for(int i=0;i<str1.length();i++) {
					final char s = str1.charAt(i);
					isAnagram=false;
					for(int j=0;j<str2.length();j++) {
						if(str2.charAt(j)==s && !visited[j]) {
							isAnagram=true;
							visited[j]=true;
							break;
						}
					}
					if(!(isAnagram)) {
						break;
					}
				}
				if(isAnagram) {
					System.out.println("Strings are Anagram");
				}
				else {
					System.out.println("Strings are not Anagram");
				}
			}
			}
			
	}
 
	}

