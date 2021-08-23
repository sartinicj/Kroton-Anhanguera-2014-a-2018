#include <stdio.h>
main (){
int matriz[4][4];
int l,c,i;
i=0;
	for(c=0;c<4;c++){
		for(l=0;l<4;l++){
			printf("matriz[%d][%d] ",l+1,c+1);
			scanf("%d",&matriz[l][c]);
		}	
	}
	for(c=0;c<4;c++){
			printf("\nColuna %d ",c);
	for(l=0;l<4;l++){
			printf("%d",matriz[c][l]);
		}	
	}
	printf("\n\n");
		for(l=0;l<4;l++){
			printf("\nLinha %d ",l);
		for(c=0;c<4;c++){
			printf("%d",matriz[c][l]);
		}	
	}
}
