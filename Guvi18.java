package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class Guvi18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter List of N coins");
		int n=s.nextInt();
		int i;
		int count=0;
		int j;
		int[] values=new int[n];
		int[] count1=new int[n];
		int k=0;;
		System.out.println("Enter coins");
		for(i=0;i<n;i++){
			values[i]=s.nextInt();
		}
		System.out.println("Enter Total sum");
		int sum=s.nextInt();
		Arrays.sort(values);
	for(i=n-1;i>=0;i--){
		count=count+sum/values[i];
		sum=sum%10;
	}
		System.out.println(count);
	}
}
