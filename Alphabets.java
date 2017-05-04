package guvi;
import java.util.Scanner;
public class Alphabets {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rem,reverse=0,rem1;
		while(n>0)
		{
			rem=n%10;
			reverse=reverse*10+rem;
			n/=10;
		}
		//System.out.println("reverse="+reverse);
		while(reverse>0)
		{
			rem1=reverse%10;
			switch(rem1)
			{
			case 1:
			{
				System.out.print("a");
				break;
			}
			case 2:
			{
				System.out.print("b");
				break;
			}
			case 3:
			{
				System.out.print("c");
				break;
			}
			case 4:
			{
				System.out.print("d");
				break;
			}
			case 5:
			{
				System.out.print("e");
				break;
			}
			case 6:
			{
				System.out.print("f");
				break;
			}
			case 7:
			{
				System.out.print("g");
				break;
			}
			case 8:
			{
				System.out.print("h");
				break;
			}
			case 9:
			{
				System.out.print("i");
				break;
			}
			}
			reverse/=10;
		}
	}

}
