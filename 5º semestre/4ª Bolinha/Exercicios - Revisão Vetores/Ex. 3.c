#include <iostream>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
int vet[4], i, ma, me;
float med, soma;
i=1;
soma=0;
for(i=0; i<4; i++){
	printf("Digite um valor: ");
	scanf("%d", &vet[i]);
}
	ma=vet[0];
	me=vet[0];
	for (i=0;i<4;i++){
		if (vet[i]>ma){
			ma=vet[i];
		} 
		if (vet[i]<me){
			me=vet[i];
		}
	
	soma= soma+vet[i];
	}
med=soma/4;
//printf("%d", vet[i]);
printf("O maior numero = %d", ma);
printf("O menor numero = %d", me);
printf("A media dos numeros = %f", med);

	return 0;
}
