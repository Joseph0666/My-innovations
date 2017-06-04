package pro;
import java.util.Scanner;
public class Pow {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int len=String.valueOf(n).length();
		int[] a=new int[len];
		int i,reverse=0;
		for(i=0;i<len;i++)
		{
			int rem=n%10;
			reverse=reverse*10+rem;
			n/=10;
		}
		for(i=0;i<len;i++)
		{
			int rem=reverse%10;
			a[i]=rem;
			reverse/=10;
		}
		
		int sum=0;
		for(i=0;i<len-1;i++)
		{
			sum=(int) (sum+Math.pow(a[i], a[i+1]));
			//System.out.println("i="+sum);
		}
		System.out.println(sum+a[len-1]);
	}

}
