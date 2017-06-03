import java.util.Scanner;
public class Encoding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String input1=s.nextLine();
		String input2=s.nextLine();
		//System.out.println(input1);
		//System.out.println(input2);
		int len=input1.length();
		int len1=input2.length();
		int i;
		for(i=0;i<len;i++)
		{
			char ch=input1.charAt(i);
			switch(ch)
			{
			case 'a':
			{
				System.out.print("k");
				break;
			}
			case 'b':
			{
				System.out.print("l");
				break;
			}
			case 'c':
			{
				System.out.print("m");
				break;
			}case 'd':
			{
				System.out.print("n");
				break;
			}
			case 'e':
			{
				System.out.print("o");
				break;
			}
			case 'f':
			{
				System.out.print("p");
				break;
			}
			case 'g':
			{
				System.out.print("q");
				break;
			}
			case 'h':
			{
				System.out.print("r");
				break;
			}
			case 'i':
			{
				System.out.print("s");
				break;
			}
			case 'j':
			{
				System.out.print("t");
				break;
			}
			case 'k':
			{
				System.out.print("u");
				break;
			}
			case 'l':
			{
				System.out.print("v");
				break;
			}
			case 'm':
			{
				System.out.print("w");
				break;
			}
			case 'n':
			{
				System.out.print("x");
				break;
			}
			case 'o':
			{
				System.out.print("y");
				break;
			}
			case 'p':
			{
				System.out.print("z");
				break;
			}
			case 'q':
			{
				System.out.print("a");
				break;
			}
			case 'r':
			{
				System.out.print("b");
				break;
			}
			case 's':
			{
				System.out.print("c");
				break;
			}
			case 't':
			{
				System.out.print("d");
				break;
			}
			case 'u':
			{
				System.out.print("e");
				break;
			}case 'v':
			{
				System.out.print("f");
				break;
			}case 'w':
			{
				System.out.print("g");
				break;
			}case 'x':
			{
				System.out.print("h");
				break;
			}case 'y':
			{
				System.out.print("i");
				break;
			}case 'z':
			{
				System.out.print("j");
				break;
			}
			}
		}
		System.out.print(" ");
		String str=" ";
		for(i=0;i<len1;i++)
		{
		if(i==1)
		{
			System.out.print(input2.charAt(i-1));
		}
		else
		{
			System.out.print(input2.charAt(i));
		}
		}
	}

}
