#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
int vet[5], i, reset=0;
i=0;
for (i=0; i<5; i++){
	printf("Digite a altura: ");
	scanf("%d", &vet[i]);
}
for (i=0;i<5;i++){
if(vet[i-1]>=vet[i] || reset){
	printf("\n%d EXPLODIRA!",vet[i]);
}else
if(vet[i-1]<=vet[i]){
	printf("\n%d NAO EXPLODIRA!",vet[i]);
	reset=1;
}
}
}




