#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
int vet1[10], vet2[10], vet3[20], i;
i=0;
for (i=0; i<2; i++){
	printf("\n1 Digite um numero: \n");	
	scanf("%d", &vet1[i]);
}
for (i=0;i<2;i++){
	printf("\nOs valores do vetor 1, sao: %d\n", vet1[i]);
}
i=0;
for (i=0; i<10; i++){
	printf("\n2 Digite um numero: \n");	
	scanf("%d", &vet2[i]);
}
//for (i=0;i<2;i++){
//	printf("\nOs valores do vetor 2, sao: %d\n", vet2[i]);
//}
i=0;
for(i=0;i<10;i++){
		vet3[i]=vet1[i];
		vet3[i+2]=vet2[i];
}
i=0;
for(i=0;i<20;i++){
printf("\nOs valores do vetor 3, sao: %d\n", vet3[i]);
}
	return 0;
}
