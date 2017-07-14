package Workout;

import java.util.Scanner;

public class Hunter50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int Number=s.nextInt();
		int divisor=s.nextInt();
		int rem=0;
		while(Number>=divisor){
			Number=Number-divisor;
			rem++;
		}
		System.out.println(rem);
	}

}
