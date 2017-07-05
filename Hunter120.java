package guvi;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Hunter120 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str="acbdadmalayalamabc";
		int i;
		int j;
		int small=12344;
		LinkedHashSet set =new LinkedHashSet(); 
		for(i=0;i<str.length();i++){
			for(j=i+1;j<=str.length();j++){
				String s1="";
				s1=s1+str.substring(i,j);
				//System.out.println(s1);
				StringBuffer s2=new StringBuffer(s1);
				String s4="";
				s4=s4+s2.reverse().toString();
				if(s1.equals(s4) && s1.length()>1){
					set.add(s1);
				}
			}
		}
		for(Object o:set){
			String s3="";
			s3=((String)s3+o);
			int len=s3.length();
			if(small>len){
			small=len;
			}
		}
		for(Object o:set){
			String s3="";
			s3=((String)s3+o);
			int len=s3.length();
			if(len==small){
				System.out.println(s3);
			}
		}
	}

}
