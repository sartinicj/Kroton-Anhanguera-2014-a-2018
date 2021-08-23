#include <stdio.h>
#include<stdlib.h>
main () {
	char aux;
	printf("\nDigite um caracter: ");
	scanf(" %c",&aux);
		if (aux>='A' && aux<='Z' || aux>='a'&& aux<='z'){
			if (aux=='a'||aux=='A'||aux=='e'||aux=='E'||aux=='i'||aux=='I'||aux=='o'||aux=='O'||aux=='u'||aux=='U'){
				printf("\n Seu caracter e uma vogal: \n");
			}else{
				printf("\n Seu caracter e uma consoante: \n");
			}
	}else{
		printf("\n Nao e letra\n");
	}
	system("pause");
}

