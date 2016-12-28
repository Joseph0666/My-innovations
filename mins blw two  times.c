#include<stdio.h>
main()
{
    float hour1,hour2,mins=0,i,n;
    printf("enter the hour1");
    scanf("%f",&hour1);
    printf("enter the hour2");
    scanf("%f",&hour2);
    n=hour2-hour1;
    printf("\nn=%f",n);
    mins=n*60;
    printf("\n mins=%f",mins);
}
