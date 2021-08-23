#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

main ()
{
 
 float n1,n2,resultado,operador;
 int numbi,conv,resconv,i,fat,num;
 char bim[10];

 do{ 
  printf("\n==================================");
  printf("\n==         CALCULADORA          ==");
  printf("\n==                              ==");
  printf("\n==                              ==");
  printf("\n==  (1)  para soma              ==");
  printf("\n==  (2)  para subtracao         ==");
  printf("\n==  (3)  para multiplicacao     ==");
  printf("\n==  (4)  para divisao           ==");
  printf("\n==  (5)  para exponenciacao     ==");
  printf("\n==  (6)  para raiz quadrada     ==");
  printf("\n==  (7)  para porcentagem       ==");
  printf("\n==  (8)  para Fatorial          ==");
  printf("\n==  (9)  para Dec para Binario  ==");
  printf("\n==  (10) para Binario para Dec  ==");
  printf("\n==  (0)  para sair              ==");
  printf("\n==                              ==");
  printf("\n==================================");
  printf("\n");
  printf("\n Digite a opcao: ");          
	scanf ("%f",&operador);
        if (operador==1) {
			printf("\n Digite o primeiro numero: ");
	 		  scanf ("%f",&n1);
		    printf("\n Digite o segundo numero: ");
	 		  scanf ("%f",&n2);
				resultado=n1+n2;    
			printf ("\n O resultado e: %.2f\n",resultado);
   		}
	else
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
			    resultado=n1*n2;
			printf ("\n O resultado e: %.2f\n",resultado);

		}
	else 
		if (operador==4) {
			printf("\n Digite o primeiro numero: ");
			  scanf ("%f",&n1);
 			printf("\n Digite o segundo numero: ");
			  scanf ("%f",&n2);
				resultado=n1/n2;
			printf ("\n O resultado e: %.2f\n",resultado);

		}
	else
		if (operador==5) {
			printf("\n Digite o numero a ser elevado: ");
		      scanf ("%f",&n1);
			printf("\n Digite o numero da elevacao: ");
			  scanf ("%f",&n2);
				resultado=pow(n1,n2);    
			printf ("\n O resultado e: %.2f\n",resultado);
		}
	else
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
			printf ("\n O resultado e: %.2f%\n",resultado);
		}
	else
		if (operador==8) {
			printf("\n Digite o valor inteiro: ");
			  scanf ("%d",&num);
			fat=1;
			for(i=num;i>1;i--){
				fat=fat*i;
				printf ("\n O fatorial e: %d\n",fat);
			}
		}
	else
		if (operador==9){
			printf("\n Digite o valor Decimal: ");
			  scanf ("%d",&conv);
				itoa(conv,bim,2);
			printf ("\n O resultado em binario e: %s\n",bim);  
		
		}
	else	
		if (operador==10) {
			printf("\n Digite o valor em Binario: ");
		      scanf ("%d",&numbi);
			resconv=0;
			i=1;
				do{	
					resconv=resconv+((numbi%10)*i);
					i=i*2;
					numbi=numbi/10;
				}while(numbi!=0);	
				printf ("\n O resultado em Decimal e: %d\n",resconv);
		}	
	else
		if(operador==0){  
			printf ("\nVoce escolheu a opcao sair !! \n");
		}	
	printf("\n");
system("pause");
system("cls");
 }while (operador!=0);
}



