#include<stdio.h>
#include<conio.h>
//#include<string.h>
main()
{
    char s1[10];
    char *s2;
    printf("enter the string");
    scanf("%s",s1);
  s2=strrev(s1);
    printf("strng rev=%s",s2);
    getch();
}
