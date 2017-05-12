package pro;
import java.util.Scanner;
public class Pattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=i;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.print(" ");
			for(j=i;j<n;j++){
			System.out.print("*");}
			System.out.println("\n");
		}
	}

}
