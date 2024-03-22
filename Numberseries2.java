package gani.assignments;

import java.util.Scanner;

public class Numberseries2 {

	public static void main(String[] args) {
		// print the number series 1,2,4,8....
		int n,m=1;
		System.out.print("enter series length :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for (int i=0;i<n;i++) {
			System.out.print(m+" ");
			m=m*2;
		}


	}

}
