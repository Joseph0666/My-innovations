package pro;
import java.util.Scanner;
public class RemovingCharinIndex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char[] ch=str.toCharArray();
		System.out.println("Enter the index");
		int index=s.nextInt();
		int i,j;
		int n=str.length();
		char[] ch1=new char[n];
		for(i=0;i<ch.length;i++)
		{
			if(i!=index){
				ch1[i]=ch[i];
				System.out.print(ch1[i]);
			}
			
		}
		
	}

}
