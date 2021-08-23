#include <stdio.h>
main (){
	int vet[30],i, ma, me, par, neg, soma;
	float media;
	par=soma=neg=0;
	for (i=0; i<30; i++){
		printf("\nDigite o numero %d",i+1);
		scanf("%d",& vet[i]);
		soma+=vet[i];
		if(vet[i]<0)
			neg++;
			if((vet[i]%2)==0)
			par=par+1;
			if(i==0){
				ma=vet[i];
				me=vet[i];
			}else{
			if(vet[i]>ma)
			ma=vet[i];
			if(vet[i]>me)
			me=vet[i];
			}
			media=soma/i;
			printf("\nO maior numero e %d: ", ma);
			printf("\nO menor numero e %d: ", me);
			printf("\nO numero par e %d: ", par);
			printf("\nO numero negativo e %d: ", neg);
			printf("\nA soma e %d: ", soma);
			printf("\nA media e %f: ", media);
			}
			
}
