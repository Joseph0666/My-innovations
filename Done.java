package Workout;

import java.util.Scanner;

public class Done {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
			System.out.println("Enter total Members");
			int n=s.nextInt();
			int count=0;
			if(n%2==0){
				System.out.println("Teams divided in to="+n/2+" "+n/2);
				System.out.println("Members diffference="+count);
			}
			else if(n%2!=0){
				int a=n/2+1;
				int b=n/2;
				count=a-b;
				System.out.println("Teams divided in to ="+a+" "+b);
				System.out.println("Members diffference="+count);
			}
		}
	}
