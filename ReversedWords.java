package pro;
import java.util.Scanner;
public class ReversedWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String str=s.nextLine();
		String[] str1=str.split(" ");
		for(String str2:str1)
		{
			StringBuffer rev=new StringBuffer(str2);
			rev.reverse();
			System.out.print(rev+" ");
		}
	}

}
