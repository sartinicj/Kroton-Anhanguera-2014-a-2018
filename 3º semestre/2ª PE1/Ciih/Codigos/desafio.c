#include<stdio.h>
#include<stdlib.h>
main (){
	int num, tab, i;
	char op;
	printf("\n Digite um numero  para fazer a tabuada: ");
	scanf("%d",&num);
	i= 0;
	do{
		do{
			tab=(num*i);
			i=i+1;
			printf("\n %d", tab);
		}while (i<=10);
	printf("\nDigite s/n para fazer uma nova tabuada: ");
	scanf(" %c",&op);
//	do {
//		i= 0;
//		do{
//			tab=(num*i);
//			i=i+1;
//			printf("\n %d", tab);
//		}while (i<=10);
	}while (op='n');	
}

