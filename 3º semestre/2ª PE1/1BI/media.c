#include <stdio.h>
#include<stdlib.h>
main () {
	float b1, b2;
	printf("\n Digite a nota do primeiro bimestre: ");
	scanf("%f", &b1);
	printf("\n Digite a nota do segundo bimestre: ");
	scanf("%f", &b2);
	if ((b1*0.4)+(b2*0.6)>6){
		printf("\n APROVADO!!! ");
	}else
		printf("\n REPROVADO!!! ");
			}
