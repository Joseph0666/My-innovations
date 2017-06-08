package pro;
import java.util.Arrays;
import java.util.Scanner;
public class Arr9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		int i;
		int j;
		int dup=0;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		
		for(i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1] && a[i]!=a[n-1])
			{
				System.out.println(a[i]);
			}
			}
		System.out.println(a[n-1]);
		}
	}

