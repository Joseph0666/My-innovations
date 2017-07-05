package guvi;
import java.util.Scanner;
public class Hunter110 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int [][]a=new int[n][m];
		int i;
		int j;
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				a[i][j]=s.nextInt();
			}
		}int sum=0;
		for(i=1;i<n-1;i++){
			for(j=1;j<m-1;j++){
				sum=sum+a[i][j];
			}
		}
		System.out.println(sum);
	}

}
