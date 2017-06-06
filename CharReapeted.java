import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class CharReapeted {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String str1="";
		int i,j,count=0;
		HashSet a=new HashSet();
		for(i=0;i<str.length();i++)
		{
			a.add(str.charAt(i));
		}
		Iterator itr=a.iterator();
		while(itr.hasNext())
		{
			str1=str1+itr.next();
		}
		StringBuffer s2=new StringBuffer(str1);
		s2.reverse();
		System.out.println(s2);
	}

}
