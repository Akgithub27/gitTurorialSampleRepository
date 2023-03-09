package udemy;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		String word;
		//String reverse ="";
		char c ;
		int i,j,count=0;
		String occurance="";
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the word : ");
		word=sc.nextLine();
		
		System.out.println("Enter the char to be checked : ");
		c = sc.next().charAt(0);
		
		 for(i=0;i<word.length();i++)
		 {
			 if(c==word.charAt(i))
			 {
				 occurance="true";
			 }
			 else {
				 occurance = "false";
			 }
		 }
		 System.out.println(occurance);
		
		
	
		
	}

}
