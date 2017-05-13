package pro;
import java.util.Arrays;
import java.util.Scanner;
public class SortMarks {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i,j;
		System.out.println("Enter total num of Subjects");
		//System.out.println("Enter num");
		int n=s.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		for(i=0;i<n;i++)
		{
			System.out.println("m"+i+": "+a[i]);
		}
		double avg=0;
		for(i=0;i<n;i++)
		{
		 avg=avg+a[i];
		}
		System.out.println("avg="+avg/n);
	}

}
