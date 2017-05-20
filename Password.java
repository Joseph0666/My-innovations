package pro;
import java.util.Scanner;
public class Password {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String str1=s.nextLine();
		int n=str.length();
		int n1=str1.length();
		System.out.println("Enter pin");
		int pin=s.nextInt();
		String Firstname="";
		String Secondname="";
		if(n>n1){
			Firstname=str;
		}
		else{
			Secondname=str;
		}
		if(n1>n)
		{
			Firstname=str1;
		}
		else{
			Secondname=str1;
		}
		System.out.println("FirstName="+Firstname);
		System.out.println("SecondName="+Secondname);
		char ch=Firstname.charAt(0);
		int length=String.valueOf(pin).length();
		//System.out.println("length="+length);
		int []a=new int[length];
		for(int i=0;i<length;i++)
		{
			int rem=pin%10;
			a[i]=rem;
			pin/=10;
		}
		//System.out.println(a[length-1]);
		//System.out.println(a[0]);
		System.out.println("password="+ch+Secondname+a[0]+a[length-1]);
	}

}
