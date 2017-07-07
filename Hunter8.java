package guvi;
import java.util.LinkedList;
import java.util.Scanner;
public class Hunter8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int []a=new int[]{2,3,4};
		int []b=new int[]{1,2,3,4,5};
		int i;
		int j;
		LinkedList list = new LinkedList();
		LinkedList list1 = new LinkedList();
		String s2="";//String is easy to check subset of b[i] 	
		String s1="";//String is easy to check subset of a[i]
			for(i=0;i<3;i++){
				s1=s1+a[i];
			}
			for(i=0;i<5;i++){
				s2=s2+b[i];
			}
			for(i=0;i<s2.length();i++){
				for(j=i+1;j<=s2.length();j++){
					String s3="";
					s3=s3+s2.substring(i,j);
					list.add(s3);
				}
			}
			for(i=0;i<s1.length();i++){
				for(j=i+1;j<=s1.length();j++){
					String s3="";
					s3=s3+s1.substring(i,j);
					list1.add(s3);
				}
			}int count=0;
		for(Object o : list1){
			for(Object obj : list){
				String str="";
				str=str+o;
				if(str.length()>=2){
					if(o.equals(obj)){
					count++;	
					}	
				}
			}
		}
		if(count==0){
			System.out.println("No subset");
		}
		else {
			System.out.println("a1 is subset of a2");
		}
	}
}