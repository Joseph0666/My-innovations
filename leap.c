#include<stdio.h>
#include<conio.h>
main()
{
	int year;
	printf("enter the year");
	scanf("%d",&year);
	if(year%4==0)
	{
		printf("the year is leapyear");
	}
	else if(year%100==0 && year%400==0)
	{
		printf("the year is leap year");
	}
	else
	{
		printf("the year is not a leapyear");
	}
}
