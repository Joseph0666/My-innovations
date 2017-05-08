package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class StringDuplicates {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();
		int length=str.length();
		char dup=0;
		int i,j,flag;
		char[] ch=str.toCharArray();
		char[] ch1=new char[length];
		Arrays.sort(ch);
		for(i=0;i<length;i++)
		{
			System.out.print(ch[i]);
		}
		System.out.println("\n");
		for(i=0;i<length-1;i++)
		{
			if(ch[i]!=ch[i+1])
			{
				ch1[i]=ch[i];
				System.out.print(ch[i]);
			}
		}
		System.out.print(ch[length-1]);
	}
}
