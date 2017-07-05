package pro;
import java.util.Arrays;
import java.util.Scanner;
public class Guvi58 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter k");
	int k=s.nextInt();
	System.out.println("Enter size of array");
	int n=s.nextInt();
	int[] a=new int[n];
	int i;
	int j;
	int count=0;
	for(i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	Arrays.sort(a);
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			int sub=a[j]-a[i];
			if(sub==k){
				//System.out.println(a[i]+","+a[j]);
				count++;
			}
		}
	}
	System.out.println(count);
	}

}
