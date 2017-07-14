package Workout;

import java.util.Scanner;

public class Guvi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s =new Scanner(System.in);
			int i;
			int j;
			int k;
			int n=s.nextInt();
			int[] a=new int[n];
			for(i=0;i<n;i++){
				a[i]=s.nextInt();
			}
			for(i=0;i<n;i++){
				for(j=i+1;j<n-1;j++){
					k=0;
					for(k=j+1;k<n;k++){
					if(a[i]+a[j]==a[k]){
						System.out.println(a[i]+" "+a[j]+" = "+a[k]);
					}
				}
			}
		}	
	}
}
