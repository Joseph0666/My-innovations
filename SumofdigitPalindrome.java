package pro;
import java.util.Scanner;
public class SumofdigitPalindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=s.nextInt();
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		System.out.println("Sum="+sum);
		int sum1=sum;
		int reverse=0;
		while(sum>0)
		{
			int rem=sum%10;
			reverse=reverse*10+rem;
			sum/=10;
		}
		System.out.println("reverse="+reverse);
		if(sum1==reverse)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}

}
