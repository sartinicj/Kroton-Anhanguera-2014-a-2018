#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
int vet[5], i, num;
i=0;
for (i=0;i<6;i++){
printf("Digite um numero: ");
scanf ("%d", &vet[i]);
};
do{
	printf("\nMENU:");
	printf("\n[1] Mostrar valor: ");
	printf("\n[2] Deslocar o vetor para a direita: ");
	printf("\n[3] Deslocar o vetor para a esquerda: ");
	printf("\n[4] SAIR\n");
	scanf("%d", &num);
	if(num==1){
		printf("%d", vet[i]);
	}
}while(num!=4);
	return 0;
}
