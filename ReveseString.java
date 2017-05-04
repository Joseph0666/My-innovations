package guvi;
import java.util.Scanner;
public class ReveseString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] words=str.split(" ");
		for(String r:words){
			String reverse=new StringBuffer(r).reverse().toString();
			System.out.print(reverse+" ");
			}
	}

}
