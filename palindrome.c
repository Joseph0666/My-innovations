#include<stdio.h>
#include<conio.h>
main()
{
	int num,reverse=0;
	printf("enter the num");
	scanf("%d",&num);
	while(num)
	{
	reverse=reverse*num%10;
		reverse=reverse+num;
		num=num/10;
	}
	if(num==reverse)
	{
		printf("the num ispailndrome:%d ",reverse);
	}
	else
	{
		printf("\n the num is not palindrome:%d",reverse);
	}
}
