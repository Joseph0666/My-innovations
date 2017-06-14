import java.util.Scanner;
public class RemoveSpaces {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String s2=str.replaceAll("\\s+"," ");
		System.out.println(s2);
	}

}
