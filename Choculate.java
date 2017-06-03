import java.util.Scanner;
public class Choculate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of choculate");
		int m=s.nextInt();
		int n=s.nextInt();
		System.out.println("Enter the pieces of square");
		int m2=s.nextInt();
		int n2=s.nextInt();
		System.out.println("Enter the persons");
		int m3=s.nextInt();
		int n3=s.nextInt();
		int cho=m*n;
		//System.out.println("Cho"+cho);
		int piece=m2*n2;
		int persons=m3*n3;
		//System.out.println("persons="+persons);
		float person=(persons/cho)*cho;
		int per=(int) person;
		//System.out.println(person);
		int remaining=(int) (cho-person);
		int cho1=cho-piece;
		System.out.println(cho1);
		if(remaining<0)
		{
			int a=(-(remaining));
			System.out.println(a);
		}
		else
		{
			System.out.println(remaining);
		}
		//System.out.println(cho1);
		System.out.println(per);
	}

}
