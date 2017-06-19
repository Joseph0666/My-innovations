package marksofstudents;
import  java.util.Scanner;
public class NumberSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int n=0;
		int[] a=new int[num];
		int[] b=new int[num];
		int[] c=new int[num];
		int i;
		int j;
		int rem=0;
		for(i=0;i<num;i++){
			a[i]=i;
		}
			for(i=0;i<num;i++){
				n=0;
				while(a[i]>0){
					rem=a[i]%10;
					if(rem==3 || rem==4){
						b[i]=b[i]*10+rem;
					}
					a[i]/=10;
				}
				//System.out.print(b[i]);
			}
			for(i=0;i<num;i++){
				while(b[i]>0){
					rem=b[i]%10;
					c[i]=c[i]*10+rem;
					b[i]/=10;
				}
			}
			for(i=1;i<num;i++){	
				if(i==c[i]){
					System.out.println(c[i]);
				}
			}
		}
	}