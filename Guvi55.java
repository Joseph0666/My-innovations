package guvi;

import java.util.Scanner;
		
public class Guvi55 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int NoOfElephants=s.nextInt();
		int WeightOfSpiderWeb=s.nextInt();
		int n=NoOfElephants;
		int m=WeightOfSpiderWeb;
		int[] a=new int[n];
		int i;
		int j;
		int count=0;
		int sum=0;
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
			sum=sum+a[i];
			if(sum<=m){
				count++;
			}
			else{
				break;
			}
		}
		System.out.println(count);
	}

}
