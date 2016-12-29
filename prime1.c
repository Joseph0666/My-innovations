#include<stdio.h>
main()

{

	int num,count,i,j;
int a,b;
printf("enter the num");
	scanf("%d",&a);
printf("enter the num");
	scanf("%d",&b);
for(j=a;j<=b;j++)
    {
        num=j;
        count=0;
	for(i=2;i<=num;i++)
	{
		if(num%i==0)
		count++;
	}
	if(count==1)
		printf("%d",num);
    }
}
