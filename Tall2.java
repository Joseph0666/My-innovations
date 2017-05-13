package pro;
import java.util.Scanner;
public class Tall2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int i,j,n,temp=0;
System.out.println("Enterr n");
n=s.nextInt();
System.out.println("Enter k");
int k=s.nextInt();
int[] a=new int[n];
for(i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
	for(j=i+1;j<n;j++)
	{
		if(a[i]>a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	System.out.println(a[i]);
}
System.out.println("4th tallest:"+a[n-4]+"\n"+"k tallest:"+a[k]);
	}

}
