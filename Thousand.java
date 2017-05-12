package pro;
import java.util.Arrays;
import java.util.Scanner;
public class Thousand {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		int th=a[n-1]-a[0];
		System.out.println(th+"Thousand");
	}

}
