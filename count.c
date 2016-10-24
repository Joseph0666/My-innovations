#include<stdio.h>
#include<conio.h>
main()
{
	int num,count=0;
	printf("enter the num");
	scanf("%d",&num);
	if(num>0){
	num=num%10;
	count=count+num;
	num=num/10;
}
printf("the num is:%d",count);
}
