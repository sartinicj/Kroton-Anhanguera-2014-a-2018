#include<stdio.h>
#include<stdlib.h>
main(){
	int idade;
	float altura;
	char op,cont;
	do{
	printf("\n Digite sua Idade: ");
	scanf("%d",&idade);
	printf("\n Digite sua Altura: ");
	scanf("%f",&altura);
	printf("\nDigite 's' para continuar: ");
	scanf(" %c",&op);
	}while(op=='s');
}
