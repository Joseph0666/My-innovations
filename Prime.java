import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		int count=0,sum=0;
		for(i=2;i<n;i++)
		{
			count=0;
			for(j=2;j<n;j++)
			{	
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				//System.out.println(i);
				int rem=i%10;
				if(rem==3)
				{
					sum=sum+i;
				}
			}
		}
		System.out.println("Sum="+sum);
	}

}
