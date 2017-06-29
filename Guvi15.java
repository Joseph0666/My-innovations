package guvi;
import java.util.Scanner;
public class Guvi15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		int i;
		int j;
		
		int[]d=new int[n];
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		int[] b=new int[n];
		for(i=0;i<n;i++){
			int n1=0;
			String s1=Integer.toBinaryString(a[i]);
			n1=Integer.parseInt(s1);
			b[i]=n1;
		}
		int[] c=new int[n];
		for(i=0;i<n;i++){
			d[i]=b[i];
		}
		for(i=0;i<n;i++){
			int count=0;
			while(b[i]>0){
				int rem=b[i]%10;
				if(rem==1){
					count++;
				}
				b[i]/=10;
			}
			c[i]=count;
		}
		int temp=0;
		int temp1=0;
			for(i=0;i<n;i++){
				for(j=i+1;j<n;j++){
					if(c[i]<c[j]){
						temp=c[i];
						c[i]=c[j];
						c[j]=temp;
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						temp=d[i];
						d[i]=d[j];
						d[j]=temp;
					}
					else if(c[i]==c[j]){
						if(a[i]<a[j]){
							temp=c[i];
							c[i]=c[j];
							c[j]=temp;
							temp=a[i];
							a[i]=a[j];
							a[j]=temp;
							temp=d[i];
							d[i]=d[j];
							d[j]=temp;
						}
					}
				}
			}
			for(i=0;i<n;i++){
				System.out.println(a[i]);
			}
			
	}

}
