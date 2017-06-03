import java.util.Scanner;
public class Coprime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int input1=s.nextInt();
		int input2=s.nextInt();
		int i,count=0,count1=0;
		for(i=1;i<input1;i++)
		{
			if(input1%i==0)
			{
				count++;
			}
		}
		for(i=1;i<input2;i++)
		{
			if(input2%i==0)
			{
				count1++;
			}
		}
		if(count==1&&count1==1)
		{
			System.out.println("Coprime num");
		}
		else
		{
			System.out.println("Not coprime num");
		}
	}

}
