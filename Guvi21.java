package guvi;
import java.util.Scanner;
public class Guvi21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int n1=n/2;
		int i;
		int[] a=new int[n];
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		int sum=0;
				int sum1=0;
		for(i=0;i<n;i++){
			if(i>=n1){
				sum=sum+a[i];
			}
			else if(i<n1){
				sum1=sum1+a[i];
			}
		}
		System.out.println(sum);
		System.out.println(sum1);
		if((sum1/n1)==(sum/(n-n1))){
			System.out.println("Possible");
		}
		else {
			System.out.println("Not possible");
		}
	}

}
