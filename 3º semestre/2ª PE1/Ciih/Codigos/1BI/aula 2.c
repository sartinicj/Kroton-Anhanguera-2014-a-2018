#include <stdio.h>
#include<stdlib.h>
main () {
	int idade;
	float altura;
	char op;
	do{
		printf("\n Digite sua idade");
		scanf("%d",& idade);
		printf("\n Digite sua altura");
		scanf("%f", & altura);
		printf("\n Digite 's' para continuar");
		scanf("%c",&op);
	}while ( cont=:'s' );
}
