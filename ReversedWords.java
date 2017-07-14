package pro;
import java.util.Scanner;
import java.util.ArrayList;
public class ReversedWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String str=s.nextLine();
		String[] str1=str.split(" ");
		ArrayList<String> list = new ArrayList<String>();
		for(String str2:str1)
		{
			list.add(str2);
		}String s1="";
		for(int i=0;i<list.size();i++){
			if(i%2==0){
				String s2="";
				s2=s2+list.get(i);
				StringBuffer s3 = new StringBuffer(s2);
				s3.reverse().toString();
				s1=s1+s3+" ";
			}
			else{
				s1=s1+list.get(i)+" ";
			}
		}
		System.out.println(s1);
	}

}
