package pro;
import java.util.Scanner;
public class PrimeNumber1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int input1=s.nextInt();
		int input2=s.nextInt();
		int input3=s.nextInt();
		int len1=String.valueOf(input1).length();
		int i;
		int j;
		int k;
		int count=0,count1=0;
		if((input2>=10 && input2<=999)&&(input3>=10 && input3<=999)){
		for(i=input2;i<=input3;i++){
			count=0;
			for(j=2;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==1){
				System.out.println(i);
				int i2=i;
				if(len1==1){
				while(i2>0){
					int rem=i2%10;
					if(rem==input1){
						count1++;
					}
					i2/=10;
				}
			}
				else if(len1==2){
					while(i2>0){
						int rem=i2%100;
						if(rem==input1){
							count1++;
						}
						i2/=10;
					}
				}
				else if(len1==3){
					while(i2>0){
						int rem=i2%1000;
						if(rem==input1){
							count1++;
						}
						i2/=100;
					}
				}
			}
		}
	}
		else
		{
			System.out.println("Invalid input");
		}
		System.out.println("N digit occurs in "+count1);
	}
}