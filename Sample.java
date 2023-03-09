package udemy;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		String word;
		int sum=0;
		int ascii;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		word=sc.nextLine();
		
		for(int i =0;i<word.length();i++)
		{
			ascii = (int) word.charAt(i);
			
			if(ascii>=65 && ascii <=90)
			{
				sum = sum +(ascii-64);
			}
			if(ascii>=97 && ascii <=122)
			{
				sum = sum +(ascii-96);
			}
		}
		
		System.out.println(sum);
		
		
	}

}
