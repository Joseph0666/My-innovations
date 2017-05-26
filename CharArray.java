package pro;
import java.util.Scanner;
public class CharArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char[] ch=str.toCharArray();
		int n=ch.length;
		int i,j;
		System.out.println("Enter the length");
		int len=s.nextInt();
		for(i=0;i<len-1;i++)
		{
			for(j=i+1;j<n;j++){	
				System.out.print(ch[i]);
			System.out.println( ch[j]);
		}
	}
}
}
