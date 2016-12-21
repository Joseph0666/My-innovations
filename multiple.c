#include<stdio.h>
main()
{
	int num,i,multiply=0;
	printf("enter the num");
	scanf("%d",&num);
	for(i=1;i<=10;i++)
	{
		multiply=num*i;
		printf("%d=%d*%d \n",multiply,num,i);
	}	
}
