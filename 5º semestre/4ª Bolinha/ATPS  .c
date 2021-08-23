#include <stdio.h>
#include <stdlib.h> 

int RandomInteger (int low, int high)
{
int k;
double d;
d = (double) rand () / ((double) RAND_MAX + 1);
k = d * (high - low + 1);
return low + k;


int main(int argc, char** argv)  {
	printf("o sorteado é: %d", RandomInteger(0,100) );
	return 0;
}
}
