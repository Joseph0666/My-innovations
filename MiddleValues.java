package pro;
import java.util.Scanner;
public class MiddleValues {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] a=new int[n];
int i,rem;
for(i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
if(n%2!=0){
	rem=n/2;
	System.out.println(a[rem]);
}
else if(n%2==0)
{
	rem=n/2;
	System.out.println(a[rem]);
}
	}

}
