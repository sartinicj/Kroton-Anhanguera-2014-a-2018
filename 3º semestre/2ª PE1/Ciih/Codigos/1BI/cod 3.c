#include <stdio.h>
#include<stdlib.h>
main () {
	int idade;
	float peso, altura;
	char sexo;
	printf("\n Digite sua idade");
	scanf("%d", & idade);
	printf("\n Digite seu sexo");
	scanf(" %c", & sexo);
	printf("\n Digite seu peso");
	scanf("%f", & peso);
	printf("\n Digite sua altura");
	scanf("%f", & altura);
	printf("\n Sua idade é %d seu sexo é %c seu peso eh%f e sua altura e %f",idade,sexo,peso,altura);
	
}
