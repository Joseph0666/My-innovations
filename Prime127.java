package LogicPrograms;
import java.util.Scanner;
public class Prime127 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int sum=0;
		int input=s.nextInt();
		int i;
		int j;
		int count=0;
		for(i=2;i<input;i++){
			count=0;
			for(j=2;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==1){
				int i2=i;
					int rem=i2%10;
					if(rem==3){
						sum=sum+i2;
				}
			}
		}
		System.out.println(sum);
	}

}
