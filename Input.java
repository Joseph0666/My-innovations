package pro;
import java.util.Scanner;
public class Input {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	//System.out.println(str);
	String str1=str.replaceAll("\\D+","");
	//System.out.println(str1);
	int n=str1.length();
	int m=Integer.parseInt(str1);
	//System.out.println("len"+n);
	int[] a=new int[n];
	int large=-1234;
	int i,j,sum=0;
	for(i=0;i<n;i++)
	{
		int rem=m%10;
		a[i]=rem;
		m/=10;
	}
	for(i=0;i<n;i++)
	{
		if(a[i]>large){
			large=a[i];
		}
	}
	System.out.println("digit="+large);
	for(i=0;i<n;i++)
	{
		sum=sum+a[i]*large;
	}
	System.out.println("A="+sum);
	int n1=String.valueOf(sum).length();
	int sum1=0;
	//System.out.println("lengthof sum="+n1);
	for(i=0;i<n1;i++)
	{
		int rem1=sum%10;
		sum1=sum1+rem1;
		sum/=10;
	}
	System.out.println("sum="+sum1);
	int c=sum1;
	int n2=String.valueOf(sum1).length();
	int sum2=0;
	//System.out.println("lengthof sum="+n1);
	for(i=0;i<n2;i++)
	{
		int rem1=sum1%10;
		sum2=sum2+rem1;
		sum1/=10;
	}
	System.out.println("sum1("+c+")-->="+sum2);
	int small=1234;
	for(i=0;i<n;i++)
	{
		if(small>a[i]){
			small=a[i];
		}
	}
	System.out.println("Smallest digit="+small);
	int sum3=1;
	for(i=0;i<n;i++){
		sum3=sum3*(a[i]+small);
	}
	System.out.println("B="+sum3);
	int n3=String.valueOf(sum3).length();
	//System.out.println("lengthofsum3="+n3);
	int sum4=0;
	for(i=0;i<n3;i++)
	{
		int rem1=sum3%10;
		sum4=sum4+rem1;
		sum3/=10;
	}
	System.out.println("sum2="+sum4);	
	int sq=0;
	if(sum2<sum4){
		sq=sum2*sum2;
		System.out.println("Square("+sum2+")="+sq);
	}
	else
	{
		sq=sum4*sum4;
		System.out.println("Square("+sum4+")="+sq);
	}

	}
}
