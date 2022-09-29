package Tandemloop;
import java.util.*;

public class Problem4 {
	public static int getNumberOfMultiples(int n, List<Integer> input) {
		
		int count=0;
		for(int i:input)
		{
			if(i%n==0)
				count++;
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of Elements in the list");
		int num= s.nextInt();
		System.out.println("Enter the elements of the list");
		List<Integer> list= new ArrayList<Integer>();
		
		for(int i=0; i<num; i++)
		{
			list.add(s.nextInt());
		}

		int[] multiples= {1,2,3,4,5,6,7,8,9};
		
		HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
		for(int i=0; i<multiples.length; i++)
		{
			map.put(multiples[i], getNumberOfMultiples(multiples[i], list));
		}
		System.out.println(map);
	}

}
