#include<stdio.h>
#include<conio.h>
main()
{
	int num,fact=1,i;
	printf("enter the num");
	scanf("%d",&num);
	for(i=1;i<=num;i++)
	{
		fact=fact*i;
		}
	printf("the factorial is:%d",fact);
}
