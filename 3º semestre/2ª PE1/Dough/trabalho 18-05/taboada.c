#include<stdio.h>
#include<stdlib.h>
#include<math.h>

main(){
	int num,i,x,restab;
	int tab[9];
	int op;

	printf("\nDigite o numero para taboada: ");
	scanf("%d",&num);
	x=0;
	while (x<=10){
		restab=restab=num*x;
		printf("\n%d X %d = %d",num,x,restab);
		x++;
		tab[i]=restab;
		i++;
	
//		printf("\ndeseja fazer outra taboada (1)Sim (2)Não");
//		scanf("%d",&op);
	}
printf("",tab[i]);
}

