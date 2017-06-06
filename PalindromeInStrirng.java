import java.util.Scanner;
public class PalindromeInStrirng {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int i,j;
		int large=-1233;
		int n=str.length();
		int count=0;
		String s1="";
		String s3="";
		String s4="";
		for(i=0;i<n;i++)
		{
			s1="";
			s3="";
			for(j=i+1;j<n;j++)
			{if(i+1==j){
				s1=s1+str.charAt(i)+str.charAt(j);}
			else
			{
				s1=s1+str.charAt(j);
			}
				///System.out.println("S1="+s1);
				s3=s1;
				StringBuffer s2=new StringBuffer(s1);
				s2.reverse();
				s4=s2.toString();
				//System.out.println("S2="+s2);
				if(s4.equals(s3))
				{		
					System.out.println(s4);	
				}
			}
		}
		s.close();
	}

}
