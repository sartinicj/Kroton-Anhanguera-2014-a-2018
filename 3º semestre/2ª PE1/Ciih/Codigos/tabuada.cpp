#include<stdio.h>
#include<stdlib.h>
main (){
int num, tab, i;
printf("\n Digite um numero: ");
scanf("%d",&num);
	i= 0;
do{
	tab=(num*i);
	i=i+1;
	printf("\nA tabuada do 2 é %d", tab);
}while (i<=10);
}
