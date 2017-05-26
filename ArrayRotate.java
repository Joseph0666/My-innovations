package pro;
import java.util.Scanner;
public class ArrayRotate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter d value less than half of n");
		int d=s.nextInt();
		int i,j;
		int[] b=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		if(n%2==0){
		for(i=d;i<n;i++)
		{
			b[i-d]=a[i];
		}
		for(i=0;i<d;i++)
		{
			b[d+i]=a[i];
		}		
		for(i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}
		}
		else
		{
			for(i=d;i<n;i++)
			{
				b[i-d]=a[i];
			}
			for(i=0;i<d;i++)
			{
				b[d+i+1]=a[i];
			}		
			for(i=0;i<n;i++)
			{
				System.out.println(b[i]);
			}
		}
	}
}
