#include<stdio.h>
#include<stdlib.h>
main()
{
   char ch[10];
   int i,temp=0;
   printf("enter the string");
   scanf("%s",ch);
   for(i=0;i<=ch[i]!='\0';i++)
   {
    printf("\n%c=%d",ch[i],ch[i]);
       temp=temp+ch[i];
   }
   printf("\ntemp=%d",temp);
}
