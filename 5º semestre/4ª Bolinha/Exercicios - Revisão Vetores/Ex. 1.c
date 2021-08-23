#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
int mes;
do{
	printf("\nEscolha um numero para saber o mes, e 0 para sair: ");
	scanf("%d",&mes);
//do{
//printf("Digite o mes deforma numerica: ");
//scanf("%d", &mes);
//do{
	if(mes==1){
		printf("JAN");
	}
	if (mes==2){
		printf("FEV");
	}
	if(mes==3){
		printf("MAR");
	}
	if(mes==4){
		printf("ABR");
	}
	if(mes==5){
		printf("MAI");
	}
	if(mes==6){
		printf("JUN");
	}
	if(mes==7){
		printf("JUL");
	}
	if(mes==8){
		printf("AGO");
	}
	if(mes==9){
		printf("SET");
	}
	if(mes==10){
		printf("OUT");
	}
	if(mes==11){
		printf("NOV");
	}
	if(mes==12){
		printf("DEZ");
	}
}while(mes!=0);
//}
}
