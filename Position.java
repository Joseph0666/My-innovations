package guvi;
import java.util.Scanner;
public class Position {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,i,j,temp=0;
		n=s.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
					
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>=a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		for(i=0;i<n;i+=2)
		{
			if(a[i]!=a[i+1]){
				System.out.println(a[i]);
				break;
			}
		}
	}

}
