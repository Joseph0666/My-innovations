package guvi;

import java.util.Scanner;
public class Hunter113 {
	public static int output=0;
	public static void prime(int n,int n1){
		int i;
		int j;
		int count=0;
		int c=0;
		int count1=0;
		int[] a=new int[n1];
		for(i=n;i<=n1;i++){
			int sum=0;
			j=i;
			while(j>0){
				int rem=j%10;
				sum=sum+rem;
				j/=10;
			}
			a[c]=sum;
			c++;
		}
		for(i=0;i<c;i++){
			count=0;
			for(j=2;j<=n1;j++){
				if(a[i]%j==0){
					count++;
				}
			}
			if(count==1){
				count1++;
			}
		}
		output=count1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int input1=s.nextInt();
			int input2=s.nextInt();
			prime(input1,input2);
			System.out.println(output);
	}
}
