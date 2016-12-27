#include<stdio.h>
#include<conio.h>
main()
{
    int num,reverse=0,rem;
    printf("enter the num");
    scanf("%d",&num);
    while(num>0)
    {
        rem=num%10;
        reverse=rem+reverse*10;
        num/=10;
    }
    printf("rverse num is :%d",reverse);
}
