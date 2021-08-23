#include<stdio.h>
#include<stdlib.h>
main(){
  int idade;
  float peso,altura;
  char sexo;
  printf("Digite sua Idade: ");
  scanf("%d",&idade);
  printf("Digite sua Altura: ");
  scanf("%f",&altura);
  printf("Digite seu Peso: ");
  scanf("%f",&peso);
  printf("Digite seu sexo: ");
  scanf(" %c",&sexo);
  
  printf("\n Sua idade e %d anos: ", idade);
  printf("\n Sua Altura e %.2f centimentros: ", altura);
  printf("\n Seu peso e %.2f kilos: ", peso);
  printf("\n Seu sexo e: %c \n", sexo);
  system("pause");
}
