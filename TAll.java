package pro;
import java.util.Arrays;
import java.util.Scanner;
public class TAll {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter n");
int n=s.nextInt(),i;
int[] a=new int[n];
System.out.println("Enter k");
int k=s.nextInt();
for(i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
Arrays.sort(a);
for(i=0;i<n;i++){
System.out.println(a[i]);
	}
System.out.println("4th tallest Student:"+a[n-4]);
System.out.println("K tallest Student:"+a[k]);
	}
}
