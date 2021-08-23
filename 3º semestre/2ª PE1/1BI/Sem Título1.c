#include <stdio.h>
#include <conio.h>
#include <math.h>

main ()
{
 
float n1,n2,resultado,operador;
do{ 
printf("\n================================");
printf("\n==        CALCULADORA         ==");
printf("\n==                            ==");
printf("\n==                            ==");
printf("\n==  (1) para soma             ==");
printf("\n==  (2) para subtracao        ==");
printf("\n==  (3) para multiplicacao    ==");
printf("\n==  (4) para divisao          ==");
printf("\n==  (5) para exponenciacao    ==");
printf("\n==  (6) para raiz quadrada    ==");
printf("\n==  (7) para porcentagem      ==");
printf("\n==  (8) para sair             ==");
printf("\n================================");
printf("\n Digite a opcao: ");          
	scanf ("%f",&operador);
if (operador==1) {
	printf("\n Digite o primeiro numero: ");
	scanf ("%f",&n1);
    printf("\n Digite o segundo numero: ");
	scanf ("%f",&n2);
		resultado=n1+n2;    
	printf ("\n O resultado e: %.2f\n",resultado);
	}else
		if (operador==2) {
	printf("\n Digite o primeiro numero: ");
	scanf ("%f",&n1);
    printf("\n Digite o segundo numero: ");
	scanf ("%f",&n2);
			resultado=n1-n2;
			printf ("\n O resultado e: %.2f\n",resultado);

		}	

	else
		if (operador==3) {
	printf("\n Digite o primeiro numero: ");
	scanf ("%f",&n1);
    printf("\n Digite o segundo numero: ");
	scanf ("%f",&n2);
			resultado=n1/n2;
			printf ("\n O resultado e: %.2f",resultado);

		}		

	else  
		if (operador==4) {
	printf("\n Digite o primeiro numero: ");
	scanf ("%f",&n1);
    printf("\n Digite o segundo numero: ");
	scanf ("%f",&n2);
			resultado=n1*n2;
			printf ("\n O resultado e: %.2f",resultado);

		}
	else
		if (operador==5) {
	printf("\n Digite o numero a ser elevado: ");
	scanf ("%f",&n1);
    printf("\n Digite o numero da elevacao: ");
	scanf ("%f",&n2);
			resultado=pow(n1,n2);    
			printf ("\n O resultado e: %.2f\n",resultado);
	}else
		if (operador==6) {
	printf("\n Digite o numero a ser tirada a raiz: ");
	scanf ("%f",&n1);
			resultado=sqrt(n1);
			printf ("\n O resultado e: %.2f\n",resultado);
		}	
	else
		if (operador==7) {
	printf("\n Digite o valor inteiro: ");
	scanf ("%f",&n1);
    printf("\n Digite a porcentagem: ");
	scanf ("%f",&n2);
			resultado=(n1/100)*n2;
			printf ("\n O resultado e:%.2f%",resultado);
	}
	else
		if(operador==8){  
	printf ("Voce escolheu a opcao sair: ");
			}	
				
	}while (operador!=0);
			
	
}



