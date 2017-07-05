package pro;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Guvipro1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str="abcabcbabcabbcbabccc";
		int i;
		int j;
		String s1="";
		LinkedHashSet set=new LinkedHashSet();
		LinkedHashSet set1=new LinkedHashSet();
		LinkedHashSet set2=new LinkedHashSet();	
		LinkedHashSet set3=new LinkedHashSet();	
		for(i=0;i<str.length();i++){
			set.add(str.charAt(i));
		}
		char []ch=new char[set.size()];
		for(Object o:set){
			s1=s1+o;
		}
	for(i=0;i<s1.length();i++){	
		for(j=i+1;j<=s1.length();j++){
			String s2="";
			s2=s2+s1.substring(i,j);
			set1.add(s2);
			}
		}
	for(i=0;i<str.length();i++){
		for(j=i+1;j<=str.length();j++){
			String s3="";
			s3=s3+str.substring(i,j);
			set2.add(s3);
		}
	}
	for(Object o:set1){
		for(Object obj:set2){
			if(o.equals(obj)){
				set3.add(o);
			}
		}
	}int large=-1234;
	for(Object o:set3){
		int len=0;
		len=((String) o).length();
		if(large<len){
			large=len;
		}
	}
		for(Object o:set3){
			if(large==((String) o).length()){
			System.out.println(o);	
			}
		}
	}
}