#include <stdio.h>
int main()
{
    int temp=0,temp1=0,n,i;
    char a[10],c;
    scanf("%d",&n);
    printf("enter trhe name");
    scanf("%s",a);
    printf("%s",a);
   for(i=0;i<n;i++)
   {
       printf("\n%d",a[i]);
    temp=temp+a[i];
    printf("\n addd=%d",temp);
   }
    temp1=temp/n;
    printf("\npassss=%d",temp1);



}
