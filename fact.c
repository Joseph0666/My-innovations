#include<stdio.h>
main()
{
    int num,i,fact=1;
    printf("enter the num");
    scanf("%d",&num);
    for(i=1;i<=num;i++)
    {
        fact=fact*i;
     //   i++;
}
printf("fact=%d",fact);
}
