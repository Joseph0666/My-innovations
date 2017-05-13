package pro;
import java.util.Scanner;
public class RemoveElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter n");
		n=s.nextInt();
		System.out.println("Enter remove element");
		int remove=s.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]!=remove)
			{
				System.out.print(a[i]+",");
			}
		}
	}

}
