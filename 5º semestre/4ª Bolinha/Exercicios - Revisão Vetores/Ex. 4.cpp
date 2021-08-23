#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
int vet[30], i;
i=0;
for(i=1; i<30; i++){
	printf("Digite um valor: ");
	scanf("%d", &vet[i]);
	}
	for(i=29; i>0; i--){
	printf("%d", vet[i]);
}







	return 0;
}
