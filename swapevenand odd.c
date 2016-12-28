#include<stdio.h>
main()
{
    int i;
    char ch[10];
    char temp;
    printf("enter the char");
      scanf("%s",ch);
      printf("\n strin=%s",ch);
      for(i=0;i<strlen(ch);i=i+2)
       {
        temp=ch[i];
        ch[i]=ch[i+1];
        ch[i+1]=temp;
    }
    printf("\n string swap=%s",ch);
}
