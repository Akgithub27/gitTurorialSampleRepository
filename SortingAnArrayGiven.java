import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortingAnArrayGiven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,temp=0;
		System.out.println("Enter the size of array : ");
		a=sc.nextInt();
		int arr[] = new int[a];
		int arr1[] = new int[a];
		List<Integer> listOne = new ArrayList<>();
		List<Integer> listTwo= new ArrayList<>();
		List<Integer> mergedList= new ArrayList<>();
		
		System.out.println("Enter the array ");
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
			listOne.add(arr[i]);
		}
		listTwo.addAll(listOne);
		Collections.sort(listOne,(i,j)-> i<j?1:-1);
		for(Integer n : listOne)
		{
		}
		System.out.println(mergedList);
	}

}
