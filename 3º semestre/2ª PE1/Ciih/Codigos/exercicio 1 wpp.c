#include <stdio.h>
#include <stdlib.h>
#include <math.h>
main() {
	int result, num, vet[9], i;
	char resp;
	do{
	printf("\nQual sera a tabuada feita?");
	scanf("%d",& num);
		for(i=0; i<=10; i++){
		result=(num*i);
		printf("\n%d*%d=%d", num, i, result);
	}
	printf("\nDeseja fazer uma nova tabuada? s/n");
	scanf("%c",&resp);
	}while (resp='n');
}
