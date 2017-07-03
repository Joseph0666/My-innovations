package guvi;
import java.util.Scanner;
public class Guvi126 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i;
		int []a=new int[10];
		int j;
		int []b=new int[n];
		for(i=0;i<n;i++){
			b[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
			while(b[i]>0){
				int rem=b[i]%10;
				a[rem]++;
				b[i]/=10;
			}
		}
		for(i=0;i<10;i++){
			System.out.println(i+" "+"count="+a[i]);
		}
	}

}
