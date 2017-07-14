package pro;
import java.util.Scanner;
public class Power {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	System.out.println("enter num");
		int n=s.nextInt();
		System.out.println("Enter power");
		int power=4;
		int length=String.valueOf(n).length();
		int rem,sum=1;
		int[] a=new int[length];
		int i,j;
		for(i=0;i<length;i++){
			rem=n%10;
			a[i]=rem;
			n/=10;
		}
		int sum1=0;
		for(i=0;i<length;i++){
			sum=1;
			for(j=0;j<length;j++){
				sum*=a[i];
			}
			sum1=sum1+sum;
		}
		System.out.println(sum1);
	}

}
