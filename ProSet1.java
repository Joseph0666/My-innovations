package Guvi;
import java.util.*;
public class ProSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int input=s.nextInt();
		s.nextLine();
		ArrayList<String> list = new ArrayList<String>();
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		String []s1 = new String[input];
		for(int i=0;i<input;i++){
			s1[i]=s.nextLine();
		}
		for(int i=0;i<input;i++){
			for(int j=1;j<=s1[i].length();j++){
				String str1="";
				str1=s1[i].substring(0,j);
				list.add(str1);
				//System.out.println(str1);
			}
		}
		for(int i=0;i<list.size();i++){
			if(set.add(list.get(i))){
				
			}
			else{
				set1.add(list.get(i));
			}
		}
		String check="";
		for(String w:set1){
			check=w;
		}
		System.out.println(check);
	}
}
