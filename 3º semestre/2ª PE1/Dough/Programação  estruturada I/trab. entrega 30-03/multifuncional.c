#include<stdio.h>
#include<stdlib.h>
main(){
	float salario,salario_alm,altura,peso,imc;
	int op;
	do{
	printf("\n********************MULTIFUNCIONAL********************");
	printf("\n*********(1) calculo de IMC            ***************");
	printf("\n*********(2) Almento de 10% no salario ***************");
	printf("\n*********(3) teste 1                   ***************");
	printf("\n*********(4) teste 2                   ***************");
	printf("\n*********(0) Sair                      ***************");
	printf("\n******************************************************");
	printf("\n\nDigite a sua opcao: ");
	scanf("%f",&op);
			if (op==1) {
				printf("\n\nDigite sua altura: ");
				scanf("%f",&altura);
				printf("\nDigite seu peso: ");
				scanf("%f",&peso);
					imc=(altura*altura)/peso;
						printf("\n\nSeu IMC e: %.2f",imc);
			}else
			if (op==2){
				printf("\nDigite seu salario atual: ");
				scanf("%f",&salario);
				salario_alm=(salario/100)*10;
				printf("Seu salario com 10% de aumento e: %.2f",salario_alm);
			}	
				
	}	while (op!=0);
			
	
}
