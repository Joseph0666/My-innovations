import java.util.Scanner;
public class Arra9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		int i;
		int j;
		int b=0;
		int c=0;
		int sum=0;
		int sum1=0;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
				sum=sum+a[i];
		}
		for(i=0;i<n;i++){
			if(a[i]==6){
				b=i;
				System.out.println("6="+b);
			}
			else if(a[i]==7)
			{
				c=i;
				System.out.println("7="+c);
			}
		}
		for(i=b;i<=c;i++)
		{
			sum1=sum1+a[i];
		}
	int sum2=sum-sum1;
	System.out.println("Sum="+sum2);
	}

}
