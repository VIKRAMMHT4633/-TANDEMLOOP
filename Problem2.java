package Tandemloop;

import java.util.Scanner;

public class Problem2 {
	static void odd(int n) {
		for(int i=0; i<n; i++)
		{
			System.out.print((2*i+1)+" ");
		}
	}

	public static void main(String[] args) {
		int x=0;
		Scanner s= new Scanner(System.in);
		x=s.nextInt();
		odd(x);

	}

}
