package LogicPrograms;
import java.util.Scanner;
public class Guvi60 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=s.nextInt();
		System.out.println("ENter the search num");
		int index=s.nextInt();
		int t=1;
		int n=3;
		int n1=3;
		int i;
		int j;
		int []a=new int[num+1];
		for(i=0;i<num;i++){
			a[i]=n;
			if(a[i]==1){
				n1=n1*2;
				n=n1+1;
			}
			n--;
		}
		/*for(i=0;i<num;i++){
			System.out.println(a[i]);
		}*/
		System.out.println(a[index-1]);
		}
	}
