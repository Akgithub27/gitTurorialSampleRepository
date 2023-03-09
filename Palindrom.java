package udemy;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		String word,reverse = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		word=sc.nextLine();
		
		String s[] = word.split(" ");
		
	for(String obj : s)
		{
			if(!(isPalindrom(obj)))
			{
				reverse = reverse+obj+" ";
			}
		}
	System.out.println(reverse.length());
	 String reverse1=reverse.trim();
	System.out.println("Output : "+reverse1);
	System.out.println(reverse1.length());

	}

	private static boolean isPalindrom(String str) {
		String rev ="",copy;
		copy=str;
		for(int i=copy.length()-1;i>=0;i--)
		{
			rev=rev+copy.charAt(i);
		}
		if(rev.equals(str))
		{
			return true;
		}
		else
		{
			return false;
			
		}
		
		}

}
