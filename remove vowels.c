#include<stdio.h>
main()
{
    int i,j=0;
    char ch[1000];
    printf("enter the string");
scanf("%s",ch);
    printf("%s",ch);
    for(i=0;i<=strlen(ch);i++)
    {
        if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
            ch[i]=' ';
        else
           ch[j++]=ch[i];
    }
printf("\n string=%s",ch);
}
