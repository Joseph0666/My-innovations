import java.util.Arrays;
import java.util.Scanner;
public class Twodimentinal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int[][] a=new int[m][n];
		int i,j,large=-123;
		int[] arr=new int[m*n];
		int[] arr1=new int[m*n];
		int k=0;
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
		System.out.print(a[i][j]);
			}
			System.out.println("\n");
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				arr[k]=a[i][j];
				k++;		
			}
		}
		int[][] a1=new int[m][n];
		Arrays.sort(arr);
		int d=0;
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a1[i][j]=arr[d];
				d++;
			}
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
		System.out.print(a1[i][j]);	
			}
			System.out.print("\n");
		}
	}
}
