package guvi;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Guvi28 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char []ch=str.toCharArray();
		int i;
		int j;
		
		String s1="";
		LinkedHashSet set=new LinkedHashSet();
		for(i=0;i<ch.length;i++){
			set.add(ch[i]);
		}
		for(Object o:set){
			s1=s1+o;
		}
		System.out.println(s1);
	}

}
