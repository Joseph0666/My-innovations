package pro;
import java.util.Arrays;
import java.util.Scanner;
public class ArraySplit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rem=n/2;
		int[] a=new int[n];
		int[] b=new int[n];
		int[] c=new int[n];
		int[] d=new int[n];
		int i,j;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		for(i=0;i<=rem;i++)
		{
			b[i]=a[i];
		}
		for(i=rem+1;i<n;i++){
			c[i]=a[i];
		}
		for(i=0;i<n-1;i++)
		{
			d[i]=c[n-1-i];
		}
		int[] e=new int[n];
		for(i=0;i<rem;i++)
		{
			e[i]=d[i];
			System.out.print(e[i]+",");
			e[i+1]=b[i];
			System.out.print(e[i+1]+",");
		}
		System.out.print(a[rem]);
			}
}
