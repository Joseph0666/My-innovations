package pro;
import java.util.Scanner;
public class Power1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int i;
		int sum=0;
		int len=String.valueOf(num).length();
		int reverse=0;
		for(i=0;i<len;i++){
			int rem=num%10;
			reverse=reverse*10+rem;
			num/=10;
		}
		for(i=0;i<len;i++){
			int rem=reverse%10;
			sum=sum+(int)(Math.pow(rem,i));
			reverse/=10;
		}
		System.out.println(sum);
	}

}
