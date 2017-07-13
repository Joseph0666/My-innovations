package Workout;
import java.util.Scanner;
public class FileConcepts {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str="Mani".toLowerCase();
		String str1="Joe".toLowerCase();
		int i;
		int j;
		int count=0;
		char []ch=str.toCharArray();
		char []ch1=str1.toCharArray();
		int []a=new int[]{1,2,3,4,5,6};
		String str2="";
		String str4="";
		for(i=0;i<ch.length;i++){
			count=0;
			for(j=0;j<ch1.length;j++){
				if(ch[i]!=ch1[j]){
					count++;
				}
				else if(ch[i]==ch1[j]){
					ch1[j]='\0';
				}
			}
			if(count==ch1.length){
				str2=str2+ch[i];
			}
		}
		for(i=0;i<ch1.length;i++){
			if(ch1[i] !='\0'){
			str2=str2+ch1[i];}
		}
		System.out.println(str2);
		int len1=str2.length();
		System.out.println(len1);
		int len=0;
		int count1=6;
		int del=0;
		int sum=0;
		int k=0;
		int []b=new int[10];
		do{
			int c=0;
			c=len1-count1;
			int find=0;
			find=c;
			del=del+find;
			if(del<=6){
				b[k]=del;
				k++;
			}
			else if(del>6){
				
			}
		System.out.println(del);
			for(i=0;i<6;i++){
				System.out.print(a[i]+" ");
			}
			count1--;
		}while(count1!=0);
	}
}
