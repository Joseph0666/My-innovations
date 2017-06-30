package guvi;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Guvi57 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str="1234xyz";
		String str1="abdekk123";
		int i;
		int j;
		int large=-1234;
		LinkedHashSet set=new LinkedHashSet();
		LinkedHashSet set1=new LinkedHashSet();
		LinkedHashSet set2=new LinkedHashSet();
		for(i=0;i<str.length();i++){
			for(j=i+1;j<=str.length();j++){
				String s1="";
				String s2="";
				s1=s1+str.substring(i,j);
				set.add(s1);
			}
		}
		for(i=0;i<str1.length();i++){
			for(j=i+1;j<=str1.length();j++){
				String s1="";
				String s2="";
				s2=s2+str1.substring(i,j);
				set1.add(s2);
			}
		}
		for(Object o:set){
			for(Object obj:set1){
				if(o.equals(obj)){
					int count=0;
					count=((String)o).length();
					if(count>=2){
					if(large<count){
						large=count;
						}
					}
				}
			}
		}
				if(large>0){
					System.out.println("True");
				}
				else{
					System.out.println("False");
				}
		}
}
