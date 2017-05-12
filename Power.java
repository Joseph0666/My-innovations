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
		int rem,sum=0;
		int[] a=new int[length];
		int i,j;
		for(i=0;i<length;i++){
			rem=n%10;
			a[i]=rem;
			n/=10;
		}
		for(i=0;i<length;i++){
			sum=sum+a[i]*a[i]*a[i]*a[i];
		}
		System.out.println(sum);
	}

}
