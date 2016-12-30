#include<stdio.h>
#include<string.h>
main()
{
    char days[10],i;
    printf("enter the days");
   gets(days);
    if(strcmp("sunday",days)==0)
    {
     printf("holiday");
    }
    else
    {
        printf("its is working day");
    }
}
