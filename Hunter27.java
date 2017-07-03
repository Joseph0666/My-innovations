package guvi;

import java.util.Scanner;

public class Hunter27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str="malayalam";
		int i;
		int j;
		int large=-1234;
		String s5="";
		for(i=0;i<str.length();i++){
			for(j=i+1;j<=str.length();j++){
				String s1="";
				s1=str.substring(i,j);
				//System.out.println(s1);
				String s3="";
				s3=s1;
				StringBuffer s2=new StringBuffer(s1);
				String s4="";
				s2.reverse();
				s4=s2.toString();
				if(!(s3.equals(s4))){
					if(s3.length()>large){
					large=s3.length();
					}
				}
				if(!(s3.equals(s4))){
					if(large==s3.length()){
				 s5=s3;
					}
				}
			}
		}
		System.out.println("Large="+s5);
	}

}
