#include<stdio.h>
#include<conio.h>
main()
{
	int num,i,sum=0;
	printf("enter the num");
	scanf("%d",&num);
	for(i=0;i<=num;i++)
	{
		sum=sum+i;
	}
	printf("the sum=%d",sum);
}
