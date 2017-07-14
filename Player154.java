package Workout;

import java.util.Scanner;

public class Player154 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str="Joseph";
		char []ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(i==1){
				ch[i]=Character.toUpperCase(ch[i]);
			}System.out.print(ch[i]);
		}
	}
}
