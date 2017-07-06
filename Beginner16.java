package guvi;
import java.util.Scanner;
public class Beginner16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i;
		int j;
		int count=0;
		int input1=s.nextInt();
		int input2=s.nextInt();
		for(i=input1;i<input2;i++){
			count=0;
			for(j=2;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==1){
				System.out.println(i);
			}
		}
	}

}
