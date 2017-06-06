import java.util.Scanner;
public class ReapeatedString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int i,j;
		int count=0;
		for(i=0;i<str.length();i++)
		{
			count=0;
			for(j=0;j<str.length();j++)
			{
				if(str.charAt(i)==(str.charAt(j)))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(str.charAt(i));
		}
	}
	}
}
