package guvi;
import java.util.Scanner;
public class Seed {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter seed x");
		int x=s.nextInt();
		int x1=x;
		System.out.println("Enter seed y");
		int y=s.nextInt();
		int rem,mul=1;
		while(x>0)
		{
			rem=x%10;
			mul=mul*rem;
			x/=10;
		}
		int ans=x1*mul;
		if(ans==y){
			System.out.println(x1+"is seed of"+y);
		}
		else
		{
			System.out.println(x1+"is not seed of"+y);
		}
	}

}
