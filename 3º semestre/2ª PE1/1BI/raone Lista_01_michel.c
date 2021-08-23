# include <stdio.h>
# include <stdlib.h>
main(){
	float n1, n2, n3, n4, nf1, nf2, mt;
	
	printf("***NOTAS DO PRIMEIRO SEMESTRE***");
	
	printf("\n Digite Nota1: ");
	scanf( "%f",&n1);
	
	printf("\n Digite Nota2: ");
	scanf("%f",&n2);
	
	printf("\n Você Digitou: %.1f, para nota1!! e: %.1f, para nota2!",n1,n2);

	nf1= (n1*4+n2*6)/10;
	
	printf("\n Sua Media Final: %.1f",nf1);


	
printf("\n***NOTAS DO SEGUNDO SEMESTRE***");

	printf("\n Digite Nota3: ");
	scanf( "%f",&n1);
	
	printf("\n Digite Nota4: ");
	scanf("%f",&n2);
	
	printf("\n Você Digitou: %.1f, para nota3!! e: %.1f, para nota4!",n1,n2);

	nf2= (n3*7+n4*3)/10;
	
	printf("\n Sua Media Final: %.1f",nf2);

	mt= (nf1+nf2)/2;
	
	if(mt>= 6){
	
	printf ("\n Aprovado com Media %.1f",mt);
	
	}else{
		
	printf ("\n Reprovado com Media %.1f",mt);
	}
	system("pause");
}
