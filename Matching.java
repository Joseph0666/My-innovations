package pro;
import java.util.Scanner;
public class Matching {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n");
		int n=s.nextInt();
		int[] a=new int[n];
		int m=0;
		System.out.println("Enter target integer");
		int t=s.nextInt();
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			m=m+a[i];
		}
		if(m==t)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
