package guvi;
import java.util.Scanner;
public class Indexnum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);	
		int i,n;
		n=s.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(i==a[i])
			{
				System.out.println(a[i]);
			}
		}
	}

}
