package guvi;
import java.util.Scanner;
public class FIndTwoNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int target=9;
		int[] a=new int[n];
		int i,j;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]+a[j]==target)
				{
					System.out.println(a[i]+","+a[j]);
					break;
				}
			}
		}
	}

}
