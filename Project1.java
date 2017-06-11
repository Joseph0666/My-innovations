package pro;
public class Project1{
	public static void main(String[] args) {
	String [][] arr=new String[8][8];
	arr[0][0]="Emp No.";arr[0][1]="Emp Name";arr[0][2]="JoinDate";arr[0][3]="Designcode";arr[0][4]="Dept";arr[0][5]="Basic";arr[0][6]="HRA";arr[0][7]="IT";
	arr[1][0]="1001";arr[1][1]="Ashish";arr[1][2]="01/04/2009";arr[1][3]="e";arr[1][4]="R&D";arr[1][5]="20000";arr[1][6]="8000";arr[1][7]="3000";
	arr[2][0]="1002";arr[2][1]="Sushma";arr[2][2]="23/08/2012";arr[2][3]="c";arr[2][4]="PM";arr[2][5]="30000";arr[2][6]="12000";arr[2][7]="9000";
	arr[3][0]="1003";arr[3][1]="Raghul";arr[3][2]="12/11/2008";arr[3][3]="k";arr[3][4]="Acct";arr[3][5]="10000";arr[3][6]="8000";arr[3][7]="1000";
	arr[4][0]="1004";arr[4][1]="Chahat";arr[4][2]="29/01/2013";arr[4][3]="r";arr[4][4]="Frontdesk";arr[4][5]="12000";arr[4][6]="6000";arr[4][7]="2000";
	arr[5][0]="1005";arr[5][1]="Ranjan";arr[5][2]="16/07/2005";arr[5][3]="m";arr[5][4]="Engg";arr[5][5]="50000";arr[5][6]="20000";arr[5][7]="20000";
	arr[6][0]="1006";arr[6][1]="Suman";arr[6][2]="1/1/2000";arr[6][3]="e";arr[6][4]="Manufactoring";arr[6][5]="23000";arr[6][6]="9000";arr[6][7]="4400";
	arr[7][0]="1007";arr[7][1]="Tanmey";arr[7][2]="12/06/2006";arr[7][3]="c";arr[7][4]="PM";arr[7][5]="29000";arr[7][6]="12000";arr[7][7]="10000";
	int len=arr.length;
	int i;
	int j;
	String [][] a=new String[6][3];
	a[0][0]="Designation Code";a[0][1]="Designation";a[0][2]="DA";
	a[1][0]="e";a[1][1]="Engineer";a[1][2]="20000";
	a[2][0]="c";a[2][1]="Consultant";a[2][2]="32000";
	a[3][0]="k";a[3][1]="Clerk";a[3][2]="12000";
	a[4][0]="r";a[4][1]="Recpionist";a[4][2]="15000";
	a[5][0]="m";a[5][1]="Manager";a[5][2]="40000";
	String c=args[0];
	String c1="";
	String c2="";
	int position=0;
		//System.out.println(c);
	int c3=Integer.parseInt(c);
if(c3>=1001 &&c3<=1007){
		for(i=0;i<len;i++){
			j=0;
			if(arr[i][j].equals(c)){
				j=3;
				c1=arr[i][j];
				position=i;
			}
		}
		int Basic=Integer.parseInt(arr[position][5]);
		int HRA=Integer.parseInt(arr[position][6]);
		int IT=Integer.parseInt(arr[position][7]);
		int len1=a.length;
		int position1=0;
		for(i=0;i<len1;i++){
			j=0;
			if(a[i][j]==c1){
				j=2;
				c2=a[i][j];
				position1=i;
			}
		}
		int DA=Integer.parseInt(a[position1][2]);
		int salary=Basic+HRA+DA-IT;
		System.out.println(arr[0][0]+"\t"+arr[0][1]+"    "+arr[0][4]+"ment"+"      "+a[0][1]+"  "+"Salary\n");
		System.out.printf("%-8s%-12s%-14s%-13s%d",arr[position][0],arr[position][1],arr[position][4],a[position1][1],salary);
	}
else{
	System.out.println("There is no employeee with empid:"+c3);
}
}
}