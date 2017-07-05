package pro;
import java.util.Scanner;
public class Guvihunter60 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int []a={2,3,6,12,15,18};
		int []rotate={15,18,2,3,6,12};
		int k=0;
		int i;
		int j;
		for(i=0;i<a.length;i++){
			if(rotate[0]==a[i]){
				k=i;
			}
		}
		System.out.println("rotate array k is :"+k);
	}

}
