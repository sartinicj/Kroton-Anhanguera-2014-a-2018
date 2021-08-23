#include <stdio.h>
#include <stdlib.h>
int l,c,i,ba;
float alunos[20][5],media1,media2,mediag,nf;
main (){
	for(l=1;l<=20;l++)
		for (c=1;c<=2;c++){
		printf("\nAluno %d digite a nota do %d bimestre: ",l,c);
		scanf("%f",&alunos[l][c]);
		}
		for(l=1;l<=20;l++)
			for (c=3;c<=4;c++){
			printf("\nAluno %d digite a nota do %d bimestre: ",l,c);
			scanf("%f",&alunos[l][c]);
			}
do{
	printf("\n **********************************************MENU*****");
	printf("\n *** 1} Mostrar todas as notas de um aluno *************");
	printf("\n *** 2) Mostrar todas as notas de todos os alunos ******");
	printf("\n *** 3) Mostrar todas as notas finais \n***    de todos os alunos *");
	printf("\n *** 4) Mostrar a maior media final por aluno, \n***    caso haja varios alunos, mostre o numero de todos *");
	printf("\n *** 5) Para encerrar***");
		scanf("%d",&i);
	if(i==1){
		printf("Qual o numero do aluno?");
		scanf("%d",&ba);
    	for(l=0;l==ba;l++)
    		for(c=0;c<=3;c++){
			printf("\n As notas do aluno %d, sao: %f",ba,alunos[l][c]);		
		}	
	}else{
		if (i==2){
			for(l=1;l<=20;l++)
			for (c=1;c<=4;c++){
			printf("\n%f",alunos[l][c]);
		}else{
			if (i==3){
				for(l=1;l<=20;l++)
					for (c=1;c<=2;c++){
					media1=((alunos[l][c]+alunos[l][c])*0.4)
					}
					for(l=1;l<=20;l++)
					for (c=3;c<=4;c++){
						media2=((alunos[l][c]+alunos[l][c])*0.6)
					}
					alunos[l][4]=(media1+media2)
			printf("\n A nota final do aluno %d é %d",l,alunos[l][4])
			}
			else{
				if(i==4)
			}else
			printf("Opcao nao valida")
							
			}
		}
	}
	
  }while(i!=5)
}

