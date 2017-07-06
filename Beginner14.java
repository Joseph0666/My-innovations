package guvi;
import java.util.Scanner;
public class Beginner14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int input1=s.nextInt();
		int input2=s.nextInt();
		int i;
		int j;
		for(i=input1;i<=input2;i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
	}

}
