import java.util.Scanner;

public class Skillrack4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int []arr=new int[n];
		int []arr1=new int[n];
		int i;
		int j;
		int k;
		int large=-11234;
		int count=0;
		for(i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
			for(i=0;i<n;i++){
				if(i==0){
					arr1[i]=-1;
				}
				else if(i!=0){
					if(arr[i-1]>arr[i]){
						arr1[i]=arr[i-1];
					}
					else if(arr[i-1]<=arr[i]){
						for(k=0;k<arr1.length;k++){
							if(arr1[k]>large){
								large=arr1[k];
							}
						}
						if(arr[i]>large){
							arr1[i]=-1;
						}
						else{
							arr1[i]=large;
						}
					}
				}
					
			}
		for(i=0;i<n;i++){
			System.out.println(arr1[i]);
		}
	}
}
