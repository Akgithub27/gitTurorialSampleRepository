import java.util.Scanner;

public class StringSolvingProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		String result="";
		for(int i=0;i<s.length();i++)
		{
			if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
				int caster = (int) s.charAt(i);
				if (caster >= 65 && caster <= 90) {
					caster = caster + 32;
				} else if (caster >= 97 && caster <= 122) {
					caster = caster - 32;
				}
				char ch = (char) caster;
				if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
						|| ch == 'I' || ch == 'O' || ch == 'U')) {
					result = result + "#" + ch;
				}
			} else {
				result = result + s.charAt(i);
			}
		}
		System.out.println(result);
		

	}

}
