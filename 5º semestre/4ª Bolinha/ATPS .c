#include <stdio.h>
#include <stdlib.h> 
#include <stdmath> 
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
// Algoritmo 1 - Gerador de n�meros inteiros aleat�rios
// A fun��o RandomInteger devolve um inteiro
// aleat�rio entre low e high inclusive,
// ou seja, no intervalo fechado low..high.
int RandomInteger (int low, int high)
{
int k;
double d;
d = (double) rand () / ((double) RAND_MAX + 1);
k = d * (high - low + 1);
return low + k;


int main(int argc, char** argv) {
	printf("o sorteado �: %d", RandomInteger(0,100) );
	return 0;
}
