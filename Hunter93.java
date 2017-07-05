import java.util.LinkedList;
import java.util.Scanner;
public class Hunter93 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str="WelCome To GuVi";
		int i;
		int j;
		int []a=new int[str.length()];
		int c=0;
		String s4="";
		for(i=0;i<str.length();i++){
			if(Character.isUpperCase(str.charAt(i))){
				a[c]=i;
				c++;
			}
		}
		LinkedList set=new LinkedList();
		String[] s1=str.split(" ");
		for(String w:s1){
			StringBuffer s2=new StringBuffer(w);
			s4="";
			s4=s4+s2.reverse().toString().toLowerCase();
			set.add(s4+" ");
		}
		char []ch=new char[str.length()+str.length()];
		String s5="";
		int count=0;
		int l=0;
		int k=0;
		for(Object o:set){
			s5="";
			s5=s5+o;
			l=0;
			for(i=count;i<k+s5.length();i++){
				ch[i]=s5.charAt(l);
				l++;
				count++;
			}
			k=count;
		}
		for(i=0;i<a.length;i++){
		for(j=0;j<ch.length;j++){	
			if(a[i]==j){
			ch[j]=Character.toUpperCase(ch[j]);
			}
		}
		}
		for(i=0;i<ch.length;i++){
			System.out.print(ch[i]);
		}
	}
}
