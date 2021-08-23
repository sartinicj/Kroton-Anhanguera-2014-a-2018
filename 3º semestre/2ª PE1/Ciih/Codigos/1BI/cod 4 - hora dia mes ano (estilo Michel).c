#include <stdio.h>
#include <stdlib.h>
main (){
	int dia, mes, ano, hora, min, seg;
	printf("\n Informe a data no formato dd/mm/aaaa: ");
	scanf("%d/%d/%d", &dia, &mes, &ano);
	printf("\n Informe o horário no formato hh:mm:ss ");
	scanf("%d:%d:%d", &hora, &min, &seg);
	printf("\n Data informada: \n dia %d do mes de%d do ano %d", dia, mes, ano);
	printf("\n Horário informado: %d hs: %d m: %d s", hora, min, seg);
	system ("pause");
}
