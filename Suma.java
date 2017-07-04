package guvi;
import java.util.Scanner;

public class Suma {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int me=0;
		int myfriend=0;
		int i;
		int j;
		int numberofcoins=s.nextInt();
		int []a=new int[numberofcoins];
		for(i=0;i<numberofcoins;i++){
			a[i]=s.nextInt();
		}
		for(i=0;i<numberofcoins;i++){
			if(i%2==0){
				me+=a[i];
			}
			else {
				myfriend+=a[i];
			}
		}
		if(me>myfriend){
			System.out.println("I am a winner="+me);
		}
		else if(myfriend>me){
		System.out.println("Myfriend is a Winner="+myfriend);	
		}
		else if(me==myfriend){
			System.out.println("Both are equal="+me);
		}
	}
}
