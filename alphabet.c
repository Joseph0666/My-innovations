#include<stdio.h>
#include<conio.h>
main()
{
	 char word,a;
	printf("enter the character");
	scanf("%c",&word);
	if(word>='a' && word<='z') 

	{
		printf("the word is alphabet");
	}
	else if(word>= 'A' && word<= 'Z' )
	{
		printf("the word  is alphabet");
	}
	else
	{
		printf("the word  is not an alphabet");
	}
}
