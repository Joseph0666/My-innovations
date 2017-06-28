package guvi;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Pangram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			String str=s.nextLine();
			int i;
			int j;
			LinkedHashSet set=new LinkedHashSet();
			String s2=str.toLowerCase();
			String s1=s2.replaceAll("\\s+","");
			char []ch=s1.toCharArray();
			for(i=0;i<ch.length;i++){
				if(Character.isAlphabetic(ch[i])){
				set.add(ch[i]);
				}
			}
			Iterator itr=set.iterator();
			if(set.size()==26){
				System.out.println("Panagram");
			}
			else{
				System.out.println("Not panagram");
			}
	}
}
