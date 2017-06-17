package pro;
import java.util.Scanner;
public class Pyramid {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=10;
		int i;
		int j;
		int k;
		for(i=0;i<n;i++)
		{
			for(k=n;k>=i;k--){
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
