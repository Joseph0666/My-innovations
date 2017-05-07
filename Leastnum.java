package guvi;
import java.util.Scanner;
public class Leastnum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt(),rem,temp=0,i;
		int length = String.valueOf(n).length();
		//System.out.println("Enter the size of num:");
		//int num=s.nextInt();
		System.out.println("K digits from the input number");
		int k=s.nextInt();
		int num=length-k;
		int j;
		int[] a=new int[n];
	//	System.out.println(length);
		for(i=0;i<length;i++){
			rem=n%10;
			a[i]=rem;
			//System.out.print(a[i]);
			n/=10;
		}
		//System.out.println("ascendingorder");
		for(i=0;i<length;i++)
		{
			for(j=i+1;j<length;j++)
			{
				if(a[i]>=a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			//System.out.print(a[i]);
		}
		for(i=0;i<num;i++)
		{
			System.out.print(a[i]);
		}
	}

}
