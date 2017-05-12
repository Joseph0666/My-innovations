package pro;
import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),rem,sum=0,sum1=0;
		int length=String.valueOf(n).length();
		int[] a=new int[length];
				int i,j;
		for(i=0;i<length;i++)
		{
			rem=n%10;
			a[i]=rem;
			n/=10;
		}
		for(i=0;i<length;i++)
		{
			for(j=i;j<length;j++)
			{
				sum=sum+a[j];
			}
		}
		System.out.println(sum);
	}

}
