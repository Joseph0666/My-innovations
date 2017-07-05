package guvi;
import java.util.Scanner;
public class Hunter64 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=689;
		int[] a={500,100,50,10,1};
		int sum=0;
		int i;
		int j;
		for(i=0;i<a.length;i++){
			int div=num/a[i];
			int rem=num%a[i];
			sum=sum+div;
			num=rem;
		}
		System.out.println(sum+" currency notes");
	}

}
