import java.util.Scanner;
public class Target {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,m;
		n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter m");
		m=s.nextInt();
		System.out.println("Enter the TargetNumber");
		int t=s.nextInt(),count=0;
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
	
		for(i=0;i<m;i++)
		{
			count=count+a[i];
		}
		if(t==count)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
