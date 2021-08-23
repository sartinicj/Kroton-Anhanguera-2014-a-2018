float nota1, nota2, nf1, nota3, nota4, nf2, nfinal;
main () {
	printf("\n Digite a nota 1: ");
	scanf("%f", &nota1);
	printf("\n Digite a nota 2: ");
	scanf("%f", &nota2);
	nf1==(nota1*4+nota2*6)/10;
	printf("\n Sua nota final do semestre 1 foi de %f",nf1);
	printf("\n Digite a nota 3: ");
	scanf("%f", &nota3);
	printf("\n Digite a nota 4: ");
	scanf("%f", &nota4);
	nf2==(nota3*7+nota4*3)/10;
	printf("\n Sua nota final do semestre 2 foi de %f",nf2);
	nfinal==(nf1+nf2)/2;
	printf("\n Sua nota final geral foi de %f",nfinal);
	if(nfinal >= 6){
		printf("\n APROVADO");
		}else
		printf("\n REPROVADO");
	
	
	
	
	
}
