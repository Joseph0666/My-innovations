package pro;
import java.util.Scanner;
public class StringPassword {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String str1=s.nextLine();
		String s1="";
		String s2="";
		int reverse=0;
		int n=str.length();
		int n1=str1.length();
		//System.out.println("String1="+n);
		//System.out.println("String2="+n1);
		if(n<n1)
		{
		for(int i=0;i<=n1-n;i++)
		{
			reverse=reverse*10+i;
		}
	}
		else if(n1<n)
		{
			for(int i=0;i<=n-n1;i++)
			{
				reverse=reverse*10+i;
			}
		}
		//System.out.println(reverse);
		if(n<n1)
		{
			s1=str+reverse;
		}
		else
		{
			s1=str1+reverse;
		}
		//System.out.println(s1);
		if(n<n1){
		for(int i=0;i<s1.length();i++)
		{
			s2=s2+s1.charAt(i)+str1.charAt(i);
		}
	}
		else
		{
			for(int i=0;i<s1.length();i++)
			{
				s2=s2+str.charAt(i)+s1.charAt(i);
			}	
		}
		System.out.println(s2);
	}
}
