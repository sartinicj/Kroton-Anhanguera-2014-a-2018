#include <stdio.h>
#include<stdlib.h>


main () {
	float p,h, imc;
	
	
	printf("\n Digite seu peso: ");
	scanf("%f", &p);
	printf("\n Digite sua altura: ");
	scanf("%f", &h);
		imc=p/(h*h);
			printf("\n %f",imc);
		if (imc<=17){
		printf("\n %.2f peso Muito Abaixo para sua altura %.1f",imc,h);
			}



			if (imc<=18.49){
		printf("\n %f Abaixo do Peso",imc);
		}
		
		
		
		if (imc<=24.99){
		printf("\n %f Peso Normal!",imc);	
	}
	
			if (imc>24.99 &&imc<27){
		printf("\n %f Foara de forma",imc);	
	}


}
	

	
