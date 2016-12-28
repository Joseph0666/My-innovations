#include<stdio.h>
main()
{
    int length,breadth,radius,height;
    int triangle,circle,rectangle,a,b,c;
    printf("enter the length");
    scanf("%d",&length);
    printf("enter the breadth");
    scanf("%d",&breadth);
    printf("enter the radius");
    scanf("%d",&radius);
    printf("enter the height");
    scanf("%d",&height);
    a=area(breadth,height);
    b=area1(radius);
    c=area2(length,breadth);
    printf("triangle=%d",a);
    printf("circle=%d",b);
    printf("rectangle=%d",c);
}
int area(breadth,height)
{
    int temp;
    temp=0.5*breadth*height;
return temp;
}
int area1(radius)
{
    int temp1;
    temp1=3.14*radius*radius;
    return temp1;
}
int area2(length,breadth)
{
    int temp2;
    temp2=length*breadth;
    return temp2;
}
