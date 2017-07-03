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
		for(i=0;i<n;i++){
			count=0;
			int sum1=0;
			for(j=i;j<n;j++){
				count++;
				sum1=sum1+values[j];
				int sum2=sum1+values[i];
				if(sum==sum2){
					count1[k]=count+1;
					k++;
				}
				else if(sum==values[i]){
					count1[k]=count;
					k++;
					}
			}
		}int small=1223345;
		for(i=0;i<k;i++){
			if(small>count1[i]){
				small=count1[i];
			}
		}
		System.out.println(small);
	}
}

