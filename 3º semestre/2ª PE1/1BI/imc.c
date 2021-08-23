#include <stdio.h>
#include<stdlib.h>
main () {
	float p,h, imc;
	printf("\n Digite seu peso: ");
	scanf("%f", &p);
	printf("\n Digite sua altura: ");
	scanf("%f", &h);
	imc=(p/h*h);
	printf("\n Seu imc e: %.2f", imc);
	if (imc<17){
	printf("\n Muito Abaixo do Peso!");
		} else (imc<18,49);
			printf("\n Abaixo do Peso!");
			if (imc<24,99){
				printf("\n Peso Normal!");
				}else (imc<29,99);
					printf("\n Acima do Peso!");
					if (imc<34,99){
					printf("\n Obesidade 1!");
					}else (imc<39.99);
						printf("\n Obesidade 2 (severa)!");
						if(imc>40);{
							printf("\n Obesidade 3 (mórbida)!");
						};
		}
	
