#include<stdio.h>
main()
{
	int num,count=0,i;
	printf("enter the num");
	scanf("%d",&num);
	for(i=2;i<=num;i++)
	{
		if(num%i==0)
		count++;
	}
	if(count==1)
	{
		printf("the num is prime");
	}
	else if(num==1)
	{
		printf("num is neither prime nor composite");	
	}

else 
	{
		printf("the num is not prime");
	}	
}
	

