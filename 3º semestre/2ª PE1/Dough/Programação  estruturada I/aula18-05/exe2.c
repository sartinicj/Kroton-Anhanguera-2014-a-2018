#include<stdio.h>
main (){
	int i, ma, mi;
	char resp, txt[50];
	do{
		fflush (stdin);
		printf("\nDigite um texto qualquer; ");
		gets(txt);
		ma=0;
		mi=0;
		for(i=0;txt[i]!='\0';i++){
			if (txt[i]>='A'&& txt[i]<='Z')
			ma++;
			if (txt[i]>='a'&&txt[i]<='z')
			mi++;
			}
			printf("\nVoce escreveu: %s",txt);
			printf("\n%sContem %d maiusculas e %d minusculas",txt,ma,mi);
			printf("\nDigite s para continuar: ");
			scanf(" %c", &resp);
			}while(resp=='S'|| resp=='s');
		}
