package Workout;

import java.util.Arrays;
import java.util.Scanner;

public class Player51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s =new Scanner(System.in);
		int n=5;
		int[] a=new int[n];
		int i;
		int j;
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		int len=a.length;
		System.out.println(a[1]);
	}

}
