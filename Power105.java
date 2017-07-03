package LogicPrograms;

public class Power105 {
	public static int sum=0;
	public static int s1=0;
	public static void power(int input){
		int i;
		int j;
		int reverse=0;
		int len=String.valueOf(input).length();
		for(i=0;i<len;i++){
			int rem=input%10;
			reverse=reverse*10+rem;
			input/=10;
		}
		int[] a=new int[len];
		for(i=0;i<len;i++){
			int rem=reverse%10;
			a[i]=rem;
			reverse/=10;
		}
		int sum1=1;
		int sum2=1;
		for(i=0;i<len-1;i++){
			sum1=1;
			int num=a[i+1];
			for(j=0;j<num;j++){
				sum1=sum1*a[i];
			}
			sum=sum+sum1;
		}
		int num1=a[len-1];
		int a1=a[0];
		for(i=0;i<a1;i++){
			sum2=sum2*num1;
		}
		s1=sum2;
		//System.out.println(s1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		power(1234);
		System.out.println(sum+s1);
	}

}
