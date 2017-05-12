package pro;
import java.util.Scanner;
public class LargestDiference {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		int i,j;
		int diff=0,large=-1234;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
			diff=a[i]-a[i+1];
			Math.abs(diff);
			if(diff>large){
				large=diff;
			}
		}
		System.out.println(large);
	}

}
