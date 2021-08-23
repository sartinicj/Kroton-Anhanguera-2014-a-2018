#include<stdio.h>
main(){
	int i;
	float vet[4],media,soma;
	soma=0;
	media=0;
	for (i=0;i<4;i++){
		printf("\nDigite o numero %d: ",i+1);
		scanf("%f",&vet[i]);
	}for (i=0;i<4;i++){
		soma=soma+vet[i];//acumulador
	}
	media=soma/i;
	printf("\nMostrando valores\n");
	for(i=0;i<4;i++){
		printf("\n Indice %d, valor=%.2f",i,vet[i]);}
		printf("\nSomatorio total=%.2f, media geral=%.3f\n",soma,media);

	system("pause");
}
