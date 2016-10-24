#include <stdio.h>
#include<conio.h>
 main()
{
    int num,power,result = 1;

    printf("Enter a base number: ");
    scanf("%d", &num);

    printf("Enter an power ");
    scanf("%d", &power);

    while (power != 0)
    {
      result=result*num;
      --power;

    printf("answer= %d", result);
}
}
