package pro;
import java.util.Scanner;
public class Workingday {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the day 1st char to be in uppercase and remaning char in lowercase");
		String str=s.nextLine();
		if(str.equalsIgnoreCase("Sunday"))
		{
			System.out.println("False");
		}
		else if(str.equalsIgnoreCase("Saturday")||str.equalsIgnoreCase("Monday")||str.equalsIgnoreCase("Tuesday")||str.equalsIgnoreCase("Wednesday")||str.equalsIgnoreCase("Thrusday")||str.equalsIgnoreCase("Friday"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("InValid Statement");
		}
			
	}

}
