package pro;
import java.util.LinkedList;
import java.util.Scanner;
public class Guvi14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int[] arr=new int[n];
			int i;
			int j;
			int k;
			int large=-1234;
			LinkedList list=new LinkedList();
			for(i=0;i<n;i++){
				arr[i]=s.nextInt();
			}
			for(i=0;i<n;i++){
				for(j=i+1;j<=n;j++){
					int add=0;
					int sum=0;
					for(k=i;k<j;k++){
						add=add+arr[k];
					}
					//System.out.println(add);
					if(large<add){
						large=add;
					}
				}
		}
			//System.out.println("large="+large);
			for(i=0;i<n;i++){
				for(j=i+1;j<=n;j++){
					int add=0;
					int sum=0;
					for(k=i;k<j;k++){
						add=add+arr[k];
					}
					for(k=i;k<j;k++){
						if(add==large){
							System.out.println(arr[k]);
						}
					}
				}
			}
	}

}
