#include <stdio.h>
#include <stdlib.h> 
#include <stdmath> 
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
// Algoritmo 1 - Gerador de números inteiros aleatórios
// A função RandomInteger devolve um inteiro
// aleatório entre low e high inclusive,
// ou seja, no intervalo fechado low..high.
int RandomInteger (int low, int high)
{
int k;
double d;
d = (double) rand () / ((double) RAND_MAX + 1);
k = d * (high - low + 1);
return low + k;


int main(int argc, char** argv) {
	printf("o sorteado é: %d", RandomInteger(0,100) );
	return 0;
}
