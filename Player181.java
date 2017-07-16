package Workout;

import java.util.Scanner;

public class Player181 {
	static void print(int n1){
	if(n1==1){
		
	}
	else{
		int k=n1-1;
		print(k);
		System.out.println(k);
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		print(n+1);
	}

}
